grammar Grammar;
import Lexicon;

start: definicion* EOF;

//definición temporal
cosas: LITENT | LITREAL | CHAR;

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
defFunc:;

definicion: defVar | defStruct | defFunc;
