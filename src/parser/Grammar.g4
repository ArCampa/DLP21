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

//descomentar para arrays variable[List<int> list = new ArrayList<int>()] //para declarar en structs
// o componer variables definidas returns[Variable ast]: IDENT ':' ('[' LITENT ']' {
// $list.add($LITENT); })*? tipo ';' { $ast = new Variable($IDENT, $list, $tipo.ast) };

//para declarar en structs o componer variables definidas
variable
	returns[Variable ast]:
	IDENT ':' tipo { $ast = new Variable($IDENT.text , $tipo.ast);
		};
//tipos que puede tener una variable o un retorno
tipo
	returns[Tipo ast]:
	'int' {$ast = new TipoInt();}
	| 'float' {$ast = new TipoFloat();}
	| 'char' {$ast = new TipoChar();}
	| IDENT {$ast = new TipoStruct($IDENT.text);};
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
	IDENT '(' variablesParametros ')' returnTipoOpt '{' variablesDefinidas sentencias '}' { if($returnTipoOpt.list.size()==1)
    { $ast = new MetodoDefinido($variablesParametros.list, $returnTipo.list.get(0), $variablesDefinidas.list);}
    else
    {$ast = new MetodoDefinido($variablesParametros.list, null, $variablesDefinidas.list);}
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
		variableDefinida {$list.add((VariableDefinida) $variableDefinida.ast);}
	)*;

//sentencias que puede haber dentro de un metodo
sentencias:;