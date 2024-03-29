/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package visitor;

import java.io.*;

import ast.*;
import java.util.*;

/**
 * ASTPrinter. Utilidad que ayuda a validar un arbol AST:
 * - Muestra la estructura del árbol en HTML.
 * - Destaca los hijos/propiedades a null.
 * - Muestra a qué texto apuntan las posiciones de cada nodo (linea/columna)
 *      ayudando a decidir cual de ellas usar en los errores y generación de código.
 *
 * Esta clase se genera con VGen. El uso de esta clase es opcional (puede eliminarse del proyecto).
 *
 */
public class ASTPrinter extends DefaultVisitor {

    /**
     * toHtml. Muestra la estructura del AST indicando qué hay en las posiciones
     * (línea y columna) de cada nodo.
     *
     * @param sourceFile El fichero del cual se ha obtenido el AST
     * @param raiz       El AST creado a partir de sourceFile
     * @param filename   Nombre del fichero HMTL a crear con la traza del AST
     */

    public static void toHtml(String sourceFile, AST raiz, String filename) {
        toHtml(sourceFile, raiz, filename, 4);
    }

    public static void toHtml(AST raiz, String filename) {
        toHtml(null, raiz, filename);
    }

    // tabWidth deberían ser los espacios correspondientes a un tabulador en eclipse.
    // Normalmente no sería necesario especificarlo. Usar mejor los dos métodos anteriores.

    public static void toHtml(String sourceFile, AST raiz, String filename, int tabWidth) {
        try {
            PrintWriter writer = new PrintWriter(
                    new FileWriter(filename.endsWith(".html") ? filename : filename + ".html"));
            generateHeader(writer);
            writer.println("[ASTPrinter] -------------------------------- line:col  line:col");
            if (raiz != null) {
                ASTPrinter tracer = new ASTPrinter(writer, loadLines(sourceFile, tabWidth));
                raiz.accept(tracer, Integer.valueOf(0));
            } else
                writer.println("raiz == null");
            writer.println(ls + ls + "[ASTPrinter] --------------------------------");
            generateFooter(writer);
            writer.close();
            System.out.println(ls + "ASTPrinter: Fichero '" + filename
                    + ".html' generado. Abra dicho fichero para validar el AST generado.");
        } catch (IOException e) {
            System.out.println(ls + "ASTPrinter: No se ha podido crear el fichero " + filename);
            e.printStackTrace();
        }
    }

    private static void generateHeader(PrintWriter writer) {
        writer.println("<html>\r\n"
            + "<head>\r\n"
            + "<meta charset=\"utf-8\" />\r\n"
            + "<style type=\"text/css\">\r\n"
            + ".value { font-weight: bold; }\r\n"
            + ".dots { color: #bebdbd; }\r\n"
            + ".type { color: #BBBBBB; }\r\n"
            + ".pos { color: #CCCCCC; }\r\n"
            + ".sourceText { color: #BBBBBB; }\r\n"
            + ".posText {\r\n" + "	color: #BBBBBB;\r\n"
            + "	text-decoration: underline; font-weight: bold;\r\n"
            + "}\r\n"
            + ".null {\r\n"
            + "	color: #FF0000;\r\n"
            + "	font-weight: bold;\r\n"
            + "	font-style: italic;\r\n" + "}\r\n"
            + "</style>\r\n" + "</head>\r\n" + "\r\n"
            + "<body><pre>");
    }

    private static void generateFooter(PrintWriter writer) {
        writer.println("</pre>\r\n" + "</body>\r\n" + "</html>");
    }

    private ASTPrinter(PrintWriter writer, List<String> sourceLines) {
        this.writer = writer;
        this.sourceLines = sourceLines;
    }

    // ----------------------------------------------
	//	class Programa { List<Definicion> definiciones; }
	public Object visit(Programa node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "Programa", node, false);

