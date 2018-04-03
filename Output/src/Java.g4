/*
 * [The "BSD license"]
 *  Copyright (c) 2014 Terence Parr
 *  Copyright (c) 2014 Sam Harwell
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * A Java 8 grammar for ANTLR 4 derived from the Java Language Specification
 * chapter 19.
 *
 * NOTE: This grammar results in a generated parser that is much slower
 *       than the Java 7 grammar in the grammars-v4/java directory. This
 *     one is, however, extremely close to the spec.
 *
 * You can test with
 *
 *  $ antlr4 Java8.g4
 *  $ javac *.java
 *  $ grun Java8 compilationUnit *.java
 *
 * Or,
~/antlr/code/grammars-v4/java8 $ java Test .
/Users/parrt/antlr/code/grammars-v4/java8/./Java8BaseListener.java
/Users/parrt/antlr/code/grammars-v4/java8/./Java8Lexer.java
/Users/parrt/antlr/code/grammars-v4/java8/./Java8Listener.java
/Users/parrt/antlr/code/grammars-v4/java8/./Java8Parser.java
/Users/parrt/antlr/code/grammars-v4/java8/./Test.java
Total lexer+parser time 30844ms.
 */

// Modified ANTLR format Java BNF for Compiler Design [CS335]
grammar Java;


/*
 * Productions from §3 (Lexical Structure)
 */

literal
	:	IntegerLiteral	#java1
	|	FloatingPointLiteral	#java2
	|	BooleanLiteral	#java3
	|	CharacterLiteral	#java4
	|	StringLiteral	#java5
	|	NullLiteral	#java6
	;

/*
 * Productions from §4 (Types, Values, and Variables)
 */

typeType
    :  (classOrInterfaceType | primitiveType) ('[' ']')*
    ;


type
	:	primitiveType	#java7
	|	referenceType	#java8
	;

primitiveType
	:	numericType	#java9
	|	'boolean'	#java10
	;

numericType
	:	integralType	#java11
	|	floatingPointType	#java12
	;

integralType
	:	'int'	#java13
	|	'char'	#java14
	;

floatingPointType
	:	'float'	#java15
	;

referenceType
	:	classOrInterfaceType	#java16
	|	typeVariable	#java17
	|	arrayType	#java18
	;

classOrInterfaceType
	:	(	classType_lfno_classOrInterfaceType
		)
		(	classType_lf_classOrInterfaceType
		)*	#java19
	;

classType
	:	Identifier typeArguments?	#java20
	|	classOrInterfaceType '.' Identifier typeArguments?	#java21
	;

classType_lf_classOrInterfaceType
	:	'.' Identifier typeArguments?	#java22
	;

classType_lfno_classOrInterfaceType
	:	Identifier typeArguments?	#java23
	;

typeVariable
	:	Identifier	#java24
	;

arrayType
	:	primitiveType dims	#java25
	|	classOrInterfaceType dims	#java26
	|	typeVariable dims	#java27
	;

dims
	:	'[' ']' ('[' ']')*	#java28
	;

typeParameter
	:	Identifier typeBound?	#java29
	;

typeBound
	:	'extends' typeVariable	#java30
	;

typeArguments
	:	'<' typeArgumentList '>'	#java31
	;

typeArgumentList
	:	typeArgument (',' typeArgument)*	#java32
	;

typeArgument
	:	referenceType	#java33
	|	wildcard	#java34
	;

wildcard
	:	'?' wildcardBounds?	#java35
	;

wildcardBounds
	:	'extends' referenceType	#java36
	|	'super' referenceType	#java37
	;

/*
 * Productions from §6 (Names)
 */

packageName
	:	Identifier	#java38
	|	packageName '.' Identifier	#java39
	;

typeName
	:	Identifier	#java40
	|	packageOrTypeName '.' Identifier	#java41
	;

packageOrTypeName
	:	Identifier	#java42
	|	packageOrTypeName '.' Identifier	#java43
	;

