grammar Java;

goal
:	mainClass classDeclaration* EOF
;


mainClass
:	'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}';

classDeclaration
:	'class' Identifier ( 'extends' Identifier )? '{' fieldDeclaration* methodDeclaration* '}';

fieldDeclaration
:	varDeclaration ;

varDeclaration
:	typeDim Identifier ';';

methodDeclaration
:	'public' typeDim Identifier '(' parameterList? ')' '{' methodBody '}';

parameterList
:   parameter (',' parameter)*
;

parameter
:   typeDim Identifier
;

methodBody
:	statement* RETURN (expression)? ';'
;


type
:	'int'
|	'boolean'
|   'float'
|   'char'
|	Identifier
;


typeDim
:	'int' dims
|	'boolean' dims
|   'float'dims
|   'char'dims
|	Identifier dims
|	'int'
|	'boolean'
|   'float'
|   'char'
|	Identifier
;

dims
:   '[' ']' ('[' ']')*
;

statement
:	'{' statement* '}'
#nestedStatement
|   fieldDeclaration
#declaration
|	'if' LP expression RP ifBlock 'else' elseBlock
#ifElseStatement
|	'while' LP expression RP whileBlock
#whileStatement
|   'for' LP statement ';' expression ';' statement RP whileBlock
#forStatement
|	'println' LP  expression RP ';'
#printStatement
|	Identifier EQ expression ';'
#variableAssignmentStatement
|	Identifier LSB expression RSB (LSB expression RSB)* EQ expression ';'
#arrayAssignmentStatement
;

ifBlock
:	statement
;

elseBlock
:	statement
;

whileBlock
:	statement
;

expression
:   Identifier LSB expression RSB ( LSB expression RSB )*
# arrayAccessExpression

|   Identifier '(' ( expression ( ',' expression )* )? ')'
# methodCallExpression

|   NOT expression
# notExpression

|   'new' type LSB IntegerLiteral RSB ( LSB IntegerLiteral RSB )*
# arrayInstantiationExpression

|   'new' Identifier '(' ')'
# objectInstantiationExpression

|	expression POWER expression
# powExpression

|   expression TIMES expression
# mulExpression

|   expression PLUS expression
# addExpression

|   expression MINUS expression
# subExpression

|   expression LT expression
# ltExpression

|   expression GT expression
# gtExpression

|   expression LTE expression
# lteExpression

|   expression GTE expression
# gteExpression

|   expression EQU expression
#equExpression

|   expression AND expression
# andExpression

|   expression OR expression
# andExpression

|   IntegerLiteral
# intLitExpression

|   DecimalLiteral
# decLitExpression

|   BooleanLiteral
# booleanLitExpression

|   Identifier
# identifierExpression

|   'this'
# thisExpression

|   '(' expression ')'
# parenExpression
;

AND:'&&';
LT:'<';
LTE:'<=';
GT:'>';
GTE:'>=';
EQU:'==';
PLUS:'+';
MINUS:'-';
TIMES:'*';
POWER:'**';
NOT:'!';
LSB:'[';
RSB:']';
LP:'(';
RP:')';
RETURN: 'return';
EQ: '=';

BooleanLiteral
:	'true'
|	'false'
;

Identifier
:	JavaLetter JavaLetterOrDigit*
;

fragment
JavaLetter
:	[a-zA-Z$_] // these are the 'java letters' below 0xFF
;

fragment
JavaLetterOrDigit
:	[a-zA-Z0-9$_] // these are the 'java letters or digits' below 0xFF
;

IntegerLiteral
:	DecimalIntegerLiteral
;

DecimalLiteral
:   IntegerLiteral.IntegerLiteral
;
fragment
DecimalIntegerLiteral
:	DecimalNumeral
;


fragment
DecimalNumeral
	:	'0'
|	NonZeroDigit (Digits? | Underscores Digits)
	;

	fragment
	Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

	fragment
	Digit
	:	'0'
	|	NonZeroDigit
	;

	fragment
	NonZeroDigit
	:	[1-9]
	;

	fragment
	DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

	fragment
	DigitOrUnderscore
	:	Digit
	|	'_'
	;

	fragment
	Underscores
	:	'_'+
	;

	WS
	:   [ \r\t\n]+ -> skip
	;

	MULTILINE_COMMENT
	:  '/*' .*? '*/' -> skip
	;
	LINE_COMMENT
	:  '//' .*? '\n' -> skip
	;