		visit(indent + 1, "definiciones", "List<Definicion>",node.getDefiniciones());
		return null;
	}

	//	class VariableDefinida { Variable var; }
	public Object visit(VariableDefinida node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "VariableDefinida", node, false);

		visit(indent + 1, "var", "Variable",node.getVar());
		return null;
	}

	//	class Variable { String nombre;  Tipo tipado; }
	public Object visit(Variable node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "Variable", node, false);

		print(indent + 1, "nombre", "String", node.getNombre());
		visit(indent + 1, "tipado", "Tipo",node.getTipado());
		return null;
	}

	//	class EstructuraDefinida { String nombre;  List<Variable> variables; }
	public Object visit(EstructuraDefinida node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "EstructuraDefinida", node, false);

		print(indent + 1, "nombre", "String", node.getNombre());
		visit(indent + 1, "variables", "List<Variable>",node.getVariables());
		return null;
	}

	//	class VariablesStruct { Variable variables; }
	public Object visit(VariablesStruct node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "VariablesStruct", node, false);

		visit(indent + 1, "variables", "Variable",node.getVariables());
		return null;
	}

	//	class MetodoDefinido { List<Variable> parametros;  Tipo retorno;  List<VariableDefinida> variablesDef;  List<Sentencia> sentenciasEj; }
	public Object visit(MetodoDefinido node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "MetodoDefinido", node, false);

		visit(indent + 1, "parametros", "List<Variable>",node.getParametros());
		visit(indent + 1, "retorno", "Tipo",node.getRetorno());
		visit(indent + 1, "variablesDef", "List<VariableDefinida>",node.getVariablesDef());
		visit(indent + 1, "sentenciasEj", "List<Sentencia>",node.getSentenciasEj());
		return null;
	}

	//	class VariablesParametros { List<Variable> variables; }
	public Object visit(VariablesParametros node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "VariablesParametros", node, false);

		visit(indent + 1, "variables", "List<Variable>",node.getVariables());
		return null;
	}

	//	class ReturnTipo { Tipo tipo; }
	public Object visit(ReturnTipo node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "ReturnTipo", node, false);

		visit(indent + 1, "tipo", "Tipo",node.getTipo());
		return null;
	}

	//	class VariablesDefinidas { List<VariablesDefinidas> variablesdefinidas; }
	public Object visit(VariablesDefinidas node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "VariablesDefinidas", node, false);

		visit(indent + 1, "variablesdefinidas", "List<VariablesDefinidas>",node.getVariablesdefinidas());
		return null;
	}

	//	class ArrayDefinido { String nombre;  Tipo type; }
	public Object visit(ArrayDefinido node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "ArrayDefinido", node, false);

		print(indent + 1, "nombre", "String", node.getNombre());
		visit(indent + 1, "type", "Tipo",node.getType());
		return null;
	}

	//	class ExpresionParentesis { Expresion expr; }
	public Object visit(ExpresionParentesis node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "ExpresionParentesis", node, false);

		visit(indent + 1, "expr", "Expresion",node.getExpr());
		return null;
	}

	//	class ExpresionIdent { String identificador; }
	public Object visit(ExpresionIdent node, Object param) {
		int indent = ((Integer)param).intValue();

		printCompact(indent, "ExpresionIdent", node, "identificador", node.getIdentificador());
		return null;
	}

	//	class ExpresionConstante { String constante; }
	public Object visit(ExpresionConstante node, Object param) {
		int indent = ((Integer)param).intValue();

		printCompact(indent, "ExpresionConstante", node, "constante", node.getConstante());
		return null;
	}

	//	class ExpresionLlamadaMetodo { String nombre;  List<Expresion> parametros; }
	public Object visit(ExpresionLlamadaMetodo node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "ExpresionLlamadaMetodo", node, false);

		print(indent + 1, "nombre", "String", node.getNombre());
		visit(indent + 1, "parametros", "List<Expresion>",node.getParametros());
		return null;
	}

	//	class ExpresionCampoStruct { Expresion nombreStruct;  String campo; }
	public Object visit(ExpresionCampoStruct node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "ExpresionCampoStruct", node, false);

		visit(indent + 1, "nombreStruct", "Expresion",node.getNombreStruct());
		print(indent + 1, "campo", "String", node.getCampo());
		return null;
	}

	//	class ExpresionArray { Expresion id;  Expresion pos; }
	public Object visit(ExpresionArray node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "ExpresionArray", node, false);

		visit(indent + 1, "id", "Expresion",node.getId());
		visit(indent + 1, "pos", "Expresion",node.getPos());
		return null;
	}

	//	class ExpresionAritmetica { Expresion l;  String op;  Expresion r; }
	public Object visit(ExpresionAritmetica node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "ExpresionAritmetica", node, false);

		visit(indent + 1, "l", "Expresion",node.getL());
		print(indent + 1, "op", "String", node.getOp());
		visit(indent + 1, "r", "Expresion",node.getR());
		return null;
	}

	//	class ExpresionLogica { Expresion l;  String op;  Expresion r; }
	public Object visit(ExpresionLogica node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "ExpresionLogica", node, false);

		visit(indent + 1, "l", "Expresion",node.getL());
		print(indent + 1, "op", "String", node.getOp());
		visit(indent + 1, "r", "Expresion",node.getR());
		return null;
	}

	//	class ExpresionCast { Tipo type;  Expresion ex; }
	public Object visit(ExpresionCast node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "ExpresionCast", node, false);

		visit(indent + 1, "type", "Tipo",node.getType());
		visit(indent + 1, "ex", "Expresion",node.getEx());
		return null;
	}

	//	class ParametrosPasados { List<Expresion> params; }
	public Object visit(ParametrosPasados node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "ParametrosPasados", node, false);

		visit(indent + 1, "params", "List<Expresion>",node.getParams());
		return null;
	}

	//	class SentenciaExpresion { Expresion expr; }
	public Object visit(SentenciaExpresion node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "SentenciaExpresion", node, false);

		visit(indent + 1, "expr", "Expresion",node.getExpr());
		return null;
	}

	//	class SentenciaAsignacion { Expresion l;  Expresion r; }
	public Object visit(SentenciaAsignacion node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "SentenciaAsignacion", node, false);

		visit(indent + 1, "l", "Expresion",node.getL());
		visit(indent + 1, "r", "Expresion",node.getR());
		return null;
	}

	//	class SentenciaIf { Expresion expr;  List<Sentencia> ifTrue; }
	public Object visit(SentenciaIf node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "SentenciaIf", node, false);

		visit(indent + 1, "expr", "Expresion",node.getExpr());
		visit(indent + 1, "ifTrue", "List<Sentencia>",node.getIfTrue());
		return null;
	}

	//	class SentenciaIfElse { Expresion expr;  List<Sentencia> ifTrue;  List<Sentencia> ifFalse; }
	public Object visit(SentenciaIfElse node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "SentenciaIfElse", node, false);

		visit(indent + 1, "expr", "Expresion",node.getExpr());
		visit(indent + 1, "ifTrue", "List<Sentencia>",node.getIfTrue());
		visit(indent + 1, "ifFalse", "List<Sentencia>",node.getIfFalse());
		return null;
	}

	//	class SentenciaWhile { Expresion expr;  List<Sentencia> contenido; }
	public Object visit(SentenciaWhile node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "SentenciaWhile", node, false);

		visit(indent + 1, "expr", "Expresion",node.getExpr());
		visit(indent + 1, "contenido", "List<Sentencia>",node.getContenido());
		return null;
	}

	//	class Sentencias { List<Sentencia> list; }
	public Object visit(Sentencias node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "Sentencias", node, false);

		visit(indent + 1, "list", "List<Sentencia>",node.getList());
		return null;
	}

	//	class SentenciaCondicional { Sentencia condicional; }
	public Object visit(SentenciaCondicional node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "SentenciaCondicional", node, false);

		visit(indent + 1, "condicional", "Sentencia",node.getCondicional());
		return null;
	}

	//	class SentenciaPrint { Expresion expr; }
	public Object visit(SentenciaPrint node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "SentenciaPrint", node, false);

		visit(indent + 1, "expr", "Expresion",node.getExpr());
		return null;
	}

	//	class SentenciaRead { Expresion expr; }
	public Object visit(SentenciaRead node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "SentenciaRead", node, false);

		visit(indent + 1, "expr", "Expresion",node.getExpr());
		return null;
	}

	//	class SentenciaReturn { Expresion expr; }
	public Object visit(SentenciaReturn node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "SentenciaReturn", node, false);

		visit(indent + 1, "expr", "Expresion",node.getExpr());
		return null;
	}

	//	class SentenciaPrintVoid {  }
	public Object visit(SentenciaPrintVoid node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "SentenciaPrintVoid", node, true);

		return null;
	}

	//	class SentenciaReturnVoid {  }
	public Object visit(SentenciaReturnVoid node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "SentenciaReturnVoid", node, true);

		return null;
	}

	//	class TipoInt {  }
	public Object visit(TipoInt node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "TipoInt", node, true);

		return null;
	}

	//	class TipoFloat {  }
	public Object visit(TipoFloat node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "TipoFloat", node, true);

		return null;
	}

	//	class TipoChar {  }
	public Object visit(TipoChar node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "TipoChar", node, true);

		return null;
	}

	//	class TipoStruct { String nombre; }
	public Object visit(TipoStruct node, Object param) {
		int indent = ((Integer)param).intValue();

		printCompact(indent, "TipoStruct", node, "nombre", node.getNombre());
		return null;
	}

	//	class TipoArray { int dim;  Tipo type; }
	public Object visit(TipoArray node, Object param) {
		int indent = ((Integer)param).intValue();

		printName(indent, "TipoArray", node, false);

		print(indent + 1, "dim", "int", node.getDim());
		visit(indent + 1, "type", "Tipo",node.getType());
		return null;
	}


	// -----------------------------------------------------------------
	// Métodos invocados desde los métodos visit -----------------------

	private void printName(int indent, String name, AST node, boolean empty) {
		String text = ls + tabula(indent) + name + " &rarr;  ";
		text = String.format("%1$-" + 93 + "s", text);
		if (empty)
			text = text.replace(name, valueTag(name));
		writer.print(text + getPosition(node));
	}

	private void print(int indent, String name, String type, Object value) {
		write(indent, formatValue(value) + "  " + typeTag(type));
	}

	private void print(int indent, String attName, String type, List<? extends Object> children) {
		write(indent, attName + "  " + typeTag(type) + " = ");
		if (children != null)
			for (Object child : children)
				write(indent + 1, formatValue(child));
		else
			writer.print(" " + valueTag(null));
	}

	// Versión compacta de una linea para nodos que solo tienen un atributo String
	private void printCompact(int indent, String nodeName, AST node, String attName, Object value) {
		String fullName = nodeName + '.' + attName;
		String text = ls + tabula(indent) + '\"' + value + "\"  " + fullName;
		text = String.format("%1$-" + 88 + "s", text);
		// text = text.replace(value.toString(), valueTag(value));
		text = text.replace(fullName, typeTag(fullName));
		writer.print(text + getPosition(node));
	}

	private void visit(int indent, String attName, String type, List<? extends AST> children) {
		write(indent, attName + "  " + typeTag(type) + " = ");
		if (children != null)
			for (AST child : children)
				child.accept(this, indent + 1);
		else
			writer.print(" " + valueTag(null));
	}

	private void visit(int indent, String attName, String type, AST child) {
		if (child != null)
			child.accept(this, Integer.valueOf(indent));
		else
			write(indent, valueTag(null) + "  " + attName + ':' + typeTag(type));
	}

	// -----------------------------------------------------------------
	// Métodos auxiliares privados -------------------------------------

	private void write(int indent, String text) {
		writer.print(ls + tabula(indent) + text);
	}

	private static String tabula(int count) {
		StringBuffer cadena = new StringBuffer("<span class=\"dots\">");
		for (int i = 0; i < count; i++)
			cadena.append(i % 2 == 0 && i > 0 ? "|  " : ".  ");
		return cadena.toString() + "</span>";
	}

	private String typeTag(String type) {
		if (type.equals("String"))
			return "";
		return "<span class=\"type\">" + type.replace("<", "&lt;").replace(">", "&gt;") + "</span>";
	}

	private String valueTag(Object value) {
		if (value == null)
			return "<span class=\"null\">null</span>";
		return "<span class=\"value\">" + value + "</span>";
	}

	private String formatValue(Object value) {
		String text = valueTag(value);
		if (value instanceof String)
			text = "\"" + text + '"';
		return text;
	}


	// -----------------------------------------------------------------
	// Métodos para mostrar las Posiciones -----------------------------

	private String getPosition(AST node) {
		String text = node.getStart() + "  " + node.getEnd();
		text = "<span class=\"pos\">" + String.format("%1$-" + 13 + "s", text) + "</span>";
		text = text.replace("null", "<span class=\"null\">null</span>");
		String sourceText = findSourceText(node);
		if (sourceText != null)
			text += sourceText;
		return text;
	}

	private String findSourceText(AST node) {
		if (sourceLines == null)
			return null;

		Position start = node.getStart();
		Position end = node.getEnd();
		if (start == null || end == null)
			return null;

		String afterText, text, beforeText;
		if (start.getLine() == end.getLine()) {
			String line = sourceLines.get(start.getLine() - 1);
			afterText = line.substring(0, start.getColumn() - 1);
			text = line.substring(start.getColumn() - 1, end.getColumn());
			beforeText = line.substring(end.getColumn());
		} else {
			String firstLine = sourceLines.get(start.getLine() - 1);
			String lastLine = sourceLines.get(end.getLine() - 1);

			afterText = firstLine.substring(0, start.getColumn() - 1);

			text = firstLine.substring(start.getColumn() - 1);
			text += "</span><span class=\"sourceText\">" + " ... " + "</span><span class=\"posText\">";
			text += lastLine.substring(0, end.getColumn()).replaceAll("^\\s+", "");

			beforeText = lastLine.substring(end.getColumn());
		}
		return "<span class=\"sourceText\">" + afterText.replaceAll("^\\s+", "")
				+ "</span><span class=\"posText\">" + text
				+ "</span><span class=\"sourceText\">" + beforeText + "</span>";
	}

	private static List<String> loadLines(String sourceFile, int tabWidth) {
		if (sourceFile == null)
			return null;
		try {
			String spaces = new String(new char[tabWidth]).replace("\0", " ");

			List<String> lines = new ArrayList<String>();
			BufferedReader br = new BufferedReader(new FileReader(sourceFile));
			String line;
			while ((line = br.readLine()) != null) {
			//	lines.add(line.replace("\t", spaces)); // Si tab = 4 espaces (Eclipse)
				lines.add(line);
            }
			br.close();
			return lines;
		} catch (FileNotFoundException e) {
			System.out.println("Warning. No se pudo encontrar el fichero fuente '" + sourceFile + "'. No se mostrará informaicón de posición.");
			return null;
		} catch (IOException e) {
			System.out.println("Warning. Error al leer del fichero fuente '" + sourceFile + "'. No se mostrará informaicón de posición.");
			return null;
		}
	}


	private List<String> sourceLines;
	private static String ls = System.getProperty("line.separator");
	private PrintWriter writer;
}