expressionName
	:	Identifier	#java44
	|	ambiguousName '.' Identifier	#java45
	;

methodName
	:	Identifier	#java46
	;

ambiguousName
	:	Identifier	#java47
	|	ambiguousName '.' Identifier	#java48
	;

/*
 * Productions from §7 (Packages)
 */

compilationUnit
	:	packageDeclaration? importDeclaration* typeDeclaration* EOF	#java49
	;

packageDeclaration
	:	'package' Identifier ('.' Identifier)* ';'	#java50
	;

importDeclaration
	:	singleTypeImportDeclaration	#java51
	|	typeImportOnDemandDeclaration	#java52
	|	singleStaticImportDeclaration	#java53
	|	staticImportOnDemandDeclaration	#java54
	;

singleTypeImportDeclaration
	:	'import' typeName ';'	#java55
	;

typeImportOnDemandDeclaration
	:	'import' packageOrTypeName '.' '*' ';'	#java56
	;

singleStaticImportDeclaration
	:	'import' 'static' typeName '.' Identifier ';'	#java57
	;

staticImportOnDemandDeclaration
	:	'import' 'static' typeName '.' '*' ';'	#java58
	;

typeDeclaration
	:	classDeclaration	#java59
	|	';'	#java60
	;

/*
 * Productions from §8 (Classes)
 */

classDeclaration
	:	normalClassDeclaration	#java61
	;

normalClassDeclaration
	:	classModifier* 'class' Identifier typeParameters? superclass? classBody	#java62
	;

classModifier
	:	'public'	#java63
	|	'private'	#java64
	|	'abstract'	#java65
	|	'static'	#java66
	;

typeParameters
	:	'<' typeParameterList '>'	#java67
	;

typeParameterList
	:	typeParameter (',' typeParameter)*	#java68
	;

superclass
	:	'extends' classType	#java69
	;

classBody
	:	'{' classBodyDeclaration* '}'	#java70
	;

classBodyDeclaration
	:	classMemberDeclaration	#java71
	|	instanceInitializer	#java72
	|	staticInitializer	#java73
	|	constructorDeclaration	#java74
	;

classMemberDeclaration
	:	fieldDeclaration	#java75
	|	methodDeclaration	#java76
	|	classDeclaration	#java77
	|	';'	#java78
	;

fieldDeclaration
	:	fieldModifier* typeType variableDeclaratorList ';'	#java79
	;

fieldModifier
	:	'public'	#java80
	|	'private'	#java81
	|	'static'	#java82
	;

variableDeclaratorList
	:	variableDeclarator (',' variableDeclarator)*	#java83
	;

variableDeclarator
	:	variableDeclaratorId ('=' variableInitializer)?	#java84
	;

variableDeclaratorId
	:	Identifier dims?	#java85
	;

variableInitializer
	:	expression	#java86
	|	arrayInitializer	#java87
	;

methodDeclaration
	:	methodModifier* methodHeader methodBody	#java88
	;

methodModifier
	:	'public'	#java89
	|	'private'	#java90
	|	'abstract'	#java91
	|	'static'	#java92
	;

methodHeader
	:	result methodDeclarator	#java93
	|	typeParameters methodDeclarator	#java94
	;

result
	:	'void'	#java95
	|	type	#java96
	;

methodDeclarator
	:	Identifier '(' formalParameterList? ')' dims?	#java97
	;

formalParameterList
	:	formalParameters ',' lastFormalParameter	#java98
	|	lastFormalParameter	#java99
	;

formalParameters
	:	formalParameter (',' formalParameter)*	#java100
	|	receiverParameter (',' formalParameter)*	#java101
	;

formalParameter
	:	typeType variableDeclaratorId	#java102
	;

lastFormalParameter
	:	typeType '...' variableDeclaratorId	#java103
	|	formalParameter	#java104
	;

receiverParameter
	:	(Identifier '.')? 'this'	#java105
	;


