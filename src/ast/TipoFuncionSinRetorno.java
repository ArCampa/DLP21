/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	tipoFuncionSinRetorno:definicion -> name:String  params:definicion*  sentencias:sentencia*

public class TipoFuncionSinRetorno extends AbstractDefinicion {

	public TipoFuncionSinRetorno(String name, List<Definicion> params, List<Sentencia> sentencias) {
		this.name = name;
		this.params = params;
		this.sentencias = sentencias;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(params, sentencias);
	}

	public TipoFuncionSinRetorno(Object name, Object params, Object sentencias) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.params = this.<Definicion>getAstFromContexts(params);
		this.sentencias = this.<Sentencia>getAstFromContexts(sentencias);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, params, sentencias);
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
	private List<Sentencia> sentencias;

	public String toString() {
       return "{name:" + getName() + ", params:" + getParams() + ", sentencias:" + getSentencias() + "}";
   }
}
