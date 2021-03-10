/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	expresionCampoStruct:expresion -> nombreStruct:expresion  campo:String

public class ExpresionCampoStruct extends AbstractExpresion {

	public ExpresionCampoStruct(Expresion nombreStruct, String campo) {
		this.nombreStruct = nombreStruct;
		this.campo = campo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombreStruct);
	}

	public ExpresionCampoStruct(Object nombreStruct, Object campo) {
		this.nombreStruct = (Expresion) getAST(nombreStruct);
		this.campo = (campo instanceof Token) ? ((Token)campo).getText() : (String) campo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombreStruct, campo);
	}

	public Expresion getNombreStruct() {
		return nombreStruct;
	}
	public void setNombreStruct(Expresion nombreStruct) {
		this.nombreStruct = nombreStruct;
	}

	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion nombreStruct;
	private String campo;

	public String toString() {
       return "{nombreStruct:" + getNombreStruct() + ", campo:" + getCampo() + "}";
   }
}
