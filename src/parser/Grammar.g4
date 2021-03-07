grammar Grammar;
@parser::header {
	import ast.*;
	}
import Lexicon;

start
	returns[Programa ast]:
	definiciones EOF { $ast = new Programa($definiciones.list); };

definiciones
	returns[List<Definicion> list = new ArrayList<Definicion>()]: (
		definicion {$list.add($definicion.ast);}
	);

definicion
	returns[Definicion ast]:
	defVar { $ast = new DefVar($defVar.ast );}
	| defStruct { $ast = new DefStruct($defStruct.ast);}
	| defFunc;

//definición de variables
tipo
	returns[Tipo ast]:
	'int' { $ast = new TipoInt();}
	| 'float' { $ast = new TipoFloat();}
	| 'char' { $ast = new TipoChar();}
	| IDENT { $ast = new tipoStruct($IDENT.text);} //esto es para los structs
	| '[' LITENT ']' tipo { $ast = tipo.ast; }; //este patrón es composición

defVar
	returns[DefVar ast]:
	'var' IDENT ':' tipo ';' { $ast = new DefVar( $IDENT.text, tipo.ast) };

//definición de estructuras
defStruct
	returns[DefStruct ast]:
	'struct' IDENT '{' sentencia '}' { $ast = new DefStruct($IDENT.text, $sentencia.ast); };

//definicion de funciones
defFunc
	returns[DefFunc ast]:
	funcName = IDENT '(' params ')' (':' tipo)? '{' sentencias '}' //
	{ $ast =  new DefFunc($IDENT, $params.list, $tipo.ast, $sentencias.list); 
		};

params
	returns[List<Param> list = new ArrayList<Param>()]: (
		IDENT ':' tipo { $list.add(new Param($IDENT, $tipo.ast)); } (
			',' IDENT ':' tipo { $list.add(new Param($IDENT, $tipo.ast)); }
		)*
	)*;

asignacion
	returns[ Asignacion ast]:
	left = IDENT '=' right = IDENT ';' { $ast = new Asignacion( $left.text, $right.text); }
	| IDENT '=' expr ';' { $ast = new Asignacion( $IDENT.text, expr.ast) };

operador:
	'+'
	| '-'
	| '*'
	| '/'
	| '<'
	| '>'
	| '=='
	| '<='
	| '>='
	| '!='
	| '&&'
	| '||';

expr
	returns[Expresion ast]:
	CHAR { $ast = new CharConstant(&CHAR.text);}
	| LITENT { $ast = new IntConstant(&LITENT.text);}
	| LITREAL { $ast = new FloatConstant(&LITREAL.text);}
	| IDENT { $ast = new Identificador(&IDENT.text);}
	| l = expr operador r = expr { $ast = new ExpresionAritmetica(&l.ast, $operador.text, $r.ast);}
	| '<' tipo '>' IDENT { $ast = new Expresion($tipo.ast, $IDENT.text);}
	| '(' expr ')' { $ast = new Expresion(&expr.ast);}
	| IDENT '(' (expr (',' expr)*)* ')'; //

condicional
	returns[Condicional ast]:
	'if' '(' expr ')' '{' ifTrue = sentencias '}' 'else' '{' ifFalse = sentencias '}' { $ast = If($expr.ast, $ifTrue.list, ifFalse.list);
		}
	| 'while' '(' expr ')' '{' sentencias '}' { $ast = new While($expr.ast, $sentencias.list); };

sentencia
	returns[Sentencia ast]:
	defVar { $ast = new Definicion($defVar.ast);}
	| asignacion { $ast = new Asignacion($asignacion.ast);}
	| condicional { $ast = new Condicional($condicional.ast);}
	| keyword = ('println' | 'printsp') expr ';' { $ast = new Print($keyword.text, $expr.ast);}
	| 'return' expr ';' { $ast = new Return($expr.ast);}
	| 'read' expr ';' { $ast = new Read($expr.ast);};
sentencias
	returns[List<Sentencia> list = new ArrayList<Sentencia>()]: (
		sentencia {$list.add($sentencia.ast);}
	)*;
// keyword: 'println'|'printsp'|'return'|'read'|'load';
