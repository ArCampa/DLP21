/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	ident:expresion -> 

public class Ident extends AbstractExpresion {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{Ident}";
   }
}
