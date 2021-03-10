/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	expresionLlamadaMetodo:expresion -> nombre:String  parametros:expresion*

public class ExpresionLlamadaMetodo extends AbstractExpresion {

	public ExpresionLlamadaMetodo(String nombre, List<Expresion> parametros) {
		this.nombre = nombre;
		this.parametros = parametros;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametros);
	}

	public ExpresionLlamadaMetodo(Object nombre, Object parametros) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;
		this.parametros = this.<Expresion>getAstFromContexts(parametros);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, parametros);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Expresion> getParametros() {
		return parametros;
	}
	public void setParametros(List<Expresion> parametros) {
		this.parametros = parametros;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String nombre;
	private List<Expresion> parametros;

	public String toString() {
       return "{nombre:" + getNombre() + ", parametros:" + getParametros() + "}";
   }
}
