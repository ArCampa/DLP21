grammar Grammar;
import Lexicon;

start: definicion* EOF;

//definición de variables
tipo:
	'int'
	| 'float'
	| 'char'
	| IDENT //esto es para los structs
	| '[' LITENT ']' tipo; //este patrón es composición
defVar: 'var' IDENT ':' tipo ';';

//definición de estructuras
defStruct: 'struct' IDENT '{' sentencia '}';

//definicion de funciones
defFunc:
	IDENT '(' (IDENT ':' tipo (',' IDENT ':' tipo)*)* ')' (
		':' tipo
	)? '{' (sentencia)* '}'; //

definicion: defVar | defStruct | defFunc;

<<<<<<< HEAD
<<<<<<< HEAD
asignacion: IDENT '=' IDENT ';' | IDENT '=' expr ';';
=======
asignacion: IDENT '=' IDENT | IDENT = expr;
>>>>>>> parent of b826416 (Grammar ready for testing)
=======
asignacion: IDENT '=' IDENT | IDENT = expr;
>>>>>>> parent of b826416 (Grammar ready for testing)

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

<<<<<<< HEAD
<<<<<<< HEAD
expr:
	CHAR
	| LITENT
	| LITREAL
	| IDENT
	| expr operador expr
	| '<' tipo '>' IDENT
	| '(' expr ')'
	| IDENT '(' (expr (',' expr)*)* ')'; //
=======
expr: CHAR | LITENT | LITREAL | IDENT | expr operador expr; //
>>>>>>> parent of b826416 (Grammar ready for testing)
=======
expr: CHAR | LITENT | LITREAL | IDENT | expr operador expr; //
>>>>>>> parent of b826416 (Grammar ready for testing)

condicional:
	'if' '(' expr ')' '{' sentencia* '}' 'else' '{' sentencia* '}';

sentencia:
	defVar
	| asignacion
	| condicional
	| ('println' | 'printsp') expr ';'
	| 'return' expr ';'
	| 'read' expr ';';

// keyword: 'println'|'printsp'|'return'|'read'|'load';
