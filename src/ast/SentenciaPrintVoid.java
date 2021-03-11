/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	sentenciaPrintVoid:sentencia -> 

public class SentenciaPrintVoid extends AbstractSentencia {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{SentenciaPrintVoid}";
   }
}
