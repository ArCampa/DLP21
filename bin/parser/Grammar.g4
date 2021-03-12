grammar Grammar;
@parser::header {
	import ast.*;
	}
import Lexicon;

start
	returns[Programa ast]:
	declaraciones EOF { $ast = new Programa ($declaraciones.list);};

//todo lo que puede haber en un programa son declaraciones
declaraciones
	returns[List<Definicion> list = new ArrayList<Definicion>();]: (
		variableDefinida {$list.add($variableDefinida.ast);}
		| estructuraDefinida {$list.add($estructuraDefinida.ast);}
		| metodoDefinido {$list.add($metodoDefinido.ast);}
	)*;

//definicion de una variable
variableDefinida
	returns[Definicion ast]:
	'var' variable {$ast = new VariableDefinida($variable.ast);} ';';

//para declarar en structs o componer variables definidas
variable
	returns[Variable ast]:
	IDENT ':' tipo { $ast = new Variable($IDENT , $tipo.ast);
		};
//tipos que puede tener una variable o un retorno
tipo
	returns[Tipo ast]:
	'int' {$ast = new TipoInt();}
	| 'float' {$ast = new TipoFloat();}
	| 'char' {$ast = new TipoChar();}
	| IDENT {$ast = new TipoStruct($IDENT);}
	| '[' LITENT ']' tipo {$ast = new TipoArray(LITENT, $tipo.ast);};

//array, tipo puede ser [num] tipo, que puede ser [num] tipo #recursividad
arrayDefinido
	returns[ArrayDefinido ast]:
	'var' IDENT ':' tipo {$ast = new ArrayDefinido($IDENT, $tipo.ast);};

// //para las dimesiones de los arrays dimensiones returns[List<Expresion> list = new
// ArrayList<Expresion>();]: ('[' num = expr ']' {$list.add($num.ast);})+;

//definicion de una estructura
estructuraDefinida
	returns[Definicion ast]:
	'struct' IDENT '{' variablesStruct '}' ';' { $ast = new EstructuraDefinida($IDENT, $variablesStruct.list);
		};

// variables contenidas en una estructura, regla auxiliar
variablesStruct
	returns[List<Variable> list = new ArrayList<Variable>();]:
	(variable {$list.add($variable.ast);} ';')*;

//definicion de un metodo
metodoDefinido
	returns[Definicion ast]:
	IDENT '(' variablesParametros ')' returnTipoOpt '{' variablesDefinidas sentencias '}' { 
	if($returnTipoOpt.list.size()==1)
    { $ast = new MetodoDefinido($variablesParametros.list, $returnTipoOpt.list.get(0), $variablesDefinidas.list, $sentencias.list);}
    else
    {$ast = new MetodoDefinido($variablesParametros.list, null, $variablesDefinidas.list, $sentencias.list);}
		};

//parámetros de un metodo, se llaman variables al heredar de variable
variablesParametros
	returns[List<Variable> list = new ArrayList<Variable>();]: (
		primero = variable {$list.add($variable.ast);} (
			',' otro = variable {$list.add($variable.ast);}
		)*
	)?;

//tipo de retorno de un método, devuelve una lista vacía si es null
returnTipoOpt
	returns[List<Tipo> list = new ArrayList<Tipo>();]:
	':' tipo {$list.add($tipo.ast);}
	|;

//variables definidas dentro de un metodo, se agrupan en esta regla auxiliar porque no pueden aparecer entre sentencias
variablesDefinidas
	returns[List<VariableDefinida> list = new ArrayList<VariableDefinida>();]: (
		variableDefinida {$list.add((VariableDefinida) $variableDefinida.ast);
		}
	)*;

//expresiones, para comprobar cosas, asignar cosas, etc 
expr
	returns[Expresion ast]:
	'(' expr ')' {$ast = new ExpresionParentesis($expr.ast);}
	| IDENT {$ast = new ExpresionIdent($IDENT);}
	| constante = (LITENT | LITREAL | CHAR) {$ast = new
	ExpresionConstante($constante.text);}
	| '<' tipo '>' expr { $ast = new ExpresionCast($tipo.ast, $expr.ast);}
	| nombre = IDENT '(' parametrosPasados ')' {		
	$ast = new ExpresionLlamadaMetodo($nombre.text, $parametrosPasados.list);}
	| prev = expr '.' IDENT { $ast = new ExpresionCampoStruct($prev.ast, $IDENT);
		} //no funcionaba sin asignar la variable expr
	| id = expr '[' pos = expr ']' {$ast = new ExpresionArray($id.ast, $pos.ast);}
	| l = expr op = ('*' | '/') r = expr {$ast = new ExpresionAritmetica($l.ast, $op.text, $r.ast); 
		}
	| l = expr op = ('+' | '-') r = expr {$ast = new ExpresionAritmetica($l.ast, $op.text, $r.ast); 
		}
	| l = expr op = ('&&' | '||') r = expr {$ast = new ExpresionLogica($l.ast, $op.text, $r.ast); }
	| l = expr op = ('>' | '<' | '==' | '>=' | '<=' | '!=') r = expr {$ast = new ExpresionLogica($l.ast, $op.text,
	$r.ast); };

parametrosPasados //lista de los parámetros que se pasan a un método, regla auxiliar
	returns[List<Expresion> list = new ArrayList<Expresion>();]: (
		var1 = expr {  $list.add($var1.ast);} (
			',' varX = expr {  $list.add($varX.ast);}
		)*
	)?;

//lista de sentencias, regla auxiliar
sentencias
	returns[List<Sentencia> list = new ArrayList<Sentencia>();]: (
		sentencia {$list.add($sentencia.ast);}
	)*;
//sentencias que puede haber dentro de un metodo
sentencia
	returns[Sentencia ast]:
	expr ';' {$ast = new SentenciaExpresion($expr.ast); }
	| l = expr '=' r = expr ';' {$ast = new SentenciaAsignacion( $l.ast, $r.ast);}
	| sentenciaCondicional {$ast = $sentenciaCondicional.ast;}
	| ('println' | 'printsp') expr ';' {$ast = new SentenciaPrint($expr.ast);}
	| 'read' expr';' {$ast = new SentenciaRead($expr.ast);}
	| 'return' expr ';' {$ast = new SentenciaReturn($expr.ast);}
	| ('println' | 'printsp') ';' {$ast = new SentenciaPrintVoid();}
	| 'return' ';' {$ast = new SentenciaReturnVoid();};

//auxiliar para procesar sentencial condicionales, hecho para resolver problemas específicos
sentenciaCondicional
	returns[Sentencia ast]:
	'if' '(' expr ')' '{' ifTrue = sentencias '}' {$ast = new SentenciaIf($expr.ast, $ifTrue.list);}
	| 'if' '(' expr ')' '{' ifTrue = sentencias '}' 'else' '{' ifFalse = sentencias '}' {$ast = new SentenciaIfElse($expr.ast, $ifTrue.list, $ifFalse.list);
		}
	| 'while' '(' expr ')' '{' sentencias '}' {$ast = new SentenciaWhile($expr.ast, $sentencias.list);
		};

