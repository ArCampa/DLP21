/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	DefStruct:definicion -> text:String  sentencias:sentencia*

public class DefStruct extends AbstractDefinicion {

	public DefStruct(String text, List<Sentencia> sentencias) {
		this.text = text;
		this.sentencias = sentencias;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(sentencias);
	}

	public DefStruct(Object text, Object sentencias) {
		this.text = (text instanceof Token) ? ((Token)text).getText() : (String) text;
		this.sentencias = this.<Sentencia>getAstFromContexts(sentencias);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(text, sentencias);
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public List<Sentencia> getSentencias() {
		return sentencias;
	}
	public void setSentencias(List<Sentencia> sentencias) {
		this.sentencias = sentencias;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String text;
	private List<Sentencia> sentencias;

	public String toString() {
       return "{text:" + getText() + ", sentencias:" + getSentencias() + "}";
   }
}
