/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	metodoDefinido:definicion -> parametros:variable*  retorno:tipo  variablesDef:variableDefinida*  sentenciasEj:sentencia*

public class MetodoDefinido extends AbstractDefinicion {

	public MetodoDefinido(List<Variable> parametros, Tipo retorno, List<VariableDefinida> variablesDef, List<Sentencia> sentenciasEj) {
		this.parametros = parametros;
		this.retorno = retorno;
		this.variablesDef = variablesDef;
		this.sentenciasEj = sentenciasEj;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametros, retorno, variablesDef, sentenciasEj);
	}

	public MetodoDefinido(Object parametros, Object retorno, Object variablesDef, Object sentenciasEj) {
		this.parametros = this.<Variable>getAstFromContexts(parametros);
		this.retorno = (Tipo) getAST(retorno);
		this.variablesDef = this.<VariableDefinida>getAstFromContexts(variablesDef);
		this.sentenciasEj = this.<Sentencia>getAstFromContexts(sentenciasEj);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametros, retorno, variablesDef, sentenciasEj);
	}

	public List<Variable> getParametros() {
		return parametros;
	}
	public void setParametros(List<Variable> parametros) {
		this.parametros = parametros;
	}

	public Tipo getRetorno() {
		return retorno;
	}
	public void setRetorno(Tipo retorno) {
		this.retorno = retorno;
	}

	public List<VariableDefinida> getVariablesDef() {
		return variablesDef;
	}
	public void setVariablesDef(List<VariableDefinida> variablesDef) {
		this.variablesDef = variablesDef;
	}

	public List<Sentencia> getSentenciasEj() {
		return sentenciasEj;
	}
	public void setSentenciasEj(List<Sentencia> sentenciasEj) {
		this.sentenciasEj = sentenciasEj;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Variable> parametros;
	private Tipo retorno;
	private List<VariableDefinida> variablesDef;
	private List<Sentencia> sentenciasEj;

	public String toString() {
       return "{parametros:" + getParametros() + ", retorno:" + getRetorno() + ", variablesDef:" + getVariablesDef() + ", sentenciasEj:" + getSentenciasEj() + "}";
   }
}
