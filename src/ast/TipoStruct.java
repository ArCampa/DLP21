/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	tipoStruct:definicion -> name:String  defsNoVar:definicion*

public class TipoStruct extends AbstractDefinicion {

	public TipoStruct(String name, List<Definicion> defsNoVar) {
		this.name = name;
		this.defsNoVar = defsNoVar;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(defsNoVar);
	}

	public TipoStruct(Object name, Object defsNoVar) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.defsNoVar = this.<Definicion>getAstFromContexts(defsNoVar);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, defsNoVar);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Definicion> getDefsNoVar() {
		return defsNoVar;
	}
	public void setDefsNoVar(List<Definicion> defsNoVar) {
		this.defsNoVar = defsNoVar;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private List<Definicion> defsNoVar;

	public String toString() {
       return "{name:" + getName() + ", defsNoVar:" + getDefsNoVar() + "}";
   }
}