methodBody
	:	block	#java106
	|	';'	#java107
	;

instanceInitializer
	:	block	#java108
	;

staticInitializer
	:	'static' block	#java109
	;

constructorDeclaration
	:	constructorModifier* constructorDeclarator constructorBody	#java110
	;

constructorModifier
	:	'public'	#java111
	|	'private'	#java112
	;

constructorDeclarator
	:	typeParameters? simpleTypeName '(' formalParameterList? ')'	#java113
	;

simpleTypeName
	:	Identifier	#java114
	;

constructorBody
	:	'{' explicitConstructorInvocation? blockStatements? '}'	#java115
	;

explicitConstructorInvocation
	:	typeArguments? 'this' '(' argumentList? ')' ';'	#java116
	|	typeArguments? 'super' '(' argumentList? ')' ';'	#java117
	|	expressionName '.' typeArguments? 'super' '(' argumentList? ')' ';'	#java118
	|	primary '.' typeArguments? 'super' '(' argumentList? ')' ';'	#java119
	;

/*
 * Productions from §9 (Interfaces)
 */

constantDeclaration
	:	constantModifier* variableDeclaratorList ';'	#java120
	;

constantModifier
	:	'public'	#java121
	|	'static'	#java122
	;

elementValuePairList
	:	elementValuePair (',' elementValuePair)*	#java123
	;

elementValuePair
	:	Identifier '=' elementValue	#java124
	;

elementValue
	:	conditionalExpression	#java125
	|	elementValueArrayInitializer	#java126
	;

elementValueArrayInitializer
	:	'{' elementValueList? ','? '}'	#java127
	;

elementValueList
	:	elementValue (',' elementValue)*	#java128
	;

/*
 * Productions from §10 (Arrays)
 */

arrayInitializer
	:	'{' variableInitializerList? ','? '}'	#java129
	;

variableInitializerList
	:	variableInitializer (',' variableInitializer)*	#java130
	;

/*
 * Productions from §14 (Blocks and Statements)
 */

block
	:	'{' blockStatements? '}'	#java131
	;

blockStatements
	:	blockStatement blockStatement*	#java132
	;

blockStatement
	:	localVariableDeclarationStatement	#java133
	|	classDeclaration	#java134
	|	statement	#java135
	;

localVariableDeclarationStatement
	:	localVariableDeclaration ';'	#java136
	;

localVariableDeclaration
	:	typeType variableDeclaratorList	#java137
	;

statement
	:	statementWithoutTrailingSubstatement	#java138
	|	labeledStatement	#java139
	|	ifThenStatement	#java140
	|	ifThenElseStatement	#java141
	|	whileStatement	#java142
	|	forStatement	#java143
	;

statementNoShortIf
	:	statementWithoutTrailingSubstatement	#java144
	|	labeledStatementNoShortIf	#java145
	|	ifThenElseStatementNoShortIf	#java146
	|	whileStatementNoShortIf	#java147
	|	forStatementNoShortIf	#java148
	;

statementWithoutTrailingSubstatement
	:	block	#java149
	|	emptyStatement	#java150
	|	expressionStatement	#java151
	|	breakStatement	#java152
	|	continueStatement	#java153
	|	returnStatement	#java154
	;

emptyStatement
	:	';'	#java155
	;

labeledStatement
	:	Identifier ':' statement	#java156
	;

labeledStatementNoShortIf
	:	Identifier ':' statementNoShortIf	#java157
	;

expressionStatement
	:	statementExpression ';'	#java158
	;

statementExpression
	:	assignment	#java159
	|	preIncrementExpression	#java160
	|	preDecrementExpression	#java161
	|	postIncrementExpression	#java162
	|	postDecrementExpression	#java163
	|	methodInvocation	#java164
	|	classInstanceCreationExpression	#java165
	;

ifThenStatement
	:	'if' '(' expression ')' statement	#java166
	;

ifThenElseStatement
	:	'if' '(' expression ')' statementNoShortIf 'else' statement	#java167
	;

