grammar Grammar;
@parser::header {
	import ast.*;
	}
import Lexicon;

start
	returns[Programa ast]:
	definiciones EOF { $ast = new Programa($definiciones.list);};
definiciones
	returns[List<Definicion> list = new ArrayList<Definicion>()]: (
		definicion { $list.add($definicion.ast);}
	)*;
definicion
	returns[Definicion ast]:
	tipoSimple { $ast = $tipoSimple.ast;}
	| tipoComplejo { $ast = $tipoComplejo.ast;}
	| tipoStruct { $ast = $tipoStruct.ast;}
	| tipoFuncion { $ast = $tipoFuncion.ast;};

tipoSimple
	returns[Definicion ast]:
	'var' IDENT ':' tipo ';' { $ast = new TipoSimple($IDENT.text, $tipo.ast);};

tipoComplejo
	returns[Definicion ast]:
	'var' nombre = IDENT ':' estructura = IDENT ';' { $ast = new TipoComplejo($nombre.text, $estructura.text);
		};
tipo
	returns[Tipo ast]:
	t = 'int' { $ast = new TipoInt();}
	| t = 'char' { $ast = new TipoChar();}
	| t = 'float' { $ast = new TipoFloat();};

//no sé hacer esto array returns[Definicion ast]: 'var' IDENT ':' dimension tipo {$ast = new
// TipoArray($IDENT.text, $dimension.list, $tipo.ast);};

// dimension returns[List<String> list = new ArrayList<String>()]: ( '[' LITENT ']' {
// $list.add($LITENT.text);} )+;

tipoStruct
	returns[Definicion ast]:
	'struct' IDENT '{' defsNoVar '}' ';' {$ast = new TipoStruct($IDENT.text, $defsNoVar.list);};

defsNoVar
	returns[List<Definicion> list = new ArrayList<Definicion>()]:
	(
		IDENT ':' tipo {$list.add(new TipoSimple($IDENT.text, $tipo.ast));} ';'
	)*;

tipoFuncion
	returns[Definicion ast]:
	IDENT '(' defParams ')' ':' tipo '{' sentencias '}' { $ast = new TipoFuncion($IDENT.text, $defParams.list, $tipo.ast, $sentencias.list);
		}
	| IDENT '(' defParams ')' '{' sentencias '}' { $ast = new TipoFuncionSinRetorno($IDENT.text, $defParams.list,$sentencias.list);
		};

defParams
	returns[List<Definicion> list = new ArrayList<Definicion>()]: (
		IDENT ':' tipo {$list.add(new TipoSimple($IDENT.text, $tipo.ast));} (
			',' IDENT ':' tipo {$list.add(new TipoSimple($IDENT.text, $tipo.ast));}
		)*
	)*;

sentencias
	returns[List<Sentencia> list= new ArrayList<Sentencia>()]: (
		sentencia {$list.add($sentencia.ast);}
	)*;

sentencia
	returns[Sentencia ast]:
	'if' '(' expr ')' '{' ifTrue = sentencias '}' 'else' '{' ifFalse = sentencias '}' {$ast = new IfStatement($expr.ast, $ifTrue.list, $ifFalse.list);
		}
	| 'while' '(' expr ')' '{' sentencias '}' {$ast = new WhileStatement($expr.ast, $sentencias.list);
		}
	| IDENT '=' expr ';' {$ast = new Asignacion($IDENT.text, $expr.ast);}
	| ('printsp' | 'println') expr ';' {$ast = new PrintStatement($expr.ast);}
	| 'read' expr ';' {$ast = new ReadStatement($expr.ast);}
	| 'return' expr ';' {$ast =  new ReturnStatement($expr.ast);}
	//| expr ';' {$ast = new Sentencia($expr.ast;)}
	| asignacion {$ast = $asignacion.ast;}
	| tipoSimple;

expr
	returns[Expresion ast]:
	IDENT {$ast = new Ident($IDENT.text);}
	| IDENT '(' params ')' {$ast = new LlamadaFunc($IDENT.text, $params.list);}
	| l = expr op = (
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
		| '||'
	) r = expr {$ast = new ArithmeticExpresion($l.ast, $op.text, $r.ast);}
	| llamadaCampo {$ast = $llamadaCampo.ast;};

llamadaCampo
	returns[Expresion ast]:
	IDENT '.' expr {$ast = new LlamadaCampo($IDENT.text, $expr.ast);}
	| l = IDENT '.' r = IDENT {$ast = new LlamadaCampo($l.text, $r.text);};

params
	returns[List<Expresion> list = new ArrayList<Expresion>()]:
	valor = (IDENT | LITENT | LITREAL | CHAR) {$list.add(new Ident($valor.text));}
	| expr {$list.add(new ParamExpresion($expr.ast));}
	|;

asignacion
	returns[Asignacion ast]:
	l = expr '=' r = expr ';' {$ast = new Asignacion($l.ast, $r.ast);};