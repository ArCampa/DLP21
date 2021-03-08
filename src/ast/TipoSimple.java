/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	tipoSimple:definicion -> name:String  tipo:tipo

public class TipoSimple extends AbstractDefinicion {

	public TipoSimple(String name, Tipo tipo) {
		this.name = name;
		this.tipo = tipo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo);
	}

	public TipoSimple(Object name, Object tipo) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.tipo = (Tipo) getAST(tipo);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, tipo);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private Tipo tipo;

	public String toString() {
       return "{name:" + getName() + ", tipo:" + getTipo() + "}";
   }
}
