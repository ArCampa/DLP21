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
defStruct:;

//definicion de funciones
defFunc:
	IDENT '(' (IDENT ':' tipo (',' IDENT ':' tipo)*)* ')' ':' tipo '{' (
		sentencia
	)* '}'; //

definicion: defVar | defStruct | defFunc;

asignacion: IDENT '=' IDENT | IDENT '=' expr;

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

expr: CHAR | LITENT | LITREAL | IDENT | expr operador expr | '<' tipo '>' IDENT; //

condicional:
	'if' '(' expr ')' '{' sentencia* '}' 'else' '{' sentencia* '}'
	| 'while' '(' expr ')' '{' sentencia* '}';

sentencia: defVar | asignacion | condicional;
