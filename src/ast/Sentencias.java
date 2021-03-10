/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import visitor.*;

//	sentencias -> list:sentencia*

public class Sentencias extends AbstractAST  {

	public Sentencias(List<Sentencia> list) {
		this.list = list;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(list);
	}

	public Sentencias(Object list) {
		this.list = this.<Sentencia>getAstFromContexts(list);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(list);
	}

	public List<Sentencia> getList() {
		return list;
	}
	public void setList(List<Sentencia> list) {
		this.list = list;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Sentencia> list;

	public String toString() {
       return "{list:" + getList() + "}";
   }
}
