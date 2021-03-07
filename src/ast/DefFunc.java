/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	DefFunc:definicion -> 

public class DefFunc extends AbstractDefinicion {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{DefFunc}";
   }
}