ifThenElseStatementNoShortIf
	:	'if' '(' expression ')' statementNoShortIf 'else' statementNoShortIf	#java168
	;

whileStatement
	:	'while' '(' expression ')' statement	#java169
	;

whileStatementNoShortIf
	:	'while' '(' expression ')' statementNoShortIf	#java170
	;

forStatement
	:	basicForStatement	#java171
	;

forStatementNoShortIf
	:	basicForStatementNoShortIf	#java172
	;

basicForStatement
	:	'for' '(' forInit? ';' expression? ';' forUpdate? ')' statement	#java173
	;

basicForStatementNoShortIf
	:	'for' '(' forInit? ';' expression? ';' forUpdate? ')' statementNoShortIf	#java174
	;

forInit
	:	statementExpressionList	#java175
	|	localVariableDeclaration	#java176
	;

forUpdate
	:	statementExpressionList	#java177
	;

statementExpressionList
	:	statementExpression (',' statementExpression)*	#java178
	;

breakStatement
	:	'break' Identifier? ';'	#java179
	;

continueStatement
	:	'continue' Identifier? ';'	#java180
	;

returnStatement
	:	'return' expression? ';'	#java181
	;

/*
 * Productions from §15 (Expressions)
 */

primary
	:	(	primaryNoNewArray_lfno_primary
		|	arrayCreationExpression
		)
		(	primaryNoNewArray_lf_primary
		)*	#java182
	;

primaryNoNewArray
	:	literal	#java183
	|	typeName ('[' ']')* '.' 'class'	#java184
	|	'void' '.' 'class'	#java185
	|	'this'	#java186
	|	typeName '.' 'this'	#java187
	|	'(' expression ')'	#java188
	|	classInstanceCreationExpression	#java189
	|	fieldAccess	#java190
	|	arrayAccess	#java191
	|	methodInvocation	#java192
	|	methodReference	#java193
	;

primaryNoNewArray_lf_arrayAccess
	:	#java194
	;

primaryNoNewArray_lfno_arrayAccess
	:	literal	#java195
	|	typeName ('[' ']')* '.' 'class'	#java196
	|	'void' '.' 'class'	#java197
	|	'this'	#java198
	|	typeName '.' 'this'	#java199
	|	'(' expression ')'	#java200
	|	classInstanceCreationExpression	#java201
	|	fieldAccess	#java202
	|	methodInvocation	#java203
	|	methodReference	#java204
	;

primaryNoNewArray_lf_primary
	:	classInstanceCreationExpression_lf_primary	#java205
	|	fieldAccess_lf_primary	#java206
	|	arrayAccess_lf_primary	#java207
	|	methodInvocation_lf_primary	#java208
	|	methodReference_lf_primary	#java209
	;

primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
	:	#java210
	;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
	:	classInstanceCreationExpression_lf_primary	#java211
	|	fieldAccess_lf_primary	#java212
	|	methodInvocation_lf_primary	#java213
	|	methodReference_lf_primary	#java214
	;

primaryNoNewArray_lfno_primary
	:	literal	#java215
	|	typeName ('[' ']')* '.' 'class'	#java216
	|	'void' '.' 'class'	#java217
	|	'this'	#java218
	|	typeName '.' 'this'	#java219
	|	'(' expression ')'	#java220
	|	classInstanceCreationExpression_lfno_primary	#java221
	|	fieldAccess_lfno_primary	#java222
	|	arrayAccess_lfno_primary	#java223
	|	methodInvocation_lfno_primary	#java224
	|	methodReference_lfno_primary	#java225
	;

primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
	:	#java226
	;

primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
	:	literal	#java227
	|	typeName ('[' ']')* '.' 'class'	#java228
	|	'void' '.' 'class'	#java229
	|	'this'	#java230
	|	typeName '.' 'this'	#java231
	|	'(' expression ')'	#java232
	|	classInstanceCreationExpression_lfno_primary	#java233
	|	fieldAccess_lfno_primary	#java234
	|	methodInvocation_lfno_primary	#java235
	|	methodReference_lfno_primary	#java236
	;

