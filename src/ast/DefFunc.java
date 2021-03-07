/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	DefFunc:definicion -> text:String  params:param*  tipo:tipo  sentencias:sentencia*

public class DefFunc extends AbstractDefinicion {

	public DefFunc(String text, List<Param> params, Tipo tipo, List<Sentencia> sentencias) {
		this.text = text;
		this.params = params;
		this.tipo = tipo;
		this.sentencias = sentencias;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(params, tipo, sentencias);
	}

	public DefFunc(Object text, Object params, Object tipo, Object sentencias) {
		this.text = (text instanceof Token) ? ((Token)text).getText() : (String) text;
		this.params = this.<Param>getAstFromContexts(params);
		this.tipo = (Tipo) getAST(tipo);
		this.sentencias = this.<Sentencia>getAstFromContexts(sentencias);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(text, params, tipo, sentencias);
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public List<Param> getParams() {
		return params;
	}
	public void setParams(List<Param> params) {
		this.params = params;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
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
	private List<Param> params;
	private Tipo tipo;
	private List<Sentencia> sentencias;

	public String toString() {
       return "{text:" + getText() + ", params:" + getParams() + ", tipo:" + getTipo() + ", sentencias:" + getSentencias() + "}";
   }
}
