/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	tipoFuncion:definicion -> name:String  params:definicion*  returnType:tipo  sentencias:sentencia*

public class TipoFuncion extends AbstractDefinicion {

	public TipoFuncion(String name, List<Definicion> params, Tipo returnType, List<Sentencia> sentencias) {
		this.name = name;
		this.params = params;
		this.returnType = returnType;
		this.sentencias = sentencias;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(params, returnType, sentencias);
	}

	public TipoFuncion(Object name, Object params, Object returnType, Object sentencias) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.params = this.<Definicion>getAstFromContexts(params);
		this.returnType = (Tipo) getAST(returnType);
		this.sentencias = this.<Sentencia>getAstFromContexts(sentencias);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, params, returnType, sentencias);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Definicion> getParams() {
		return params;
	}
	public void setParams(List<Definicion> params) {
		this.params = params;
	}

	public Tipo getReturnType() {
		return returnType;
	}
	public void setReturnType(Tipo returnType) {
		this.returnType = returnType;
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

	private String name;
	private List<Definicion> params;
	private Tipo returnType;
	private List<Sentencia> sentencias;

	public String toString() {
       return "{name:" + getName() + ", params:" + getParams() + ", returnType:" + getReturnType() + ", sentencias:" + getSentencias() + "}";
   }
}