classInstanceCreationExpression
	:	'new' typeArguments? Identifier ('.' Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' classBody?	#java237
	|	expressionName '.' 'new' typeArguments? Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?	#java238
	|	primary '.' 'new' typeArguments? Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?	#java239
	;

classInstanceCreationExpression_lf_primary
	:	'.' 'new' typeArguments? Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?	#java240
	;

classInstanceCreationExpression_lfno_primary
	:	'new' typeArguments? Identifier ('.' Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' classBody?	#java241
	|	expressionName '.' 'new' typeArguments? Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?	#java242
	;

typeArgumentsOrDiamond
	:	typeArguments	#java243
	|	'<' '>'	#java244
	;

fieldAccess
	:	primary '.' Identifier	#java245
	|	'super' '.' Identifier	#java246
	|	typeName '.' 'super' '.' Identifier	#java247
	;

fieldAccess_lf_primary
	:	'.' Identifier	#java248
	;

fieldAccess_lfno_primary
	:	'super' '.' Identifier	#java249
	|	typeName '.' 'super' '.' Identifier	#java250
	;

arrayAccess
	:	(	expressionName '[' expression ']'
		|	primaryNoNewArray_lfno_arrayAccess '[' expression ']'
		)
		(	primaryNoNewArray_lf_arrayAccess '[' expression ']'
		)*	#java251
	;

arrayAccess_lf_primary
	:	(	primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary '[' expression ']'
		)
		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary '[' expression ']'
		)*	#java252
	;

arrayAccess_lfno_primary
	:	(	expressionName '[' expression ']'
		|	primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary '[' expression ']'
		)
		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary '[' expression ']'
		)*	#java253
	;

methodInvocation
	:	methodName '(' argumentList? ')'	#java254
	|	typeName '.' typeArguments? Identifier '(' argumentList? ')'	#java255
	|	expressionName '.' typeArguments? Identifier '(' argumentList? ')'	#java256
	|	primary '.' typeArguments? Identifier '(' argumentList? ')'	#java257
	|	'super' '.' typeArguments? Identifier '(' argumentList? ')'	#java258
	|	typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')'	#java259
	;

methodInvocation_lf_primary
	:	'.' typeArguments? Identifier '(' argumentList? ')'	#java260
	;

methodInvocation_lfno_primary
	:	methodName '(' argumentList? ')'	#java261
	|	typeName '.' typeArguments? Identifier '(' argumentList? ')'	#java262
	|	expressionName '.' typeArguments? Identifier '(' argumentList? ')'	#java263
	|	'super' '.' typeArguments? Identifier '(' argumentList? ')'	#java264
	|	typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')'	#java265
	;

argumentList
	:	expression (',' expression)*	#java266
	;

methodReference
	:	expressionName '::' typeArguments? Identifier	#java267
	|	referenceType '::' typeArguments? Identifier	#java268
	|	primary '::' typeArguments? Identifier	#java269
	|	'super' '::' typeArguments? Identifier	#java270
	|	typeName '.' 'super' '::' typeArguments? Identifier	#java271
	|	classType '::' typeArguments? 'new'	#java272
	|	arrayType '::' 'new'	#java273
	;

methodReference_lf_primary
	:	'::' typeArguments? Identifier	#java274
	;

methodReference_lfno_primary
	:	expressionName '::' typeArguments? Identifier	#java275
	|	referenceType '::' typeArguments? Identifier	#java276
	|	'super' '::' typeArguments? Identifier	#java277
	|	typeName '.' 'super' '::' typeArguments? Identifier	#java278
	|	classType '::' typeArguments? 'new'	#java279
	|	arrayType '::' 'new'	#java280
	;

