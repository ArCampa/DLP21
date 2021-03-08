/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	whileStatement:sentencia -> expr:expresion  code:sentencia*

public class WhileStatement extends AbstractSentencia {

	public WhileStatement(Expresion expr, List<Sentencia> code) {
		this.expr = expr;
		this.code = code;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr, code);
	}

	public WhileStatement(Object expr, Object code) {
		this.expr = (Expresion) getAST(expr);
		this.code = this.<Sentencia>getAstFromContexts(code);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr, code);
	}

	public Expresion getExpr() {
		return expr;
	}
	public void setExpr(Expresion expr) {
		this.expr = expr;
	}

	public List<Sentencia> getCode() {
		return code;
	}
	public void setCode(List<Sentencia> code) {
		this.code = code;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion expr;
	private List<Sentencia> code;

	public String toString() {
       return "{expr:" + getExpr() + ", code:" + getCode() + "}";
   }
}
