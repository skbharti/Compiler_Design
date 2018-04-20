// Generated from /home/varun/IdeaProjects/Compiler_Design/LexerParser/src/Java.g4 by ANTLR 4.7
package src;
import IRCode.src.IRCode.ThreeAddCode;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.EnumSet;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, AND=23, LT=24, LTE=25, 
		GT=26, GTE=27, EQU=28, PLUS=29, MINUS=30, TIMES=31, POWER=32, NOT=33, 
		LSB=34, RSB=35, LP=36, RP=37, RETURN=38, EQ=39, REF=40, BooleanLiteral=41, 
		Identifier=42, IntegerLiteral=43, DecimalLiteral=44, WS=45, MULTILINE_COMMENT=46, 
		LINE_COMMENT=47, OR=48;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_fieldDeclaration = 3, 
		RULE_varDeclaration = 4, RULE_methodDeclaration = 5, RULE_parameterList = 6, 
		RULE_parameter = 7, RULE_methodBody = 8, RULE_type = 9, RULE_typeDim = 10, 
		RULE_dims = 11, RULE_statement = 12, RULE_ifBlock = 13, RULE_elseBlock = 14, 
		RULE_whileBlock = 15, RULE_expression = 16;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "fieldDeclaration", "varDeclaration", 
		"methodDeclaration", "parameterList", "parameter", "methodBody", "type", 
		"typeDim", "dims", "statement", "ifBlock", "elseBlock", "whileBlock", 
		"expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'String'", 
		"'}'", "'extends'", "';'", "','", "'int'", "'boolean'", "'float'", "'char'", 
		"'if'", "'else'", "'while'", "'for'", "'println'", "'new'", "'this'", 
		"'&&'", "'<'", "'<='", "'>'", "'>='", "'=='", "'+'", "'-'", "'*'", "'**'", 
		"'!'", "'['", "']'", "'('", "')'", "'return'", "'='", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "AND", 
		"LT", "LTE", "GT", "GTE", "EQU", "PLUS", "MINUS", "TIMES", "POWER", "NOT", 
		"LSB", "RSB", "LP", "RP", "RETURN", "EQ", "REF", "BooleanLiteral", "Identifier", 
		"IntegerLiteral", "DecimalLiteral", "WS", "MULTILINE_COMMENT", "LINE_COMMENT", 
		"OR"
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
	public static class GoalContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					classDeclaration();
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(40);
			mainClass();
			setState(41);
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

	public static class MainClassContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
		public String place;
		public String start;
		public String end;
		public int value;

		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }

		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(Identifier);
			setState(45);
			match(T__1);
			setState(46);
			match(T__2);
			setState(47);
			match(T__3);
			setState(48);
			match(T__4);
			setState(49);
			match(T__5);
			setState(50);
			match(LP);
			setState(51);
			match(T__6);
			setState(52);
			match(LSB);
			setState(53);
			match(RSB);
			setState(54);
			match(Identifier);
			setState(55);
			match(RP);
			setState(56);
			match(T__1);
			setState(57);
			statement();
			setState(58);
			match(T__7);
			setState(59);
			match(T__7);
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
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

        public List<TerminalNode> Identifier() {
            return getTokens(JavaParser.Identifier);
        }

		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			match(Identifier);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(63);
				match(T__8);
				setState(64);
				match(Identifier);
				}
			}

			setState(67);
			match(T__1);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Identifier))) != 0)) {
				{
				{
				setState(68);
				fieldDeclaration();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(74);
				methodDeclaration();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__7);
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
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			varDeclaration();
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

	public static class VarDeclarationContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

		public TypeDimContext typeDim() {
			return getRuleContext(TypeDimContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			typeDim();
			setState(85);
			match(Identifier);
			setState(86);
			match(T__9);
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
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

		public TypeDimContext typeDim() {
			return getRuleContext(TypeDimContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__2);
			setState(89);
			typeDim();
			setState(90);
			match(Identifier);
			setState(91);
			match(LP);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Identifier))) != 0)) {
				{
				setState(92);
				parameterList();
				}
			}

			setState(95);
			match(RP);
			setState(96);
			match(T__1);
			setState(97);
			methodBody();
			setState(98);
			match(T__7);
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

	public static class ParameterListContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;
        public List<JavaParser.Type> paramList;

		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParameterList(this);
            for (int i = 0; i < this.getChildCount(); i++) {
				if (this.getChild(i) instanceof JavaParser.ParameterContext) {
					paramList.add(MyJavaListener.getType(this.getChild(i).getChild(0).getText()));
				}
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			parameter();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(101);
				match(T__10);
				setState(102);
				parameter();
				}
				}
				setState(107);
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

	public static class ParameterContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

		public TypeDimContext typeDim() {
			return getRuleContext(TypeDimContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			typeDim();
			setState(109);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;
        
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << Identifier))) != 0)) {
				{
				{
				setState(111);
				statement();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(RETURN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << NOT) | (1L << LP) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0)) {
				{
				setState(118);
				expression(0);
				}
			}

			setState(121);
			match(T__9);
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
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;
        public Type type;   //  initialize type value for this token
		
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Identifier))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TypeDimContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;
        public int numberOfDimensions;
        public int[] lengthOfDimensions;
        public Type type;   //  initialize type value for this token


        public void setDimCount (int count)
        {
            numberOfDimensions = count;
        }

		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeDimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDimContext typeDim() throws RecognitionException {
		TypeDimContext _localctx = new TypeDimContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeDim);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__11);
				setState(126);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(T__12);
				setState(128);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(T__13);
				setState(130);
				dims();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(T__14);
				setState(132);
				dims();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				match(Identifier);
				setState(134);
				dims();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(T__11);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				match(T__12);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				match(T__13);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				match(T__14);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(139);
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

	public static class DimsContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;
        public int dimCount;

		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(LSB);
			setState(143);
			match(RSB);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSB) {
				{
				{
				setState(144);
				match(LSB);
				setState(145);
				match(RSB);
				}
				}
				setState(150);
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

	public static class StatementContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode LP() { return getToken(JavaParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(JavaParser.RP, 0); }
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode LP() { return getToken(JavaParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(JavaParser.RP, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStatementContext extends StatementContext {
		public TerminalNode LP() { return getToken(JavaParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(JavaParser.RP, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfElseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableAssignmentStatementContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(JavaParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatementContext {
		public TerminalNode LP() { return getToken(JavaParser.LP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(JavaParser.RP, 0); }
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssignmentStatementContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<TerminalNode> LSB() { return getTokens(JavaParser.LSB); }
		public TerminalNode LSB(int i) {
			return getToken(JavaParser.LSB, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RSB() { return getTokens(JavaParser.RSB); }
		public TerminalNode RSB(int i) {
			return getToken(JavaParser.RSB, i);
		}
		public TerminalNode EQ() { return getToken(JavaParser.EQ, 0); }
		public ArrayAssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationContext extends StatementContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public DeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NestedStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNestedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNestedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNestedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new NestedStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__1);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << Identifier))) != 0)) {
					{
					{
					setState(152);
					statement();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				fieldDeclaration();
				}
				break;
			case 3:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__15);
				setState(161);
				match(LP);
				setState(162);
				expression(0);
				setState(163);
				match(RP);
				setState(164);
				ifBlock();
				setState(165);
				match(T__16);
				setState(166);
				elseBlock();
				}
				break;
			case 4:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(T__17);
				setState(169);
				match(LP);
				setState(170);
				expression(0);
				setState(171);
				match(RP);
				setState(172);
				whileBlock();
				}
				break;
			case 5:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(T__18);
				setState(175);
				match(LP);
				setState(176);
				statement();
				setState(177);
				match(T__9);
				setState(178);
				expression(0);
				setState(179);
				match(T__9);
				setState(180);
				statement();
				setState(181);
				match(RP);
				setState(182);
				whileBlock();
				}
				break;
			case 6:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				match(T__19);
				setState(185);
				match(LP);
				setState(186);
				expression(0);
				setState(187);
				match(RP);
				setState(188);
				match(T__9);
				}
				break;
			case 7:
				_localctx = new VariableAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				match(Identifier);
				setState(191);
				match(EQ);
				setState(192);
				expression(0);
				setState(193);
				match(T__9);
				}
				break;
			case 8:
				_localctx = new ArrayAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
				match(Identifier);
				setState(196);
				match(LSB);
				setState(197);
				expression(0);
				setState(198);
				match(RSB);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSB) {
					{
					{
					setState(199);
					match(LSB);
					setState(200);
					expression(0);
					setState(201);
					match(RSB);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(EQ);
				setState(209);
				expression(0);
				setState(210);
				match(T__9);
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

	public static class IfBlockContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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

	public static class ElseBlockContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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

	public static class WhileBlockContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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

	public static class ExpressionContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;
        public JavaParser.Type type;

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LtExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public LtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLtExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectInstantiationExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ObjectInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterObjectInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitObjectInstantiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitObjectInstantiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public GtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGtExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayInstantiationExpressionContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LSB() { return getTokens(JavaParser.LSB); }
		public TerminalNode LSB(int i) {
			return getToken(JavaParser.LSB, i);
		}
		public List<TerminalNode> IntegerLiteral() { return getTokens(JavaParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(JavaParser.IntegerLiteral, i);
		}
		public List<TerminalNode> RSB() { return getTokens(JavaParser.RSB); }
		public TerminalNode RSB(int i) {
			return getToken(JavaParser.RSB, i);
		}
		public ArrayInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayInstantiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayInstantiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(JavaParser.POWER, 0); }
		public PowExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPowExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(JavaParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLitExpressionContext extends ExpressionContext {
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public BooleanLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBooleanLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBooleanLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBooleanLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLitExpressionContext extends ExpressionContext {
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public IntLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIntLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIntLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIntLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecLitExpressionContext extends ExpressionContext {
		public TerminalNode DecimalLiteral() { return getToken(JavaParser.DecimalLiteral, 0); }
		public DecLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDecLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDecLitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDecLitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectMethodCallExpressionContext extends ExpressionContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> REF() { return getTokens(JavaParser.REF); }
		public TerminalNode REF(int i) {
			return getToken(JavaParser.REF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ObjectMethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterObjectMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitObjectMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitObjectMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GteExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTE() { return getToken(JavaParser.GTE, 0); }
		public GteExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGteExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EquExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQU() { return getToken(JavaParser.EQU, 0); }
		public EquExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEquExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEquExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEquExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<TerminalNode> LSB() { return getTokens(JavaParser.LSB); }
		public TerminalNode LSB(int i) {
			return getToken(JavaParser.LSB, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RSB() { return getTokens(JavaParser.RSB); }
		public TerminalNode RSB(int i) {
			return getToken(JavaParser.RSB, i);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(JavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(JavaParser.OR, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(JavaParser.PLUS, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LteExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LTE() { return getToken(JavaParser.LTE, 0); }
		public LteExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLteExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectVariableReferenceExpressionContext extends ExpressionContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> REF() { return getTokens(JavaParser.REF); }
		public TerminalNode REF(int i) {
			return getToken(JavaParser.REF, i);
		}
		public ObjectVariableReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterObjectVariableReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitObjectVariableReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitObjectVariableReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(JavaParser.MINUS, 0); }
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(JavaParser.TIMES, 0); }
		public MulExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayAccessExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(221);
				match(Identifier);
				setState(222);
				match(LSB);
				setState(223);
				expression(0);
				setState(224);
				match(RSB);
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(225);
						match(LSB);
						setState(226);
						expression(0);
						setState(227);
						match(RSB);
						}
						} 
					}
					setState(233);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 2:
				{
				_localctx = new MethodCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(Identifier);
				setState(235);
				match(LP);
				setState(236);
				expression(0);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(237);
					match(T__10);
					setState(238);
					expression(0);
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(RP);
				}
				break;
			case 3:
				{
				_localctx = new ObjectMethodCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				match(Identifier);
				setState(247);
				match(REF);
				setState(248);
				match(Identifier);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==REF) {
					{
					{
					setState(249);
					match(REF);
					setState(250);
					match(Identifier);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(LP);
				setState(257);
				expression(0);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(258);
					match(T__10);
					setState(259);
					expression(0);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(RP);
				}
				break;
			case 4:
				{
				_localctx = new ObjectVariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(Identifier);
				setState(268);
				match(REF);
				setState(269);
				match(Identifier);
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(270);
						match(REF);
						setState(271);
						match(Identifier);
						}
						} 
					}
					setState(276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 5:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(NOT);
				setState(278);
				expression(20);
				}
				break;
			case 6:
				{
				_localctx = new ArrayInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(T__20);
				setState(280);
				type();
				setState(281);
				match(LSB);
				setState(282);
				match(IntegerLiteral);
				setState(283);
				match(RSB);
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(284);
						match(LSB);
						setState(285);
						match(IntegerLiteral);
						setState(286);
						match(RSB);
						}
						} 
					}
					setState(291);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case 7:
				{
				_localctx = new ObjectInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				match(T__20);
				setState(293);
				match(Identifier);
				setState(294);
				match(LP);
				setState(295);
				match(RP);
				}
				break;
			case 8:
				{
				_localctx = new IntLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				match(IntegerLiteral);
				}
				break;
			case 9:
				{
				_localctx = new DecLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(DecimalLiteral);
				}
				break;
			case 10:
				{
				_localctx = new BooleanLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				match(BooleanLiteral);
				}
				break;
			case 11:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				match(Identifier);
				}
				break;
			case 12:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(T__21);
				}
				break;
			case 13:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(LP);
				setState(302);
				expression(0);
				setState(303);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new PowExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(308);
						match(POWER);
						setState(309);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(311);
						match(TIMES);
						setState(312);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(314);
						match(PLUS);
						setState(315);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(317);
						match(MINUS);
						setState(318);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new LtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(320);
						match(LT);
						setState(321);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new GtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(323);
						match(GT);
						setState(324);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new LteExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(326);
						match(LTE);
						setState(327);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new GteExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(328);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(329);
						match(GTE);
						setState(330);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new EquExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(332);
						match(EQU);
						setState(333);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(335);
						match(AND);
						setState(336);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(338);
						match(OR);
						setState(339);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(344);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u015c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4D\n\4\3"+
		"\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\t\3\t\3\t\3\n\7\ns\n\n\f\n\16\n"+
		"v\13\n\3\n\3\n\5\nz\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3\r\3\r\3\r\3\r\7\r\u0095"+
		"\n\r\f\r\16\r\u0098\13\r\3\16\3\16\7\16\u009c\n\16\f\16\16\16\u009f\13"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u00ce\n\16\f\16\16\16\u00d1\13\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00d7\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e8\n\22\f\22\16\22\u00eb\13\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00f2\n\22\f\22\16\22\u00f5\13\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00fe\n\22\f\22\16\22\u0101\13\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0107\n\22\f\22\16\22\u010a\13\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0113\n\22\f\22\16\22\u0116\13\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0122\n\22\f\22\16"+
		"\22\u0125\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0134\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0157\n\22\f\22"+
		"\16\22\u015a\13\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"\2\3\4\2\16\21,,\2\u0182\2\'\3\2\2\2\4-\3\2\2\2\6?\3\2\2\2\bT\3\2\2"+
		"\2\nV\3\2\2\2\fZ\3\2\2\2\16f\3\2\2\2\20n\3\2\2\2\22t\3\2\2\2\24}\3\2\2"+
		"\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32\u00d6\3\2\2\2\34\u00d8\3\2\2\2"+
		"\36\u00da\3\2\2\2 \u00dc\3\2\2\2\"\u0133\3\2\2\2$&\5\6\4\2%$\3\2\2\2&"+
		")\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\5\4\3\2+,\7\2\2"+
		"\3,\3\3\2\2\2-.\7\3\2\2./\7,\2\2/\60\7\4\2\2\60\61\7\5\2\2\61\62\7\6\2"+
		"\2\62\63\7\7\2\2\63\64\7\b\2\2\64\65\7&\2\2\65\66\7\t\2\2\66\67\7$\2\2"+
		"\678\7%\2\289\7,\2\29:\7\'\2\2:;\7\4\2\2;<\5\32\16\2<=\7\n\2\2=>\7\n\2"+
		"\2>\5\3\2\2\2?@\7\3\2\2@C\7,\2\2AB\7\13\2\2BD\7,\2\2CA\3\2\2\2CD\3\2\2"+
		"\2DE\3\2\2\2EI\7\4\2\2FH\5\b\5\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2"+
		"\2JO\3\2\2\2KI\3\2\2\2LN\5\f\7\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2"+
		"\2PR\3\2\2\2QO\3\2\2\2RS\7\n\2\2S\7\3\2\2\2TU\5\n\6\2U\t\3\2\2\2VW\5\26"+
		"\f\2WX\7,\2\2XY\7\f\2\2Y\13\3\2\2\2Z[\7\5\2\2[\\\5\26\f\2\\]\7,\2\2]_"+
		"\7&\2\2^`\5\16\b\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\'\2\2bc\7\4\2\2c"+
		"d\5\22\n\2de\7\n\2\2e\r\3\2\2\2fk\5\20\t\2gh\7\r\2\2hj\5\20\t\2ig\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mk\3\2\2\2no\5\26\f\2op"+
		"\7,\2\2p\21\3\2\2\2qs\5\32\16\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2"+
		"\2uw\3\2\2\2vt\3\2\2\2wy\7(\2\2xz\5\"\22\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2"+
		"\2{|\7\f\2\2|\23\3\2\2\2}~\t\2\2\2~\25\3\2\2\2\177\u0080\7\16\2\2\u0080"+
		"\u008f\5\30\r\2\u0081\u0082\7\17\2\2\u0082\u008f\5\30\r\2\u0083\u0084"+
		"\7\20\2\2\u0084\u008f\5\30\r\2\u0085\u0086\7\21\2\2\u0086\u008f\5\30\r"+
		"\2\u0087\u0088\7,\2\2\u0088\u008f\5\30\r\2\u0089\u008f\7\16\2\2\u008a"+
		"\u008f\7\17\2\2\u008b\u008f\7\20\2\2\u008c\u008f\7\21\2\2\u008d\u008f"+
		"\7,\2\2\u008e\177\3\2\2\2\u008e\u0081\3\2\2\2\u008e\u0083\3\2\2\2\u008e"+
		"\u0085\3\2\2\2\u008e\u0087\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008a\3\2"+
		"\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\27\3\2\2\2\u0090\u0091\7$\2\2\u0091\u0096\7%\2\2\u0092\u0093\7$\2\2\u0093"+
		"\u0095\7%\2\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\31\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009d"+
		"\7\4\2\2\u009a\u009c\5\32\16\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00d7\7\n\2\2\u00a1\u00d7\5\b\5\2\u00a2\u00a3\7\22\2\2"+
		"\u00a3\u00a4\7&\2\2\u00a4\u00a5\5\"\22\2\u00a5\u00a6\7\'\2\2\u00a6\u00a7"+
		"\5\34\17\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00d7\3\2"+
		"\2\2\u00aa\u00ab\7\24\2\2\u00ab\u00ac\7&\2\2\u00ac\u00ad\5\"\22\2\u00ad"+
		"\u00ae\7\'\2\2\u00ae\u00af\5 \21\2\u00af\u00d7\3\2\2\2\u00b0\u00b1\7\25"+
		"\2\2\u00b1\u00b2\7&\2\2\u00b2\u00b3\5\32\16\2\u00b3\u00b4\7\f\2\2\u00b4"+
		"\u00b5\5\"\22\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8"+
		"\7\'\2\2\u00b8\u00b9\5 \21\2\u00b9\u00d7\3\2\2\2\u00ba\u00bb\7\26\2\2"+
		"\u00bb\u00bc\7&\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7\'\2\2\u00be\u00bf"+
		"\7\f\2\2\u00bf\u00d7\3\2\2\2\u00c0\u00c1\7,\2\2\u00c1\u00c2\7)\2\2\u00c2"+
		"\u00c3\5\"\22\2\u00c3\u00c4\7\f\2\2\u00c4\u00d7\3\2\2\2\u00c5\u00c6\7"+
		",\2\2\u00c6\u00c7\7$\2\2\u00c7\u00c8\5\"\22\2\u00c8\u00cf\7%\2\2\u00c9"+
		"\u00ca\7$\2\2\u00ca\u00cb\5\"\22\2\u00cb\u00cc\7%\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00c9\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7)"+
		"\2\2\u00d3\u00d4\5\"\22\2\u00d4\u00d5\7\f\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u0099\3\2\2\2\u00d6\u00a1\3\2\2\2\u00d6\u00a2\3\2\2\2\u00d6\u00aa\3\2"+
		"\2\2\u00d6\u00b0\3\2\2\2\u00d6\u00ba\3\2\2\2\u00d6\u00c0\3\2\2\2\u00d6"+
		"\u00c5\3\2\2\2\u00d7\33\3\2\2\2\u00d8\u00d9\5\32\16\2\u00d9\35\3\2\2\2"+
		"\u00da\u00db\5\32\16\2\u00db\37\3\2\2\2\u00dc\u00dd\5\32\16\2\u00dd!\3"+
		"\2\2\2\u00de\u00df\b\22\1\2\u00df\u00e0\7,\2\2\u00e0\u00e1\7$\2\2\u00e1"+
		"\u00e2\5\"\22\2\u00e2\u00e9\7%\2\2\u00e3\u00e4\7$\2\2\u00e4\u00e5\5\""+
		"\22\2\u00e5\u00e6\7%\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u0134\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7,\2\2\u00ed\u00ee\7&\2\2\u00ee\u00f3"+
		"\5\"\22\2\u00ef\u00f0\7\r\2\2\u00f0\u00f2\5\"\22\2\u00f1\u00ef\3\2\2\2"+
		"\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\'\2\2\u00f7\u0134\3\2\2\2\u00f8"+
		"\u00f9\7,\2\2\u00f9\u00fa\7*\2\2\u00fa\u00ff\7,\2\2\u00fb\u00fc\7*\2\2"+
		"\u00fc\u00fe\7,\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0103\7&\2\2\u0103\u0108\5\"\22\2\u0104\u0105\7\r\2\2\u0105\u0107\5\""+
		"\22\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7\'"+
		"\2\2\u010c\u0134\3\2\2\2\u010d\u010e\7,\2\2\u010e\u010f\7*\2\2\u010f\u0114"+
		"\7,\2\2\u0110\u0111\7*\2\2\u0111\u0113\7,\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0134\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7#\2\2\u0118\u0134\5\"\22\26\u0119"+
		"\u011a\7\27\2\2\u011a\u011b\5\24\13\2\u011b\u011c\7$\2\2\u011c\u011d\7"+
		"-\2\2\u011d\u0123\7%\2\2\u011e\u011f\7$\2\2\u011f\u0120\7-\2\2\u0120\u0122"+
		"\7%\2\2\u0121\u011e\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0134\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\27"+
		"\2\2\u0127\u0128\7,\2\2\u0128\u0129\7&\2\2\u0129\u0134\7\'\2\2\u012a\u0134"+
		"\7-\2\2\u012b\u0134\7.\2\2\u012c\u0134\7+\2\2\u012d\u0134\7,\2\2\u012e"+
		"\u0134\7\30\2\2\u012f\u0130\7&\2\2\u0130\u0131\5\"\22\2\u0131\u0132\7"+
		"\'\2\2\u0132\u0134\3\2\2\2\u0133\u00de\3\2\2\2\u0133\u00ec\3\2\2\2\u0133"+
		"\u00f8\3\2\2\2\u0133\u010d\3\2\2\2\u0133\u0117\3\2\2\2\u0133\u0119\3\2"+
		"\2\2\u0133\u0126\3\2\2\2\u0133\u012a\3\2\2\2\u0133\u012b\3\2\2\2\u0133"+
		"\u012c\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u012e\3\2\2\2\u0133\u012f\3\2"+
		"\2\2\u0134\u0158\3\2\2\2\u0135\u0136\f\23\2\2\u0136\u0137\7\"\2\2\u0137"+
		"\u0157\5\"\22\24\u0138\u0139\f\22\2\2\u0139\u013a\7!\2\2\u013a\u0157\5"+
		"\"\22\23\u013b\u013c\f\21\2\2\u013c\u013d\7\37\2\2\u013d\u0157\5\"\22"+
		"\22\u013e\u013f\f\20\2\2\u013f\u0140\7 \2\2\u0140\u0157\5\"\22\21\u0141"+
		"\u0142\f\17\2\2\u0142\u0143\7\32\2\2\u0143\u0157\5\"\22\20\u0144\u0145"+
		"\f\16\2\2\u0145\u0146\7\34\2\2\u0146\u0157\5\"\22\17\u0147\u0148\f\r\2"+
		"\2\u0148\u0149\7\33\2\2\u0149\u0157\5\"\22\16\u014a\u014b\f\f\2\2\u014b"+
		"\u014c\7\35\2\2\u014c\u0157\5\"\22\r\u014d\u014e\f\13\2\2\u014e\u014f"+
		"\7\36\2\2\u014f\u0157\5\"\22\f\u0150\u0151\f\n\2\2\u0151\u0152\7\31\2"+
		"\2\u0152\u0157\5\"\22\13\u0153\u0154\f\t\2\2\u0154\u0155\7\62\2\2\u0155"+
		"\u0157\5\"\22\n\u0156\u0135\3\2\2\2\u0156\u0138\3\2\2\2\u0156\u013b\3"+
		"\2\2\2\u0156\u013e\3\2\2\2\u0156\u0141\3\2\2\2\u0156\u0144\3\2\2\2\u0156"+
		"\u0147\3\2\2\2\u0156\u014a\3\2\2\2\u0156\u014d\3\2\2\2\u0156\u0150\3\2"+
		"\2\2\u0156\u0153\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159#\3\2\2\2\u015a\u0158\3\2\2\2\30\'CIO_kty\u008e\u0096"+
		"\u009d\u00cf\u00d6\u00e9\u00f3\u00ff\u0108\u0114\u0123\u0133\u0156\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}


    public enum Type {
        INT, INT_ARR, FLOAT, FLOAT_ARR, CHAR, CHAR_ARR, BOOLEAN, BOOLEAN_ARR, VOID, CLASS1, CLASS2, CLASS3, CLASS4,
        CLASS5, CLASS6, CLASS7, CLASS8, CLASS9, CLASS10, CLASS11, CLASS12, CLASS13, CLASS14, CLASS15, CLASS16, CLASS17,
        CLASS18, CLASS19, CLASS20, CLASS21, CLASS22, CLASS23, CLASS24, CLASS25,  CLASS1_ARR, CLASS2_ARR, CLASS3_ARR, CLASS4_ARR,
        CLASS5_ARR, CLASS6_ARR, CLASS7_ARR, CLASS8_ARR, CLASS9_ARR, CLASS10_ARR, CLASS11_ARR, CLASS12_ARR, CLASS13_ARR, CLASS14_ARR, CLASS15_ARR, CLASS16_ARR, CLASS17_ARR,
        CLASS18_ARR, CLASS19_ARR, CLASS20_ARR, CLASS21_ARR, CLASS22_ARR, CLASS23_ARR, CLASS24_ARR, CLASS25_ARR;

        public String className = null;
        public static EnumSet<JavaParser.Type> ARRAY = EnumSet.of(INT_ARR, FLOAT_ARR, BOOLEAN_ARR, CHAR_ARR, CLASS1_ARR, CLASS2_ARR, CLASS3_ARR, CLASS4_ARR,
                CLASS5_ARR, CLASS6_ARR, CLASS7_ARR, CLASS8_ARR, CLASS9_ARR, CLASS10_ARR, CLASS11_ARR, CLASS12_ARR, CLASS13_ARR, CLASS14_ARR, CLASS15_ARR, CLASS16_ARR, CLASS17_ARR,
                CLASS18_ARR, CLASS19_ARR, CLASS20_ARR, CLASS21_ARR, CLASS22_ARR, CLASS23_ARR, CLASS24_ARR, CLASS25_ARR);

        public static EnumSet<JavaParser.Type> ARITHEMATIC = EnumSet.of(INT, FLOAT, BOOLEAN, CHAR);
        public static EnumSet<JavaParser.Type> CHARS = EnumSet.of(INT, BOOLEAN, CHAR);
        public static EnumSet<JavaParser.Type> NON_ARRAY = EnumSet.of(INT, FLOAT, CHAR, BOOLEAN, CLASS1, CLASS2, CLASS3, CLASS4,
                CLASS5, CLASS6, CLASS7, CLASS8, CLASS9, CLASS10, CLASS11, CLASS12, CLASS13, CLASS14, CLASS15, CLASS16, CLASS17,
                CLASS18, CLASS19, CLASS20, CLASS21, CLASS22, CLASS23, CLASS24, CLASS25);
        public static EnumSet<JavaParser.Type> CLASS = EnumSet.of(CLASS1, CLASS2, CLASS3, CLASS4,
                CLASS5, CLASS6, CLASS7, CLASS8, CLASS9, CLASS10, CLASS11, CLASS12, CLASS13, CLASS14, CLASS15, CLASS16, CLASS17,
                CLASS18, CLASS19, CLASS20, CLASS21, CLASS22, CLASS23, CLASS24, CLASS25);

        // Dynamic types also reuired!
        public static JavaParser.Type arrToNormal(JavaParser.Type type) {
            switch (type) {
                case INT_ARR:
                    return INT;
                case CHAR_ARR:
                    return CHAR;
                case FLOAT_ARR:
                    return FLOAT;
                case BOOLEAN_ARR:
                    return BOOLEAN;
                default:
                    return VOID;
            }
        }

        public static JavaParser.Type getType(int i){
            return JavaParser.Type.values()[8+i];
        }

        public static boolean isClassType(JavaParser.Type myType){
            return CLASS.contains(myType);
        }


    }
}