arrayCreationExpression
	:	'new' primitiveType dimExprs dims?	#java281
	|	'new' classOrInterfaceType dimExprs dims?	#java282
	|	'new' primitiveType dims arrayInitializer	#java283
	|	'new' classOrInterfaceType dims arrayInitializer	#java284
	;

dimExprs
	:	dimExpr dimExpr*	#java285
	;

dimExpr
	:	'[' expression ']'	#java286
	;

constantExpression
	:	expression	#java287
	;

expression
	:	assignmentExpression	#java288
	;

inferredFormalParameterList
	:	Identifier (',' Identifier)*	#java289
	;

assignmentExpression
	:	conditionalExpression	#java290
	|	assignment	#java291
	;

assignment
	:	leftHandSide assignmentOperator expression	#java292
	;

leftHandSide
	:	expressionName	#java293
	|	fieldAccess	#java294
	|	arrayAccess	#java295
	;

assignmentOperator
	:	'='	#java296
	|	'*='	#java297
	|	'/='	#java298
	|	'%='	#java299
	|	'+='	#java300
	|	'-='	#java301
	|	'<<='	#java302
	|	'>>='	#java303
	|	'&='	#java304
	|	'^='	#java305
	|	'|='	#java306
	;

conditionalExpression
	:	conditionalOrExpression	#java307
	|	conditionalOrExpression '?' expression ':' conditionalExpression	#java308
	;

conditionalOrExpression
	:	conditionalAndExpression	#java309
	|	conditionalOrExpression '||' conditionalAndExpression	#java310
	;

conditionalAndExpression
	:	inclusiveOrExpression	#java311
	|	conditionalAndExpression '&&' inclusiveOrExpression	#java312
	;

inclusiveOrExpression
	:	exclusiveOrExpression	#java313
	|	inclusiveOrExpression '|' exclusiveOrExpression	#java314
	;

exclusiveOrExpression
	:	andExpression	#java315
	|	exclusiveOrExpression '^' andExpression	#java316
	;

andExpression
	:	equalityExpression	#java317
	|	andExpression '&' equalityExpression	#java318
	;

equalityExpression
	:	relationalExpression	#java319
	|	equalityExpression '==' relationalExpression	#java320
	|	equalityExpression '!=' relationalExpression	#java321
	;

relationalExpression
	:	shiftExpression	#java322
	|	relationalExpression '<' shiftExpression	#java323
	|	relationalExpression '>' shiftExpression	#java324
	|	relationalExpression '<=' shiftExpression	#java325
	|	relationalExpression '>=' shiftExpression	#java326
	|	relationalExpression 'instanceof' referenceType	#java327
	;

shiftExpression
	:	additiveExpression	#java328
	|	shiftExpression '<' '<' additiveExpression	#java329
	|	shiftExpression '>' '>' additiveExpression	#java330
	;

additiveExpression
	:	multiplicativeExpression	#java331
	|	additiveExpression '+' multiplicativeExpression	#java332
	|	additiveExpression '-' multiplicativeExpression	#java333
	;

multiplicativeExpression
	:	unaryExpression	#java334
	|	multiplicativeExpression '*' unaryExpression	#java335
	|	multiplicativeExpression '/' unaryExpression	#java336
	|	multiplicativeExpression '%' unaryExpression	#java337
	;

unaryExpression
	:	preIncrementExpression	#java338
	|	preDecrementExpression	#java339
	|	'+' unaryExpression	#java340
	|	'-' unaryExpression	#java341
	|	unaryExpressionNotPlusMinus	#java342
	;

preIncrementExpression
	:	'++' unaryExpression	#java343
	;

preDecrementExpression
	:	'--' unaryExpression	#java344
	;

unaryExpressionNotPlusMinus
	:	postfixExpression	#java345
	|	'~' unaryExpression	#java346
	|	'!' unaryExpression	#java347
	|	castExpression	#java348
	;

postfixExpression
	:	(	primary
		|	expressionName
		)
		(	postIncrementExpression_lf_postfixExpression
		|	postDecrementExpression_lf_postfixExpression
		)*	#java349
	;

