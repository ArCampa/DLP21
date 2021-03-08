/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	tipoComplejo:definicion -> name:String  estructura:String

public class TipoComplejo extends AbstractDefinicion {

	public TipoComplejo(String name, String estructura) {
		this.name = name;
		this.estructura = estructura;
	}

	public TipoComplejo(Object name, Object estructura) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.estructura = (estructura instanceof Token) ? ((Token)estructura).getText() : (String) estructura;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, estructura);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEstructura() {
		return estructura;
	}
	public void setEstructura(String estructura) {
		this.estructura = estructura;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private String estructura;

	public String toString() {
       return "{name:" + getName() + ", estructura:" + getEstructura() + "}";
   }
}
