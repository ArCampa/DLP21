/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	estructuraDefinida:definicion -> nombre:String  variables:variable*

public class EstructuraDefinida extends AbstractDefinicion {

	public EstructuraDefinida(String nombre, List<Variable> variables) {
		this.nombre = nombre;
		this.variables = variables;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(variables);
	}

	public EstructuraDefinida(Object nombre, Object variables) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;
		this.variables = this.<Variable>getAstFromContexts(variables);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, variables);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Variable> getVariables() {
		return variables;
	}
	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String nombre;
	private List<Variable> variables;

	public String toString() {
       return "{nombre:" + getNombre() + ", variables:" + getVariables() + "}";
   }
}