postIncrementExpression
	:	postfixExpression '++'	#java350
	;

postIncrementExpression_lf_postfixExpression
	:	'++'	#java351
	;

postDecrementExpression
	:	postfixExpression '--'	#java352
	;

postDecrementExpression_lf_postfixExpression
	:	'--'	#java353
	;

castExpression
	:	'(' primitiveType ')' unaryExpression	#java354
	;

// LEXER

// §3.9 Keywords

ABSTRACT : 'abstract';
BOOLEAN : 'boolean';
BREAK : 'break';
CHAR : 'char';
CLASS : 'class';
CONST : 'const';
CONTINUE : 'continue';
ELSE : 'else';
EXTENDS : 'extends';
FLOAT : 'float';
FOR : 'for';
IF : 'if';
IMPORT : 'import';
INSTANCEOF : 'instanceof';
INT : 'int';
NEW : 'new';
PACKAGE : 'package';
PRIVATE : 'private';
PUBLIC : 'public';
RETURN : 'return';
STATIC : 'static';
SUPER : 'super';
THIS : 'this';
VOID : 'void';
WHILE : 'while';

// §3.10.1 Integer Literals

IntegerLiteral
	:	DecimalIntegerLiteral	
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

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
	:	DecimalFloatingPointLiteral	
	;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix?	
	|	'.' Digits ExponentPart? FloatTypeSuffix?	
	|	Digits ExponentPart FloatTypeSuffix?	
	|	Digits FloatTypeSuffix	
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger	
	;

fragment
ExponentIndicator
	:	[eE]	
	;

fragment
SignedInteger
	:	Sign? Digits	
	;

fragment
Sign
	:	[+-]	
	;

fragment
FloatTypeSuffix
	:	[fF]	
	;

// §3.10.3 Boolean Literals

BooleanLiteral
	:	'true'	
	|	'false'	
	;

// §3.10.4 Character Literals

CharacterLiteral
	:	'\'' SingleCharacter '\''	
	|	'\'' EscapeSequence '\''	
	;

fragment
SingleCharacter
	:	~['\\]	
	;

// §3.10.5 String Literals

StringLiteral
	:	'"' StringCharacters? '"'	
	;

fragment
StringCharacters
	:	StringCharacter+	
	;

fragment
StringCharacter
	:	~["\\]	
	|	EscapeSequence	
	;

// §3.10.6 Escape Sequences for Character and String Literals

fragment
EscapeSequence
	:	'\\' [btnfr"'\\]	
	;

// §3.10.7 The Null Literal

NullLiteral
	:	'null'	
	;

// §3.11 Separators

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';

// §3.12 Operators

ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
TILDE : '~';
QUESTION : '?';
COLON : ':';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BITAND : '&';
BITOR : '|';
CARET : '^';
MOD : '%';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
AND_ASSIGN : '&=';
OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
MOD_ASSIGN : '%=';
LSHIFT_ASSIGN : '<<=';
RSHIFT_ASSIGN : '>>=';


// §3.8 Identifiers (must appear after all keywords in the grammar)

Identifier
	:	JavaLetter JavaLetterOrDigit*	
	;

fragment
JavaLetter
	:	[a-zA-Z$_] // these are the "java letters" below 0x7F	
	|	// covers all characters above 0x7F which are not a surrogate
		~[\u0000-\u007F\uD800-\uDBFF]
		{Character.isJavaIdentifierStart(_input.LA(-1))}?	
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?	
	;

fragment
JavaLetterOrDigit
	:	[a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F	
	|	// covers all characters above 0x7F which are not a surrogate
		~[\u0000-\u007F\uD800-\uDBFF]
		{Character.isJavaIdentifierPart(_input.LA(-1))}?	
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?	
	;

//
// Additional symbols not defined in the lexical specification
//


//
// Whitespace and comments
//

WS  :  [ \t\r\n]+ -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;

