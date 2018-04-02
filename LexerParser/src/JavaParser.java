// Generated from /Users/karthikeyan/IdeaProjects/Compiler_Design/LexerParser/src/Java.g4 by ANTLR 4.7
package src;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ABSTRACT=3, BOOLEAN=4, BREAK=5, CHAR=6, CLASS=7, CONST=8, 
		CONTINUE=9, ELSE=10, EXTENDS=11, FLOAT=12, FOR=13, IF=14, IMPORT=15, INSTANCEOF=16, 
		INT=17, NEW=18, PACKAGE=19, PRIVATE=20, PUBLIC=21, RETURN=22, STATIC=23, 
		SUPER=24, THIS=25, VOID=26, WHILE=27, IntegerLiteral=28, FloatingPointLiteral=29, 
		BooleanLiteral=30, CharacterLiteral=31, StringLiteral=32, NullLiteral=33, 
		LPAREN=34, RPAREN=35, LBRACE=36, RBRACE=37, LBRACK=38, RBRACK=39, SEMI=40, 
		COMMA=41, DOT=42, ASSIGN=43, GT=44, LT=45, BANG=46, TILDE=47, QUESTION=48, 
		COLON=49, EQUAL=50, LE=51, GE=52, NOTEQUAL=53, AND=54, OR=55, INC=56, 
		DEC=57, ADD=58, SUB=59, MUL=60, DIV=61, BITAND=62, BITOR=63, CARET=64, 
		MOD=65, ADD_ASSIGN=66, SUB_ASSIGN=67, MUL_ASSIGN=68, DIV_ASSIGN=69, AND_ASSIGN=70, 
		OR_ASSIGN=71, XOR_ASSIGN=72, MOD_ASSIGN=73, LSHIFT_ASSIGN=74, RSHIFT_ASSIGN=75, 
		Identifier=76, WS=77, LINE_COMMENT=78;
	public static final int
		RULE_literal = 0, RULE_typeType = 1, RULE_type = 2, RULE_primitiveType = 3, 
		RULE_numericType = 4, RULE_integralType = 5, RULE_floatingPointType = 6, 
		RULE_referenceType = 7, RULE_classOrInterfaceType = 8, RULE_classType = 9, 
		RULE_classType_lf_classOrInterfaceType = 10, RULE_classType_lfno_classOrInterfaceType = 11, 
		RULE_typeVariable = 12, RULE_arrayType = 13, RULE_dims = 14, RULE_typeParameter = 15, 
		RULE_typeBound = 16, RULE_typeArguments = 17, RULE_typeArgumentList = 18, 
		RULE_typeArgument = 19, RULE_wildcard = 20, RULE_wildcardBounds = 21, 
		RULE_packageName = 22, RULE_typeName = 23, RULE_packageOrTypeName = 24, 
		RULE_expressionName = 25, RULE_methodName = 26, RULE_ambiguousName = 27, 
		RULE_compilationUnit = 28, RULE_packageDeclaration = 29, RULE_importDeclaration = 30, 
		RULE_singleTypeImportDeclaration = 31, RULE_typeImportOnDemandDeclaration = 32, 
		RULE_singleStaticImportDeclaration = 33, RULE_staticImportOnDemandDeclaration = 34, 
		RULE_typeDeclaration = 35, RULE_classDeclaration = 36, RULE_normalClassDeclaration = 37, 
		RULE_classModifier = 38, RULE_typeParameters = 39, RULE_typeParameterList = 40, 
		RULE_superclass = 41, RULE_classBody = 42, RULE_classBodyDeclaration = 43, 
		RULE_classMemberDeclaration = 44, RULE_fieldDeclaration = 45, RULE_fieldModifier = 46, 
		RULE_variableDeclaratorList = 47, RULE_variableDeclarator = 48, RULE_variableDeclaratorId = 49, 
		RULE_variableInitializer = 50, RULE_methodDeclaration = 51, RULE_methodModifier = 52, 
		RULE_methodHeader = 53, RULE_result = 54, RULE_methodDeclarator = 55, 
		RULE_formalParameterList = 56, RULE_formalParameters = 57, RULE_formalParameter = 58, 
		RULE_lastFormalParameter = 59, RULE_receiverParameter = 60, RULE_methodBody = 61, 
		RULE_instanceInitializer = 62, RULE_staticInitializer = 63, RULE_constructorDeclaration = 64, 
		RULE_constructorModifier = 65, RULE_constructorDeclarator = 66, RULE_simpleTypeName = 67, 
		RULE_constructorBody = 68, RULE_explicitConstructorInvocation = 69, RULE_constantDeclaration = 70, 
		RULE_constantModifier = 71, RULE_elementValuePairList = 72, RULE_elementValuePair = 73, 
		RULE_elementValue = 74, RULE_elementValueArrayInitializer = 75, RULE_elementValueList = 76, 
		RULE_arrayInitializer = 77, RULE_variableInitializerList = 78, RULE_block = 79, 
		RULE_blockStatements = 80, RULE_blockStatement = 81, RULE_localVariableDeclarationStatement = 82, 
		RULE_localVariableDeclaration = 83, RULE_statement = 84, RULE_statementNoShortIf = 85, 
		RULE_statementWithoutTrailingSubstatement = 86, RULE_emptyStatement = 87, 
		RULE_labeledStatement = 88, RULE_labeledStatementNoShortIf = 89, RULE_expressionStatement = 90, 
		RULE_statementExpression = 91, RULE_ifThenStatement = 92, RULE_ifThenElseStatement = 93, 
		RULE_ifThenElseStatementNoShortIf = 94, RULE_whileStatement = 95, RULE_whileStatementNoShortIf = 96, 
		RULE_forStatement = 97, RULE_forStatementNoShortIf = 98, RULE_basicForStatement = 99, 
		RULE_basicForStatementNoShortIf = 100, RULE_forInit = 101, RULE_forUpdate = 102, 
		RULE_statementExpressionList = 103, RULE_breakStatement = 104, RULE_continueStatement = 105, 
		RULE_returnStatement = 106, RULE_primary = 107, RULE_primaryNoNewArray = 108, 
		RULE_primaryNoNewArray_lf_arrayAccess = 109, RULE_primaryNoNewArray_lfno_arrayAccess = 110, 
		RULE_primaryNoNewArray_lf_primary = 111, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 112, 
		RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 113, RULE_primaryNoNewArray_lfno_primary = 114, 
		RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 115, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 116, 
		RULE_classInstanceCreationExpression = 117, RULE_classInstanceCreationExpression_lf_primary = 118, 
		RULE_classInstanceCreationExpression_lfno_primary = 119, RULE_typeArgumentsOrDiamond = 120, 
		RULE_fieldAccess = 121, RULE_fieldAccess_lf_primary = 122, RULE_fieldAccess_lfno_primary = 123, 
		RULE_arrayAccess = 124, RULE_arrayAccess_lf_primary = 125, RULE_arrayAccess_lfno_primary = 126, 
		RULE_methodInvocation = 127, RULE_methodInvocation_lf_primary = 128, RULE_methodInvocation_lfno_primary = 129, 
		RULE_argumentList = 130, RULE_methodReference = 131, RULE_methodReference_lf_primary = 132, 
		RULE_methodReference_lfno_primary = 133, RULE_arrayCreationExpression = 134, 
		RULE_dimExprs = 135, RULE_dimExpr = 136, RULE_constantExpression = 137, 
		RULE_expression = 138, RULE_inferredFormalParameterList = 139, RULE_assignmentExpression = 140, 
		RULE_assignment = 141, RULE_leftHandSide = 142, RULE_assignmentOperator = 143, 
		RULE_conditionalExpression = 144, RULE_conditionalOrExpression = 145, 
		RULE_conditionalAndExpression = 146, RULE_inclusiveOrExpression = 147, 
		RULE_exclusiveOrExpression = 148, RULE_andExpression = 149, RULE_equalityExpression = 150, 
		RULE_relationalExpression = 151, RULE_shiftExpression = 152, RULE_additiveExpression = 153, 
		RULE_multiplicativeExpression = 154, RULE_unaryExpression = 155, RULE_preIncrementExpression = 156, 
		RULE_preDecrementExpression = 157, RULE_unaryExpressionNotPlusMinus = 158, 
		RULE_postfixExpression = 159, RULE_postIncrementExpression = 160, RULE_postIncrementExpression_lf_postfixExpression = 161, 
		RULE_postDecrementExpression = 162, RULE_postDecrementExpression_lf_postfixExpression = 163, 
		RULE_castExpression = 164;
	public static final String[] ruleNames = {
		"literal", "typeType", "type", "primitiveType", "numericType", "integralType", 
		"floatingPointType", "referenceType", "classOrInterfaceType", "classType", 
		"classType_lf_classOrInterfaceType", "classType_lfno_classOrInterfaceType", 
		"typeVariable", "arrayType", "dims", "typeParameter", "typeBound", "typeArguments", 
		"typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", "packageName", 
		"typeName", "packageOrTypeName", "expressionName", "methodName", "ambiguousName", 
		"compilationUnit", "packageDeclaration", "importDeclaration", "singleTypeImportDeclaration", 
		"typeImportOnDemandDeclaration", "singleStaticImportDeclaration", "staticImportOnDemandDeclaration", 
		"typeDeclaration", "classDeclaration", "normalClassDeclaration", "classModifier", 
		"typeParameters", "typeParameterList", "superclass", "classBody", "classBodyDeclaration", 
		"classMemberDeclaration", "fieldDeclaration", "fieldModifier", "variableDeclaratorList", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "methodDeclaration", 
		"methodModifier", "methodHeader", "result", "methodDeclarator", "formalParameterList", 
		"formalParameters", "formalParameter", "lastFormalParameter", "receiverParameter", 
		"methodBody", "instanceInitializer", "staticInitializer", "constructorDeclaration", 
		"constructorModifier", "constructorDeclarator", "simpleTypeName", "constructorBody", 
		"explicitConstructorInvocation", "constantDeclaration", "constantModifier", 
		"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"elementValueList", "arrayInitializer", "variableInitializerList", "block", 
		"blockStatements", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "statementNoShortIf", "statementWithoutTrailingSubstatement", 
		"emptyStatement", "labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"whileStatement", "whileStatementNoShortIf", "forStatement", "forStatementNoShortIf", 
		"basicForStatement", "basicForStatementNoShortIf", "forInit", "forUpdate", 
		"statementExpressionList", "breakStatement", "continueStatement", "returnStatement", 
		"primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", "primaryNoNewArray_lfno_arrayAccess", 
		"primaryNoNewArray_lf_primary", "primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", 
		"primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", "primaryNoNewArray_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", "primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", 
		"classInstanceCreationExpression", "classInstanceCreationExpression_lf_primary", 
		"classInstanceCreationExpression_lfno_primary", "typeArgumentsOrDiamond", 
		"fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", "arrayAccess", 
		"arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
		"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", 
		"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
		"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
		"expression", "inferredFormalParameterList", "assignmentExpression", "assignment", 
		"leftHandSide", "assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
		"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
		"andExpression", "equalityExpression", "relationalExpression", "shiftExpression", 
		"additiveExpression", "multiplicativeExpression", "unaryExpression", "preIncrementExpression", 
		"preDecrementExpression", "unaryExpressionNotPlusMinus", "postfixExpression", 
		"postIncrementExpression", "postIncrementExpression_lf_postfixExpression", 
		"postDecrementExpression", "postDecrementExpression_lf_postfixExpression", 
		"castExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'...'", "'::'", "'abstract'", "'boolean'", "'break'", "'char'", 
		"'class'", "'const'", "'continue'", "'else'", "'extends'", "'float'", 
		"'for'", "'if'", "'import'", "'instanceof'", "'int'", "'new'", "'package'", 
		"'private'", "'public'", "'return'", "'static'", "'super'", "'this'", 
		"'void'", "'while'", null, null, null, null, null, "'null'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
		"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
		"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
		"'>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ABSTRACT", "BOOLEAN", "BREAK", "CHAR", "CLASS", "CONST", 
		"CONTINUE", "ELSE", "EXTENDS", "FLOAT", "FOR", "IF", "IMPORT", "INSTANCEOF", 
		"INT", "NEW", "PACKAGE", "PRIVATE", "PUBLIC", "RETURN", "STATIC", "SUPER", 
		"THIS", "VOID", "WHILE", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "Identifier", "WS", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java5Context extends LiteralContext {
		public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
		public Java5Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java4Context extends LiteralContext {
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
		public Java4Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java3Context extends LiteralContext {
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public Java3Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java2Context extends LiteralContext {
		public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
		public Java2Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java6Context extends LiteralContext {
		public TerminalNode NullLiteral() { return getToken(JavaParser.NullLiteral, 0); }
		public Java6Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java1Context extends LiteralContext {
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public Java1Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new Java1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				_localctx = new Java2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(FloatingPointLiteral);
				}
				break;
			case BooleanLiteral:
				_localctx = new Java3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(BooleanLiteral);
				}
				break;
			case CharacterLiteral:
				_localctx = new Java4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new Java5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
				match(StringLiteral);
				}
				break;
			case NullLiteral:
				_localctx = new Java6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				match(NullLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(338);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
				{
				setState(339);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(342);
				match(LBRACK);
				setState(343);
				match(RBRACK);
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java8Context extends TypeContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public Java8Context(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java7Context extends TypeContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public Java7Context(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Java7Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				primitiveType();
				}
				break;
			case 2:
				_localctx = new Java8Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				referenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	 
		public PrimitiveTypeContext() { }
		public void copyFrom(PrimitiveTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java9Context extends PrimitiveTypeContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public Java9Context(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava9(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java10Context extends PrimitiveTypeContext {
		public Java10Context(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava10(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitiveType);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
				_localctx = new Java9Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				numericType();
				}
				break;
			case BOOLEAN:
				_localctx = new Java10Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
	 
		public NumericTypeContext() { }
		public void copyFrom(NumericTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java12Context extends NumericTypeContext {
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public Java12Context(NumericTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava12(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava12(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava12(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java11Context extends NumericTypeContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public Java11Context(NumericTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava11(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numericType);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case INT:
				_localctx = new Java11Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				integralType();
				}
				break;
			case FLOAT:
				_localctx = new Java12Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
	 
		public IntegralTypeContext() { }
		public void copyFrom(IntegralTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java14Context extends IntegralTypeContext {
		public Java14Context(IntegralTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava14(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava14(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava14(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java13Context extends IntegralTypeContext {
		public Java13Context(IntegralTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava13(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava13(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava13(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_integralType);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new Java13Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(INT);
				}
				break;
			case CHAR:
				_localctx = new Java14Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
	 
		public FloatingPointTypeContext() { }
		public void copyFrom(FloatingPointTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java15Context extends FloatingPointTypeContext {
		public Java15Context(FloatingPointTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava15(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava15(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava15(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_floatingPointType);
		try {
			_localctx = new Java15Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
	 
		public ReferenceTypeContext() { }
		public void copyFrom(ReferenceTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java18Context extends ReferenceTypeContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public Java18Context(ReferenceTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava18(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava18(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava18(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java17Context extends ReferenceTypeContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public Java17Context(ReferenceTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava17(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava17(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava17(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java16Context extends ReferenceTypeContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public Java16Context(ReferenceTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava16(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_referenceType);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Java16Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				classOrInterfaceType();
				}
				break;
			case 2:
				_localctx = new Java17Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				typeVariable();
				}
				break;
			case 3:
				_localctx = new Java18Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
	 
		public ClassOrInterfaceTypeContext() { }
		public void copyFrom(ClassOrInterfaceTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java19Context extends ClassOrInterfaceTypeContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public Java19Context(ClassOrInterfaceTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava19(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava19(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava19(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classOrInterfaceType);
		try {
			int _alt;
			_localctx = new Java19Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(372);
			classType_lfno_classOrInterfaceType();
			}
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					classType_lf_classOrInterfaceType();
					}
					}
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }

		public ClassTypeContext() { }
		public void copyFrom(ClassTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java21Context extends ClassTypeContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java21Context(ClassTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava21(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava21(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava21(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java20Context extends ClassTypeContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java20Context(ClassTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava20(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava20(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava20(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Java20Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(Identifier);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(380);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				_localctx = new Java21Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				classOrInterfaceType();
				setState(384);
				match(DOT);
				setState(385);
				match(Identifier);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(386);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }

		public ClassType_lf_classOrInterfaceTypeContext() { }
		public void copyFrom(ClassType_lf_classOrInterfaceTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java22Context extends ClassType_lf_classOrInterfaceTypeContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java22Context(ClassType_lf_classOrInterfaceTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava22(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava22(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava22(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lf_classOrInterfaceType);
		try {
			_localctx = new Java22Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(DOT);
			setState(392);
			match(Identifier);
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(393);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }

		public ClassType_lfno_classOrInterfaceTypeContext() { }
		public void copyFrom(ClassType_lfno_classOrInterfaceTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java23Context extends ClassType_lfno_classOrInterfaceTypeContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java23Context(ClassType_lfno_classOrInterfaceTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava23(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava23(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava23(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classType_lfno_classOrInterfaceType);
		try {
			_localctx = new Java23Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(Identifier);
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(397);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }

		public TypeVariableContext() { }
		public void copyFrom(TypeVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java24Context extends TypeVariableContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java24Context(TypeVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava24(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava24(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava24(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeVariable);
		try {
			_localctx = new Java24Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }

		public ArrayTypeContext() { }
		public void copyFrom(ArrayTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java27Context extends ArrayTypeContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public Java27Context(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava27(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava27(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava27(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java26Context extends ArrayTypeContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public Java26Context(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava26(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava26(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava26(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java25Context extends ArrayTypeContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public Java25Context(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava25(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava25(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava25(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayType);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Java25Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				primitiveType();
				setState(403);
				dims();
				}
				break;
			case 2:
				_localctx = new Java26Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				classOrInterfaceType();
				setState(406);
				dims();
				}
				break;
			case 3:
				_localctx = new Java27Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				typeVariable();
				setState(409);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }

		public DimsContext() { }
		public void copyFrom(DimsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java28Context extends DimsContext {
		public Java28Context(DimsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava28(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava28(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava28(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dims);
		try {
			int _alt;
			_localctx = new Java28Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(LBRACK);
			setState(414);
			match(RBRACK);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(415);
					match(LBRACK);
					setState(416);
					match(RBRACK);
					}
					}
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }

		public TypeParameterContext() { }
		public void copyFrom(TypeParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java29Context extends TypeParameterContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public Java29Context(TypeParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava29(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava29(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava29(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeParameter);
		int _la;
		try {
			_localctx = new Java29Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(Identifier);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(423);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }

		public TypeBoundContext() { }
		public void copyFrom(TypeBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java30Context extends TypeBoundContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public Java30Context(TypeBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava30(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava30(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava30(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeBound);
		try {
			_localctx = new Java30Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(EXTENDS);
			setState(427);
			typeVariable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }

		public TypeArgumentsContext() { }
		public void copyFrom(TypeArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java31Context extends TypeArgumentsContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public Java31Context(TypeArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava31(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava31(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava31(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeArguments);
		try {
			_localctx = new Java31Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(LT);
			setState(430);
			typeArgumentList();
			setState(431);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }

		public TypeArgumentListContext() { }
		public void copyFrom(TypeArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java32Context extends TypeArgumentListContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public Java32Context(TypeArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava32(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeArgumentList);
		int _la;
		try {
			_localctx = new Java32Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			typeArgument();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(434);
				match(COMMA);
				setState(435);
				typeArgument();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }

		public TypeArgumentContext() { }
		public void copyFrom(TypeArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java34Context extends TypeArgumentContext {
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public Java34Context(TypeArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava34(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava34(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava34(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java33Context extends TypeArgumentContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public Java33Context(TypeArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava33(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava33(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava33(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeArgument);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case Identifier:
				_localctx = new Java33Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				referenceType();
				}
				break;
			case QUESTION:
				_localctx = new Java34Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				wildcard();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }

		public WildcardContext() { }
		public void copyFrom(WildcardContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java35Context extends WildcardContext {
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public Java35Context(WildcardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava35(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava35(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava35(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_wildcard);
		int _la;
		try {
			_localctx = new Java35Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(QUESTION);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(446);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }

		public WildcardBoundsContext() { }
		public void copyFrom(WildcardBoundsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java37Context extends WildcardBoundsContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public Java37Context(WildcardBoundsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava37(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava37(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava37(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java36Context extends WildcardBoundsContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public Java36Context(WildcardBoundsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava36(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava36(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava36(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_wildcardBounds);
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				_localctx = new Java36Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(EXTENDS);
				setState(450);
				referenceType();
				}
				break;
			case SUPER:
				_localctx = new Java37Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(SUPER);
				setState(452);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }

		public PackageNameContext() { }
		public void copyFrom(PackageNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java39Context extends PackageNameContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java39Context(PackageNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava39(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava39(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava39(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java38Context extends PackageNameContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java38Context(PackageNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava38(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava38(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava38(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java38Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(456);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Java39Context(new PackageNameContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(458);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(459);
					match(DOT);
					setState(460);
					match(Identifier);
					}
					}
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }

		public TypeNameContext() { }
		public void copyFrom(TypeNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java41Context extends TypeNameContext {
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java41Context(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava41(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava41(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava41(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java40Context extends TypeNameContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java40Context(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava40(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava40(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava40(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeName);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new Java40Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new Java41Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				packageOrTypeName(0);
				setState(468);
				match(DOT);
				setState(469);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }

		public PackageOrTypeNameContext() { }
		public void copyFrom(PackageOrTypeNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java43Context extends PackageOrTypeNameContext {
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java43Context(PackageOrTypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava43(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava43(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava43(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java42Context extends PackageOrTypeNameContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java42Context(PackageOrTypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava42(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava42(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava42(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java42Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(474);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Java43Context(new PackageOrTypeNameContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(476);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(477);
					match(DOT);
					setState(478);
					match(Identifier);
					}
					}
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }

		public ExpressionNameContext() { }
		public void copyFrom(ExpressionNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java45Context extends ExpressionNameContext {
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java45Context(ExpressionNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava45(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava45(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava45(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java44Context extends ExpressionNameContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java44Context(ExpressionNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava44(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava44(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava44(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionName);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Java44Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new Java45Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				ambiguousName(0);
				setState(486);
				match(DOT);
				setState(487);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }

		public MethodNameContext() { }
		public void copyFrom(MethodNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java46Context extends MethodNameContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java46Context(MethodNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava46(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava46(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava46(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodName);
		try {
			_localctx = new Java46Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }

		public AmbiguousNameContext() { }
		public void copyFrom(AmbiguousNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java48Context extends AmbiguousNameContext {
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java48Context(AmbiguousNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava48(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava48(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava48(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java47Context extends AmbiguousNameContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java47Context(AmbiguousNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava47(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava47(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava47(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java47Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(494);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Java48Context(new AmbiguousNameContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(496);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(497);
					match(DOT);
					setState(498);
					match(Identifier);
					}
					}
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }

		public CompilationUnitContext() { }
		public void copyFrom(CompilationUnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java49Context extends CompilationUnitContext {
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public Java49Context(CompilationUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava49(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava49(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava49(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_compilationUnit);
		int _la;
		try {
			_localctx = new Java49Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(504);
				packageDeclaration();
				}
			}

			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(507);
				importDeclaration();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC) | (1L << SEMI))) != 0)) {
				{
				{
				setState(513);
				typeDeclaration();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }

		public PackageDeclarationContext() { }
		public void copyFrom(PackageDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java50Context extends PackageDeclarationContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public Java50Context(PackageDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava50(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava50(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava50(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_packageDeclaration);
		int _la;
		try {
			_localctx = new Java50Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(PACKAGE);
			setState(522);
			match(Identifier);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(523);
				match(DOT);
				setState(524);
				match(Identifier);
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }

		public ImportDeclarationContext() { }
		public void copyFrom(ImportDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java52Context extends ImportDeclarationContext {
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public Java52Context(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava52(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava52(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava52(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java51Context extends ImportDeclarationContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public Java51Context(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava51(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava51(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava51(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java54Context extends ImportDeclarationContext {
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public Java54Context(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava54(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava54(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava54(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java53Context extends ImportDeclarationContext {
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public Java53Context(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava53(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava53(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava53(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_importDeclaration);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new Java51Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				_localctx = new Java52Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				_localctx = new Java53Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				_localctx = new Java54Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }

		public SingleTypeImportDeclarationContext() { }
		public void copyFrom(SingleTypeImportDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java55Context extends SingleTypeImportDeclarationContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public Java55Context(SingleTypeImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava55(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava55(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava55(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_singleTypeImportDeclaration);
		try {
			_localctx = new Java55Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(IMPORT);
			setState(539);
			typeName();
			setState(540);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }

		public TypeImportOnDemandDeclarationContext() { }
		public void copyFrom(TypeImportOnDemandDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java56Context extends TypeImportOnDemandDeclarationContext {
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public Java56Context(TypeImportOnDemandDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava56(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava56(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava56(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeImportOnDemandDeclaration);
		try {
			_localctx = new Java56Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(IMPORT);
			setState(543);
			packageOrTypeName(0);
			setState(544);
			match(DOT);
			setState(545);
			match(MUL);
			setState(546);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }

		public SingleStaticImportDeclarationContext() { }
		public void copyFrom(SingleStaticImportDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java57Context extends SingleStaticImportDeclarationContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java57Context(SingleStaticImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava57(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava57(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava57(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_singleStaticImportDeclaration);
		try {
			_localctx = new Java57Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(IMPORT);
			setState(549);
			match(STATIC);
			setState(550);
			typeName();
			setState(551);
			match(DOT);
			setState(552);
			match(Identifier);
			setState(553);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }

		public StaticImportOnDemandDeclarationContext() { }
		public void copyFrom(StaticImportOnDemandDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java58Context extends StaticImportOnDemandDeclarationContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public Java58Context(StaticImportOnDemandDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava58(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava58(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava58(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_staticImportOnDemandDeclaration);
		try {
			_localctx = new Java58Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(IMPORT);
			setState(556);
			match(STATIC);
			setState(557);
			typeName();
			setState(558);
			match(DOT);
			setState(559);
			match(MUL);
			setState(560);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }

		public TypeDeclarationContext() { }
		public void copyFrom(TypeDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java60Context extends TypeDeclarationContext {
		public Java60Context(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava60(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava60(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava60(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java59Context extends TypeDeclarationContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public Java59Context(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava59(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava59(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava59(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeDeclaration);
		try {
			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case PRIVATE:
			case PUBLIC:
			case STATIC:
				_localctx = new Java59Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				classDeclaration();
				}
				break;
			case SEMI:
				_localctx = new Java60Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }

		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java61Context extends ClassDeclarationContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public Java61Context(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava61(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava61(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava61(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classDeclaration);
		try {
			_localctx = new Java61Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			normalClassDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }

		public NormalClassDeclarationContext() { }
		public void copyFrom(NormalClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java62Context extends NormalClassDeclarationContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public Java62Context(NormalClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava62(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava62(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava62(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_normalClassDeclaration);
		int _la;
		try {
			_localctx = new Java62Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				{
				setState(568);
				classModifier();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(CLASS);
			setState(575);
			match(Identifier);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(576);
				typeParameters();
				}
			}

			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(579);
				superclass();
				}
			}

			setState(582);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }

		public ClassModifierContext() { }
		public void copyFrom(ClassModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java63Context extends ClassModifierContext {
		public Java63Context(ClassModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava63(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava63(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava63(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java66Context extends ClassModifierContext {
		public Java66Context(ClassModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava66(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava66(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava66(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java65Context extends ClassModifierContext {
		public Java65Context(ClassModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava65(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava65(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava65(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java64Context extends ClassModifierContext {
		public Java64Context(ClassModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava64(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classModifier);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				_localctx = new Java63Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				_localctx = new Java64Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				_localctx = new Java65Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				_localctx = new Java66Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				match(STATIC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }

		public TypeParametersContext() { }
		public void copyFrom(TypeParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java67Context extends TypeParametersContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public Java67Context(TypeParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava67(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava67(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava67(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeParameters);
		try {
			_localctx = new Java67Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(LT);
			setState(591);
			typeParameterList();
			setState(592);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }

		public TypeParameterListContext() { }
		public void copyFrom(TypeParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java68Context extends TypeParameterListContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public Java68Context(TypeParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava68(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava68(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava68(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeParameterList);
		int _la;
		try {
			_localctx = new Java68Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			typeParameter();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(595);
				match(COMMA);
				setState(596);
				typeParameter();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }

		public SuperclassContext() { }
		public void copyFrom(SuperclassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java69Context extends SuperclassContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public Java69Context(SuperclassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava69(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava69(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava69(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_superclass);
		try {
			_localctx = new Java69Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(EXTENDS);
			setState(603);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }

		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java70Context extends ClassBodyContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public Java70Context(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava70(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava70(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava70(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_classBody);
		int _la;
		try {
			_localctx = new Java70Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(LBRACE);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << FLOAT) | (1L << INT) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC) | (1L << VOID) | (1L << LBRACE) | (1L << SEMI) | (1L << LT))) != 0) || _la==Identifier) {
				{
				{
				setState(606);
				classBodyDeclaration();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }

		public ClassBodyDeclarationContext() { }
		public void copyFrom(ClassBodyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java74Context extends ClassBodyDeclarationContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public Java74Context(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava74(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava74(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava74(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java73Context extends ClassBodyDeclarationContext {
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public Java73Context(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava73(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava73(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava73(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java72Context extends ClassBodyDeclarationContext {
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public Java72Context(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava72(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava72(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava72(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java71Context extends ClassBodyDeclarationContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public Java71Context(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava71(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava71(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava71(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classBodyDeclaration);
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new Java71Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				classMemberDeclaration();
				}
				break;
			case 2:
				_localctx = new Java72Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				instanceInitializer();
				}
				break;
			case 3:
				_localctx = new Java73Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				staticInitializer();
				}
				break;
			case 4:
				_localctx = new Java74Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(617);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }

		public ClassMemberDeclarationContext() { }
		public void copyFrom(ClassMemberDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java78Context extends ClassMemberDeclarationContext {
		public Java78Context(ClassMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava78(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava78(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava78(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java77Context extends ClassMemberDeclarationContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public Java77Context(ClassMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava77(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava77(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava77(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java76Context extends ClassMemberDeclarationContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public Java76Context(ClassMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava76(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava76(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava76(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java75Context extends ClassMemberDeclarationContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public Java75Context(ClassMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava75(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava75(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava75(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classMemberDeclaration);
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new Java75Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				fieldDeclaration();
				}
				break;
			case 2:
				_localctx = new Java76Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				methodDeclaration();
				}
				break;
			case 3:
				_localctx = new Java77Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				classDeclaration();
				}
				break;
			case 4:
				_localctx = new Java78Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }

		public FieldDeclarationContext() { }
		public void copyFrom(FieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java79Context extends FieldDeclarationContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public Java79Context(FieldDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava79(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava79(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava79(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fieldDeclaration);
		int _la;
		try {
			_localctx = new Java79Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				{
				setState(626);
				fieldModifier();
				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(632);
			typeType();
			setState(633);
			variableDeclaratorList();
			setState(634);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }

		public FieldModifierContext() { }
		public void copyFrom(FieldModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java82Context extends FieldModifierContext {
		public Java82Context(FieldModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava82(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava82(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava82(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java81Context extends FieldModifierContext {
		public Java81Context(FieldModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava81(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava81(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava81(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java80Context extends FieldModifierContext {
		public Java80Context(FieldModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava80(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava80(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava80(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fieldModifier);
		try {
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				_localctx = new Java80Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				_localctx = new Java81Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				match(PRIVATE);
				}
				break;
			case STATIC:
				_localctx = new Java82Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				match(STATIC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }

		public VariableDeclaratorListContext() { }
		public void copyFrom(VariableDeclaratorListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java83Context extends VariableDeclaratorListContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public Java83Context(VariableDeclaratorListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava83(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava83(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava83(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variableDeclaratorList);
		int _la;
		try {
			_localctx = new Java83Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			variableDeclarator();
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(642);
				match(COMMA);
				setState(643);
				variableDeclarator();
				}
				}
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }

		public VariableDeclaratorContext() { }
		public void copyFrom(VariableDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java84Context extends VariableDeclaratorContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public Java84Context(VariableDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava84(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava84(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava84(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableDeclarator);
		int _la;
		try {
			_localctx = new Java84Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			variableDeclaratorId();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(650);
				match(ASSIGN);
				setState(651);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }

		public VariableDeclaratorIdContext() { }
		public void copyFrom(VariableDeclaratorIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java85Context extends VariableDeclaratorIdContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public Java85Context(VariableDeclaratorIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava85(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava85(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava85(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variableDeclaratorId);
		int _la;
		try {
			_localctx = new Java85Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(Identifier);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(655);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }

		public VariableInitializerContext() { }
		public void copyFrom(VariableInitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java87Context extends VariableInitializerContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public Java87Context(VariableInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava87(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava87(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava87(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java86Context extends VariableInitializerContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Java86Context(VariableInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava86(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava86(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava86(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableInitializer);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				_localctx = new Java86Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				expression();
				}
				break;
			case LBRACE:
				_localctx = new Java87Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }

		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java88Context extends MethodDeclarationContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public Java88Context(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava88(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava88(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava88(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_methodDeclaration);
		int _la;
		try {
			_localctx = new Java88Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				{
				setState(662);
				methodModifier();
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(668);
			methodHeader();
			setState(669);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }

		public MethodModifierContext() { }
		public void copyFrom(MethodModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java92Context extends MethodModifierContext {
		public Java92Context(MethodModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava92(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava92(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava92(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java91Context extends MethodModifierContext {
		public Java91Context(MethodModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava91(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava91(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava91(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java90Context extends MethodModifierContext {
		public Java90Context(MethodModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava90(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava90(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava90(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java89Context extends MethodModifierContext {
		public Java89Context(MethodModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava89(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava89(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava89(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_methodModifier);
		try {
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				_localctx = new Java89Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				_localctx = new Java90Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				_localctx = new Java91Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				_localctx = new Java92Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(674);
				match(STATIC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }

		public MethodHeaderContext() { }
		public void copyFrom(MethodHeaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java94Context extends MethodHeaderContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Java94Context(MethodHeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava94(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava94(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava94(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java93Context extends MethodHeaderContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Java93Context(MethodHeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava93(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava93(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava93(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_methodHeader);
		try {
			setState(683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case VOID:
			case Identifier:
				_localctx = new Java93Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				result();
				setState(678);
				methodDeclarator();
				}
				break;
			case LT:
				_localctx = new Java94Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				typeParameters();
				setState(681);
				methodDeclarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }

		public ResultContext() { }
		public void copyFrom(ResultContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java96Context extends ResultContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Java96Context(ResultContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava96(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava96(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava96(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java95Context extends ResultContext {
		public Java95Context(ResultContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava95(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava95(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava95(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_result);
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				_localctx = new Java95Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				match(VOID);
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case Identifier:
				_localctx = new Java96Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }

		public MethodDeclaratorContext() { }
		public void copyFrom(MethodDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java97Context extends MethodDeclaratorContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public Java97Context(MethodDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava97(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava97(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava97(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_methodDeclarator);
		int _la;
		try {
			_localctx = new Java97Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(Identifier);
			setState(690);
			match(LPAREN);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << THIS))) != 0) || _la==Identifier) {
				{
				setState(691);
				formalParameterList();
				}
			}

			setState(694);
			match(RPAREN);
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(695);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }

		public FormalParameterListContext() { }
		public void copyFrom(FormalParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java99Context extends FormalParameterListContext {
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public Java99Context(FormalParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava99(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava99(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava99(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java98Context extends FormalParameterListContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public Java98Context(FormalParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava98(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava98(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava98(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_formalParameterList);
		try {
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new Java98Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				formalParameters();
				setState(699);
				match(COMMA);
				setState(700);
				lastFormalParameter();
				}
				break;
			case 2:
				_localctx = new Java99Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }

		public FormalParametersContext() { }
		public void copyFrom(FormalParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java101Context extends FormalParametersContext {
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public Java101Context(FormalParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava101(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava101(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava101(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java100Context extends FormalParametersContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public Java100Context(FormalParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava100(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava100(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava100(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_formalParameters);
		try {
			int _alt;
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new Java100Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				formalParameter();
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(706);
						match(COMMA);
						setState(707);
						formalParameter();
						}
						}
					}
					setState(712);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new Java101Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				receiverParameter();
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(714);
						match(COMMA);
						setState(715);
						formalParameter();
						}
						}
					}
					setState(720);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }

		public FormalParameterContext() { }
		public void copyFrom(FormalParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java102Context extends FormalParameterContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public Java102Context(FormalParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava102(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava102(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava102(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_formalParameter);
		try {
			_localctx = new Java102Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			typeType();
			setState(724);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }

		public LastFormalParameterContext() { }
		public void copyFrom(LastFormalParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java103Context extends LastFormalParameterContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public Java103Context(LastFormalParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava103(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava103(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava103(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java104Context extends LastFormalParameterContext {
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public Java104Context(LastFormalParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava104(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava104(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava104(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_lastFormalParameter);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new Java103Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				typeType();
				setState(727);
				match(T__0);
				setState(728);
				variableDeclaratorId();
				}
				break;
			case 2:
				_localctx = new Java104Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }

		public ReceiverParameterContext() { }
		public void copyFrom(ReceiverParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java105Context extends ReceiverParameterContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java105Context(ReceiverParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava105(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava105(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava105(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_receiverParameter);
		int _la;
		try {
			_localctx = new Java105Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(733);
				match(Identifier);
				setState(734);
				match(DOT);
				}
			}

			setState(737);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }

		public MethodBodyContext() { }
		public void copyFrom(MethodBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java107Context extends MethodBodyContext {
		public Java107Context(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava107(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava107(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava107(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java106Context extends MethodBodyContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Java106Context(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava106(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava106(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava106(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_methodBody);
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new Java106Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				block();
				}
				break;
			case SEMI:
				_localctx = new Java107Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }

		public InstanceInitializerContext() { }
		public void copyFrom(InstanceInitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java108Context extends InstanceInitializerContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Java108Context(InstanceInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava108(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava108(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava108(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_instanceInitializer);
		try {
			_localctx = new Java108Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }

		public StaticInitializerContext() { }
		public void copyFrom(StaticInitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java109Context extends StaticInitializerContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Java109Context(StaticInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava109(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava109(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava109(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_staticInitializer);
		try {
			_localctx = new Java109Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(STATIC);
			setState(746);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }

		public ConstructorDeclarationContext() { }
		public void copyFrom(ConstructorDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java110Context extends ConstructorDeclarationContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Java110Context(ConstructorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava110(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava110(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava110(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constructorDeclaration);
		int _la;
		try {
			_localctx = new Java110Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIVATE || _la==PUBLIC) {
				{
				{
				setState(748);
				constructorModifier();
				}
				}
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(754);
			constructorDeclarator();
			setState(755);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }

		public ConstructorModifierContext() { }
		public void copyFrom(ConstructorModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java112Context extends ConstructorModifierContext {
		public Java112Context(ConstructorModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava112(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava112(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava112(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java111Context extends ConstructorModifierContext {
		public Java111Context(ConstructorModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava111(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava111(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava111(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_constructorModifier);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				_localctx = new Java111Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				_localctx = new Java112Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }

		public ConstructorDeclaratorContext() { }
		public void copyFrom(ConstructorDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java113Context extends ConstructorDeclaratorContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public Java113Context(ConstructorDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava113(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava113(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava113(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_constructorDeclarator);
		int _la;
		try {
			_localctx = new Java113Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(761);
				typeParameters();
				}
			}

			setState(764);
			simpleTypeName();
			setState(765);
			match(LPAREN);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << THIS))) != 0) || _la==Identifier) {
				{
				setState(766);
				formalParameterList();
				}
			}

			setState(769);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }

		public SimpleTypeNameContext() { }
		public void copyFrom(SimpleTypeNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java114Context extends SimpleTypeNameContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java114Context(SimpleTypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava114(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava114(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava114(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_simpleTypeName);
		try {
			_localctx = new Java114Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }

		public ConstructorBodyContext() { }
		public void copyFrom(ConstructorBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java115Context extends ConstructorBodyContext {
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public Java115Context(ConstructorBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava115(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava115(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava115(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_constructorBody);
		int _la;
		try {
			_localctx = new Java115Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(LBRACE);
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(774);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << NEW) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << INC) | (1L << DEC))) != 0) || _la==Identifier) {
				{
				setState(777);
				blockStatements();
				}
			}

			setState(780);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }

		public ExplicitConstructorInvocationContext() { }
		public void copyFrom(ExplicitConstructorInvocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java118Context extends ExplicitConstructorInvocationContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java118Context(ExplicitConstructorInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava118(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava118(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava118(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java119Context extends ExplicitConstructorInvocationContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java119Context(ExplicitConstructorInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava119(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava119(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava119(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java116Context extends ExplicitConstructorInvocationContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java116Context(ExplicitConstructorInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava116(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava116(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava116(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java117Context extends ExplicitConstructorInvocationContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java117Context(ExplicitConstructorInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava117(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava117(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava117(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				_localctx = new Java116Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(782);
					typeArguments();
					}
				}

				setState(785);
				match(THIS);
				setState(786);
				match(LPAREN);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(787);
					argumentList();
					}
				}

				setState(790);
				match(RPAREN);
				setState(791);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new Java117Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(792);
					typeArguments();
					}
				}

				setState(795);
				match(SUPER);
				setState(796);
				match(LPAREN);
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(797);
					argumentList();
					}
				}

				setState(800);
				match(RPAREN);
				setState(801);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new Java118Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				expressionName();
				setState(803);
				match(DOT);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(804);
					typeArguments();
					}
				}

				setState(807);
				match(SUPER);
				setState(808);
				match(LPAREN);
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(809);
					argumentList();
					}
				}

				setState(812);
				match(RPAREN);
				setState(813);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new Java119Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(815);
				primary();
				setState(816);
				match(DOT);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(817);
					typeArguments();
					}
				}

				setState(820);
				match(SUPER);
				setState(821);
				match(LPAREN);
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(822);
					argumentList();
					}
				}

				setState(825);
				match(RPAREN);
				setState(826);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }

		public ConstantDeclarationContext() { }
		public void copyFrom(ConstantDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java120Context extends ConstantDeclarationContext {
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public Java120Context(ConstantDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava120(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava120(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava120(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_constantDeclaration);
		int _la;
		try {
			_localctx = new Java120Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC || _la==STATIC) {
				{
				{
				setState(830);
				constantModifier();
				}
				}
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(836);
			variableDeclaratorList();
			setState(837);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }

		public ConstantModifierContext() { }
		public void copyFrom(ConstantModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java121Context extends ConstantModifierContext {
		public Java121Context(ConstantModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava121(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava121(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava121(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java122Context extends ConstantModifierContext {
		public Java122Context(ConstantModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava122(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava122(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava122(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_constantModifier);
		try {
			setState(841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				_localctx = new Java121Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				match(PUBLIC);
				}
				break;
			case STATIC:
				_localctx = new Java122Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				match(STATIC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }

		public ElementValuePairListContext() { }
		public void copyFrom(ElementValuePairListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java123Context extends ElementValuePairListContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public Java123Context(ElementValuePairListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava123(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava123(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava123(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_elementValuePairList);
		int _la;
		try {
			_localctx = new Java123Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			elementValuePair();
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(844);
				match(COMMA);
				setState(845);
				elementValuePair();
				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }

		public ElementValuePairContext() { }
		public void copyFrom(ElementValuePairContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java124Context extends ElementValuePairContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public Java124Context(ElementValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava124(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava124(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava124(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_elementValuePair);
		try {
			_localctx = new Java124Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(Identifier);
			setState(852);
			match(ASSIGN);
			setState(853);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }

		public ElementValueContext() { }
		public void copyFrom(ElementValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java125Context extends ElementValueContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public Java125Context(ElementValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava125(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava125(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava125(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java126Context extends ElementValueContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public Java126Context(ElementValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava126(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava126(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava126(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elementValue);
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				_localctx = new Java125Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				conditionalExpression();
				}
				break;
			case LBRACE:
				_localctx = new Java126Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }

		public ElementValueArrayInitializerContext() { }
		public void copyFrom(ElementValueArrayInitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java127Context extends ElementValueArrayInitializerContext {
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public Java127Context(ElementValueArrayInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava127(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava127(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava127(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_elementValueArrayInitializer);
		int _la;
		try {
			_localctx = new Java127Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(LBRACE);
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				setState(860);
				elementValueList();
				}
			}

			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(863);
				match(COMMA);
				}
			}

			setState(866);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }

		public ElementValueListContext() { }
		public void copyFrom(ElementValueListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java128Context extends ElementValueListContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public Java128Context(ElementValueListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava128(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava128(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava128(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_elementValueList);
		try {
			int _alt;
			_localctx = new Java128Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			elementValue();
			setState(873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(869);
					match(COMMA);
					setState(870);
					elementValue();
					}
					}
				}
				setState(875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }

		public ArrayInitializerContext() { }
		public void copyFrom(ArrayInitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java129Context extends ArrayInitializerContext {
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public Java129Context(ArrayInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava129(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava129(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava129(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_arrayInitializer);
		int _la;
		try {
			_localctx = new Java129Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(LBRACE);
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				setState(877);
				variableInitializerList();
				}
			}

			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(880);
				match(COMMA);
				}
			}

			setState(883);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }

		public VariableInitializerListContext() { }
		public void copyFrom(VariableInitializerListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java130Context extends VariableInitializerListContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public Java130Context(VariableInitializerListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava130(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava130(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava130(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableInitializerList);
		try {
			int _alt;
			_localctx = new Java130Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			variableInitializer();
			setState(890);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(886);
					match(COMMA);
					setState(887);
					variableInitializer();
					}
					}
				}
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }

		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java131Context extends BlockContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public Java131Context(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava131(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava131(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava131(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_block);
		int _la;
		try {
			_localctx = new Java131Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(LBRACE);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << NEW) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << INC) | (1L << DEC))) != 0) || _la==Identifier) {
				{
				setState(894);
				blockStatements();
				}
			}

			setState(897);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }

		public BlockStatementsContext() { }
		public void copyFrom(BlockStatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java132Context extends BlockStatementsContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public Java132Context(BlockStatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava132(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava132(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava132(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_blockStatements);
		int _la;
		try {
			_localctx = new Java132Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			blockStatement();
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << NEW) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << INC) | (1L << DEC))) != 0) || _la==Identifier) {
				{
				{
				setState(900);
				blockStatement();
				}
				}
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }

		public BlockStatementContext() { }
		public void copyFrom(BlockStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java134Context extends BlockStatementContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public Java134Context(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava134(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava134(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava134(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java135Context extends BlockStatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Java135Context(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava135(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava135(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava135(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java133Context extends BlockStatementContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public Java133Context(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava133(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava133(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava133(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_blockStatement);
		try {
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new Java133Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				_localctx = new Java134Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				classDeclaration();
				}
				break;
			case 3:
				_localctx = new Java135Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }

		public LocalVariableDeclarationStatementContext() { }
		public void copyFrom(LocalVariableDeclarationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java136Context extends LocalVariableDeclarationStatementContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public Java136Context(LocalVariableDeclarationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava136(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava136(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava136(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_localVariableDeclarationStatement);
		try {
			_localctx = new Java136Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			localVariableDeclaration();
			setState(912);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }

		public LocalVariableDeclarationContext() { }
		public void copyFrom(LocalVariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java137Context extends LocalVariableDeclarationContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public Java137Context(LocalVariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava137(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava137(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava137(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_localVariableDeclaration);
		try {
			_localctx = new Java137Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			typeType();
			setState(915);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }

		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java138Context extends StatementContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public Java138Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava138(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava138(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava138(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java139Context extends StatementContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public Java139Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava139(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava139(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava139(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java143Context extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public Java143Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava143(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava143(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava143(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java141Context extends StatementContext {
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public Java141Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava141(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava141(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava141(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java142Context extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public Java142Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava142(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava142(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava142(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java140Context extends StatementContext {
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public Java140Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava140(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava140(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava140(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_statement);
		try {
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new Java138Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				_localctx = new Java139Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				labeledStatement();
				}
				break;
			case 3:
				_localctx = new Java140Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(919);
				ifThenStatement();
				}
				break;
			case 4:
				_localctx = new Java141Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(920);
				ifThenElseStatement();
				}
				break;
			case 5:
				_localctx = new Java142Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(921);
				whileStatement();
				}
				break;
			case 6:
				_localctx = new Java143Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(922);
				forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }

		public StatementNoShortIfContext() { }
		public void copyFrom(StatementNoShortIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java147Context extends StatementNoShortIfContext {
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public Java147Context(StatementNoShortIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava147(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava147(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava147(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java148Context extends StatementNoShortIfContext {
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public Java148Context(StatementNoShortIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava148(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava148(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava148(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java145Context extends StatementNoShortIfContext {
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public Java145Context(StatementNoShortIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava145(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava145(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava145(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java146Context extends StatementNoShortIfContext {
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public Java146Context(StatementNoShortIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava146(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava146(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava146(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java144Context extends StatementNoShortIfContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public Java144Context(StatementNoShortIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava144(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava144(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava144(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_statementNoShortIf);
		try {
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				_localctx = new Java144Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				_localctx = new Java145Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				_localctx = new Java146Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				_localctx = new Java147Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(928);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				_localctx = new Java148Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(929);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }

		public StatementWithoutTrailingSubstatementContext() { }
		public void copyFrom(StatementWithoutTrailingSubstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java149Context extends StatementWithoutTrailingSubstatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Java149Context(StatementWithoutTrailingSubstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava149(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava149(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava149(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java154Context extends StatementWithoutTrailingSubstatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public Java154Context(StatementWithoutTrailingSubstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava154(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava154(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava154(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java152Context extends StatementWithoutTrailingSubstatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public Java152Context(StatementWithoutTrailingSubstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava152(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava152(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava152(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java153Context extends StatementWithoutTrailingSubstatementContext {
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public Java153Context(StatementWithoutTrailingSubstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava153(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava153(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava153(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java150Context extends StatementWithoutTrailingSubstatementContext {
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public Java150Context(StatementWithoutTrailingSubstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava150(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava150(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava150(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java151Context extends StatementWithoutTrailingSubstatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public Java151Context(StatementWithoutTrailingSubstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava151(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava151(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava151(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new Java149Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				block();
				}
				break;
			case SEMI:
				_localctx = new Java150Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				emptyStatement();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
				_localctx = new Java151Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(934);
				expressionStatement();
				}
				break;
			case BREAK:
				_localctx = new Java152Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(935);
				breakStatement();
				}
				break;
			case CONTINUE:
				_localctx = new Java153Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(936);
				continueStatement();
				}
				break;
			case RETURN:
				_localctx = new Java154Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(937);
				returnStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }

		public EmptyStatementContext() { }
		public void copyFrom(EmptyStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java155Context extends EmptyStatementContext {
		public Java155Context(EmptyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava155(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava155(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava155(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_emptyStatement);
		try {
			_localctx = new Java155Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }

		public LabeledStatementContext() { }
		public void copyFrom(LabeledStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java156Context extends LabeledStatementContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Java156Context(LabeledStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava156(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava156(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava156(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_labeledStatement);
		try {
			_localctx = new Java156Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(Identifier);
			setState(943);
			match(COLON);
			setState(944);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }

		public LabeledStatementNoShortIfContext() { }
		public void copyFrom(LabeledStatementNoShortIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java157Context extends LabeledStatementNoShortIfContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public Java157Context(LabeledStatementNoShortIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava157(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava157(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava157(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_labeledStatementNoShortIf);
		try {
			_localctx = new Java157Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(Identifier);
			setState(947);
			match(COLON);
			setState(948);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }

		public ExpressionStatementContext() { }
		public void copyFrom(ExpressionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java158Context extends ExpressionStatementContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public Java158Context(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava158(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava158(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava158(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_expressionStatement);
		try {
			_localctx = new Java158Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			statementExpression();
			setState(951);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }

		public StatementExpressionContext() { }
		public void copyFrom(StatementExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java159Context extends StatementExpressionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Java159Context(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava159(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava159(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava159(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java165Context extends StatementExpressionContext {
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public Java165Context(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava165(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava165(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava165(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java163Context extends StatementExpressionContext {
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public Java163Context(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava163(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava163(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava163(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java164Context extends StatementExpressionContext {
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public Java164Context(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava164(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava164(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava164(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java161Context extends StatementExpressionContext {
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public Java161Context(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava161(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava161(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava161(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java162Context extends StatementExpressionContext {
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public Java162Context(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava162(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava162(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava162(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java160Context extends StatementExpressionContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public Java160Context(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava160(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava160(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava160(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_statementExpression);
		try {
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				_localctx = new Java159Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				assignment();
				}
				break;
			case 2:
				_localctx = new Java160Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				preIncrementExpression();
				}
				break;
			case 3:
				_localctx = new Java161Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(955);
				preDecrementExpression();
				}
				break;
			case 4:
				_localctx = new Java162Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(956);
				postIncrementExpression();
				}
				break;
			case 5:
				_localctx = new Java163Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(957);
				postDecrementExpression();
				}
				break;
			case 6:
				_localctx = new Java164Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(958);
				methodInvocation();
				}
				break;
			case 7:
				_localctx = new Java165Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(959);
				classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }

		public IfThenStatementContext() { }
		public void copyFrom(IfThenStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java166Context extends IfThenStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Java166Context(IfThenStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava166(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava166(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava166(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_ifThenStatement);
		try {
			_localctx = new Java166Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(IF);
			setState(963);
			match(LPAREN);
			setState(964);
			expression();
			setState(965);
			match(RPAREN);
			setState(966);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }

		public IfThenElseStatementContext() { }
		public void copyFrom(IfThenElseStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java167Context extends IfThenElseStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Java167Context(IfThenElseStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava167(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava167(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava167(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_ifThenElseStatement);
		try {
			_localctx = new Java167Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(IF);
			setState(969);
			match(LPAREN);
			setState(970);
			expression();
			setState(971);
			match(RPAREN);
			setState(972);
			statementNoShortIf();
			setState(973);
			match(ELSE);
			setState(974);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }

		public IfThenElseStatementNoShortIfContext() { }
		public void copyFrom(IfThenElseStatementNoShortIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java168Context extends IfThenElseStatementNoShortIfContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public Java168Context(IfThenElseStatementNoShortIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava168(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava168(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava168(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_ifThenElseStatementNoShortIf);
		try {
			_localctx = new Java168Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(IF);
			setState(977);
			match(LPAREN);
			setState(978);
			expression();
			setState(979);
			match(RPAREN);
			setState(980);
			statementNoShortIf();
			setState(981);
			match(ELSE);
			setState(982);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }

		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java169Context extends WhileStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Java169Context(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava169(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava169(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava169(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_whileStatement);
		try {
			_localctx = new Java169Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(WHILE);
			setState(985);
			match(LPAREN);
			setState(986);
			expression();
			setState(987);
			match(RPAREN);
			setState(988);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }

		public WhileStatementNoShortIfContext() { }
		public void copyFrom(WhileStatementNoShortIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java170Context extends WhileStatementNoShortIfContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public Java170Context(WhileStatementNoShortIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava170(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava170(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava170(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_whileStatementNoShortIf);
		try {
			_localctx = new Java170Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(WHILE);
			setState(991);
			match(LPAREN);
			setState(992);
			expression();
			setState(993);
			match(RPAREN);
			setState(994);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }

		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java171Context extends ForStatementContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public Java171Context(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava171(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava171(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava171(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_forStatement);
		try {
			_localctx = new Java171Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			basicForStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }

		public ForStatementNoShortIfContext() { }
		public void copyFrom(ForStatementNoShortIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java172Context extends ForStatementNoShortIfContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public Java172Context(ForStatementNoShortIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava172(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava172(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava172(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_forStatementNoShortIf);
		try {
			_localctx = new Java172Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			basicForStatementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }

		public BasicForStatementContext() { }
		public void copyFrom(BasicForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java173Context extends BasicForStatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public Java173Context(BasicForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava173(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava173(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava173(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_basicForStatement);
		int _la;
		try {
			_localctx = new Java173Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(FOR);
			setState(1001);
			match(LPAREN);
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << INC) | (1L << DEC))) != 0) || _la==Identifier) {
				{
				setState(1002);
				forInit();
				}
			}

			setState(1005);
			match(SEMI);
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				setState(1006);
				expression();
				}
			}

			setState(1009);
			match(SEMI);
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << INC) | (1L << DEC))) != 0) || _la==Identifier) {
				{
				setState(1010);
				forUpdate();
				}
			}

			setState(1013);
			match(RPAREN);
			setState(1014);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }

		public BasicForStatementNoShortIfContext() { }
		public void copyFrom(BasicForStatementNoShortIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java174Context extends BasicForStatementNoShortIfContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public Java174Context(BasicForStatementNoShortIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava174(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava174(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava174(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			_localctx = new Java174Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(FOR);
			setState(1017);
			match(LPAREN);
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << INC) | (1L << DEC))) != 0) || _la==Identifier) {
				{
				setState(1018);
				forInit();
				}
			}

			setState(1021);
			match(SEMI);
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				setState(1022);
				expression();
				}
			}

			setState(1025);
			match(SEMI);
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << INC) | (1L << DEC))) != 0) || _la==Identifier) {
				{
				setState(1026);
				forUpdate();
				}
			}

			setState(1029);
			match(RPAREN);
			setState(1030);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }

		public ForInitContext() { }
		public void copyFrom(ForInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java176Context extends ForInitContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public Java176Context(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava176(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava176(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava176(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java175Context extends ForInitContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public Java175Context(ForInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava175(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava175(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava175(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_forInit);
		try {
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				_localctx = new Java175Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				statementExpressionList();
				}
				break;
			case 2:
				_localctx = new Java176Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }

		public ForUpdateContext() { }
		public void copyFrom(ForUpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java177Context extends ForUpdateContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public Java177Context(ForUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava177(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava177(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava177(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_forUpdate);
		try {
			_localctx = new Java177Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }

		public StatementExpressionListContext() { }
		public void copyFrom(StatementExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java178Context extends StatementExpressionListContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public Java178Context(StatementExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava178(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava178(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava178(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_statementExpressionList);
		int _la;
		try {
			_localctx = new Java178Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			statementExpression();
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1039);
				match(COMMA);
				setState(1040);
				statementExpression();
				}
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }

		public BreakStatementContext() { }
		public void copyFrom(BreakStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java179Context extends BreakStatementContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java179Context(BreakStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava179(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava179(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava179(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_breakStatement);
		int _la;
		try {
			_localctx = new Java179Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(BREAK);
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1047);
				match(Identifier);
				}
			}

			setState(1050);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }

		public ContinueStatementContext() { }
		public void copyFrom(ContinueStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java180Context extends ContinueStatementContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java180Context(ContinueStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava180(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava180(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava180(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_continueStatement);
		int _la;
		try {
			_localctx = new Java180Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			match(CONTINUE);
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1053);
				match(Identifier);
				}
			}

			setState(1056);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }

		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java181Context extends ReturnStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Java181Context(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava181(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava181(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava181(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_returnStatement);
		int _la;
		try {
			_localctx = new Java181Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(RETURN);
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				setState(1059);
				expression();
				}
			}

			setState(1062);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }

		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java182Context extends PrimaryContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public Java182Context(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava182(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava182(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava182(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_primary);
		try {
			int _alt;
			_localctx = new Java182Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1064);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1065);
				arrayCreationExpression();
				}
				break;
			}
			setState(1071);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1068);
					primaryNoNewArray_lf_primary();
					}
					}
				}
				setState(1073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }

		public PrimaryNoNewArrayContext() { }
		public void copyFrom(PrimaryNoNewArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java190Context extends PrimaryNoNewArrayContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public Java190Context(PrimaryNoNewArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava190(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava190(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava190(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java191Context extends PrimaryNoNewArrayContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public Java191Context(PrimaryNoNewArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava191(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava191(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava191(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java189Context extends PrimaryNoNewArrayContext {
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public Java189Context(PrimaryNoNewArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava189(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava189(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava189(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java187Context extends PrimaryNoNewArrayContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public Java187Context(PrimaryNoNewArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava187(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava187(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava187(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java188Context extends PrimaryNoNewArrayContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Java188Context(PrimaryNoNewArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava188(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava188(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava188(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java185Context extends PrimaryNoNewArrayContext {
		public Java185Context(PrimaryNoNewArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava185(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava185(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava185(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java186Context extends PrimaryNoNewArrayContext {
		public Java186Context(PrimaryNoNewArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava186(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava186(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava186(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java183Context extends PrimaryNoNewArrayContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Java183Context(PrimaryNoNewArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava183(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava183(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava183(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java184Context extends PrimaryNoNewArrayContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public Java184Context(PrimaryNoNewArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava184(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava184(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava184(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java192Context extends PrimaryNoNewArrayContext {
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public Java192Context(PrimaryNoNewArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava192(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava192(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava192(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java193Context extends PrimaryNoNewArrayContext {
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public Java193Context(PrimaryNoNewArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava193(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava193(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava193(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				_localctx = new Java183Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				literal();
				}
				break;
			case 2:
				_localctx = new Java184Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1075);
				typeName();
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1076);
					match(LBRACK);
					setState(1077);
					match(RBRACK);
					}
					}
					setState(1082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1083);
				match(DOT);
				setState(1084);
				match(CLASS);
				}
				break;
			case 3:
				_localctx = new Java185Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1086);
				match(VOID);
				setState(1087);
				match(DOT);
				setState(1088);
				match(CLASS);
				}
				break;
			case 4:
				_localctx = new Java186Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1089);
				match(THIS);
				}
				break;
			case 5:
				_localctx = new Java187Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1090);
				typeName();
				setState(1091);
				match(DOT);
				setState(1092);
				match(THIS);
				}
				break;
			case 6:
				_localctx = new Java188Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1094);
				match(LPAREN);
				setState(1095);
				expression();
				setState(1096);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new Java189Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1098);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				_localctx = new Java190Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1099);
				fieldAccess();
				}
				break;
			case 9:
				_localctx = new Java191Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1100);
				arrayAccess();
				}
				break;
			case 10:
				_localctx = new Java192Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1101);
				methodInvocation();
				}
				break;
			case 11:
				_localctx = new Java193Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1102);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }

		public PrimaryNoNewArray_lf_arrayAccessContext() { }
		public void copyFrom(PrimaryNoNewArray_lf_arrayAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java194Context extends PrimaryNoNewArray_lf_arrayAccessContext {
		public Java194Context(PrimaryNoNewArray_lf_arrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava194(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava194(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava194(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			_localctx = new Java194Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }

		public PrimaryNoNewArray_lfno_arrayAccessContext() { }
		public void copyFrom(PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java204Context extends PrimaryNoNewArray_lfno_arrayAccessContext {
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public Java204Context(PrimaryNoNewArray_lfno_arrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava204(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava204(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava204(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java202Context extends PrimaryNoNewArray_lfno_arrayAccessContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public Java202Context(PrimaryNoNewArray_lfno_arrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava202(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava202(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava202(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java203Context extends PrimaryNoNewArray_lfno_arrayAccessContext {
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public Java203Context(PrimaryNoNewArray_lfno_arrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava203(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava203(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava203(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java200Context extends PrimaryNoNewArray_lfno_arrayAccessContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Java200Context(PrimaryNoNewArray_lfno_arrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava200(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava200(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava200(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java201Context extends PrimaryNoNewArray_lfno_arrayAccessContext {
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public Java201Context(PrimaryNoNewArray_lfno_arrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava201(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava201(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava201(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java198Context extends PrimaryNoNewArray_lfno_arrayAccessContext {
		public Java198Context(PrimaryNoNewArray_lfno_arrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava198(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava198(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava198(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java199Context extends PrimaryNoNewArray_lfno_arrayAccessContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public Java199Context(PrimaryNoNewArray_lfno_arrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava199(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava199(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava199(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java196Context extends PrimaryNoNewArray_lfno_arrayAccessContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public Java196Context(PrimaryNoNewArray_lfno_arrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava196(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava196(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava196(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java197Context extends PrimaryNoNewArray_lfno_arrayAccessContext {
		public Java197Context(PrimaryNoNewArray_lfno_arrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava197(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava197(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava197(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java195Context extends PrimaryNoNewArray_lfno_arrayAccessContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Java195Context(PrimaryNoNewArray_lfno_arrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava195(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava195(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava195(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new Java195Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				literal();
				}
				break;
			case 2:
				_localctx = new Java196Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1108);
				typeName();
				setState(1113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1109);
					match(LBRACK);
					setState(1110);
					match(RBRACK);
					}
					}
					setState(1115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1116);
				match(DOT);
				setState(1117);
				match(CLASS);
				}
				break;
			case 3:
				_localctx = new Java197Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1119);
				match(VOID);
				setState(1120);
				match(DOT);
				setState(1121);
				match(CLASS);
				}
				break;
			case 4:
				_localctx = new Java198Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1122);
				match(THIS);
				}
				break;
			case 5:
				_localctx = new Java199Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1123);
				typeName();
				setState(1124);
				match(DOT);
				setState(1125);
				match(THIS);
				}
				break;
			case 6:
				_localctx = new Java200Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1127);
				match(LPAREN);
				setState(1128);
				expression();
				setState(1129);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new Java201Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1131);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				_localctx = new Java202Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1132);
				fieldAccess();
				}
				break;
			case 9:
				_localctx = new Java203Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1133);
				methodInvocation();
				}
				break;
			case 10:
				_localctx = new Java204Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1134);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }

		public PrimaryNoNewArray_lf_primaryContext() { }
		public void copyFrom(PrimaryNoNewArray_lf_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java206Context extends PrimaryNoNewArray_lf_primaryContext {
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public Java206Context(PrimaryNoNewArray_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava206(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava206(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava206(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java207Context extends PrimaryNoNewArray_lf_primaryContext {
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public Java207Context(PrimaryNoNewArray_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava207(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava207(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava207(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java205Context extends PrimaryNoNewArray_lf_primaryContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public Java205Context(PrimaryNoNewArray_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava205(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava205(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava205(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java208Context extends PrimaryNoNewArray_lf_primaryContext {
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public Java208Context(PrimaryNoNewArray_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava208(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava208(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava208(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java209Context extends PrimaryNoNewArray_lf_primaryContext {
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public Java209Context(PrimaryNoNewArray_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava209(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava209(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava209(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new Java205Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				_localctx = new Java206Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				_localctx = new Java207Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1139);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				_localctx = new Java208Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1140);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				_localctx = new Java209Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1141);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }

		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext() { }
		public void copyFrom(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java210Context extends PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext {
		public Java210Context(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava210(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava210(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava210(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			_localctx = new Java210Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }

		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext() { }
		public void copyFrom(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java213Context extends PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext {
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public Java213Context(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava213(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava213(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava213(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java214Context extends PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext {
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public Java214Context(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava214(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava214(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava214(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java211Context extends PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public Java211Context(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava211(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava211(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava211(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java212Context extends PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext {
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public Java212Context(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava212(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava212(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava212(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				_localctx = new Java211Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1146);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				_localctx = new Java212Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				_localctx = new Java213Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1148);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				_localctx = new Java214Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1149);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }

		public PrimaryNoNewArray_lfno_primaryContext() { }
		public void copyFrom(PrimaryNoNewArray_lfno_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java217Context extends PrimaryNoNewArray_lfno_primaryContext {
		public Java217Context(PrimaryNoNewArray_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava217(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava217(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava217(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java218Context extends PrimaryNoNewArray_lfno_primaryContext {
		public Java218Context(PrimaryNoNewArray_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava218(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava218(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava218(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java215Context extends PrimaryNoNewArray_lfno_primaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Java215Context(PrimaryNoNewArray_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava215(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava215(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava215(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java216Context extends PrimaryNoNewArray_lfno_primaryContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public Java216Context(PrimaryNoNewArray_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava216(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava216(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava216(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java224Context extends PrimaryNoNewArray_lfno_primaryContext {
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public Java224Context(PrimaryNoNewArray_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava224(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava224(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava224(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java225Context extends PrimaryNoNewArray_lfno_primaryContext {
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public Java225Context(PrimaryNoNewArray_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava225(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava225(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava225(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java222Context extends PrimaryNoNewArray_lfno_primaryContext {
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public Java222Context(PrimaryNoNewArray_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava222(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava222(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava222(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java223Context extends PrimaryNoNewArray_lfno_primaryContext {
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public Java223Context(PrimaryNoNewArray_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava223(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava223(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava223(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java220Context extends PrimaryNoNewArray_lfno_primaryContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Java220Context(PrimaryNoNewArray_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava220(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava220(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava220(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java221Context extends PrimaryNoNewArray_lfno_primaryContext {
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public Java221Context(PrimaryNoNewArray_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava221(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava221(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava221(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java219Context extends PrimaryNoNewArray_lfno_primaryContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public Java219Context(PrimaryNoNewArray_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava219(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava219(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava219(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new Java215Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1152);
				literal();
				}
				break;
			case 2:
				_localctx = new Java216Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				typeName();
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1154);
					match(LBRACK);
					setState(1155);
					match(RBRACK);
					}
					}
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1161);
				match(DOT);
				setState(1162);
				match(CLASS);
				}
				break;
			case 3:
				_localctx = new Java217Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1164);
				match(VOID);
				setState(1165);
				match(DOT);
				setState(1166);
				match(CLASS);
				}
				break;
			case 4:
				_localctx = new Java218Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1167);
				match(THIS);
				}
				break;
			case 5:
				_localctx = new Java219Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1168);
				typeName();
				setState(1169);
				match(DOT);
				setState(1170);
				match(THIS);
				}
				break;
			case 6:
				_localctx = new Java220Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1172);
				match(LPAREN);
				setState(1173);
				expression();
				setState(1174);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new Java221Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1176);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 8:
				_localctx = new Java222Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1177);
				fieldAccess_lfno_primary();
				}
				break;
			case 9:
				_localctx = new Java223Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1178);
				arrayAccess_lfno_primary();
				}
				break;
			case 10:
				_localctx = new Java224Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1179);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				_localctx = new Java225Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1180);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }

		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext() { }
		public void copyFrom(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java226Context extends PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext {
		public Java226Context(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava226(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava226(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava226(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			_localctx = new Java226Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }

		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext() { }
		public void copyFrom(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java228Context extends PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public Java228Context(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava228(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava228(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava228(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java229Context extends PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext {
		public Java229Context(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava229(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava229(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava229(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java227Context extends PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Java227Context(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava227(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava227(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava227(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java235Context extends PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext {
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public Java235Context(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava235(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava235(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava235(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java236Context extends PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext {
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public Java236Context(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava236(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava236(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava236(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java233Context extends PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext {
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public Java233Context(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava233(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava233(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava233(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java234Context extends PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext {
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public Java234Context(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava234(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava234(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava234(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java231Context extends PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public Java231Context(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava231(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava231(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava231(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java232Context extends PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Java232Context(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava232(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava232(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava232(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java230Context extends PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext {
		public Java230Context(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava230(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava230(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava230(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(1213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				_localctx = new Java227Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1185);
				literal();
				}
				break;
			case 2:
				_localctx = new Java228Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				typeName();
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1187);
					match(LBRACK);
					setState(1188);
					match(RBRACK);
					}
					}
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1194);
				match(DOT);
				setState(1195);
				match(CLASS);
				}
				break;
			case 3:
				_localctx = new Java229Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1197);
				match(VOID);
				setState(1198);
				match(DOT);
				setState(1199);
				match(CLASS);
				}
				break;
			case 4:
				_localctx = new Java230Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1200);
				match(THIS);
				}
				break;
			case 5:
				_localctx = new Java231Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1201);
				typeName();
				setState(1202);
				match(DOT);
				setState(1203);
				match(THIS);
				}
				break;
			case 6:
				_localctx = new Java232Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1205);
				match(LPAREN);
				setState(1206);
				expression();
				setState(1207);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new Java233Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1209);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 8:
				_localctx = new Java234Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1210);
				fieldAccess_lfno_primary();
				}
				break;
			case 9:
				_localctx = new Java235Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1211);
				methodInvocation_lfno_primary();
				}
				break;
			case 10:
				_localctx = new Java236Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1212);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }

		public ClassInstanceCreationExpressionContext() { }
		public void copyFrom(ClassInstanceCreationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java239Context extends ClassInstanceCreationExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public Java239Context(ClassInstanceCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava239(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava239(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava239(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java237Context extends ClassInstanceCreationExpressionContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public Java237Context(ClassInstanceCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava237(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava237(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava237(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java238Context extends ClassInstanceCreationExpressionContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public Java238Context(ClassInstanceCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava238(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava238(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava238(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(1274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				_localctx = new Java237Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				match(NEW);
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1216);
					typeArguments();
					}
				}

				setState(1219);
				match(Identifier);
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1220);
					match(DOT);
					setState(1221);
					match(Identifier);
					}
					}
					setState(1226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1227);
					typeArgumentsOrDiamond();
					}
				}

				setState(1230);
				match(LPAREN);
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1231);
					argumentList();
					}
				}

				setState(1234);
				match(RPAREN);
				setState(1236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(1235);
					classBody();
					}
				}

				}
				break;
			case 2:
				_localctx = new Java238Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1238);
				expressionName();
				setState(1239);
				match(DOT);
				setState(1240);
				match(NEW);
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1241);
					typeArguments();
					}
				}

				setState(1244);
				match(Identifier);
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1245);
					typeArgumentsOrDiamond();
					}
				}

				setState(1248);
				match(LPAREN);
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1249);
					argumentList();
					}
				}

				setState(1252);
				match(RPAREN);
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(1253);
					classBody();
					}
				}

				}
				break;
			case 3:
				_localctx = new Java239Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1256);
				primary();
				setState(1257);
				match(DOT);
				setState(1258);
				match(NEW);
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1259);
					typeArguments();
					}
				}

				setState(1262);
				match(Identifier);
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1263);
					typeArgumentsOrDiamond();
					}
				}

				setState(1266);
				match(LPAREN);
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1267);
					argumentList();
					}
				}

				setState(1270);
				match(RPAREN);
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(1271);
					classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }

		public ClassInstanceCreationExpression_lf_primaryContext() { }
		public void copyFrom(ClassInstanceCreationExpression_lf_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java240Context extends ClassInstanceCreationExpression_lf_primaryContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public Java240Context(ClassInstanceCreationExpression_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava240(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava240(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava240(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			_localctx = new Java240Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(DOT);
			setState(1277);
			match(NEW);
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1278);
				typeArguments();
				}
			}

			setState(1281);
			match(Identifier);
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1282);
				typeArgumentsOrDiamond();
				}
			}

			setState(1285);
			match(LPAREN);
			setState(1287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				setState(1286);
				argumentList();
				}
			}

			setState(1289);
			match(RPAREN);
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1290);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }

		public ClassInstanceCreationExpression_lfno_primaryContext() { }
		public void copyFrom(ClassInstanceCreationExpression_lfno_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java242Context extends ClassInstanceCreationExpression_lfno_primaryContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public Java242Context(ClassInstanceCreationExpression_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava242(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava242(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava242(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java241Context extends ClassInstanceCreationExpression_lfno_primaryContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public Java241Context(ClassInstanceCreationExpression_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava241(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava241(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava241(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(1334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				_localctx = new Java241Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				match(NEW);
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1294);
					typeArguments();
					}
				}

				setState(1297);
				match(Identifier);
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1298);
					match(DOT);
					setState(1299);
					match(Identifier);
					}
					}
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1305);
					typeArgumentsOrDiamond();
					}
				}

				setState(1308);
				match(LPAREN);
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1309);
					argumentList();
					}
				}

				setState(1312);
				match(RPAREN);
				setState(1314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1313);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				_localctx = new Java242Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				expressionName();
				setState(1317);
				match(DOT);
				setState(1318);
				match(NEW);
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1319);
					typeArguments();
					}
				}

				setState(1322);
				match(Identifier);
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1323);
					typeArgumentsOrDiamond();
					}
				}

				setState(1326);
				match(LPAREN);
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1327);
					argumentList();
					}
				}

				setState(1330);
				match(RPAREN);
				setState(1332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1331);
					classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }

		public TypeArgumentsOrDiamondContext() { }
		public void copyFrom(TypeArgumentsOrDiamondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java244Context extends TypeArgumentsOrDiamondContext {
		public Java244Context(TypeArgumentsOrDiamondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava244(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava244(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava244(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java243Context extends TypeArgumentsOrDiamondContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java243Context(TypeArgumentsOrDiamondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava243(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava243(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava243(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_typeArgumentsOrDiamond);
		try {
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new Java243Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1336);
				typeArguments();
				}
				break;
			case 2:
				_localctx = new Java244Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1337);
				match(LT);
				setState(1338);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }

		public FieldAccessContext() { }
		public void copyFrom(FieldAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java246Context extends FieldAccessContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java246Context(FieldAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava246(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava246(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava246(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java247Context extends FieldAccessContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java247Context(FieldAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava247(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava247(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava247(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java245Context extends FieldAccessContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java245Context(FieldAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava245(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava245(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava245(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_fieldAccess);
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				_localctx = new Java245Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1341);
				primary();
				setState(1342);
				match(DOT);
				setState(1343);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new Java246Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
				match(SUPER);
				setState(1346);
				match(DOT);
				setState(1347);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new Java247Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1348);
				typeName();
				setState(1349);
				match(DOT);
				setState(1350);
				match(SUPER);
				setState(1351);
				match(DOT);
				setState(1352);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }

		public FieldAccess_lf_primaryContext() { }
		public void copyFrom(FieldAccess_lf_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java248Context extends FieldAccess_lf_primaryContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java248Context(FieldAccess_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava248(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava248(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava248(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_fieldAccess_lf_primary);
		try {
			_localctx = new Java248Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(DOT);
			setState(1357);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }

		public FieldAccess_lfno_primaryContext() { }
		public void copyFrom(FieldAccess_lfno_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java249Context extends FieldAccess_lfno_primaryContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java249Context(FieldAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava249(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava249(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava249(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java250Context extends FieldAccess_lfno_primaryContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public Java250Context(FieldAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava250(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava250(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava250(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_fieldAccess_lfno_primary);
		try {
			setState(1368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				_localctx = new Java249Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1359);
				match(SUPER);
				setState(1360);
				match(DOT);
				setState(1361);
				match(Identifier);
				}
				break;
			case Identifier:
				_localctx = new Java250Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1362);
				typeName();
				setState(1363);
				match(DOT);
				setState(1364);
				match(SUPER);
				setState(1365);
				match(DOT);
				setState(1366);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }

		public ArrayAccessContext() { }
		public void copyFrom(ArrayAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java251Context extends ArrayAccessContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public Java251Context(ArrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava251(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava251(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava251(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arrayAccess);
		int _la;
		try {
			_localctx = new Java251Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1370);
				expressionName();
				setState(1371);
				match(LBRACK);
				setState(1372);
				expression();
				setState(1373);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(1375);
				primaryNoNewArray_lfno_arrayAccess();
				setState(1376);
				match(LBRACK);
				setState(1377);
				expression();
				setState(1378);
				match(RBRACK);
				}
				break;
			}
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1382);
				primaryNoNewArray_lf_arrayAccess();
				setState(1383);
				match(LBRACK);
				setState(1384);
				expression();
				setState(1385);
				match(RBRACK);
				}
				}
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }

		public ArrayAccess_lf_primaryContext() { }
		public void copyFrom(ArrayAccess_lf_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java252Context extends ArrayAccess_lf_primaryContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public Java252Context(ArrayAccess_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava252(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava252(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava252(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			_localctx = new Java252Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1392);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(1393);
			match(LBRACK);
			setState(1394);
			expression();
			setState(1395);
			match(RBRACK);
			}
			setState(1404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1397);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(1398);
					match(LBRACK);
					setState(1399);
					expression();
					setState(1400);
					match(RBRACK);
					}
					}
				}
				setState(1406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }

		public ArrayAccess_lfno_primaryContext() { }
		public void copyFrom(ArrayAccess_lfno_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java253Context extends ArrayAccess_lfno_primaryContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public Java253Context(ArrayAccess_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava253(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava253(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava253(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			_localctx = new Java253Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1407);
				expressionName();
				setState(1408);
				match(LBRACK);
				setState(1409);
				expression();
				setState(1410);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(1412);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(1413);
				match(LBRACK);
				setState(1414);
				expression();
				setState(1415);
				match(RBRACK);
				}
				break;
			}
			setState(1426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1419);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(1420);
					match(LBRACK);
					setState(1421);
					expression();
					setState(1422);
					match(RBRACK);
					}
					}
				}
				setState(1428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }

		public MethodInvocationContext() { }
		public void copyFrom(MethodInvocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java259Context extends MethodInvocationContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java259Context(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava259(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava259(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava259(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java257Context extends MethodInvocationContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java257Context(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava257(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava257(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava257(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java258Context extends MethodInvocationContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java258Context(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava258(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava258(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava258(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java255Context extends MethodInvocationContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java255Context(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava255(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava255(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava255(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java256Context extends MethodInvocationContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java256Context(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava256(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava256(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava256(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java254Context extends MethodInvocationContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java254Context(MethodInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava254(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava254(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava254(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_methodInvocation);
		int _la;
		try {
			setState(1497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				_localctx = new Java254Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1429);
				methodName();
				setState(1430);
				match(LPAREN);
				setState(1432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1431);
					argumentList();
					}
				}

				setState(1434);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new Java255Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				typeName();
				setState(1437);
				match(DOT);
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1438);
					typeArguments();
					}
				}

				setState(1441);
				match(Identifier);
				setState(1442);
				match(LPAREN);
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1443);
					argumentList();
					}
				}

				setState(1446);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new Java256Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1448);
				expressionName();
				setState(1449);
				match(DOT);
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1450);
					typeArguments();
					}
				}

				setState(1453);
				match(Identifier);
				setState(1454);
				match(LPAREN);
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1455);
					argumentList();
					}
				}

				setState(1458);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new Java257Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1460);
				primary();
				setState(1461);
				match(DOT);
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1462);
					typeArguments();
					}
				}

				setState(1465);
				match(Identifier);
				setState(1466);
				match(LPAREN);
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1467);
					argumentList();
					}
				}

				setState(1470);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new Java258Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1472);
				match(SUPER);
				setState(1473);
				match(DOT);
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1474);
					typeArguments();
					}
				}

				setState(1477);
				match(Identifier);
				setState(1478);
				match(LPAREN);
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1479);
					argumentList();
					}
				}

				setState(1482);
				match(RPAREN);
				}
				break;
			case 6:
				_localctx = new Java259Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1483);
				typeName();
				setState(1484);
				match(DOT);
				setState(1485);
				match(SUPER);
				setState(1486);
				match(DOT);
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1487);
					typeArguments();
					}
				}

				setState(1490);
				match(Identifier);
				setState(1491);
				match(LPAREN);
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1492);
					argumentList();
					}
				}

				setState(1495);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }

		public MethodInvocation_lf_primaryContext() { }
		public void copyFrom(MethodInvocation_lf_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java260Context extends MethodInvocation_lf_primaryContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java260Context(MethodInvocation_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava260(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava260(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava260(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			_localctx = new Java260Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			match(DOT);
			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1500);
				typeArguments();
				}
			}

			setState(1503);
			match(Identifier);
			setState(1504);
			match(LPAREN);
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				setState(1505);
				argumentList();
				}
			}

			setState(1508);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }

		public MethodInvocation_lfno_primaryContext() { }
		public void copyFrom(MethodInvocation_lfno_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java264Context extends MethodInvocation_lfno_primaryContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java264Context(MethodInvocation_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava264(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava264(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava264(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java265Context extends MethodInvocation_lfno_primaryContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java265Context(MethodInvocation_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava265(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava265(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava265(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java262Context extends MethodInvocation_lfno_primaryContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java262Context(MethodInvocation_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava262(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava262(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava262(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java263Context extends MethodInvocation_lfno_primaryContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java263Context(MethodInvocation_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava263(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava263(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava263(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java261Context extends MethodInvocation_lfno_primaryContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public Java261Context(MethodInvocation_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava261(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava261(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava261(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(1566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				_localctx = new Java261Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1510);
				methodName();
				setState(1511);
				match(LPAREN);
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1512);
					argumentList();
					}
				}

				setState(1515);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new Java262Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				typeName();
				setState(1518);
				match(DOT);
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1519);
					typeArguments();
					}
				}

				setState(1522);
				match(Identifier);
				setState(1523);
				match(LPAREN);
				setState(1525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1524);
					argumentList();
					}
				}

				setState(1527);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new Java263Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1529);
				expressionName();
				setState(1530);
				match(DOT);
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1531);
					typeArguments();
					}
				}

				setState(1534);
				match(Identifier);
				setState(1535);
				match(LPAREN);
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1536);
					argumentList();
					}
				}

				setState(1539);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new Java264Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1541);
				match(SUPER);
				setState(1542);
				match(DOT);
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1543);
					typeArguments();
					}
				}

				setState(1546);
				match(Identifier);
				setState(1547);
				match(LPAREN);
				setState(1549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1548);
					argumentList();
					}
				}

				setState(1551);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new Java265Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1552);
				typeName();
				setState(1553);
				match(DOT);
				setState(1554);
				match(SUPER);
				setState(1555);
				match(DOT);
				setState(1557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1556);
					typeArguments();
					}
				}

				setState(1559);
				match(Identifier);
				setState(1560);
				match(LPAREN);
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(1561);
					argumentList();
					}
				}

				setState(1564);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }

		public ArgumentListContext() { }
		public void copyFrom(ArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java266Context extends ArgumentListContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Java266Context(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava266(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava266(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava266(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_argumentList);
		int _la;
		try {
			_localctx = new Java266Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			expression();
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1569);
				match(COMMA);
				setState(1570);
				expression();
				}
				}
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }

		public MethodReferenceContext() { }
		public void copyFrom(MethodReferenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java268Context extends MethodReferenceContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java268Context(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava268(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava268(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava268(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java269Context extends MethodReferenceContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java269Context(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava269(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava269(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava269(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java267Context extends MethodReferenceContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java267Context(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava267(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava267(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava267(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java273Context extends MethodReferenceContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public Java273Context(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava273(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava273(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava273(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java271Context extends MethodReferenceContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java271Context(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava271(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava271(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava271(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java272Context extends MethodReferenceContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java272Context(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava272(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava272(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava272(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java270Context extends MethodReferenceContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java270Context(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava270(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava270(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava270(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_methodReference);
		int _la;
		try {
			setState(1623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				_localctx = new Java267Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1576);
				expressionName();
				setState(1577);
				match(T__1);
				setState(1579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1578);
					typeArguments();
					}
				}

				setState(1581);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new Java268Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1583);
				referenceType();
				setState(1584);
				match(T__1);
				setState(1586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1585);
					typeArguments();
					}
				}

				setState(1588);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new Java269Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1590);
				primary();
				setState(1591);
				match(T__1);
				setState(1593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1592);
					typeArguments();
					}
				}

				setState(1595);
				match(Identifier);
				}
				break;
			case 4:
				_localctx = new Java270Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1597);
				match(SUPER);
				setState(1598);
				match(T__1);
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1599);
					typeArguments();
					}
				}

				setState(1602);
				match(Identifier);
				}
				break;
			case 5:
				_localctx = new Java271Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1603);
				typeName();
				setState(1604);
				match(DOT);
				setState(1605);
				match(SUPER);
				setState(1606);
				match(T__1);
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1607);
					typeArguments();
					}
				}

				setState(1610);
				match(Identifier);
				}
				break;
			case 6:
				_localctx = new Java272Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1612);
				classType();
				setState(1613);
				match(T__1);
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1614);
					typeArguments();
					}
				}

				setState(1617);
				match(NEW);
				}
				break;
			case 7:
				_localctx = new Java273Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1619);
				arrayType();
				setState(1620);
				match(T__1);
				setState(1621);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }

		public MethodReference_lf_primaryContext() { }
		public void copyFrom(MethodReference_lf_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java274Context extends MethodReference_lf_primaryContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java274Context(MethodReference_lf_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava274(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava274(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava274(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_methodReference_lf_primary);
		int _la;
		try {
			_localctx = new Java274Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			match(T__1);
			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1626);
				typeArguments();
				}
			}

			setState(1629);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }

		public MethodReference_lfno_primaryContext() { }
		public void copyFrom(MethodReference_lfno_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java279Context extends MethodReference_lfno_primaryContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java279Context(MethodReference_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava279(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava279(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava279(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java277Context extends MethodReference_lfno_primaryContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java277Context(MethodReference_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava277(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava277(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava277(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java278Context extends MethodReference_lfno_primaryContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java278Context(MethodReference_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava278(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava278(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava278(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java275Context extends MethodReference_lfno_primaryContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java275Context(MethodReference_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava275(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava275(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava275(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java276Context extends MethodReference_lfno_primaryContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Java276Context(MethodReference_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava276(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava276(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava276(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java280Context extends MethodReference_lfno_primaryContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public Java280Context(MethodReference_lfno_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava280(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava280(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava280(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(1671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				_localctx = new Java275Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				expressionName();
				setState(1632);
				match(T__1);
				setState(1634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1633);
					typeArguments();
					}
				}

				setState(1636);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new Java276Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1638);
				referenceType();
				setState(1639);
				match(T__1);
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1640);
					typeArguments();
					}
				}

				setState(1643);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new Java277Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
				match(SUPER);
				setState(1646);
				match(T__1);
				setState(1648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1647);
					typeArguments();
					}
				}

				setState(1650);
				match(Identifier);
				}
				break;
			case 4:
				_localctx = new Java278Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1651);
				typeName();
				setState(1652);
				match(DOT);
				setState(1653);
				match(SUPER);
				setState(1654);
				match(T__1);
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1655);
					typeArguments();
					}
				}

				setState(1658);
				match(Identifier);
				}
				break;
			case 5:
				_localctx = new Java279Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1660);
				classType();
				setState(1661);
				match(T__1);
				setState(1663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1662);
					typeArguments();
					}
				}

				setState(1665);
				match(NEW);
				}
				break;
			case 6:
				_localctx = new Java280Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1667);
				arrayType();
				setState(1668);
				match(T__1);
				setState(1669);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }

		public ArrayCreationExpressionContext() { }
		public void copyFrom(ArrayCreationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java284Context extends ArrayCreationExpressionContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public Java284Context(ArrayCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava284(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava284(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava284(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java282Context extends ArrayCreationExpressionContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public Java282Context(ArrayCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava282(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava282(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava282(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java283Context extends ArrayCreationExpressionContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public Java283Context(ArrayCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava283(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava283(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava283(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java281Context extends ArrayCreationExpressionContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public Java281Context(ArrayCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava281(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava281(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava281(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_arrayCreationExpression);
		try {
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				_localctx = new Java281Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1673);
				match(NEW);
				setState(1674);
				primitiveType();
				setState(1675);
				dimExprs();
				setState(1677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1676);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Java282Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1679);
				match(NEW);
				setState(1680);
				classOrInterfaceType();
				setState(1681);
				dimExprs();
				setState(1683);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1682);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new Java283Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1685);
				match(NEW);
				setState(1686);
				primitiveType();
				setState(1687);
				dims();
				setState(1688);
				arrayInitializer();
				}
				break;
			case 4:
				_localctx = new Java284Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1690);
				match(NEW);
				setState(1691);
				classOrInterfaceType();
				setState(1692);
				dims();
				setState(1693);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }

		public DimExprsContext() { }
		public void copyFrom(DimExprsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java285Context extends DimExprsContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public Java285Context(DimExprsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava285(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava285(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava285(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_dimExprs);
		try {
			int _alt;
			_localctx = new Java285Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			dimExpr();
			setState(1701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1698);
					dimExpr();
					}
					}
				}
				setState(1703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }

		public DimExprContext() { }
		public void copyFrom(DimExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java286Context extends DimExprContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Java286Context(DimExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava286(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava286(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava286(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_dimExpr);
		try {
			_localctx = new Java286Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			match(LBRACK);
			setState(1705);
			expression();
			setState(1706);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }

		public ConstantExpressionContext() { }
		public void copyFrom(ConstantExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java287Context extends ConstantExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Java287Context(ConstantExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava287(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava287(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava287(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_constantExpression);
		try {
			_localctx = new Java287Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }

		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java288Context extends ExpressionContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public Java288Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava288(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava288(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava288(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_expression);
		try {
			_localctx = new Java288Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }

		public InferredFormalParameterListContext() { }
		public void copyFrom(InferredFormalParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java289Context extends InferredFormalParameterListContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public Java289Context(InferredFormalParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava289(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava289(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava289(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_inferredFormalParameterList);
		int _la;
		try {
			_localctx = new Java289Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(Identifier);
			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1713);
				match(COMMA);
				setState(1714);
				match(Identifier);
				}
				}
				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }

		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java290Context extends AssignmentExpressionContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public Java290Context(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava290(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava290(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava290(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java291Context extends AssignmentExpressionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Java291Context(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava291(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava291(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava291(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_assignmentExpression);
		try {
			setState(1722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				_localctx = new Java290Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1720);
				conditionalExpression();
				}
				break;
			case 2:
				_localctx = new Java291Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1721);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }

		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java292Context extends AssignmentContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Java292Context(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava292(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava292(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava292(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_assignment);
		try {
			_localctx = new Java292Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			leftHandSide();
			setState(1725);
			assignmentOperator();
			setState(1726);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }

		public LeftHandSideContext() { }
		public void copyFrom(LeftHandSideContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java295Context extends LeftHandSideContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public Java295Context(LeftHandSideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava295(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava295(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava295(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java293Context extends LeftHandSideContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public Java293Context(LeftHandSideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava293(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava293(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava293(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java294Context extends LeftHandSideContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public Java294Context(LeftHandSideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava294(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava294(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava294(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_leftHandSide);
		try {
			setState(1731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				_localctx = new Java293Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1728);
				expressionName();
				}
				break;
			case 2:
				_localctx = new Java294Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1729);
				fieldAccess();
				}
				break;
			case 3:
				_localctx = new Java295Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1730);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }

		public AssignmentOperatorContext() { }
		public void copyFrom(AssignmentOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java305Context extends AssignmentOperatorContext {
		public Java305Context(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava305(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava305(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava305(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java306Context extends AssignmentOperatorContext {
		public Java306Context(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava306(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava306(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava306(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java303Context extends AssignmentOperatorContext {
		public Java303Context(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava303(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava303(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava303(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java304Context extends AssignmentOperatorContext {
		public Java304Context(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava304(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava304(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava304(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java301Context extends AssignmentOperatorContext {
		public Java301Context(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava301(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava301(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava301(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java302Context extends AssignmentOperatorContext {
		public Java302Context(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava302(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava302(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava302(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java299Context extends AssignmentOperatorContext {
		public Java299Context(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava299(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava299(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava299(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java300Context extends AssignmentOperatorContext {
		public Java300Context(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava300(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava300(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava300(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java297Context extends AssignmentOperatorContext {
		public Java297Context(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava297(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava297(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava297(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java298Context extends AssignmentOperatorContext {
		public Java298Context(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava298(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava298(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava298(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java296Context extends AssignmentOperatorContext {
		public Java296Context(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava296(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava296(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava296(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_assignmentOperator);
		try {
			setState(1744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				_localctx = new Java296Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1733);
				match(ASSIGN);
				}
				break;
			case MUL_ASSIGN:
				_localctx = new Java297Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1734);
				match(MUL_ASSIGN);
				}
				break;
			case DIV_ASSIGN:
				_localctx = new Java298Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1735);
				match(DIV_ASSIGN);
				}
				break;
			case MOD_ASSIGN:
				_localctx = new Java299Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1736);
				match(MOD_ASSIGN);
				}
				break;
			case ADD_ASSIGN:
				_localctx = new Java300Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1737);
				match(ADD_ASSIGN);
				}
				break;
			case SUB_ASSIGN:
				_localctx = new Java301Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1738);
				match(SUB_ASSIGN);
				}
				break;
			case LSHIFT_ASSIGN:
				_localctx = new Java302Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1739);
				match(LSHIFT_ASSIGN);
				}
				break;
			case RSHIFT_ASSIGN:
				_localctx = new Java303Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1740);
				match(RSHIFT_ASSIGN);
				}
				break;
			case AND_ASSIGN:
				_localctx = new Java304Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1741);
				match(AND_ASSIGN);
				}
				break;
			case XOR_ASSIGN:
				_localctx = new Java305Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1742);
				match(XOR_ASSIGN);
				}
				break;
			case OR_ASSIGN:
				_localctx = new Java306Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1743);
				match(OR_ASSIGN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }

		public ConditionalExpressionContext() { }
		public void copyFrom(ConditionalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java307Context extends ConditionalExpressionContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public Java307Context(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava307(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava307(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava307(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java308Context extends ConditionalExpressionContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public Java308Context(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava308(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava308(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava308(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_conditionalExpression);
		try {
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				_localctx = new Java307Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1746);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				_localctx = new Java308Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1747);
				conditionalOrExpression(0);
				setState(1748);
				match(QUESTION);
				setState(1749);
				expression();
				setState(1750);
				match(COLON);
				setState(1751);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }

		public ConditionalOrExpressionContext() { }
		public void copyFrom(ConditionalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java310Context extends ConditionalOrExpressionContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public Java310Context(ConditionalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava310(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava310(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava310(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java309Context extends ConditionalOrExpressionContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public Java309Context(ConditionalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava309(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava309(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava309(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 290;
		enterRecursionRule(_localctx, 290, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java309Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1756);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Java310Context(new ConditionalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(1758);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1759);
					match(OR);
					setState(1760);
					conditionalAndExpression(0);
					}
					}
				}
				setState(1765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }

		public ConditionalAndExpressionContext() { }
		public void copyFrom(ConditionalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java312Context extends ConditionalAndExpressionContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public Java312Context(ConditionalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava312(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava312(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava312(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java311Context extends ConditionalAndExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public Java311Context(ConditionalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava311(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava311(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava311(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 292;
		enterRecursionRule(_localctx, 292, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java311Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1767);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Java312Context(new ConditionalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(1769);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1770);
					match(AND);
					setState(1771);
					inclusiveOrExpression(0);
					}
					}
				}
				setState(1776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }

		public InclusiveOrExpressionContext() { }
		public void copyFrom(InclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java314Context extends InclusiveOrExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public Java314Context(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava314(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava314(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava314(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java313Context extends InclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public Java313Context(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava313(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava313(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava313(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 294;
		enterRecursionRule(_localctx, 294, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java313Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1778);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Java314Context(new InclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(1780);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1781);
					match(BITOR);
					setState(1782);
					exclusiveOrExpression(0);
					}
					}
				}
				setState(1787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }

		public ExclusiveOrExpressionContext() { }
		public void copyFrom(ExclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java316Context extends ExclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public Java316Context(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava316(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava316(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava316(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java315Context extends ExclusiveOrExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public Java315Context(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava315(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava315(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava315(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 296;
		enterRecursionRule(_localctx, 296, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java315Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1789);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1796);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Java316Context(new ExclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(1791);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1792);
					match(CARET);
					setState(1793);
					andExpression(0);
					}
					}
				}
				setState(1798);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }

		public AndExpressionContext() { }
		public void copyFrom(AndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java317Context extends AndExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public Java317Context(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava317(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava317(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava317(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java318Context extends AndExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public Java318Context(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava318(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava318(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava318(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 298;
		enterRecursionRule(_localctx, 298, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java317Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1800);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1807);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Java318Context(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(1802);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1803);
					match(BITAND);
					setState(1804);
					equalityExpression(0);
					}
					}
				}
				setState(1809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }

		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java321Context extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public Java321Context(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava321(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava321(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava321(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java320Context extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public Java320Context(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava320(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava320(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava320(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java319Context extends EqualityExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public Java319Context(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava319(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava319(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava319(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 300;
		enterRecursionRule(_localctx, 300, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java319Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1811);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1819);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
						{
						_localctx = new Java320Context(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1813);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1814);
						match(EQUAL);
						setState(1815);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new Java321Context(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1816);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1817);
						match(NOTEQUAL);
						setState(1818);
						relationalExpression(0);
						}
						break;
					}
					}
				}
				setState(1823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }

		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java327Context extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public Java327Context(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava327(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava327(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava327(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java325Context extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public Java325Context(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava325(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava325(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava325(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java326Context extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public Java326Context(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava326(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava326(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava326(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java323Context extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public Java323Context(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava323(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava323(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava323(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java324Context extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public Java324Context(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava324(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava324(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava324(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java322Context extends RelationalExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public Java322Context(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava322(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava322(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava322(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 302;
		enterRecursionRule(_localctx, 302, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java322Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1825);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1844);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1842);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						_localctx = new Java323Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1827);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1828);
						match(LT);
						setState(1829);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new Java324Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1830);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1831);
						match(GT);
						setState(1832);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new Java325Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1833);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1834);
						match(LE);
						setState(1835);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new Java326Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1836);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1837);
						match(GE);
						setState(1838);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new Java327Context(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1839);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1840);
						match(INSTANCEOF);
						setState(1841);
						referenceType();
						}
						break;
					}
					}
				}
				setState(1846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }

		public ShiftExpressionContext() { }
		public void copyFrom(ShiftExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java328Context extends ShiftExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public Java328Context(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava328(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava328(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava328(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java330Context extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public Java330Context(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava330(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava330(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava330(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java329Context extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public Java329Context(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava329(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava329(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava329(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 304;
		enterRecursionRule(_localctx, 304, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java328Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1848);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1860);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1858);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
					case 1:
						{
						_localctx = new Java329Context(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(1850);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1851);
						match(LT);
						setState(1852);
						match(LT);
						setState(1853);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new Java330Context(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(1854);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1855);
						match(GT);
						setState(1856);
						match(GT);
						setState(1857);
						additiveExpression(0);
						}
						break;
					}
					}
				}
				setState(1862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }

		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java332Context extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public Java332Context(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava332(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava332(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava332(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java333Context extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public Java333Context(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava333(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava333(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava333(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java331Context extends AdditiveExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public Java331Context(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava331(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava331(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava331(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 306;
		enterRecursionRule(_localctx, 306, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java331Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1864);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1874);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						_localctx = new Java332Context(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(1866);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1867);
						match(ADD);
						setState(1868);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new Java333Context(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(1869);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1870);
						match(SUB);
						setState(1871);
						multiplicativeExpression(0);
						}
						break;
					}
					}
				}
				setState(1876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }

		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java336Context extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Java336Context(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava336(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava336(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava336(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java337Context extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Java337Context(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava337(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava337(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava337(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java334Context extends MultiplicativeExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Java334Context(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava334(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava334(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava334(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java335Context extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Java335Context(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava335(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava335(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava335(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 308;
		enterRecursionRule(_localctx, 308, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Java334Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1878);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1889);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
					case 1:
						{
						_localctx = new Java335Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1880);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1881);
						match(MUL);
						setState(1882);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new Java336Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1883);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1884);
						match(DIV);
						setState(1885);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new Java337Context(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1886);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1887);
						match(MOD);
						setState(1888);
						unaryExpression();
						}
						break;
					}
					}
				}
				setState(1893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }

		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java338Context extends UnaryExpressionContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public Java338Context(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava338(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava338(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava338(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java339Context extends UnaryExpressionContext {
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public Java339Context(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava339(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava339(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava339(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java341Context extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Java341Context(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava341(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava341(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava341(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java342Context extends UnaryExpressionContext {
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public Java342Context(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava342(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava342(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava342(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java340Context extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Java340Context(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava340(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava340(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava340(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_unaryExpression);
		try {
			setState(1901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				_localctx = new Java338Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1894);
				preIncrementExpression();
				}
				break;
			case DEC:
				_localctx = new Java339Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1895);
				preDecrementExpression();
				}
				break;
			case ADD:
				_localctx = new Java340Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1896);
				match(ADD);
				setState(1897);
				unaryExpression();
				}
				break;
			case SUB:
				_localctx = new Java341Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1898);
				match(SUB);
				setState(1899);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
				_localctx = new Java342Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1900);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }

		public PreIncrementExpressionContext() { }
		public void copyFrom(PreIncrementExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java343Context extends PreIncrementExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Java343Context(PreIncrementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava343(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava343(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava343(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_preIncrementExpression);
		try {
			_localctx = new Java343Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			match(INC);
			setState(1904);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }

		public PreDecrementExpressionContext() { }
		public void copyFrom(PreDecrementExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java344Context extends PreDecrementExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Java344Context(PreDecrementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava344(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava344(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava344(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_preDecrementExpression);
		try {
			_localctx = new Java344Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			match(DEC);
			setState(1907);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }

		public UnaryExpressionNotPlusMinusContext() { }
		public void copyFrom(UnaryExpressionNotPlusMinusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java347Context extends UnaryExpressionNotPlusMinusContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Java347Context(UnaryExpressionNotPlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava347(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava347(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava347(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java348Context extends UnaryExpressionNotPlusMinusContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public Java348Context(UnaryExpressionNotPlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava348(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava348(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava348(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java345Context extends UnaryExpressionNotPlusMinusContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public Java345Context(UnaryExpressionNotPlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava345(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava345(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava345(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Java346Context extends UnaryExpressionNotPlusMinusContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Java346Context(UnaryExpressionNotPlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava346(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava346(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava346(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(1915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				_localctx = new Java345Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1909);
				postfixExpression();
				}
				break;
			case 2:
				_localctx = new Java346Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1910);
				match(TILDE);
				setState(1911);
				unaryExpression();
				}
				break;
			case 3:
				_localctx = new Java347Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1912);
				match(BANG);
				setState(1913);
				unaryExpression();
				}
				break;
			case 4:
				_localctx = new Java348Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1914);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }

		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java349Context extends PostfixExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public Java349Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava349(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava349(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava349(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_postfixExpression);
		try {
			int _alt;
			_localctx = new Java349Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1917);
				primary();
				}
				break;
			case 2:
				{
				setState(1918);
				expressionName();
				}
				break;
			}
			setState(1925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1923);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(1921);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(1922);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
	 
		public PostIncrementExpressionContext() { }
		public void copyFrom(PostIncrementExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java350Context extends PostIncrementExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public Java350Context(PostIncrementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava350(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava350(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava350(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_postIncrementExpression);
		try {
			_localctx = new Java350Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			postfixExpression();
			setState(1929);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
	 
		public PostIncrementExpression_lf_postfixExpressionContext() { }
		public void copyFrom(PostIncrementExpression_lf_postfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java351Context extends PostIncrementExpression_lf_postfixExpressionContext {
		public Java351Context(PostIncrementExpression_lf_postfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava351(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava351(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava351(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			_localctx = new Java351Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
	 
		public PostDecrementExpressionContext() { }
		public void copyFrom(PostDecrementExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java352Context extends PostDecrementExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public Java352Context(PostDecrementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava352(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava352(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava352(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_postDecrementExpression);
		try {
			_localctx = new Java352Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			postfixExpression();
			setState(1934);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
	 
		public PostDecrementExpression_lf_postfixExpressionContext() { }
		public void copyFrom(PostDecrementExpression_lf_postfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java353Context extends PostDecrementExpression_lf_postfixExpressionContext {
		public Java353Context(PostDecrementExpression_lf_postfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava353(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava353(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava353(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			_localctx = new Java353Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	 
		public CastExpressionContext() { }
		public void copyFrom(CastExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Java354Context extends CastExpressionContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Java354Context(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterJava354(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitJava354(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitJava354(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_castExpression);
		try {
			_localctx = new Java354Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			match(LPAREN);
			setState(1939);
			primitiveType();
			setState(1940);
			match(RPAREN);
			setState(1941);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 24:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 27:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 145:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 146:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 147:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 148:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 149:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 150:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 151:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 152:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 153:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 154:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 3);
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u079a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0153\n\2"+
		"\3\3\3\3\5\3\u0157\n\3\3\3\3\3\7\3\u015b\n\3\f\3\16\3\u015e\13\3\3\4\3"+
		"\4\5\4\u0162\n\4\3\5\3\5\5\5\u0166\n\5\3\6\3\6\5\6\u016a\n\6\3\7\3\7\5"+
		"\7\u016e\n\7\3\b\3\b\3\t\3\t\3\t\5\t\u0175\n\t\3\n\3\n\7\n\u0179\n\n\f"+
		"\n\16\n\u017c\13\n\3\13\3\13\5\13\u0180\n\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0186\n\13\5\13\u0188\n\13\3\f\3\f\3\f\5\f\u018d\n\f\3\r\3\r\5\r\u0191"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u019e"+
		"\n\17\3\20\3\20\3\20\3\20\7\20\u01a4\n\20\f\20\16\20\u01a7\13\20\3\21"+
		"\3\21\5\21\u01ab\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\7\24\u01b7\n\24\f\24\16\24\u01ba\13\24\3\25\3\25\5\25\u01be\n\25\3\26"+
		"\3\26\5\26\u01c2\n\26\3\27\3\27\3\27\3\27\5\27\u01c8\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\7\30\u01d0\n\30\f\30\16\30\u01d3\13\30\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u01da\n\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01e2"+
		"\n\32\f\32\16\32\u01e5\13\32\3\33\3\33\3\33\3\33\3\33\5\33\u01ec\n\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01f6\n\35\f\35\16\35\u01f9"+
		"\13\35\3\36\5\36\u01fc\n\36\3\36\7\36\u01ff\n\36\f\36\16\36\u0202\13\36"+
		"\3\36\7\36\u0205\n\36\f\36\16\36\u0208\13\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\7\37\u0210\n\37\f\37\16\37\u0213\13\37\3\37\3\37\3 \3 \3 \3 \5 "+
		"\u021b\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3$\3%\3%\5%\u0237\n%\3&\3&\3\'\7\'\u023c\n\'\f\'\16\'"+
		"\u023f\13\'\3\'\3\'\3\'\5\'\u0244\n\'\3\'\5\'\u0247\n\'\3\'\3\'\3(\3("+
		"\3(\3(\5(\u024f\n(\3)\3)\3)\3)\3*\3*\3*\7*\u0258\n*\f*\16*\u025b\13*\3"+
		"+\3+\3+\3,\3,\7,\u0262\n,\f,\16,\u0265\13,\3,\3,\3-\3-\3-\3-\5-\u026d"+
		"\n-\3.\3.\3.\3.\5.\u0273\n.\3/\7/\u0276\n/\f/\16/\u0279\13/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\5\60\u0282\n\60\3\61\3\61\3\61\7\61\u0287\n\61\f\61\16"+
		"\61\u028a\13\61\3\62\3\62\3\62\5\62\u028f\n\62\3\63\3\63\5\63\u0293\n"+
		"\63\3\64\3\64\5\64\u0297\n\64\3\65\7\65\u029a\n\65\f\65\16\65\u029d\13"+
		"\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u02a6\n\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u02ae\n\67\38\38\58\u02b2\n8\39\39\39\59\u02b7\n"+
		"9\39\39\59\u02bb\n9\3:\3:\3:\3:\3:\5:\u02c2\n:\3;\3;\3;\7;\u02c7\n;\f"+
		";\16;\u02ca\13;\3;\3;\3;\7;\u02cf\n;\f;\16;\u02d2\13;\5;\u02d4\n;\3<\3"+
		"<\3<\3=\3=\3=\3=\3=\5=\u02de\n=\3>\3>\5>\u02e2\n>\3>\3>\3?\3?\5?\u02e8"+
		"\n?\3@\3@\3A\3A\3A\3B\7B\u02f0\nB\fB\16B\u02f3\13B\3B\3B\3B\3C\3C\5C\u02fa"+
		"\nC\3D\5D\u02fd\nD\3D\3D\3D\5D\u0302\nD\3D\3D\3E\3E\3F\3F\5F\u030a\nF"+
		"\3F\5F\u030d\nF\3F\3F\3G\5G\u0312\nG\3G\3G\3G\5G\u0317\nG\3G\3G\3G\5G"+
		"\u031c\nG\3G\3G\3G\5G\u0321\nG\3G\3G\3G\3G\3G\5G\u0328\nG\3G\3G\3G\5G"+
		"\u032d\nG\3G\3G\3G\3G\3G\3G\5G\u0335\nG\3G\3G\3G\5G\u033a\nG\3G\3G\3G"+
		"\5G\u033f\nG\3H\7H\u0342\nH\fH\16H\u0345\13H\3H\3H\3H\3I\3I\5I\u034c\n"+
		"I\3J\3J\3J\7J\u0351\nJ\fJ\16J\u0354\13J\3K\3K\3K\3K\3L\3L\5L\u035c\nL"+
		"\3M\3M\5M\u0360\nM\3M\5M\u0363\nM\3M\3M\3N\3N\3N\7N\u036a\nN\fN\16N\u036d"+
		"\13N\3O\3O\5O\u0371\nO\3O\5O\u0374\nO\3O\3O\3P\3P\3P\7P\u037b\nP\fP\16"+
		"P\u037e\13P\3Q\3Q\5Q\u0382\nQ\3Q\3Q\3R\3R\7R\u0388\nR\fR\16R\u038b\13"+
		"R\3S\3S\3S\5S\u0390\nS\3T\3T\3T\3U\3U\3U\3V\3V\3V\3V\3V\3V\5V\u039e\n"+
		"V\3W\3W\3W\3W\3W\5W\u03a5\nW\3X\3X\3X\3X\3X\3X\5X\u03ad\nX\3Y\3Y\3Z\3"+
		"Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\5]\u03c3\n]\3^\3"+
		"^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3a\3a\3"+
		"a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3c\3c\3d\3d\3e\3e\3e\5e\u03ee\ne\3e\3e\5"+
		"e\u03f2\ne\3e\3e\5e\u03f6\ne\3e\3e\3e\3f\3f\3f\5f\u03fe\nf\3f\3f\5f\u0402"+
		"\nf\3f\3f\5f\u0406\nf\3f\3f\3f\3g\3g\5g\u040d\ng\3h\3h\3i\3i\3i\7i\u0414"+
		"\ni\fi\16i\u0417\13i\3j\3j\5j\u041b\nj\3j\3j\3k\3k\5k\u0421\nk\3k\3k\3"+
		"l\3l\5l\u0427\nl\3l\3l\3m\3m\5m\u042d\nm\3m\7m\u0430\nm\fm\16m\u0433\13"+
		"m\3n\3n\3n\3n\7n\u0439\nn\fn\16n\u043c\13n\3n\3n\3n\3n\3n\3n\3n\3n\3n"+
		"\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0452\nn\3o\3o\3p\3p\3p\3p\7p\u045a"+
		"\np\fp\16p\u045d\13p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3"+
		"p\3p\3p\5p\u0472\np\3q\3q\3q\3q\3q\5q\u0479\nq\3r\3r\3s\3s\3s\3s\5s\u0481"+
		"\ns\3t\3t\3t\3t\7t\u0487\nt\ft\16t\u048a\13t\3t\3t\3t\3t\3t\3t\3t\3t\3"+
		"t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u04a0\nt\3u\3u\3v\3v\3v\3v\7v\u04a8"+
		"\nv\fv\16v\u04ab\13v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3"+
		"v\3v\3v\5v\u04c0\nv\3w\3w\5w\u04c4\nw\3w\3w\3w\7w\u04c9\nw\fw\16w\u04cc"+
		"\13w\3w\5w\u04cf\nw\3w\3w\5w\u04d3\nw\3w\3w\5w\u04d7\nw\3w\3w\3w\3w\5"+
		"w\u04dd\nw\3w\3w\5w\u04e1\nw\3w\3w\5w\u04e5\nw\3w\3w\5w\u04e9\nw\3w\3"+
		"w\3w\3w\5w\u04ef\nw\3w\3w\5w\u04f3\nw\3w\3w\5w\u04f7\nw\3w\3w\5w\u04fb"+
		"\nw\5w\u04fd\nw\3x\3x\3x\5x\u0502\nx\3x\3x\5x\u0506\nx\3x\3x\5x\u050a"+
		"\nx\3x\3x\5x\u050e\nx\3y\3y\5y\u0512\ny\3y\3y\3y\7y\u0517\ny\fy\16y\u051a"+
		"\13y\3y\5y\u051d\ny\3y\3y\5y\u0521\ny\3y\3y\5y\u0525\ny\3y\3y\3y\3y\5"+
		"y\u052b\ny\3y\3y\5y\u052f\ny\3y\3y\5y\u0533\ny\3y\3y\5y\u0537\ny\5y\u0539"+
		"\ny\3z\3z\3z\5z\u053e\nz\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u054d"+
		"\n{\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u055b\n}\3~\3~\3~\3~\3~\3~"+
		"\3~\3~\3~\3~\5~\u0567\n~\3~\3~\3~\3~\3~\7~\u056e\n~\f~\16~\u0571\13~\3"+
		"\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\7\177\u057d"+
		"\n\177\f\177\16\177\u0580\13\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u058c\n\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u0593\n\u0080\f\u0080\16\u0080"+
		"\u0596\13\u0080\3\u0081\3\u0081\3\u0081\5\u0081\u059b\n\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u05a2\n\u0081\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u05a7\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u05ae\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u05b3\n\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u05ba\n\u0081\3\u0081\3"+
		"\u0081\3\u0081\5\u0081\u05bf\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3"+
		"\u0081\5\u0081\u05c6\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u05cb\n\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u05d3\n\u0081"+
		"\3\u0081\3\u0081\3\u0081\5\u0081\u05d8\n\u0081\3\u0081\3\u0081\5\u0081"+
		"\u05dc\n\u0081\3\u0082\3\u0082\5\u0082\u05e0\n\u0082\3\u0082\3\u0082\3"+
		"\u0082\5\u0082\u05e5\n\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\5"+
		"\u0083\u05ec\n\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u05f3"+
		"\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u05f8\n\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\5\u0083\u05ff\n\u0083\3\u0083\3\u0083\3\u0083"+
		"\5\u0083\u0604\n\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083"+
		"\u060b\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0610\n\u0083\3\u0083\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0618\n\u0083\3\u0083\3"+
		"\u0083\3\u0083\5\u0083\u061d\n\u0083\3\u0083\3\u0083\5\u0083\u0621\n\u0083"+
		"\3\u0084\3\u0084\3\u0084\7\u0084\u0626\n\u0084\f\u0084\16\u0084\u0629"+
		"\13\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u062e\n\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u0635\n\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\5\u0085\u063c\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u0643\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u064b\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\5\u0085\u0652\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\5\u0085\u065a\n\u0085\3\u0086\3\u0086\5\u0086\u065e\n\u0086\3\u0086\3"+
		"\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u0665\n\u0087\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\3\u0087\5\u0087\u066c\n\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\5\u0087\u0673\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\5\u0087\u067b\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u0682\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u068a\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0690"+
		"\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0696\n\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u06a2\n\u0088\3\u0089\3\u0089\7\u0089\u06a6\n\u0089\f\u0089\16"+
		"\u0089\u06a9\13\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\7\u008d\u06b6\n\u008d\f\u008d"+
		"\16\u008d\u06b9\13\u008d\3\u008e\3\u008e\5\u008e\u06bd\n\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\5\u0090\u06c6\n\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\5\u0091\u06d3\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\5\u0092\u06dc\n\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\7\u0093\u06e4\n\u0093\f\u0093\16\u0093\u06e7"+
		"\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u06ef"+
		"\n\u0094\f\u0094\16\u0094\u06f2\13\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\7\u0095\u06fa\n\u0095\f\u0095\16\u0095\u06fd\13\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u0705\n\u0096"+
		"\f\u0096\16\u0096\u0708\13\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\7\u0097\u0710\n\u0097\f\u0097\16\u0097\u0713\13\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\7\u0098"+
		"\u071e\n\u0098\f\u0098\16\u0098\u0721\13\u0098\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u0735\n\u0099"+
		"\f\u0099\16\u0099\u0738\13\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u0745\n\u009a"+
		"\f\u009a\16\u009a\u0748\13\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u0753\n\u009b\f\u009b\16\u009b"+
		"\u0756\13\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c\u0764\n\u009c\f\u009c"+
		"\16\u009c\u0767\13\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\5\u009d\u0770\n\u009d\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f"+
		"\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u077e"+
		"\n\u00a0\3\u00a1\3\u00a1\5\u00a1\u0782\n\u00a1\3\u00a1\3\u00a1\7\u00a1"+
		"\u0786\n\u00a1\f\u00a1\16\u00a1\u0789\13\u00a1\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\2\17.\628\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u00a7\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\2\2\2\u0840\2\u0152\3\2\2\2\4\u0156\3\2"+
		"\2\2\6\u0161\3\2\2\2\b\u0165\3\2\2\2\n\u0169\3\2\2\2\f\u016d\3\2\2\2\16"+
		"\u016f\3\2\2\2\20\u0174\3\2\2\2\22\u0176\3\2\2\2\24\u0187\3\2\2\2\26\u0189"+
		"\3\2\2\2\30\u018e\3\2\2\2\32\u0192\3\2\2\2\34\u019d\3\2\2\2\36\u019f\3"+
		"\2\2\2 \u01a8\3\2\2\2\"\u01ac\3\2\2\2$\u01af\3\2\2\2&\u01b3\3\2\2\2(\u01bd"+
		"\3\2\2\2*\u01bf\3\2\2\2,\u01c7\3\2\2\2.\u01c9\3\2\2\2\60\u01d9\3\2\2\2"+
		"\62\u01db\3\2\2\2\64\u01eb\3\2\2\2\66\u01ed\3\2\2\28\u01ef\3\2\2\2:\u01fb"+
		"\3\2\2\2<\u020b\3\2\2\2>\u021a\3\2\2\2@\u021c\3\2\2\2B\u0220\3\2\2\2D"+
		"\u0226\3\2\2\2F\u022d\3\2\2\2H\u0236\3\2\2\2J\u0238\3\2\2\2L\u023d\3\2"+
		"\2\2N\u024e\3\2\2\2P\u0250\3\2\2\2R\u0254\3\2\2\2T\u025c\3\2\2\2V\u025f"+
		"\3\2\2\2X\u026c\3\2\2\2Z\u0272\3\2\2\2\\\u0277\3\2\2\2^\u0281\3\2\2\2"+
		"`\u0283\3\2\2\2b\u028b\3\2\2\2d\u0290\3\2\2\2f\u0296\3\2\2\2h\u029b\3"+
		"\2\2\2j\u02a5\3\2\2\2l\u02ad\3\2\2\2n\u02b1\3\2\2\2p\u02b3\3\2\2\2r\u02c1"+
		"\3\2\2\2t\u02d3\3\2\2\2v\u02d5\3\2\2\2x\u02dd\3\2\2\2z\u02e1\3\2\2\2|"+
		"\u02e7\3\2\2\2~\u02e9\3\2\2\2\u0080\u02eb\3\2\2\2\u0082\u02f1\3\2\2\2"+
		"\u0084\u02f9\3\2\2\2\u0086\u02fc\3\2\2\2\u0088\u0305\3\2\2\2\u008a\u0307"+
		"\3\2\2\2\u008c\u033e\3\2\2\2\u008e\u0343\3\2\2\2\u0090\u034b\3\2\2\2\u0092"+
		"\u034d\3\2\2\2\u0094\u0355\3\2\2\2\u0096\u035b\3\2\2\2\u0098\u035d\3\2"+
		"\2\2\u009a\u0366\3\2\2\2\u009c\u036e\3\2\2\2\u009e\u0377\3\2\2\2\u00a0"+
		"\u037f\3\2\2\2\u00a2\u0385\3\2\2\2\u00a4\u038f\3\2\2\2\u00a6\u0391\3\2"+
		"\2\2\u00a8\u0394\3\2\2\2\u00aa\u039d\3\2\2\2\u00ac\u03a4\3\2\2\2\u00ae"+
		"\u03ac\3\2\2\2\u00b0\u03ae\3\2\2\2\u00b2\u03b0\3\2\2\2\u00b4\u03b4\3\2"+
		"\2\2\u00b6\u03b8\3\2\2\2\u00b8\u03c2\3\2\2\2\u00ba\u03c4\3\2\2\2\u00bc"+
		"\u03ca\3\2\2\2\u00be\u03d2\3\2\2\2\u00c0\u03da\3\2\2\2\u00c2\u03e0\3\2"+
		"\2\2\u00c4\u03e6\3\2\2\2\u00c6\u03e8\3\2\2\2\u00c8\u03ea\3\2\2\2\u00ca"+
		"\u03fa\3\2\2\2\u00cc\u040c\3\2\2\2\u00ce\u040e\3\2\2\2\u00d0\u0410\3\2"+
		"\2\2\u00d2\u0418\3\2\2\2\u00d4\u041e\3\2\2\2\u00d6\u0424\3\2\2\2\u00d8"+
		"\u042c\3\2\2\2\u00da\u0451\3\2\2\2\u00dc\u0453\3\2\2\2\u00de\u0471\3\2"+
		"\2\2\u00e0\u0478\3\2\2\2\u00e2\u047a\3\2\2\2\u00e4\u0480\3\2\2\2\u00e6"+
		"\u049f\3\2\2\2\u00e8\u04a1\3\2\2\2\u00ea\u04bf\3\2\2\2\u00ec\u04fc\3\2"+
		"\2\2\u00ee\u04fe\3\2\2\2\u00f0\u0538\3\2\2\2\u00f2\u053d\3\2\2\2\u00f4"+
		"\u054c\3\2\2\2\u00f6\u054e\3\2\2\2\u00f8\u055a\3\2\2\2\u00fa\u0566\3\2"+
		"\2\2\u00fc\u0572\3\2\2\2\u00fe\u058b\3\2\2\2\u0100\u05db\3\2\2\2\u0102"+
		"\u05dd\3\2\2\2\u0104\u0620\3\2\2\2\u0106\u0622\3\2\2\2\u0108\u0659\3\2"+
		"\2\2\u010a\u065b\3\2\2\2\u010c\u0689\3\2\2\2\u010e\u06a1\3\2\2\2\u0110"+
		"\u06a3\3\2\2\2\u0112\u06aa\3\2\2\2\u0114\u06ae\3\2\2\2\u0116\u06b0\3\2"+
		"\2\2\u0118\u06b2\3\2\2\2\u011a\u06bc\3\2\2\2\u011c\u06be\3\2\2\2\u011e"+
		"\u06c5\3\2\2\2\u0120\u06d2\3\2\2\2\u0122\u06db\3\2\2\2\u0124\u06dd\3\2"+
		"\2\2\u0126\u06e8\3\2\2\2\u0128\u06f3\3\2\2\2\u012a\u06fe\3\2\2\2\u012c"+
		"\u0709\3\2\2\2\u012e\u0714\3\2\2\2\u0130\u0722\3\2\2\2\u0132\u0739\3\2"+
		"\2\2\u0134\u0749\3\2\2\2\u0136\u0757\3\2\2\2\u0138\u076f\3\2\2\2\u013a"+
		"\u0771\3\2\2\2\u013c\u0774\3\2\2\2\u013e\u077d\3\2\2\2\u0140\u0781\3\2"+
		"\2\2\u0142\u078a\3\2\2\2\u0144\u078d\3\2\2\2\u0146\u078f\3\2\2\2\u0148"+
		"\u0792\3\2\2\2\u014a\u0794\3\2\2\2\u014c\u0153\7\36\2\2\u014d\u0153\7"+
		"\37\2\2\u014e\u0153\7 \2\2\u014f\u0153\7!\2\2\u0150\u0153\7\"\2\2\u0151"+
		"\u0153\7#\2\2\u0152\u014c\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2"+
		"\2\2\u0152\u014f\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"\3\3\2\2\2\u0154\u0157\5\22\n\2\u0155\u0157\5\b\5\2\u0156\u0154\3\2\2"+
		"\2\u0156\u0155\3\2\2\2\u0157\u015c\3\2\2\2\u0158\u0159\7(\2\2\u0159\u015b"+
		"\7)\2\2\u015a\u0158\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\5\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0162\5\b\5\2"+
		"\u0160\u0162\5\20\t\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\7"+
		"\3\2\2\2\u0163\u0166\5\n\6\2\u0164\u0166\7\6\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0164\3\2\2\2\u0166\t\3\2\2\2\u0167\u016a\5\f\7\2\u0168\u016a\5\16\b"+
		"\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\13\3\2\2\2\u016b\u016e"+
		"\7\23\2\2\u016c\u016e\7\b\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2"+
		"\u016e\r\3\2\2\2\u016f\u0170\7\16\2\2\u0170\17\3\2\2\2\u0171\u0175\5\22"+
		"\n\2\u0172\u0175\5\32\16\2\u0173\u0175\5\34\17\2\u0174\u0171\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175\21\3\2\2\2\u0176\u017a\5\30\r"+
		"\2\u0177\u0179\5\26\f\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\23\3\2\2\2\u017c\u017a\3\2\2"+
		"\2\u017d\u017f\7N\2\2\u017e\u0180\5$\23\2\u017f\u017e\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0188\3\2\2\2\u0181\u0182\5\22\n\2\u0182\u0183\7,\2\2\u0183"+
		"\u0185\7N\2\2\u0184\u0186\5$\23\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0188\3\2\2\2\u0187\u017d\3\2\2\2\u0187\u0181\3\2\2\2\u0188"+
		"\25\3\2\2\2\u0189\u018a\7,\2\2\u018a\u018c\7N\2\2\u018b\u018d\5$\23\2"+
		"\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\27\3\2\2\2\u018e\u0190"+
		"\7N\2\2\u018f\u0191\5$\23\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\31\3\2\2\2\u0192\u0193\7N\2\2\u0193\33\3\2\2\2\u0194\u0195\5\b\5\2\u0195"+
		"\u0196\5\36\20\2\u0196\u019e\3\2\2\2\u0197\u0198\5\22\n\2\u0198\u0199"+
		"\5\36\20\2\u0199\u019e\3\2\2\2\u019a\u019b\5\32\16\2\u019b\u019c\5\36"+
		"\20\2\u019c\u019e\3\2\2\2\u019d\u0194\3\2\2\2\u019d\u0197\3\2\2\2\u019d"+
		"\u019a\3\2\2\2\u019e\35\3\2\2\2\u019f\u01a0\7(\2\2\u01a0\u01a5\7)\2\2"+
		"\u01a1\u01a2\7(\2\2\u01a2\u01a4\7)\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\37\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a8\u01aa\7N\2\2\u01a9\u01ab\5\"\22\2\u01aa\u01a9\3\2"+
		"\2\2\u01aa\u01ab\3\2\2\2\u01ab!\3\2\2\2\u01ac\u01ad\7\r\2\2\u01ad\u01ae"+
		"\5\32\16\2\u01ae#\3\2\2\2\u01af\u01b0\7/\2\2\u01b0\u01b1\5&\24\2\u01b1"+
		"\u01b2\7.\2\2\u01b2%\3\2\2\2\u01b3\u01b8\5(\25\2\u01b4\u01b5\7+\2\2\u01b5"+
		"\u01b7\5(\25\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\'\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01be"+
		"\5\20\t\2\u01bc\u01be\5*\26\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2"+
		"\u01be)\3\2\2\2\u01bf\u01c1\7\62\2\2\u01c0\u01c2\5,\27\2\u01c1\u01c0\3"+
		"\2\2\2\u01c1\u01c2\3\2\2\2\u01c2+\3\2\2\2\u01c3\u01c4\7\r\2\2\u01c4\u01c8"+
		"\5\20\t\2\u01c5\u01c6\7\32\2\2\u01c6\u01c8\5\20\t\2\u01c7\u01c3\3\2\2"+
		"\2\u01c7\u01c5\3\2\2\2\u01c8-\3\2\2\2\u01c9\u01ca\b\30\1\2\u01ca\u01cb"+
		"\7N\2\2\u01cb\u01d1\3\2\2\2\u01cc\u01cd\f\3\2\2\u01cd\u01ce\7,\2\2\u01ce"+
		"\u01d0\7N\2\2\u01cf\u01cc\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2/\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01da"+
		"\7N\2\2\u01d5\u01d6\5\62\32\2\u01d6\u01d7\7,\2\2\u01d7\u01d8\7N\2\2\u01d8"+
		"\u01da\3\2\2\2\u01d9\u01d4\3\2\2\2\u01d9\u01d5\3\2\2\2\u01da\61\3\2\2"+
		"\2\u01db\u01dc\b\32\1\2\u01dc\u01dd\7N\2\2\u01dd\u01e3\3\2\2\2\u01de\u01df"+
		"\f\3\2\2\u01df\u01e0\7,\2\2\u01e0\u01e2\7N\2\2\u01e1\u01de\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\63\3\2\2"+
		"\2\u01e5\u01e3\3\2\2\2\u01e6\u01ec\7N\2\2\u01e7\u01e8\58\35\2\u01e8\u01e9"+
		"\7,\2\2\u01e9\u01ea\7N\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e6\3\2\2\2\u01eb"+
		"\u01e7\3\2\2\2\u01ec\65\3\2\2\2\u01ed\u01ee\7N\2\2\u01ee\67\3\2\2\2\u01ef"+
		"\u01f0\b\35\1\2\u01f0\u01f1\7N\2\2\u01f1\u01f7\3\2\2\2\u01f2\u01f3\f\3"+
		"\2\2\u01f3\u01f4\7,\2\2\u01f4\u01f6\7N\2\2\u01f5\u01f2\3\2\2\2\u01f6\u01f9"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f89\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01fa\u01fc\5<\37\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc\u0200\3\2\2\2\u01fd\u01ff\5> \2\u01fe\u01fd\3\2\2\2\u01ff\u0202"+
		"\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0206\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0203\u0205\5H%\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2"+
		"\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0206"+
		"\3\2\2\2\u0209\u020a\7\2\2\3\u020a;\3\2\2\2\u020b\u020c\7\25\2\2\u020c"+
		"\u0211\7N\2\2\u020d\u020e\7,\2\2\u020e\u0210\7N\2\2\u020f\u020d\3\2\2"+
		"\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214"+
		"\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\7*\2\2\u0215=\3\2\2\2\u0216\u021b"+
		"\5@!\2\u0217\u021b\5B\"\2\u0218\u021b\5D#\2\u0219\u021b\5F$\2\u021a\u0216"+
		"\3\2\2\2\u021a\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b"+
		"?\3\2\2\2\u021c\u021d\7\21\2\2\u021d\u021e\5\60\31\2\u021e\u021f\7*\2"+
		"\2\u021fA\3\2\2\2\u0220\u0221\7\21\2\2\u0221\u0222\5\62\32\2\u0222\u0223"+
		"\7,\2\2\u0223\u0224\7>\2\2\u0224\u0225\7*\2\2\u0225C\3\2\2\2\u0226\u0227"+
		"\7\21\2\2\u0227\u0228\7\31\2\2\u0228\u0229\5\60\31\2\u0229\u022a\7,\2"+
		"\2\u022a\u022b\7N\2\2\u022b\u022c\7*\2\2\u022cE\3\2\2\2\u022d\u022e\7"+
		"\21\2\2\u022e\u022f\7\31\2\2\u022f\u0230\5\60\31\2\u0230\u0231\7,\2\2"+
		"\u0231\u0232\7>\2\2\u0232\u0233\7*\2\2\u0233G\3\2\2\2\u0234\u0237\5J&"+
		"\2\u0235\u0237\7*\2\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237I\3"+
		"\2\2\2\u0238\u0239\5L\'\2\u0239K\3\2\2\2\u023a\u023c\5N(\2\u023b\u023a"+
		"\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\7\t\2\2\u0241\u0243\7N"+
		"\2\2\u0242\u0244\5P)\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246"+
		"\3\2\2\2\u0245\u0247\5T+\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\5V,\2\u0249M\3\2\2\2\u024a\u024f\7\27\2\2\u024b"+
		"\u024f\7\26\2\2\u024c\u024f\7\5\2\2\u024d\u024f\7\31\2\2\u024e\u024a\3"+
		"\2\2\2\u024e\u024b\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024d\3\2\2\2\u024f"+
		"O\3\2\2\2\u0250\u0251\7/\2\2\u0251\u0252\5R*\2\u0252\u0253\7.\2\2\u0253"+
		"Q\3\2\2\2\u0254\u0259\5 \21\2\u0255\u0256\7+\2\2\u0256\u0258\5 \21\2\u0257"+
		"\u0255\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025aS\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d\7\r\2\2\u025d\u025e"+
		"\5\24\13\2\u025eU\3\2\2\2\u025f\u0263\7&\2\2\u0260\u0262\5X-\2\u0261\u0260"+
		"\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u0266\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\7\'\2\2\u0267W\3\2\2\2"+
		"\u0268\u026d\5Z.\2\u0269\u026d\5~@\2\u026a\u026d\5\u0080A\2\u026b\u026d"+
		"\5\u0082B\2\u026c\u0268\3\2\2\2\u026c\u0269\3\2\2\2\u026c\u026a\3\2\2"+
		"\2\u026c\u026b\3\2\2\2\u026dY\3\2\2\2\u026e\u0273\5\\/\2\u026f\u0273\5"+
		"h\65\2\u0270\u0273\5J&\2\u0271\u0273\7*\2\2\u0272\u026e\3\2\2\2\u0272"+
		"\u026f\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273[\3\2\2\2"+
		"\u0274\u0276\5^\60\2\u0275\u0274\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275"+
		"\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u0277\3\2\2\2\u027a"+
		"\u027b\5\4\3\2\u027b\u027c\5`\61\2\u027c\u027d\7*\2\2\u027d]\3\2\2\2\u027e"+
		"\u0282\7\27\2\2\u027f\u0282\7\26\2\2\u0280\u0282\7\31\2\2\u0281\u027e"+
		"\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0282_\3\2\2\2\u0283"+
		"\u0288\5b\62\2\u0284\u0285\7+\2\2\u0285\u0287\5b\62\2\u0286\u0284\3\2"+
		"\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"a\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028e\5d\63\2\u028c\u028d\7-\2\2\u028d"+
		"\u028f\5f\64\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028fc\3\2\2\2"+
		"\u0290\u0292\7N\2\2\u0291\u0293\5\36\20\2\u0292\u0291\3\2\2\2\u0292\u0293"+
		"\3\2\2\2\u0293e\3\2\2\2\u0294\u0297\5\u0116\u008c\2\u0295\u0297\5\u009c"+
		"O\2\u0296\u0294\3\2\2\2\u0296\u0295\3\2\2\2\u0297g\3\2\2\2\u0298\u029a"+
		"\5j\66\2\u0299\u0298\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u029f\5l"+
		"\67\2\u029f\u02a0\5|?\2\u02a0i\3\2\2\2\u02a1\u02a6\7\27\2\2\u02a2\u02a6"+
		"\7\26\2\2\u02a3\u02a6\7\5\2\2\u02a4\u02a6\7\31\2\2\u02a5\u02a1\3\2\2\2"+
		"\u02a5\u02a2\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6k\3"+
		"\2\2\2\u02a7\u02a8\5n8\2\u02a8\u02a9\5p9\2\u02a9\u02ae\3\2\2\2\u02aa\u02ab"+
		"\5P)\2\u02ab\u02ac\5p9\2\u02ac\u02ae\3\2\2\2\u02ad\u02a7\3\2\2\2\u02ad"+
		"\u02aa\3\2\2\2\u02aem\3\2\2\2\u02af\u02b2\7\34\2\2\u02b0\u02b2\5\6\4\2"+
		"\u02b1\u02af\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2o\3\2\2\2\u02b3\u02b4\7"+
		"N\2\2\u02b4\u02b6\7$\2\2\u02b5\u02b7\5r:\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7"+
		"\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\7%\2\2\u02b9\u02bb\5\36\20\2"+
		"\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bbq\3\2\2\2\u02bc\u02bd\5"+
		"t;\2\u02bd\u02be\7+\2\2\u02be\u02bf\5x=\2\u02bf\u02c2\3\2\2\2\u02c0\u02c2"+
		"\5x=\2\u02c1\u02bc\3\2\2\2\u02c1\u02c0\3\2\2\2\u02c2s\3\2\2\2\u02c3\u02c8"+
		"\5v<\2\u02c4\u02c5\7+\2\2\u02c5\u02c7\5v<\2\u02c6\u02c4\3\2\2\2\u02c7"+
		"\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02d4\3\2"+
		"\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02d0\5z>\2\u02cc\u02cd\7+\2\2\u02cd\u02cf"+
		"\5v<\2\u02ce\u02cc\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02c3\3\2"+
		"\2\2\u02d3\u02cb\3\2\2\2\u02d4u\3\2\2\2\u02d5\u02d6\5\4\3\2\u02d6\u02d7"+
		"\5d\63\2\u02d7w\3\2\2\2\u02d8\u02d9\5\4\3\2\u02d9\u02da\7\3\2\2\u02da"+
		"\u02db\5d\63\2\u02db\u02de\3\2\2\2\u02dc\u02de\5v<\2\u02dd\u02d8\3\2\2"+
		"\2\u02dd\u02dc\3\2\2\2\u02dey\3\2\2\2\u02df\u02e0\7N\2\2\u02e0\u02e2\7"+
		",\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02e4\7\33\2\2\u02e4{\3\2\2\2\u02e5\u02e8\5\u00a0Q\2\u02e6\u02e8\7*\2"+
		"\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8}\3\2\2\2\u02e9\u02ea"+
		"\5\u00a0Q\2\u02ea\177\3\2\2\2\u02eb\u02ec\7\31\2\2\u02ec\u02ed\5\u00a0"+
		"Q\2\u02ed\u0081\3\2\2\2\u02ee\u02f0\5\u0084C\2\u02ef\u02ee\3\2\2\2\u02f0"+
		"\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\3\2"+
		"\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\5\u0086D\2\u02f5\u02f6\5\u008aF\2"+
		"\u02f6\u0083\3\2\2\2\u02f7\u02fa\7\27\2\2\u02f8\u02fa\7\26\2\2\u02f9\u02f7"+
		"\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa\u0085\3\2\2\2\u02fb\u02fd\5P)\2\u02fc"+
		"\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\5\u0088"+
		"E\2\u02ff\u0301\7$\2\2\u0300\u0302\5r:\2\u0301\u0300\3\2\2\2\u0301\u0302"+
		"\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\7%\2\2\u0304\u0087\3\2\2\2\u0305"+
		"\u0306\7N\2\2\u0306\u0089\3\2\2\2\u0307\u0309\7&\2\2\u0308\u030a\5\u008c"+
		"G\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\3\2\2\2\u030b"+
		"\u030d\5\u00a2R\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e"+
		"\3\2\2\2\u030e\u030f\7\'\2\2\u030f\u008b\3\2\2\2\u0310\u0312\5$\23\2\u0311"+
		"\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\7\33"+
		"\2\2\u0314\u0316\7$\2\2\u0315\u0317\5\u0106\u0084\2\u0316\u0315\3\2\2"+
		"\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\7%\2\2\u0319\u033f"+
		"\7*\2\2\u031a\u031c\5$\23\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u031e\7\32\2\2\u031e\u0320\7$\2\2\u031f\u0321\5\u0106"+
		"\u0084\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0323\7%\2\2\u0323\u033f\7*\2\2\u0324\u0325\5\64\33\2\u0325\u0327\7,"+
		"\2\2\u0326\u0328\5$\23\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u032a\7\32\2\2\u032a\u032c\7$\2\2\u032b\u032d\5\u0106"+
		"\u0084\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u032f\7%\2\2\u032f\u0330\7*\2\2\u0330\u033f\3\2\2\2\u0331\u0332\5\u00d8"+
		"m\2\u0332\u0334\7,\2\2\u0333\u0335\5$\23\2\u0334\u0333\3\2\2\2\u0334\u0335"+
		"\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\7\32\2\2\u0337\u0339\7$\2\2\u0338"+
		"\u033a\5\u0106\u0084\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b"+
		"\3\2\2\2\u033b\u033c\7%\2\2\u033c\u033d\7*\2\2\u033d\u033f\3\2\2\2\u033e"+
		"\u0311\3\2\2\2\u033e\u031b\3\2\2\2\u033e\u0324\3\2\2\2\u033e\u0331\3\2"+
		"\2\2\u033f\u008d\3\2\2\2\u0340\u0342\5\u0090I\2\u0341\u0340\3\2\2\2\u0342"+
		"\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\3\2"+
		"\2\2\u0345\u0343\3\2\2\2\u0346\u0347\5`\61\2\u0347\u0348\7*\2\2\u0348"+
		"\u008f\3\2\2\2\u0349\u034c\7\27\2\2\u034a\u034c\7\31\2\2\u034b\u0349\3"+
		"\2\2\2\u034b\u034a\3\2\2\2\u034c\u0091\3\2\2\2\u034d\u0352\5\u0094K\2"+
		"\u034e\u034f\7+\2\2\u034f\u0351\5\u0094K\2\u0350\u034e\3\2\2\2\u0351\u0354"+
		"\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0093\3\2\2\2\u0354"+
		"\u0352\3\2\2\2\u0355\u0356\7N\2\2\u0356\u0357\7-\2\2\u0357\u0358\5\u0096"+
		"L\2\u0358\u0095\3\2\2\2\u0359\u035c\5\u0122\u0092\2\u035a\u035c\5\u0098"+
		"M\2\u035b\u0359\3\2\2\2\u035b\u035a\3\2\2\2\u035c\u0097\3\2\2\2\u035d"+
		"\u035f\7&\2\2\u035e\u0360\5\u009aN\2\u035f\u035e\3\2\2\2\u035f\u0360\3"+
		"\2\2\2\u0360\u0362\3\2\2\2\u0361\u0363\7+\2\2\u0362\u0361\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\7\'\2\2\u0365\u0099\3\2"+
		"\2\2\u0366\u036b\5\u0096L\2\u0367\u0368\7+\2\2\u0368\u036a\5\u0096L\2"+
		"\u0369\u0367\3\2\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c"+
		"\3\2\2\2\u036c\u009b\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u0370\7&\2\2\u036f"+
		"\u0371\5\u009eP\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373"+
		"\3\2\2\2\u0372\u0374\7+\2\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0376\7\'\2\2\u0376\u009d\3\2\2\2\u0377\u037c\5f"+
		"\64\2\u0378\u0379\7+\2\2\u0379\u037b\5f\64\2\u037a\u0378\3\2\2\2\u037b"+
		"\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u009f\3\2"+
		"\2\2\u037e\u037c\3\2\2\2\u037f\u0381\7&\2\2\u0380\u0382\5\u00a2R\2\u0381"+
		"\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\7\'"+
		"\2\2\u0384\u00a1\3\2\2\2\u0385\u0389\5\u00a4S\2\u0386\u0388\5\u00a4S\2"+
		"\u0387\u0386\3\2\2\2\u0388\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a"+
		"\3\2\2\2\u038a\u00a3\3\2\2\2\u038b\u0389\3\2\2\2\u038c\u0390\5\u00a6T"+
		"\2\u038d\u0390\5J&\2\u038e\u0390\5\u00aaV\2\u038f\u038c\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u038f\u038e\3\2\2\2\u0390\u00a5\3\2\2\2\u0391\u0392\5\u00a8"+
		"U\2\u0392\u0393\7*\2\2\u0393\u00a7\3\2\2\2\u0394\u0395\5\4\3\2\u0395\u0396"+
		"\5`\61\2\u0396\u00a9\3\2\2\2\u0397\u039e\5\u00aeX\2\u0398\u039e\5\u00b2"+
		"Z\2\u0399\u039e\5\u00ba^\2\u039a\u039e\5\u00bc_\2\u039b\u039e\5\u00c0"+
		"a\2\u039c\u039e\5\u00c4c\2\u039d\u0397\3\2\2\2\u039d\u0398\3\2\2\2\u039d"+
		"\u0399\3\2\2\2\u039d\u039a\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039c\3\2"+
		"\2\2\u039e\u00ab\3\2\2\2\u039f\u03a5\5\u00aeX\2\u03a0\u03a5\5\u00b4[\2"+
		"\u03a1\u03a5\5\u00be`\2\u03a2\u03a5\5\u00c2b\2\u03a3\u03a5\5\u00c6d\2"+
		"\u03a4\u039f\3\2\2\2\u03a4\u03a0\3\2\2\2\u03a4\u03a1\3\2\2\2\u03a4\u03a2"+
		"\3\2\2\2\u03a4\u03a3\3\2\2\2\u03a5\u00ad\3\2\2\2\u03a6\u03ad\5\u00a0Q"+
		"\2\u03a7\u03ad\5\u00b0Y\2\u03a8\u03ad\5\u00b6\\\2\u03a9\u03ad\5\u00d2"+
		"j\2\u03aa\u03ad\5\u00d4k\2\u03ab\u03ad\5\u00d6l\2\u03ac\u03a6\3\2\2\2"+
		"\u03ac\u03a7\3\2\2\2\u03ac\u03a8\3\2\2\2\u03ac\u03a9\3\2\2\2\u03ac\u03aa"+
		"\3\2\2\2\u03ac\u03ab\3\2\2\2\u03ad\u00af\3\2\2\2\u03ae\u03af\7*\2\2\u03af"+
		"\u00b1\3\2\2\2\u03b0\u03b1\7N\2\2\u03b1\u03b2\7\63\2\2\u03b2\u03b3\5\u00aa"+
		"V\2\u03b3\u00b3\3\2\2\2\u03b4\u03b5\7N\2\2\u03b5\u03b6\7\63\2\2\u03b6"+
		"\u03b7\5\u00acW\2\u03b7\u00b5\3\2\2\2\u03b8\u03b9\5\u00b8]\2\u03b9\u03ba"+
		"\7*\2\2\u03ba\u00b7\3\2\2\2\u03bb\u03c3\5\u011c\u008f\2\u03bc\u03c3\5"+
		"\u013a\u009e\2\u03bd\u03c3\5\u013c\u009f\2\u03be\u03c3\5\u0142\u00a2\2"+
		"\u03bf\u03c3\5\u0146\u00a4\2\u03c0\u03c3\5\u0100\u0081\2\u03c1\u03c3\5"+
		"\u00ecw\2\u03c2\u03bb\3\2\2\2\u03c2\u03bc\3\2\2\2\u03c2\u03bd\3\2\2\2"+
		"\u03c2\u03be\3\2\2\2\u03c2\u03bf\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c1"+
		"\3\2\2\2\u03c3\u00b9\3\2\2\2\u03c4\u03c5\7\20\2\2\u03c5\u03c6\7$\2\2\u03c6"+
		"\u03c7\5\u0116\u008c\2\u03c7\u03c8\7%\2\2\u03c8\u03c9\5\u00aaV\2\u03c9"+
		"\u00bb\3\2\2\2\u03ca\u03cb\7\20\2\2\u03cb\u03cc\7$\2\2\u03cc\u03cd\5\u0116"+
		"\u008c\2\u03cd\u03ce\7%\2\2\u03ce\u03cf\5\u00acW\2\u03cf\u03d0\7\f\2\2"+
		"\u03d0\u03d1\5\u00aaV\2\u03d1\u00bd\3\2\2\2\u03d2\u03d3\7\20\2\2\u03d3"+
		"\u03d4\7$\2\2\u03d4\u03d5\5\u0116\u008c\2\u03d5\u03d6\7%\2\2\u03d6\u03d7"+
		"\5\u00acW\2\u03d7\u03d8\7\f\2\2\u03d8\u03d9\5\u00acW\2\u03d9\u00bf\3\2"+
		"\2\2\u03da\u03db\7\35\2\2\u03db\u03dc\7$\2\2\u03dc\u03dd\5\u0116\u008c"+
		"\2\u03dd\u03de\7%\2\2\u03de\u03df\5\u00aaV\2\u03df\u00c1\3\2\2\2\u03e0"+
		"\u03e1\7\35\2\2\u03e1\u03e2\7$\2\2\u03e2\u03e3\5\u0116\u008c\2\u03e3\u03e4"+
		"\7%\2\2\u03e4\u03e5\5\u00acW\2\u03e5\u00c3\3\2\2\2\u03e6\u03e7\5\u00c8"+
		"e\2\u03e7\u00c5\3\2\2\2\u03e8\u03e9\5\u00caf\2\u03e9\u00c7\3\2\2\2\u03ea"+
		"\u03eb\7\17\2\2\u03eb\u03ed\7$\2\2\u03ec\u03ee\5\u00ccg\2\u03ed\u03ec"+
		"\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1\7*\2\2\u03f0"+
		"\u03f2\5\u0116\u008c\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3"+
		"\3\2\2\2\u03f3\u03f5\7*\2\2\u03f4\u03f6\5\u00ceh\2\u03f5\u03f4\3\2\2\2"+
		"\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\7%\2\2\u03f8\u03f9"+
		"\5\u00aaV\2\u03f9\u00c9\3\2\2\2\u03fa\u03fb\7\17\2\2\u03fb\u03fd\7$\2"+
		"\2\u03fc\u03fe\5\u00ccg\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u03ff\3\2\2\2\u03ff\u0401\7*\2\2\u0400\u0402\5\u0116\u008c\2\u0401\u0400"+
		"\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\7*\2\2\u0404"+
		"\u0406\5\u00ceh\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407"+
		"\3\2\2\2\u0407\u0408\7%\2\2\u0408\u0409\5\u00acW\2\u0409\u00cb\3\2\2\2"+
		"\u040a\u040d\5\u00d0i\2\u040b\u040d\5\u00a8U\2\u040c\u040a\3\2\2\2\u040c"+
		"\u040b\3\2\2\2\u040d\u00cd\3\2\2\2\u040e\u040f\5\u00d0i\2\u040f\u00cf"+
		"\3\2\2\2\u0410\u0415\5\u00b8]\2\u0411\u0412\7+\2\2\u0412\u0414\5\u00b8"+
		"]\2\u0413\u0411\3\2\2\2\u0414\u0417\3\2\2\2\u0415\u0413\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416\u00d1\3\2\2\2\u0417\u0415\3\2\2\2\u0418\u041a\7\7"+
		"\2\2\u0419\u041b\7N\2\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b"+
		"\u041c\3\2\2\2\u041c\u041d\7*\2\2\u041d\u00d3\3\2\2\2\u041e\u0420\7\13"+
		"\2\2\u041f\u0421\7N\2\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421"+
		"\u0422\3\2\2\2\u0422\u0423\7*\2\2\u0423\u00d5\3\2\2\2\u0424\u0426\7\30"+
		"\2\2\u0425\u0427\5\u0116\u008c\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2"+
		"\2\u0427\u0428\3\2\2\2\u0428\u0429\7*\2\2\u0429\u00d7\3\2\2\2\u042a\u042d"+
		"\5\u00e6t\2\u042b\u042d\5\u010e\u0088\2\u042c\u042a\3\2\2\2\u042c\u042b"+
		"\3\2\2\2\u042d\u0431\3\2\2\2\u042e\u0430\5\u00e0q\2\u042f\u042e\3\2\2"+
		"\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u00d9"+
		"\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u0452\5\2\2\2\u0435\u043a\5\60\31\2"+
		"\u0436\u0437\7(\2\2\u0437\u0439\7)\2\2\u0438\u0436\3\2\2\2\u0439\u043c"+
		"\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043d\3\2\2\2\u043c"+
		"\u043a\3\2\2\2\u043d\u043e\7,\2\2\u043e\u043f\7\t\2\2\u043f\u0452\3\2"+
		"\2\2\u0440\u0441\7\34\2\2\u0441\u0442\7,\2\2\u0442\u0452\7\t\2\2\u0443"+
		"\u0452\7\33\2\2\u0444\u0445\5\60\31\2\u0445\u0446\7,\2\2\u0446\u0447\7"+
		"\33\2\2\u0447\u0452\3\2\2\2\u0448\u0449\7$\2\2\u0449\u044a\5\u0116\u008c"+
		"\2\u044a\u044b\7%\2\2\u044b\u0452\3\2\2\2\u044c\u0452\5\u00ecw\2\u044d"+
		"\u0452\5\u00f4{\2\u044e\u0452\5\u00fa~\2\u044f\u0452\5\u0100\u0081\2\u0450"+
		"\u0452\5\u0108\u0085\2\u0451\u0434\3\2\2\2\u0451\u0435\3\2\2\2\u0451\u0440"+
		"\3\2\2\2\u0451\u0443\3\2\2\2\u0451\u0444\3\2\2\2\u0451\u0448\3\2\2\2\u0451"+
		"\u044c\3\2\2\2\u0451\u044d\3\2\2\2\u0451\u044e\3\2\2\2\u0451\u044f\3\2"+
		"\2\2\u0451\u0450\3\2\2\2\u0452\u00db\3\2\2\2\u0453\u0454\3\2\2\2\u0454"+
		"\u00dd\3\2\2\2\u0455\u0472\5\2\2\2\u0456\u045b\5\60\31\2\u0457\u0458\7"+
		"(\2\2\u0458\u045a\7)\2\2\u0459\u0457\3\2\2\2\u045a\u045d\3\2\2\2\u045b"+
		"\u0459\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045e\3\2\2\2\u045d\u045b\3\2"+
		"\2\2\u045e\u045f\7,\2\2\u045f\u0460\7\t\2\2\u0460\u0472\3\2\2\2\u0461"+
		"\u0462\7\34\2\2\u0462\u0463\7,\2\2\u0463\u0472\7\t\2\2\u0464\u0472\7\33"+
		"\2\2\u0465\u0466\5\60\31\2\u0466\u0467\7,\2\2\u0467\u0468\7\33\2\2\u0468"+
		"\u0472\3\2\2\2\u0469\u046a\7$\2\2\u046a\u046b\5\u0116\u008c\2\u046b\u046c"+
		"\7%\2\2\u046c\u0472\3\2\2\2\u046d\u0472\5\u00ecw\2\u046e\u0472\5\u00f4"+
		"{\2\u046f\u0472\5\u0100\u0081\2\u0470\u0472\5\u0108\u0085\2\u0471\u0455"+
		"\3\2\2\2\u0471\u0456\3\2\2\2\u0471\u0461\3\2\2\2\u0471\u0464\3\2\2\2\u0471"+
		"\u0465\3\2\2\2\u0471\u0469\3\2\2\2\u0471\u046d\3\2\2\2\u0471\u046e\3\2"+
		"\2\2\u0471\u046f\3\2\2\2\u0471\u0470\3\2\2\2\u0472\u00df\3\2\2\2\u0473"+
		"\u0479\5\u00eex\2\u0474\u0479\5\u00f6|\2\u0475\u0479\5\u00fc\177\2\u0476"+
		"\u0479\5\u0102\u0082\2\u0477\u0479\5\u010a\u0086\2\u0478\u0473\3\2\2\2"+
		"\u0478\u0474\3\2\2\2\u0478\u0475\3\2\2\2\u0478\u0476\3\2\2\2\u0478\u0477"+
		"\3\2\2\2\u0479\u00e1\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u00e3\3\2\2\2\u047c"+
		"\u0481\5\u00eex\2\u047d\u0481\5\u00f6|\2\u047e\u0481\5\u0102\u0082\2\u047f"+
		"\u0481\5\u010a\u0086\2\u0480\u047c\3\2\2\2\u0480\u047d\3\2\2\2\u0480\u047e"+
		"\3\2\2\2\u0480\u047f\3\2\2\2\u0481\u00e5\3\2\2\2\u0482\u04a0\5\2\2\2\u0483"+
		"\u0488\5\60\31\2\u0484\u0485\7(\2\2\u0485\u0487\7)\2\2\u0486\u0484\3\2"+
		"\2\2\u0487\u048a\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489"+
		"\u048b\3\2\2\2\u048a\u0488\3\2\2\2\u048b\u048c\7,\2\2\u048c\u048d\7\t"+
		"\2\2\u048d\u04a0\3\2\2\2\u048e\u048f\7\34\2\2\u048f\u0490\7,\2\2\u0490"+
		"\u04a0\7\t\2\2\u0491\u04a0\7\33\2\2\u0492\u0493\5\60\31\2\u0493\u0494"+
		"\7,\2\2\u0494\u0495\7\33\2\2\u0495\u04a0\3\2\2\2\u0496\u0497\7$\2\2\u0497"+
		"\u0498\5\u0116\u008c\2\u0498\u0499\7%\2\2\u0499\u04a0\3\2\2\2\u049a\u04a0"+
		"\5\u00f0y\2\u049b\u04a0\5\u00f8}\2\u049c\u04a0\5\u00fe\u0080\2\u049d\u04a0"+
		"\5\u0104\u0083\2\u049e\u04a0\5\u010c\u0087\2\u049f\u0482\3\2\2\2\u049f"+
		"\u0483\3\2\2\2\u049f\u048e\3\2\2\2\u049f\u0491\3\2\2\2\u049f\u0492\3\2"+
		"\2\2\u049f\u0496\3\2\2\2\u049f\u049a\3\2\2\2\u049f\u049b\3\2\2\2\u049f"+
		"\u049c\3\2\2\2\u049f\u049d\3\2\2\2\u049f\u049e\3\2\2\2\u04a0\u00e7\3\2"+
		"\2\2\u04a1\u04a2\3\2\2\2\u04a2\u00e9\3\2\2\2\u04a3\u04c0\5\2\2\2\u04a4"+
		"\u04a9\5\60\31\2\u04a5\u04a6\7(\2\2\u04a6\u04a8\7)\2\2\u04a7\u04a5\3\2"+
		"\2\2\u04a8\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa"+
		"\u04ac\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac\u04ad\7,\2\2\u04ad\u04ae\7\t"+
		"\2\2\u04ae\u04c0\3\2\2\2\u04af\u04b0\7\34\2\2\u04b0\u04b1\7,\2\2\u04b1"+
		"\u04c0\7\t\2\2\u04b2\u04c0\7\33\2\2\u04b3\u04b4\5\60\31\2\u04b4\u04b5"+
		"\7,\2\2\u04b5\u04b6\7\33\2\2\u04b6\u04c0\3\2\2\2\u04b7\u04b8\7$\2\2\u04b8"+
		"\u04b9\5\u0116\u008c\2\u04b9\u04ba\7%\2\2\u04ba\u04c0\3\2\2\2\u04bb\u04c0"+
		"\5\u00f0y\2\u04bc\u04c0\5\u00f8}\2\u04bd\u04c0\5\u0104\u0083\2\u04be\u04c0"+
		"\5\u010c\u0087\2\u04bf\u04a3\3\2\2\2\u04bf\u04a4\3\2\2\2\u04bf\u04af\3"+
		"\2\2\2\u04bf\u04b2\3\2\2\2\u04bf\u04b3\3\2\2\2\u04bf\u04b7\3\2\2\2\u04bf"+
		"\u04bb\3\2\2\2\u04bf\u04bc\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04be\3\2"+
		"\2\2\u04c0\u00eb\3\2\2\2\u04c1\u04c3\7\24\2\2\u04c2\u04c4\5$\23\2\u04c3"+
		"\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04ca\7N"+
		"\2\2\u04c6\u04c7\7,\2\2\u04c7\u04c9\7N\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04cc"+
		"\3\2\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04ce\3\2\2\2\u04cc"+
		"\u04ca\3\2\2\2\u04cd\u04cf\5\u00f2z\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf"+
		"\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d2\7$\2\2\u04d1\u04d3\5\u0106\u0084"+
		"\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6"+
		"\7%\2\2\u04d5\u04d7\5V,\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7"+
		"\u04fd\3\2\2\2\u04d8\u04d9\5\64\33\2\u04d9\u04da\7,\2\2\u04da\u04dc\7"+
		"\24\2\2\u04db\u04dd\5$\23\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd"+
		"\u04de\3\2\2\2\u04de\u04e0\7N\2\2\u04df\u04e1\5\u00f2z\2\u04e0\u04df\3"+
		"\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e4\7$\2\2\u04e3"+
		"\u04e5\5\u0106\u0084\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6"+
		"\3\2\2\2\u04e6\u04e8\7%\2\2\u04e7\u04e9\5V,\2\u04e8\u04e7\3\2\2\2\u04e8"+
		"\u04e9\3\2\2\2\u04e9\u04fd\3\2\2\2\u04ea\u04eb\5\u00d8m\2\u04eb\u04ec"+
		"\7,\2\2\u04ec\u04ee\7\24\2\2\u04ed\u04ef\5$\23\2\u04ee\u04ed\3\2\2\2\u04ee"+
		"\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f2\7N\2\2\u04f1\u04f3\5\u00f2"+
		"z\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4"+
		"\u04f6\7$\2\2\u04f5\u04f7\5\u0106\u0084\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7"+
		"\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\7%\2\2\u04f9\u04fb\5V,\2\u04fa"+
		"\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04c1\3\2"+
		"\2\2\u04fc\u04d8\3\2\2\2\u04fc\u04ea\3\2\2\2\u04fd\u00ed\3\2\2\2\u04fe"+
		"\u04ff\7,\2\2\u04ff\u0501\7\24\2\2\u0500\u0502\5$\23\2\u0501\u0500\3\2"+
		"\2\2\u0501\u0502\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0505\7N\2\2\u0504"+
		"\u0506\5\u00f2z\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507"+
		"\3\2\2\2\u0507\u0509\7$\2\2\u0508\u050a\5\u0106\u0084\2\u0509\u0508\3"+
		"\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050d\7%\2\2\u050c"+
		"\u050e\5V,\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u00ef\3\2\2"+
		"\2\u050f\u0511\7\24\2\2\u0510\u0512\5$\23\2\u0511\u0510\3\2\2\2\u0511"+
		"\u0512\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0518\7N\2\2\u0514\u0515\7,\2"+
		"\2\u0515\u0517\7N\2\2\u0516\u0514\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0516"+
		"\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051b"+
		"\u051d\5\u00f2z\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e"+
		"\3\2\2\2\u051e\u0520\7$\2\2\u051f\u0521\5\u0106\u0084\2\u0520\u051f\3"+
		"\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0524\7%\2\2\u0523"+
		"\u0525\5V,\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0539\3\2\2"+
		"\2\u0526\u0527\5\64\33\2\u0527\u0528\7,\2\2\u0528\u052a\7\24\2\2\u0529"+
		"\u052b\5$\23\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\3\2"+
		"\2\2\u052c\u052e\7N\2\2\u052d\u052f\5\u00f2z\2\u052e\u052d\3\2\2\2\u052e"+
		"\u052f\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0532\7$\2\2\u0531\u0533\5\u0106"+
		"\u0084\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\3\2\2\2\u0534"+
		"\u0536\7%\2\2\u0535\u0537\5V,\2\u0536\u0535\3\2\2\2\u0536\u0537\3\2\2"+
		"\2\u0537\u0539\3\2\2\2\u0538\u050f\3\2\2\2\u0538\u0526\3\2\2\2\u0539\u00f1"+
		"\3\2\2\2\u053a\u053e\5$\23\2\u053b\u053c\7/\2\2\u053c\u053e\7.\2\2\u053d"+
		"\u053a\3\2\2\2\u053d\u053b\3\2\2\2\u053e\u00f3\3\2\2\2\u053f\u0540\5\u00d8"+
		"m\2\u0540\u0541\7,\2\2\u0541\u0542\7N\2\2\u0542\u054d\3\2\2\2\u0543\u0544"+
		"\7\32\2\2\u0544\u0545\7,\2\2\u0545\u054d\7N\2\2\u0546\u0547\5\60\31\2"+
		"\u0547\u0548\7,\2\2\u0548\u0549\7\32\2\2\u0549\u054a\7,\2\2\u054a\u054b"+
		"\7N\2\2\u054b\u054d\3\2\2\2\u054c\u053f\3\2\2\2\u054c\u0543\3\2\2\2\u054c"+
		"\u0546\3\2\2\2\u054d\u00f5\3\2\2\2\u054e\u054f\7,\2\2\u054f\u0550\7N\2"+
		"\2\u0550\u00f7\3\2\2\2\u0551\u0552\7\32\2\2\u0552\u0553\7,\2\2\u0553\u055b"+
		"\7N\2\2\u0554\u0555\5\60\31\2\u0555\u0556\7,\2\2\u0556\u0557\7\32\2\2"+
		"\u0557\u0558\7,\2\2\u0558\u0559\7N\2\2\u0559\u055b\3\2\2\2\u055a\u0551"+
		"\3\2\2\2\u055a\u0554\3\2\2\2\u055b\u00f9\3\2\2\2\u055c\u055d\5\64\33\2"+
		"\u055d\u055e\7(\2\2\u055e\u055f\5\u0116\u008c\2\u055f\u0560\7)\2\2\u0560"+
		"\u0567\3\2\2\2\u0561\u0562\5\u00dep\2\u0562\u0563\7(\2\2\u0563\u0564\5"+
		"\u0116\u008c\2\u0564\u0565\7)\2\2\u0565\u0567\3\2\2\2\u0566\u055c\3\2"+
		"\2\2\u0566\u0561\3\2\2\2\u0567\u056f\3\2\2\2\u0568\u0569\5\u00dco\2\u0569"+
		"\u056a\7(\2\2\u056a\u056b\5\u0116\u008c\2\u056b\u056c\7)\2\2\u056c\u056e"+
		"\3\2\2\2\u056d\u0568\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f"+
		"\u0570\3\2\2\2\u0570\u00fb\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0573\5\u00e4"+
		"s\2\u0573\u0574\7(\2\2\u0574\u0575\5\u0116\u008c\2\u0575\u0576\7)\2\2"+
		"\u0576\u057e\3\2\2\2\u0577\u0578\5\u00e2r\2\u0578\u0579\7(\2\2\u0579\u057a"+
		"\5\u0116\u008c\2\u057a\u057b\7)\2\2\u057b\u057d\3\2\2\2\u057c\u0577\3"+
		"\2\2\2\u057d\u0580\3\2\2\2\u057e\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057f"+
		"\u00fd\3\2\2\2\u0580\u057e\3\2\2\2\u0581\u0582\5\64\33\2\u0582\u0583\7"+
		"(\2\2\u0583\u0584\5\u0116\u008c\2\u0584\u0585\7)\2\2\u0585\u058c\3\2\2"+
		"\2\u0586\u0587\5\u00eav\2\u0587\u0588\7(\2\2\u0588\u0589\5\u0116\u008c"+
		"\2\u0589\u058a\7)\2\2\u058a\u058c\3\2\2\2\u058b\u0581\3\2\2\2\u058b\u0586"+
		"\3\2\2\2\u058c\u0594\3\2\2\2\u058d\u058e\5\u00e8u\2\u058e\u058f\7(\2\2"+
		"\u058f\u0590\5\u0116\u008c\2\u0590\u0591\7)\2\2\u0591\u0593\3\2\2\2\u0592"+
		"\u058d\3\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2"+
		"\2\2\u0595\u00ff\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0598\5\66\34\2\u0598"+
		"\u059a\7$\2\2\u0599\u059b\5\u0106\u0084\2\u059a\u0599\3\2\2\2\u059a\u059b"+
		"\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059d\7%\2\2\u059d\u05dc\3\2\2\2\u059e"+
		"\u059f\5\60\31\2\u059f\u05a1\7,\2\2\u05a0\u05a2\5$\23\2\u05a1\u05a0\3"+
		"\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\7N\2\2\u05a4"+
		"\u05a6\7$\2\2\u05a5\u05a7\5\u0106\u0084\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7"+
		"\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\7%\2\2\u05a9\u05dc\3\2\2\2\u05aa"+
		"\u05ab\5\64\33\2\u05ab\u05ad\7,\2\2\u05ac\u05ae\5$\23\2\u05ad\u05ac\3"+
		"\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\7N\2\2\u05b0"+
		"\u05b2\7$\2\2\u05b1\u05b3\5\u0106\u0084\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3"+
		"\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\7%\2\2\u05b5\u05dc\3\2\2\2\u05b6"+
		"\u05b7\5\u00d8m\2\u05b7\u05b9\7,\2\2\u05b8\u05ba\5$\23\2\u05b9\u05b8\3"+
		"\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\7N\2\2\u05bc"+
		"\u05be\7$\2\2\u05bd\u05bf\5\u0106\u0084\2\u05be\u05bd\3\2\2\2\u05be\u05bf"+
		"\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c1\7%\2\2\u05c1\u05dc\3\2\2\2\u05c2"+
		"\u05c3\7\32\2\2\u05c3\u05c5\7,\2\2\u05c4\u05c6\5$\23\2\u05c5\u05c4\3\2"+
		"\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\7N\2\2\u05c8"+
		"\u05ca\7$\2\2\u05c9\u05cb\5\u0106\u0084\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb"+
		"\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05dc\7%\2\2\u05cd\u05ce\5\60\31\2"+
		"\u05ce\u05cf\7,\2\2\u05cf\u05d0\7\32\2\2\u05d0\u05d2\7,\2\2\u05d1\u05d3"+
		"\5$\23\2\u05d2\u05d1\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4"+
		"\u05d5\7N\2\2\u05d5\u05d7\7$\2\2\u05d6\u05d8\5\u0106\u0084\2\u05d7\u05d6"+
		"\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05da\7%\2\2\u05da"+
		"\u05dc\3\2\2\2\u05db\u0597\3\2\2\2\u05db\u059e\3\2\2\2\u05db\u05aa\3\2"+
		"\2\2\u05db\u05b6\3\2\2\2\u05db\u05c2\3\2\2\2\u05db\u05cd\3\2\2\2\u05dc"+
		"\u0101\3\2\2\2\u05dd\u05df\7,\2\2\u05de\u05e0\5$\23\2\u05df\u05de\3\2"+
		"\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\7N\2\2\u05e2"+
		"\u05e4\7$\2\2\u05e3\u05e5\5\u0106\u0084\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5"+
		"\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\7%\2\2\u05e7\u0103\3\2\2\2\u05e8"+
		"\u05e9\5\66\34\2\u05e9\u05eb\7$\2\2\u05ea\u05ec\5\u0106\u0084\2\u05eb"+
		"\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\7%"+
		"\2\2\u05ee\u0621\3\2\2\2\u05ef\u05f0\5\60\31\2\u05f0\u05f2\7,\2\2\u05f1"+
		"\u05f3\5$\23\2\u05f2\u05f1\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\3\2"+
		"\2\2\u05f4\u05f5\7N\2\2\u05f5\u05f7\7$\2\2\u05f6\u05f8\5\u0106\u0084\2"+
		"\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa"+
		"\7%\2\2\u05fa\u0621\3\2\2\2\u05fb\u05fc\5\64\33\2\u05fc\u05fe\7,\2\2\u05fd"+
		"\u05ff\5$\23\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\3\2"+
		"\2\2\u0600\u0601\7N\2\2\u0601\u0603\7$\2\2\u0602\u0604\5\u0106\u0084\2"+
		"\u0603\u0602\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606"+
		"\7%\2\2\u0606\u0621\3\2\2\2\u0607\u0608\7\32\2\2\u0608\u060a\7,\2\2\u0609"+
		"\u060b\5$\23\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2"+
		"\2\2\u060c\u060d\7N\2\2\u060d\u060f\7$\2\2\u060e\u0610\5\u0106\u0084\2"+
		"\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0621"+
		"\7%\2\2\u0612\u0613\5\60\31\2\u0613\u0614\7,\2\2\u0614\u0615\7\32\2\2"+
		"\u0615\u0617\7,\2\2\u0616\u0618\5$\23\2\u0617\u0616\3\2\2\2\u0617\u0618"+
		"\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\7N\2\2\u061a\u061c\7$\2\2\u061b"+
		"\u061d\5\u0106\u0084\2\u061c\u061b\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061e"+
		"\3\2\2\2\u061e\u061f\7%\2\2\u061f\u0621\3\2\2\2\u0620\u05e8\3\2\2\2\u0620"+
		"\u05ef\3\2\2\2\u0620\u05fb\3\2\2\2\u0620\u0607\3\2\2\2\u0620\u0612\3\2"+
		"\2\2\u0621\u0105\3\2\2\2\u0622\u0627\5\u0116\u008c\2\u0623\u0624\7+\2"+
		"\2\u0624\u0626\5\u0116\u008c\2\u0625\u0623\3\2\2\2\u0626\u0629\3\2\2\2"+
		"\u0627\u0625\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0107\3\2\2\2\u0629\u0627"+
		"\3\2\2\2\u062a\u062b\5\64\33\2\u062b\u062d\7\4\2\2\u062c\u062e\5$\23\2"+
		"\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0630"+
		"\7N\2\2\u0630\u065a\3\2\2\2\u0631\u0632\5\20\t\2\u0632\u0634\7\4\2\2\u0633"+
		"\u0635\5$\23\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636\3\2"+
		"\2\2\u0636\u0637\7N\2\2\u0637\u065a\3\2\2\2\u0638\u0639\5\u00d8m\2\u0639"+
		"\u063b\7\4\2\2\u063a\u063c\5$\23\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2"+
		"\2\2\u063c\u063d\3\2\2\2\u063d\u063e\7N\2\2\u063e\u065a\3\2\2\2\u063f"+
		"\u0640\7\32\2\2\u0640\u0642\7\4\2\2\u0641\u0643\5$\23\2\u0642\u0641\3"+
		"\2\2\2\u0642\u0643\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u065a\7N\2\2\u0645"+
		"\u0646\5\60\31\2\u0646\u0647\7,\2\2\u0647\u0648\7\32\2\2\u0648\u064a\7"+
		"\4\2\2\u0649\u064b\5$\23\2\u064a\u0649\3\2\2\2\u064a\u064b\3\2\2\2\u064b"+
		"\u064c\3\2\2\2\u064c\u064d\7N\2\2\u064d\u065a\3\2\2\2\u064e\u064f\5\24"+
		"\13\2\u064f\u0651\7\4\2\2\u0650\u0652\5$\23\2\u0651\u0650\3\2\2\2\u0651"+
		"\u0652\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\7\24\2\2\u0654\u065a\3"+
		"\2\2\2\u0655\u0656\5\34\17\2\u0656\u0657\7\4\2\2\u0657\u0658\7\24\2\2"+
		"\u0658\u065a\3\2\2\2\u0659\u062a\3\2\2\2\u0659\u0631\3\2\2\2\u0659\u0638"+
		"\3\2\2\2\u0659\u063f\3\2\2\2\u0659\u0645\3\2\2\2\u0659\u064e\3\2\2\2\u0659"+
		"\u0655\3\2\2\2\u065a\u0109\3\2\2\2\u065b\u065d\7\4\2\2\u065c\u065e\5$"+
		"\23\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0660\7N\2\2\u0660\u010b\3\2\2\2\u0661\u0662\5\64\33\2\u0662\u0664\7"+
		"\4\2\2\u0663\u0665\5$\23\2\u0664\u0663\3\2\2\2\u0664\u0665\3\2\2\2\u0665"+
		"\u0666\3\2\2\2\u0666\u0667\7N\2\2\u0667\u068a\3\2\2\2\u0668\u0669\5\20"+
		"\t\2\u0669\u066b\7\4\2\2\u066a\u066c\5$\23\2\u066b\u066a\3\2\2\2\u066b"+
		"\u066c\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e\7N\2\2\u066e\u068a\3\2"+
		"\2\2\u066f\u0670\7\32\2\2\u0670\u0672\7\4\2\2\u0671\u0673\5$\23\2\u0672"+
		"\u0671\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u068a\7N"+
		"\2\2\u0675\u0676\5\60\31\2\u0676\u0677\7,\2\2\u0677\u0678\7\32\2\2\u0678"+
		"\u067a\7\4\2\2\u0679\u067b\5$\23\2\u067a\u0679\3\2\2\2\u067a\u067b\3\2"+
		"\2\2\u067b\u067c\3\2\2\2\u067c\u067d\7N\2\2\u067d\u068a\3\2\2\2\u067e"+
		"\u067f\5\24\13\2\u067f\u0681\7\4\2\2\u0680\u0682\5$\23\2\u0681\u0680\3"+
		"\2\2\2\u0681\u0682\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\7\24\2\2\u0684"+
		"\u068a\3\2\2\2\u0685\u0686\5\34\17\2\u0686\u0687\7\4\2\2\u0687\u0688\7"+
		"\24\2\2\u0688\u068a\3\2\2\2\u0689\u0661\3\2\2\2\u0689\u0668\3\2\2\2\u0689"+
		"\u066f\3\2\2\2\u0689\u0675\3\2\2\2\u0689\u067e\3\2\2\2\u0689\u0685\3\2"+
		"\2\2\u068a\u010d\3\2\2\2\u068b\u068c\7\24\2\2\u068c\u068d\5\b\5\2\u068d"+
		"\u068f\5\u0110\u0089\2\u068e\u0690\5\36\20\2\u068f\u068e\3\2\2\2\u068f"+
		"\u0690\3\2\2\2\u0690\u06a2\3\2\2\2\u0691\u0692\7\24\2\2\u0692\u0693\5"+
		"\22\n\2\u0693\u0695\5\u0110\u0089\2\u0694\u0696\5\36\20\2\u0695\u0694"+
		"\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u06a2\3\2\2\2\u0697\u0698\7\24\2\2"+
		"\u0698\u0699\5\b\5\2\u0699\u069a\5\36\20\2\u069a\u069b\5\u009cO\2\u069b"+
		"\u06a2\3\2\2\2\u069c\u069d\7\24\2\2\u069d\u069e\5\22\n\2\u069e\u069f\5"+
		"\36\20\2\u069f\u06a0\5\u009cO\2\u06a0\u06a2\3\2\2\2\u06a1\u068b\3\2\2"+
		"\2\u06a1\u0691\3\2\2\2\u06a1\u0697\3\2\2\2\u06a1\u069c\3\2\2\2\u06a2\u010f"+
		"\3\2\2\2\u06a3\u06a7\5\u0112\u008a\2\u06a4\u06a6\5\u0112\u008a\2\u06a5"+
		"\u06a4\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2"+
		"\2\2\u06a8\u0111\3\2\2\2\u06a9\u06a7\3\2\2\2\u06aa\u06ab\7(\2\2\u06ab"+
		"\u06ac\5\u0116\u008c\2\u06ac\u06ad\7)\2\2\u06ad\u0113\3\2\2\2\u06ae\u06af"+
		"\5\u0116\u008c\2\u06af\u0115\3\2\2\2\u06b0\u06b1\5\u011a\u008e\2\u06b1"+
		"\u0117\3\2\2\2\u06b2\u06b7\7N\2\2\u06b3\u06b4\7+\2\2\u06b4\u06b6\7N\2"+
		"\2\u06b5\u06b3\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b8"+
		"\3\2\2\2\u06b8\u0119\3\2\2\2\u06b9\u06b7\3\2\2\2\u06ba\u06bd\5\u0122\u0092"+
		"\2\u06bb\u06bd\5\u011c\u008f\2\u06bc\u06ba\3\2\2\2\u06bc\u06bb\3\2\2\2"+
		"\u06bd\u011b\3\2\2\2\u06be\u06bf\5\u011e\u0090\2\u06bf\u06c0\5\u0120\u0091"+
		"\2\u06c0\u06c1\5\u0116\u008c\2\u06c1\u011d\3\2\2\2\u06c2\u06c6\5\64\33"+
		"\2\u06c3\u06c6\5\u00f4{\2\u06c4\u06c6\5\u00fa~\2\u06c5\u06c2\3\2\2\2\u06c5"+
		"\u06c3\3\2\2\2\u06c5\u06c4\3\2\2\2\u06c6\u011f\3\2\2\2\u06c7\u06d3\7-"+
		"\2\2\u06c8\u06d3\7F\2\2\u06c9\u06d3\7G\2\2\u06ca\u06d3\7K\2\2\u06cb\u06d3"+
		"\7D\2\2\u06cc\u06d3\7E\2\2\u06cd\u06d3\7L\2\2\u06ce\u06d3\7M\2\2\u06cf"+
		"\u06d3\7H\2\2\u06d0\u06d3\7J\2\2\u06d1\u06d3\7I\2\2\u06d2\u06c7\3\2\2"+
		"\2\u06d2\u06c8\3\2\2\2\u06d2\u06c9\3\2\2\2\u06d2\u06ca\3\2\2\2\u06d2\u06cb"+
		"\3\2\2\2\u06d2\u06cc\3\2\2\2\u06d2\u06cd\3\2\2\2\u06d2\u06ce\3\2\2\2\u06d2"+
		"\u06cf\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d1\3\2\2\2\u06d3\u0121\3\2"+
		"\2\2\u06d4\u06dc\5\u0124\u0093\2\u06d5\u06d6\5\u0124\u0093\2\u06d6\u06d7"+
		"\7\62\2\2\u06d7\u06d8\5\u0116\u008c\2\u06d8\u06d9\7\63\2\2\u06d9\u06da"+
		"\5\u0122\u0092\2\u06da\u06dc\3\2\2\2\u06db\u06d4\3\2\2\2\u06db\u06d5\3"+
		"\2\2\2\u06dc\u0123\3\2\2\2\u06dd\u06de\b\u0093\1\2\u06de\u06df\5\u0126"+
		"\u0094\2\u06df\u06e5\3\2\2\2\u06e0\u06e1\f\3\2\2\u06e1\u06e2\79\2\2\u06e2"+
		"\u06e4\5\u0126\u0094\2\u06e3\u06e0\3\2\2\2\u06e4\u06e7\3\2\2\2\u06e5\u06e3"+
		"\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u0125\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e8"+
		"\u06e9\b\u0094\1\2\u06e9\u06ea\5\u0128\u0095\2\u06ea\u06f0\3\2\2\2\u06eb"+
		"\u06ec\f\3\2\2\u06ec\u06ed\78\2\2\u06ed\u06ef\5\u0128\u0095\2\u06ee\u06eb"+
		"\3\2\2\2\u06ef\u06f2\3\2\2\2\u06f0\u06ee\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1"+
		"\u0127\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f3\u06f4\b\u0095\1\2\u06f4\u06f5"+
		"\5\u012a\u0096\2\u06f5\u06fb\3\2\2\2\u06f6\u06f7\f\3\2\2\u06f7\u06f8\7"+
		"A\2\2\u06f8\u06fa\5\u012a\u0096\2\u06f9\u06f6\3\2\2\2\u06fa\u06fd\3\2"+
		"\2\2\u06fb\u06f9\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u0129\3\2\2\2\u06fd"+
		"\u06fb\3\2\2\2\u06fe\u06ff\b\u0096\1\2\u06ff\u0700\5\u012c\u0097\2\u0700"+
		"\u0706\3\2\2\2\u0701\u0702\f\3\2\2\u0702\u0703\7B\2\2\u0703\u0705\5\u012c"+
		"\u0097\2\u0704\u0701\3\2\2\2\u0705\u0708\3\2\2\2\u0706\u0704\3\2\2\2\u0706"+
		"\u0707\3\2\2\2\u0707\u012b\3\2\2\2\u0708\u0706\3\2\2\2\u0709\u070a\b\u0097"+
		"\1\2\u070a\u070b\5\u012e\u0098\2\u070b\u0711\3\2\2\2\u070c\u070d\f\3\2"+
		"\2\u070d\u070e\7@\2\2\u070e\u0710\5\u012e\u0098\2\u070f\u070c\3\2\2\2"+
		"\u0710\u0713\3\2\2\2\u0711\u070f\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u012d"+
		"\3\2\2\2\u0713\u0711\3\2\2\2\u0714\u0715\b\u0098\1\2\u0715\u0716\5\u0130"+
		"\u0099\2\u0716\u071f\3\2\2\2\u0717\u0718\f\4\2\2\u0718\u0719\7\64\2\2"+
		"\u0719\u071e\5\u0130\u0099\2\u071a\u071b\f\3\2\2\u071b\u071c\7\67\2\2"+
		"\u071c\u071e\5\u0130\u0099\2\u071d\u0717\3\2\2\2\u071d\u071a\3\2\2\2\u071e"+
		"\u0721\3\2\2\2\u071f\u071d\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u012f\3\2"+
		"\2\2\u0721\u071f\3\2\2\2\u0722\u0723\b\u0099\1\2\u0723\u0724\5\u0132\u009a"+
		"\2\u0724\u0736\3\2\2\2\u0725\u0726\f\7\2\2\u0726\u0727\7/\2\2\u0727\u0735"+
		"\5\u0132\u009a\2\u0728\u0729\f\6\2\2\u0729\u072a\7.\2\2\u072a\u0735\5"+
		"\u0132\u009a\2\u072b\u072c\f\5\2\2\u072c\u072d\7\65\2\2\u072d\u0735\5"+
		"\u0132\u009a\2\u072e\u072f\f\4\2\2\u072f\u0730\7\66\2\2\u0730\u0735\5"+
		"\u0132\u009a\2\u0731\u0732\f\3\2\2\u0732\u0733\7\22\2\2\u0733\u0735\5"+
		"\20\t\2\u0734\u0725\3\2\2\2\u0734\u0728\3\2\2\2\u0734\u072b\3\2\2\2\u0734"+
		"\u072e\3\2\2\2\u0734\u0731\3\2\2\2\u0735\u0738\3\2\2\2\u0736\u0734\3\2"+
		"\2\2\u0736\u0737\3\2\2\2\u0737\u0131\3\2\2\2\u0738\u0736\3\2\2\2\u0739"+
		"\u073a\b\u009a\1\2\u073a\u073b\5\u0134\u009b\2\u073b\u0746\3\2\2\2\u073c"+
		"\u073d\f\4\2\2\u073d\u073e\7/\2\2\u073e\u073f\7/\2\2\u073f\u0745\5\u0134"+
		"\u009b\2\u0740\u0741\f\3\2\2\u0741\u0742\7.\2\2\u0742\u0743\7.\2\2\u0743"+
		"\u0745\5\u0134\u009b\2\u0744\u073c\3\2\2\2\u0744\u0740\3\2\2\2\u0745\u0748"+
		"\3\2\2\2\u0746\u0744\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0133\3\2\2\2\u0748"+
		"\u0746\3\2\2\2\u0749\u074a\b\u009b\1\2\u074a\u074b\5\u0136\u009c\2\u074b"+
		"\u0754\3\2\2\2\u074c\u074d\f\4\2\2\u074d\u074e\7<\2\2\u074e\u0753\5\u0136"+
		"\u009c\2\u074f\u0750\f\3\2\2\u0750\u0751\7=\2\2\u0751\u0753\5\u0136\u009c"+
		"\2\u0752\u074c\3\2\2\2\u0752\u074f\3\2\2\2\u0753\u0756\3\2\2\2\u0754\u0752"+
		"\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0135\3\2\2\2\u0756\u0754\3\2\2\2\u0757"+
		"\u0758\b\u009c\1\2\u0758\u0759\5\u0138\u009d\2\u0759\u0765\3\2\2\2\u075a"+
		"\u075b\f\5\2\2\u075b\u075c\7>\2\2\u075c\u0764\5\u0138\u009d\2\u075d\u075e"+
		"\f\4\2\2\u075e\u075f\7?\2\2\u075f\u0764\5\u0138\u009d\2\u0760\u0761\f"+
		"\3\2\2\u0761\u0762\7C\2\2\u0762\u0764\5\u0138\u009d\2\u0763\u075a\3\2"+
		"\2\2\u0763\u075d\3\2\2\2\u0763\u0760\3\2\2\2\u0764\u0767\3\2\2\2\u0765"+
		"\u0763\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0137\3\2\2\2\u0767\u0765\3\2"+
		"\2\2\u0768\u0770\5\u013a\u009e\2\u0769\u0770\5\u013c\u009f\2\u076a\u076b"+
		"\7<\2\2\u076b\u0770\5\u0138\u009d\2\u076c\u076d\7=\2\2\u076d\u0770\5\u0138"+
		"\u009d\2\u076e\u0770\5\u013e\u00a0\2\u076f\u0768\3\2\2\2\u076f\u0769\3"+
		"\2\2\2\u076f\u076a\3\2\2\2\u076f\u076c\3\2\2\2\u076f\u076e\3\2\2\2\u0770"+
		"\u0139\3\2\2\2\u0771\u0772\7:\2\2\u0772\u0773\5\u0138\u009d\2\u0773\u013b"+
		"\3\2\2\2\u0774\u0775\7;\2\2\u0775\u0776\5\u0138\u009d\2\u0776\u013d\3"+
		"\2\2\2\u0777\u077e\5\u0140\u00a1\2\u0778\u0779\7\61\2\2\u0779\u077e\5"+
		"\u0138\u009d\2\u077a\u077b\7\60\2\2\u077b\u077e\5\u0138\u009d\2\u077c"+
		"\u077e\5\u014a\u00a6\2\u077d\u0777\3\2\2\2\u077d\u0778\3\2\2\2\u077d\u077a"+
		"\3\2\2\2\u077d\u077c\3\2\2\2\u077e\u013f\3\2\2\2\u077f\u0782\5\u00d8m"+
		"\2\u0780\u0782\5\64\33\2\u0781\u077f\3\2\2\2\u0781\u0780\3\2\2\2\u0782"+
		"\u0787\3\2\2\2\u0783\u0786\5\u0144\u00a3\2\u0784\u0786\5\u0148\u00a5\2"+
		"\u0785\u0783\3\2\2\2\u0785\u0784\3\2\2\2\u0786\u0789\3\2\2\2\u0787\u0785"+
		"\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u0141\3\2\2\2\u0789\u0787\3\2\2\2\u078a"+
		"\u078b\5\u0140\u00a1\2\u078b\u078c\7:\2\2\u078c\u0143\3\2\2\2\u078d\u078e"+
		"\7:\2\2\u078e\u0145\3\2\2\2\u078f\u0790\5\u0140\u00a1\2\u0790\u0791\7"+
		";\2\2\u0791\u0147\3\2\2\2\u0792\u0793\7;\2\2\u0793\u0149\3\2\2\2\u0794"+
		"\u0795\7$\2\2\u0795\u0796\5\b\5\2\u0796\u0797\7%\2\2\u0797\u0798\5\u0138"+
		"\u009d\2\u0798\u014b\3\2\2\2\u00dc\u0152\u0156\u015c\u0161\u0165\u0169"+
		"\u016d\u0174\u017a\u017f\u0185\u0187\u018c\u0190\u019d\u01a5\u01aa\u01b8"+
		"\u01bd\u01c1\u01c7\u01d1\u01d9\u01e3\u01eb\u01f7\u01fb\u0200\u0206\u0211"+
		"\u021a\u0236\u023d\u0243\u0246\u024e\u0259\u0263\u026c\u0272\u0277\u0281"+
		"\u0288\u028e\u0292\u0296\u029b\u02a5\u02ad\u02b1\u02b6\u02ba\u02c1\u02c8"+
		"\u02d0\u02d3\u02dd\u02e1\u02e7\u02f1\u02f9\u02fc\u0301\u0309\u030c\u0311"+
		"\u0316\u031b\u0320\u0327\u032c\u0334\u0339\u033e\u0343\u034b\u0352\u035b"+
		"\u035f\u0362\u036b\u0370\u0373\u037c\u0381\u0389\u038f\u039d\u03a4\u03ac"+
		"\u03c2\u03ed\u03f1\u03f5\u03fd\u0401\u0405\u040c\u0415\u041a\u0420\u0426"+
		"\u042c\u0431\u043a\u0451\u045b\u0471\u0478\u0480\u0488\u049f\u04a9\u04bf"+
		"\u04c3\u04ca\u04ce\u04d2\u04d6\u04dc\u04e0\u04e4\u04e8\u04ee\u04f2\u04f6"+
		"\u04fa\u04fc\u0501\u0505\u0509\u050d\u0511\u0518\u051c\u0520\u0524\u052a"+
		"\u052e\u0532\u0536\u0538\u053d\u054c\u055a\u0566\u056f\u057e\u058b\u0594"+
		"\u059a\u05a1\u05a6\u05ad\u05b2\u05b9\u05be\u05c5\u05ca\u05d2\u05d7\u05db"+
		"\u05df\u05e4\u05eb\u05f2\u05f7\u05fe\u0603\u060a\u060f\u0617\u061c\u0620"+
		"\u0627\u062d\u0634\u063b\u0642\u064a\u0651\u0659\u065d\u0664\u066b\u0672"+
		"\u067a\u0681\u0689\u068f\u0695\u06a1\u06a7\u06b7\u06bc\u06c5\u06d2\u06db"+
		"\u06e5\u06f0\u06fb\u0706\u0711\u071d\u071f\u0734\u0736\u0744\u0746\u0752"+
		"\u0754\u0763\u0765\u076f\u077d\u0781\u0785\u0787";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}