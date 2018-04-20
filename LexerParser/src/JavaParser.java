// Generated from /media/shubham/GyanSangraha/Courses/CS335/Compiler_Design/LexerParser/src/Java.g4 by ANTLR 4.7
package src;

import IRCode.src.IRCode.ThreeAddCode;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.EnumSet;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, AND = 24, LT = 25,
            LTE = 26, GT = 27, GTE = 28, EQU = 29, PLUS = 30, MINUS = 31, TIMES = 32, POWER = 33,
            NOT = 34, LSB = 35, RSB = 36, LP = 37, RP = 38, RETURN = 39, EQ = 40, REF = 41, BooleanLiteral = 42,
            Identifier = 43, IntegerLiteral = 44, DecimalLiteral = 45, WS = 46, MULTILINE_COMMENT = 47,
            LINE_COMMENT = 48, OR = 49;
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
            "'if'", "'else'", "'while'", "'for'", "'println'", "'print'", "'new'",
            "'this'", "'&&'", "'<'", "'<='", "'>'", "'>='", "'=='", "'+'", "'-'",
            "'*'", "'**'", "'!'", "'['", "']'", "'('", "')'", "'return'", "'='", "'.'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            "AND", "LT", "LTE", "GT", "GTE", "EQU", "PLUS", "MINUS", "TIMES", "POWER",
            "NOT", "LSB", "RSB", "LP", "RP", "RETURN", "EQ", "REF", "BooleanLiteral",
            "Identifier", "IntegerLiteral", "DecimalLiteral", "WS", "MULTILINE_COMMENT",
            "LINE_COMMENT", "OR"
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
    public String getGrammarFileName() {
        return "Java.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public JavaParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class GoalContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

        public MainClassContext mainClass() {
            return getRuleContext(MainClassContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(JavaParser.EOF, 0);
        }

        public List<ClassDeclarationContext> classDeclaration() {
            return getRuleContexts(ClassDeclarationContext.class);
        }

        public ClassDeclarationContext classDeclaration(int i) {
            return getRuleContext(ClassDeclarationContext.class, i);
        }

        public GoalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_goal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterGoal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitGoal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitGoal(this);
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
                _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(34);
                                classDeclaration();
                            }
                        }
                    }
                    setState(39);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
                }
                setState(40);
                mainClass();
                setState(41);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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

        public List<TerminalNode> Identifier() {
            return getTokens(JavaParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(JavaParser.Identifier, i);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public List<FieldDeclarationContext> fieldDeclaration() {
            return getRuleContexts(FieldDeclarationContext.class);
        }

        public FieldDeclarationContext fieldDeclaration(int i) {
            return getRuleContext(FieldDeclarationContext.class, i);
        }

        public List<MethodDeclarationContext> methodDeclaration() {
            return getRuleContexts(MethodDeclarationContext.class);
        }

        public MethodDeclarationContext methodDeclaration(int i) {
            return getRuleContext(MethodDeclarationContext.class, i);
        }

        public MainClassContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mainClass;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterMainClass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitMainClass(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitMainClass(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MainClassContext mainClass() throws RecognitionException {
        MainClassContext _localctx = new MainClassContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_mainClass);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(43);
                match(T__0);
                setState(44);
                match(Identifier);
                setState(45);
                match(T__1);
                setState(49);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Identifier))) != 0)) {
                    {
                        {
                            setState(46);
                            fieldDeclaration();
                        }
                    }
                    setState(51);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(55);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(52);
                                methodDeclaration();
                            }
                        }
                    }
                    setState(57);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                }
                setState(58);
                match(T__2);
                setState(59);
                match(T__3);
                setState(60);
                match(T__4);
                setState(61);
                match(T__5);
                setState(62);
                match(LP);
                setState(63);
                match(T__6);
                setState(64);
                match(LSB);
                setState(65);
                match(RSB);
                setState(66);
                match(Identifier);
                setState(67);
                match(RP);
                setState(68);
                match(T__1);
                setState(69);
                statement();
                setState(70);
                match(T__7);
                setState(71);
                match(T__7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(FieldDeclarationContext.class, i);
        }

        public List<MethodDeclarationContext> methodDeclaration() {
            return getRuleContexts(MethodDeclarationContext.class);
        }

        public MethodDeclarationContext methodDeclaration(int i) {
            return getRuleContext(MethodDeclarationContext.class, i);
        }

        public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterClassDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitClassDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitClassDeclaration(this);
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
                setState(73);
                match(T__0);
                setState(74);
                match(Identifier);
                setState(77);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__8) {
                    {
                        setState(75);
                        match(T__8);
                        setState(76);
                        match(Identifier);
                    }
                }

                setState(79);
                match(T__1);
                setState(83);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Identifier))) != 0)) {
                    {
                        {
                            setState(80);
                            fieldDeclaration();
                        }
                    }
                    setState(85);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(89);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(86);
                            methodDeclaration();
                        }
                    }
                    setState(91);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(92);
                match(T__7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(VarDeclarationContext.class, 0);
        }

        public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterFieldDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitFieldDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitFieldDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
        FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_fieldDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(94);
                varDeclaration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(TypeDimContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterVarDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitVarDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitVarDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VarDeclarationContext varDeclaration() throws RecognitionException {
        VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_varDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(96);
                typeDim();
                setState(97);
                match(Identifier);
                setState(98);
                match(T__9);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(TypeDimContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public MethodBodyContext methodBody() {
            return getRuleContext(MethodBodyContext.class, 0);
        }

        public ParameterListContext parameterList() {
            return getRuleContext(ParameterListContext.class, 0);
        }

        public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterMethodDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitMethodDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitMethodDeclaration(this);
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
                setState(100);
                match(T__2);
                setState(101);
                typeDim();
                setState(102);
                match(Identifier);
                setState(103);
                match(LP);
                setState(105);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Identifier))) != 0)) {
                    {
                        setState(104);
                        parameterList();
                    }
                }

                setState(107);
                match(RP);
                setState(108);
                match(T__1);
                setState(109);
                methodBody();
                setState(110);
                match(T__7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
        public List<JavaParser.Type> paramList = new ArrayList<Type>();

        public List<ParameterContext> parameter() {
            return getRuleContexts(ParameterContext.class);
        }

        public ParameterContext parameter(int i) {
            return getRuleContext(ParameterContext.class, i);
        }

        public ParameterListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameterList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterParameterList(this);
            for (int i = 0; i < this.getChildCount(); i++) {
                if (this.getChild(i) instanceof JavaParser.ParameterContext) {
                    paramList.add(MyJavaListener.getType(this.getChild(i).getChild(0).getText()));
                }
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitParameterList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitParameterList(this);
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
                setState(112);
                parameter();
                setState(117);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(113);
                            match(T__10);
                            setState(114);
                            parameter();
                        }
                    }
                    setState(119);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(TypeDimContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public ParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitParameter(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParameterContext parameter() throws RecognitionException {
        ParameterContext _localctx = new ParameterContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_parameter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(120);
                typeDim();
                setState(121);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodBodyContext extends ParserRuleContext {
        public TerminalNode RETURN() {
            return getToken(JavaParser.RETURN, 0);
        }

        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public MethodBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterMethodBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitMethodBody(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitMethodBody(this);
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
                setState(126);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << Identifier))) != 0)) {
                    {
                        {
                            setState(123);
                            statement();
                        }
                    }
                    setState(128);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(129);
                match(RETURN);
                setState(131);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << NOT) | (1L << LP) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0)) {
                    {
                        setState(130);
                        expression(0);
                    }
                }

                setState(133);
                match(T__9);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;
        public Type type;   //  initialize type value for this token

        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitType(this);
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
                setState(135);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Identifier))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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

        public void setDimCount(int count) {
            numberOfDimensions = count;
        }

        public DimsContext dims() {
            return getRuleContext(DimsContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public TypeDimContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeDim;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterTypeDim(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitTypeDim(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitTypeDim(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TypeDimContext typeDim() throws RecognitionException {
        TypeDimContext _localctx = new TypeDimContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_typeDim);
        try {
            setState(152);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(137);
                    match(T__11);
                    setState(138);
                    dims();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(139);
                    match(T__12);
                    setState(140);
                    dims();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(141);
                    match(T__13);
                    setState(142);
                    dims();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(143);
                    match(T__14);
                    setState(144);
                    dims();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(145);
                    match(Identifier);
                    setState(146);
                    dims();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(147);
                    match(T__11);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(148);
                    match(T__12);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(149);
                    match(T__13);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(150);
                    match(T__14);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(151);
                    match(Identifier);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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

        @Override
        public int getRuleIndex() {
            return RULE_dims;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterDims(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitDims(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitDims(this);
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
                setState(154);
                match(LSB);
                setState(155);
                match(RSB);
                setState(160);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LSB) {
                    {
                        {
                            setState(156);
                            match(LSB);
                            setState(157);
                            match(RSB);
                        }
                    }
                    setState(162);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        public StatementContext() {
        }

        public void copyFrom(StatementContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class WhileStatementContext extends StatementContext {
        public TerminalNode LP() {
            return getToken(JavaParser.LP, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RP() {
            return getToken(JavaParser.RP, 0);
        }

        public WhileBlockContext whileBlock() {
            return getRuleContext(WhileBlockContext.class, 0);
        }

        public WhileStatementContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterWhileStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitWhileStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitWhileStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintStatementContext extends StatementContext {
        public TerminalNode LP() {
            return getToken(JavaParser.LP, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RP() {
            return getToken(JavaParser.RP, 0);
        }

        public PrintStatementContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterPrintStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitPrintStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitPrintStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MethodCallStatementContext extends StatementContext {
        public List<TerminalNode> Identifier() {
            return getTokens(JavaParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(JavaParser.Identifier, i);
        }

        public List<TerminalNode> REF() {
            return getTokens(JavaParser.REF);
        }

        public TerminalNode REF(int i) {
            return getToken(JavaParser.REF, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public MethodCallStatementContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterMethodCallStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitMethodCallStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitMethodCallStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfElseStatementContext extends StatementContext {
        public TerminalNode LP() {
            return getToken(JavaParser.LP, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RP() {
            return getToken(JavaParser.RP, 0);
        }

        public IfBlockContext ifBlock() {
            return getRuleContext(IfBlockContext.class, 0);
        }

        public ElseBlockContext elseBlock() {
            return getRuleContext(ElseBlockContext.class, 0);
        }

        public IfElseStatementContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterIfElseStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitIfElseStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitIfElseStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VariableAssignmentStatementContext extends StatementContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public TerminalNode EQ() {
            return getToken(JavaParser.EQ, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public VariableAssignmentStatementContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterVariableAssignmentStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitVariableAssignmentStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitVariableAssignmentStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ForStatementContext extends StatementContext {
        public TerminalNode LP() {
            return getToken(JavaParser.LP, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RP() {
            return getToken(JavaParser.RP, 0);
        }

        public WhileBlockContext whileBlock() {
            return getRuleContext(WhileBlockContext.class, 0);
        }

        public ForStatementContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterForStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitForStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitForStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjectAssignmentStatementContext extends StatementContext {
        public List<TerminalNode> Identifier() {
            return getTokens(JavaParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(JavaParser.Identifier, i);
        }

        public List<TerminalNode> REF() {
            return getTokens(JavaParser.REF);
        }

        public TerminalNode REF(int i) {
            return getToken(JavaParser.REF, i);
        }

        public TerminalNode EQ() {
            return getToken(JavaParser.EQ, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ObjectAssignmentStatementContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterObjectAssignmentStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitObjectAssignmentStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitObjectAssignmentStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArrayAssignmentStatementContext extends StatementContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public List<TerminalNode> LSB() {
            return getTokens(JavaParser.LSB);
        }

        public TerminalNode LSB(int i) {
            return getToken(JavaParser.LSB, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> RSB() {
            return getTokens(JavaParser.RSB);
        }

        public TerminalNode RSB(int i) {
            return getToken(JavaParser.RSB, i);
        }

        public TerminalNode EQ() {
            return getToken(JavaParser.EQ, 0);
        }

        public ArrayAssignmentStatementContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterArrayAssignmentStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitArrayAssignmentStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitArrayAssignmentStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DeclarationContext extends StatementContext {
        public FieldDeclarationContext fieldDeclaration() {
            return getRuleContext(FieldDeclarationContext.class, 0);
        }

        public DeclarationContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintlnStatementContext extends StatementContext {
        public TerminalNode LP() {
            return getToken(JavaParser.LP, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RP() {
            return getToken(JavaParser.RP, 0);
        }

        public PrintlnStatementContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterPrintlnStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitPrintlnStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitPrintlnStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NestedStatementContext extends StatementContext {
        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public NestedStatementContext(StatementContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterNestedStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitNestedStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitNestedStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_statement);
        int _la;
        try {
            setState(265);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1:
                    _localctx = new NestedStatementContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(163);
                    match(T__1);
                    setState(167);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << Identifier))) != 0)) {
                        {
                            {
                                setState(164);
                                statement();
                            }
                        }
                        setState(169);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(170);
                    match(T__7);
                }
                break;
                case 2:
                    _localctx = new DeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(171);
                    fieldDeclaration();
                }
                break;
                case 3:
                    _localctx = new IfElseStatementContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(172);
                    match(T__15);
                    setState(173);
                    match(LP);
                    setState(174);
                    expression(0);
                    setState(175);
                    match(RP);
                    setState(176);
                    ifBlock();
                    setState(177);
                    match(T__16);
                    setState(178);
                    elseBlock();
                }
                break;
                case 4:
                    _localctx = new WhileStatementContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(180);
                    match(T__17);
                    setState(181);
                    match(LP);
                    setState(182);
                    expression(0);
                    setState(183);
                    match(RP);
                    setState(184);
                    whileBlock();
                }
                break;
                case 5:
                    _localctx = new ForStatementContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(186);
                    match(T__18);
                    setState(187);
                    match(LP);
                    setState(188);
                    statement();
                    setState(189);
                    match(T__9);
                    setState(190);
                    expression(0);
                    setState(191);
                    match(T__9);
                    setState(192);
                    statement();
                    setState(193);
                    match(RP);
                    setState(194);
                    whileBlock();
                }
                break;
                case 6:
                    _localctx = new PrintlnStatementContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(196);
                    match(T__19);
                    setState(197);
                    match(LP);
                    setState(198);
                    expression(0);
                    setState(199);
                    match(RP);
                    setState(200);
                    match(T__9);
                }
                break;
                case 7:
                    _localctx = new PrintStatementContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(202);
                    match(T__20);
                    setState(203);
                    match(LP);
                    setState(204);
                    expression(0);
                    setState(205);
                    match(RP);
                    setState(206);
                    match(T__9);
                }
                break;
                case 8:
                    _localctx = new VariableAssignmentStatementContext(_localctx);
                    enterOuterAlt(_localctx, 8);
                {
                    setState(208);
                    match(Identifier);
                    setState(209);
                    match(EQ);
                    setState(210);
                    expression(0);
                    setState(211);
                    match(T__9);
                }
                break;
                case 9:
                    _localctx = new ArrayAssignmentStatementContext(_localctx);
                    enterOuterAlt(_localctx, 9);
                {
                    setState(213);
                    match(Identifier);
                    setState(214);
                    match(LSB);
                    setState(215);
                    expression(0);
                    setState(216);
                    match(RSB);
                    setState(223);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LSB) {
                        {
                            {
                                setState(217);
                                match(LSB);
                                setState(218);
                                expression(0);
                                setState(219);
                                match(RSB);
                            }
                        }
                        setState(225);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(226);
                    match(EQ);
                    setState(227);
                    expression(0);
                    setState(228);
                    match(T__9);
                }
                break;
                case 10:
                    _localctx = new ObjectAssignmentStatementContext(_localctx);
                    enterOuterAlt(_localctx, 10);
                {
                    setState(230);
                    match(Identifier);
                    setState(231);
                    match(REF);
                    setState(232);
                    match(Identifier);
                    setState(237);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == REF) {
                        {
                            {
                                setState(233);
                                match(REF);
                                setState(234);
                                match(Identifier);
                            }
                        }
                        setState(239);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(240);
                    match(EQ);
                    setState(241);
                    expression(0);
                    setState(242);
                    match(T__9);
                }
                break;
                case 11:
                    _localctx = new MethodCallStatementContext(_localctx);
                    enterOuterAlt(_localctx, 11);
                {
                    setState(244);
                    match(Identifier);
                    setState(249);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == REF) {
                        {
                            {
                                setState(245);
                                match(REF);
                                setState(246);
                                match(Identifier);
                            }
                        }
                        setState(251);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(252);
                    match(LP);
                    setState(261);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << NOT) | (1L << LP) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0)) {
                        {
                            setState(253);
                            expression(0);
                            setState(258);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__10) {
                                {
                                    {
                                        setState(254);
                                        match(T__10);
                                        setState(255);
                                        expression(0);
                                    }
                                }
                                setState(260);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(263);
                    match(RP);
                    setState(264);
                    match(T__9);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(StatementContext.class, 0);
        }

        public IfBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifBlock;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterIfBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitIfBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitIfBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IfBlockContext ifBlock() throws RecognitionException {
        IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_ifBlock);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(267);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(StatementContext.class, 0);
        }

        public ElseBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseBlock;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterElseBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitElseBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitElseBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ElseBlockContext elseBlock() throws RecognitionException {
        ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_elseBlock);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(269);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(StatementContext.class, 0);
        }

        public WhileBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whileBlock;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterWhileBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitWhileBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitWhileBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WhileBlockContext whileBlock() throws RecognitionException {
        WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_whileBlock);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(271);
                statement();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        public ExpressionContext() {
        }

        public void copyFrom(ExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class LtExpressionContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode LT() {
            return getToken(JavaParser.LT, 0);
        }

        public LtExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterLtExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitLtExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitLtExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjectInstantiationExpressionContext extends ExpressionContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public ObjectInstantiationExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterObjectInstantiationExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitObjectInstantiationExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitObjectInstantiationExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class GtExpressionContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode GT() {
            return getToken(JavaParser.GT, 0);
        }

        public GtExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterGtExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitGtExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitGtExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArrayInstantiationExpressionContext extends ExpressionContext {
        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public List<TerminalNode> LSB() {
            return getTokens(JavaParser.LSB);
        }

        public TerminalNode LSB(int i) {
            return getToken(JavaParser.LSB, i);
        }

        public List<TerminalNode> IntegerLiteral() {
            return getTokens(JavaParser.IntegerLiteral);
        }

        public TerminalNode IntegerLiteral(int i) {
            return getToken(JavaParser.IntegerLiteral, i);
        }

        public List<TerminalNode> RSB() {
            return getTokens(JavaParser.RSB);
        }

        public TerminalNode RSB(int i) {
            return getToken(JavaParser.RSB, i);
        }

        public ArrayInstantiationExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterArrayInstantiationExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitArrayInstantiationExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitArrayInstantiationExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PowExpressionContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode POWER() {
            return getToken(JavaParser.POWER, 0);
        }

        public PowExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterPowExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitPowExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitPowExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierExpressionContext extends ExpressionContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public IdentifierExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterIdentifierExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitIdentifierExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitIdentifierExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MethodCallExpressionContext extends ExpressionContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public MethodCallExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterMethodCallExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitMethodCallExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitMethodCallExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NotExpressionContext extends ExpressionContext {
        public TerminalNode NOT() {
            return getToken(JavaParser.NOT, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public NotExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterNotExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitNotExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitNotExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BooleanLitExpressionContext extends ExpressionContext {
        public TerminalNode BooleanLiteral() {
            return getToken(JavaParser.BooleanLiteral, 0);
        }

        public BooleanLitExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterBooleanLitExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitBooleanLitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitBooleanLitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParenExpressionContext extends ExpressionContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ParenExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterParenExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitParenExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitParenExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IntLitExpressionContext extends ExpressionContext {
        public TerminalNode IntegerLiteral() {
            return getToken(JavaParser.IntegerLiteral, 0);
        }

        public IntLitExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterIntLitExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitIntLitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitIntLitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DecLitExpressionContext extends ExpressionContext {
        public TerminalNode DecimalLiteral() {
            return getToken(JavaParser.DecimalLiteral, 0);
        }

        public DecLitExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterDecLitExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitDecLitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitDecLitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjectMethodCallExpressionContext extends ExpressionContext {
        public List<TerminalNode> Identifier() {
            return getTokens(JavaParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(JavaParser.Identifier, i);
        }

        public List<TerminalNode> REF() {
            return getTokens(JavaParser.REF);
        }

        public TerminalNode REF(int i) {
            return getToken(JavaParser.REF, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public ObjectMethodCallExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterObjectMethodCallExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitObjectMethodCallExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitObjectMethodCallExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class GteExpressionContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode GTE() {
            return getToken(JavaParser.GTE, 0);
        }

        public GteExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterGteExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitGteExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitGteExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EquExpressionContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode EQU() {
            return getToken(JavaParser.EQU, 0);
        }

        public EquExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterEquExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitEquExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitEquExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArrayAccessExpressionContext extends ExpressionContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public List<TerminalNode> LSB() {
            return getTokens(JavaParser.LSB);
        }

        public TerminalNode LSB(int i) {
            return getToken(JavaParser.LSB, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> RSB() {
            return getTokens(JavaParser.RSB);
        }

        public TerminalNode RSB(int i) {
            return getToken(JavaParser.RSB, i);
        }

        public ArrayAccessExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterArrayAccessExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitArrayAccessExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitArrayAccessExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AndExpressionContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(JavaParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(JavaParser.OR, 0);
        }

        public AndExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterAndExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitAndExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitAndExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AddExpressionContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode PLUS() {
            return getToken(JavaParser.PLUS, 0);
        }

        public AddExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterAddExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitAddExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitAddExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ThisExpressionContext extends ExpressionContext {
        public ThisExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterThisExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitThisExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitThisExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LteExpressionContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode LTE() {
            return getToken(JavaParser.LTE, 0);
        }

        public LteExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterLteExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitLteExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitLteExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjectVariableReferenceExpressionContext extends ExpressionContext {
        public List<TerminalNode> Identifier() {
            return getTokens(JavaParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(JavaParser.Identifier, i);
        }

        public List<TerminalNode> REF() {
            return getTokens(JavaParser.REF);
        }

        public TerminalNode REF(int i) {
            return getToken(JavaParser.REF, i);
        }

        public ObjectVariableReferenceExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener)
                ((JavaListener) listener).enterObjectVariableReferenceExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitObjectVariableReferenceExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitObjectVariableReferenceExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SubExpressionContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode MINUS() {
            return getToken(JavaParser.MINUS, 0);
        }

        public SubExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterSubExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitSubExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitSubExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MulExpressionContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode TIMES() {
            return getToken(JavaParser.TIMES, 0);
        }

        public MulExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterMulExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitMulExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitMulExpression(this);
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
                setState(360);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                    case 1: {
                        _localctx = new ArrayAccessExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(274);
                        match(Identifier);
                        setState(275);
                        match(LSB);
                        setState(276);
                        expression(0);
                        setState(277);
                        match(RSB);
                        setState(284);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(278);
                                        match(LSB);
                                        setState(279);
                                        expression(0);
                                        setState(280);
                                        match(RSB);
                                    }
                                }
                            }
                            setState(286);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
                        }
                    }
                    break;
                    case 2: {
                        _localctx = new MethodCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(287);
                        match(Identifier);
                        setState(288);
                        match(LP);
                        setState(297);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << NOT) | (1L << LP) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0)) {
                            {
                                setState(289);
                                expression(0);
                                setState(294);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__10) {
                                    {
                                        {
                                            setState(290);
                                            match(T__10);
                                            setState(291);
                                            expression(0);
                                        }
                                    }
                                    setState(296);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(299);
                        match(RP);
                    }
                    break;
                    case 3: {
                        _localctx = new ObjectMethodCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(300);
                        match(Identifier);
                        setState(301);
                        match(REF);
                        setState(302);
                        match(Identifier);
                        setState(307);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == REF) {
                            {
                                {
                                    setState(303);
                                    match(REF);
                                    setState(304);
                                    match(Identifier);
                                }
                            }
                            setState(309);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(310);
                        match(LP);
                        setState(319);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << NOT) | (1L << LP) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0)) {
                            {
                                setState(311);
                                expression(0);
                                setState(316);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__10) {
                                    {
                                        {
                                            setState(312);
                                            match(T__10);
                                            setState(313);
                                            expression(0);
                                        }
                                    }
                                    setState(318);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(321);
                        match(RP);
                    }
                    break;
                    case 4: {
                        _localctx = new ObjectVariableReferenceExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(322);
                        match(Identifier);
                        setState(323);
                        match(REF);
                        setState(324);
                        match(Identifier);
                        setState(329);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(325);
                                        match(REF);
                                        setState(326);
                                        match(Identifier);
                                    }
                                }
                            }
                            setState(331);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
                        }
                    }
                    break;
                    case 5: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(332);
                        match(NOT);
                        setState(333);
                        expression(20);
                    }
                    break;
                    case 6: {
                        _localctx = new ArrayInstantiationExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(334);
                        match(T__21);
                        setState(335);
                        type();
                        setState(336);
                        match(LSB);
                        setState(337);
                        match(IntegerLiteral);
                        setState(338);
                        match(RSB);
                        setState(344);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(339);
                                        match(LSB);
                                        setState(340);
                                        match(IntegerLiteral);
                                        setState(341);
                                        match(RSB);
                                    }
                                }
                            }
                            setState(346);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                        }
                    }
                    break;
                    case 7: {
                        _localctx = new ObjectInstantiationExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(347);
                        match(T__21);
                        setState(348);
                        match(Identifier);
                        setState(349);
                        match(LP);
                        setState(350);
                        match(RP);
                    }
                    break;
                    case 8: {
                        _localctx = new IntLitExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(351);
                        match(IntegerLiteral);
                    }
                    break;
                    case 9: {
                        _localctx = new DecLitExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(352);
                        match(DecimalLiteral);
                    }
                    break;
                    case 10: {
                        _localctx = new BooleanLitExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(353);
                        match(BooleanLiteral);
                    }
                    break;
                    case 11: {
                        _localctx = new IdentifierExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(354);
                        match(Identifier);
                    }
                    break;
                    case 12: {
                        _localctx = new ThisExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(355);
                        match(T__22);
                    }
                    break;
                    case 13: {
                        _localctx = new ParenExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(356);
                        match(LP);
                        setState(357);
                        expression(0);
                        setState(358);
                        match(RP);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(397);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(395);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
                                case 1: {
                                    _localctx = new PowExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(362);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(363);
                                    match(POWER);
                                    setState(364);
                                    expression(18);
                                }
                                break;
                                case 2: {
                                    _localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(365);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(366);
                                    match(TIMES);
                                    setState(367);
                                    expression(17);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(368);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(369);
                                    match(PLUS);
                                    setState(370);
                                    expression(16);
                                }
                                break;
                                case 4: {
                                    _localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(371);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(372);
                                    match(MINUS);
                                    setState(373);
                                    expression(15);
                                }
                                break;
                                case 5: {
                                    _localctx = new LtExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(374);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(375);
                                    match(LT);
                                    setState(376);
                                    expression(14);
                                }
                                break;
                                case 6: {
                                    _localctx = new GtExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(377);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(378);
                                    match(GT);
                                    setState(379);
                                    expression(13);
                                }
                                break;
                                case 7: {
                                    _localctx = new LteExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(380);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(381);
                                    match(LTE);
                                    setState(382);
                                    expression(12);
                                }
                                break;
                                case 8: {
                                    _localctx = new GteExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(383);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(384);
                                    match(GTE);
                                    setState(385);
                                    expression(11);
                                }
                                break;
                                case 9: {
                                    _localctx = new EquExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(386);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(387);
                                    match(EQU);
                                    setState(388);
                                    expression(10);
                                }
                                break;
                                case 10: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(389);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(390);
                                    match(AND);
                                    setState(391);
                                    expression(9);
                                }
                                break;
                                case 11: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(392);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(393);
                                    match(OR);
                                    setState(394);
                                    expression(8);
                                }
                                break;
                            }
                        }
                    }
                    setState(399);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 16:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0193\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\62\n\3\f" +
                    "\3\16\3\65\13\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4P\n\4\3\4\3\4\7" +
                    "\4T\n\4\f\4\16\4W\13\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\5\3\5\3\6" +
                    "\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b" +
                    "\3\b\7\bv\n\b\f\b\16\by\13\b\3\t\3\t\3\t\3\n\7\n\177\n\n\f\n\16\n\u0082" +
                    "\13\n\3\n\3\n\5\n\u0086\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f" +
                    "\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009b\n\f\3\r\3\r\3\r\3\r\7\r" +
                    "\u00a1\n\r\f\r\16\r\u00a4\13\r\3\16\3\16\7\16\u00a8\n\16\f\16\16\16\u00ab" +
                    "\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16" +
                    "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16" +
                    "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16" +
                    "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00e0\n\16\f\16" +
                    "\16\16\u00e3\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ee" +
                    "\n\16\f\16\16\16\u00f1\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00fa" +
                    "\n\16\f\16\16\16\u00fd\13\16\3\16\3\16\3\16\3\16\7\16\u0103\n\16\f\16" +
                    "\16\16\u0106\13\16\5\16\u0108\n\16\3\16\3\16\5\16\u010c\n\16\3\17\3\17" +
                    "\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22" +
                    "\u011d\n\22\f\22\16\22\u0120\13\22\3\22\3\22\3\22\3\22\3\22\7\22\u0127" +
                    "\n\22\f\22\16\22\u012a\13\22\5\22\u012c\n\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\7\22\u0134\n\22\f\22\16\22\u0137\13\22\3\22\3\22\3\22\3\22\7\22" +
                    "\u013d\n\22\f\22\16\22\u0140\13\22\5\22\u0142\n\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\22\7\22\u014a\n\22\f\22\16\22\u014d\13\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0159\n\22\f\22\16\22\u015c\13\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22" +
                    "\u016b\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u018e\n\22\f\22\16\22\u0191\13" +
                    "\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\4\2\16" +
                    "\21--\2\u01c4\2\'\3\2\2\2\4-\3\2\2\2\6K\3\2\2\2\b`\3\2\2\2\nb\3\2\2\2" +
                    "\ff\3\2\2\2\16r\3\2\2\2\20z\3\2\2\2\22\u0080\3\2\2\2\24\u0089\3\2\2\2" +
                    "\26\u009a\3\2\2\2\30\u009c\3\2\2\2\32\u010b\3\2\2\2\34\u010d\3\2\2\2\36" +
                    "\u010f\3\2\2\2 \u0111\3\2\2\2\"\u016a\3\2\2\2$&\5\6\4\2%$\3\2\2\2&)\3" +
                    "\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\5\4\3\2+,\7\2\2\3" +
                    ",\3\3\2\2\2-.\7\3\2\2./\7-\2\2/\63\7\4\2\2\60\62\5\b\5\2\61\60\3\2\2\2" +
                    "\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\649\3\2\2\2\65\63\3\2\2\2\66" +
                    "8\5\f\7\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3" +
                    "\2\2\2<=\7\5\2\2=>\7\6\2\2>?\7\7\2\2?@\7\b\2\2@A\7\'\2\2AB\7\t\2\2BC\7" +
                    "%\2\2CD\7&\2\2DE\7-\2\2EF\7(\2\2FG\7\4\2\2GH\5\32\16\2HI\7\n\2\2IJ\7\n" +
                    "\2\2J\5\3\2\2\2KL\7\3\2\2LO\7-\2\2MN\7\13\2\2NP\7-\2\2OM\3\2\2\2OP\3\2" +
                    "\2\2PQ\3\2\2\2QU\7\4\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2" +
                    "\2\2V[\3\2\2\2WU\3\2\2\2XZ\5\f\7\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3" +
                    "\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\n\2\2_\7\3\2\2\2`a\5\n\6\2a\t\3\2\2\2" +
                    "bc\5\26\f\2cd\7-\2\2de\7\f\2\2e\13\3\2\2\2fg\7\5\2\2gh\5\26\f\2hi\7-\2" +
                    "\2ik\7\'\2\2jl\5\16\b\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7(\2\2no\7\4\2" +
                    "\2op\5\22\n\2pq\7\n\2\2q\r\3\2\2\2rw\5\20\t\2st\7\r\2\2tv\5\20\t\2us\3" +
                    "\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\17\3\2\2\2yw\3\2\2\2z{\5\26\f\2" +
                    "{|\7-\2\2|\21\3\2\2\2}\177\5\32\16\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080" +
                    "~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2" +
                    "\u0083\u0085\7)\2\2\u0084\u0086\5\"\22\2\u0085\u0084\3\2\2\2\u0085\u0086" +
                    "\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\f\2\2\u0088\23\3\2\2\2\u0089" +
                    "\u008a\t\2\2\2\u008a\25\3\2\2\2\u008b\u008c\7\16\2\2\u008c\u009b\5\30" +
                    "\r\2\u008d\u008e\7\17\2\2\u008e\u009b\5\30\r\2\u008f\u0090\7\20\2\2\u0090" +
                    "\u009b\5\30\r\2\u0091\u0092\7\21\2\2\u0092\u009b\5\30\r\2\u0093\u0094" +
                    "\7-\2\2\u0094\u009b\5\30\r\2\u0095\u009b\7\16\2\2\u0096\u009b\7\17\2\2" +
                    "\u0097\u009b\7\20\2\2\u0098\u009b\7\21\2\2\u0099\u009b\7-\2\2\u009a\u008b" +
                    "\3\2\2\2\u009a\u008d\3\2\2\2\u009a\u008f\3\2\2\2\u009a\u0091\3\2\2\2\u009a" +
                    "\u0093\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2" +
                    "\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\27\3\2\2\2\u009c\u009d" +
                    "\7%\2\2\u009d\u00a2\7&\2\2\u009e\u009f\7%\2\2\u009f\u00a1\7&\2\2\u00a0" +
                    "\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2" +
                    "\2\2\u00a3\31\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a9\7\4\2\2\u00a6\u00a8" +
                    "\5\32\16\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2" +
                    "\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u010c" +
                    "\7\n\2\2\u00ad\u010c\5\b\5\2\u00ae\u00af\7\22\2\2\u00af\u00b0\7\'\2\2" +
                    "\u00b0\u00b1\5\"\22\2\u00b1\u00b2\7(\2\2\u00b2\u00b3\5\34\17\2\u00b3\u00b4" +
                    "\7\23\2\2\u00b4\u00b5\5\36\20\2\u00b5\u010c\3\2\2\2\u00b6\u00b7\7\24\2" +
                    "\2\u00b7\u00b8\7\'\2\2\u00b8\u00b9\5\"\22\2\u00b9\u00ba\7(\2\2\u00ba\u00bb" +
                    "\5 \21\2\u00bb\u010c\3\2\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\7\'\2\2" +
                    "\u00be\u00bf\5\32\16\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\5\"\22\2\u00c1" +
                    "\u00c2\7\f\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4\7(\2\2\u00c4\u00c5\5" +
                    " \21\2\u00c5\u010c\3\2\2\2\u00c6\u00c7\7\26\2\2\u00c7\u00c8\7\'\2\2\u00c8" +
                    "\u00c9\5\"\22\2\u00c9\u00ca\7(\2\2\u00ca\u00cb\7\f\2\2\u00cb\u010c\3\2" +
                    "\2\2\u00cc\u00cd\7\27\2\2\u00cd\u00ce\7\'\2\2\u00ce\u00cf\5\"\22\2\u00cf" +
                    "\u00d0\7(\2\2\u00d0\u00d1\7\f\2\2\u00d1\u010c\3\2\2\2\u00d2\u00d3\7-\2" +
                    "\2\u00d3\u00d4\7*\2\2\u00d4\u00d5\5\"\22\2\u00d5\u00d6\7\f\2\2\u00d6\u010c" +
                    "\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8\u00d9\7%\2\2\u00d9\u00da\5\"\22\2\u00da" +
                    "\u00e1\7&\2\2\u00db\u00dc\7%\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7&\2" +
                    "\2\u00de\u00e0\3\2\2\2\u00df\u00db\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df" +
                    "\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4" +
                    "\u00e5\7*\2\2\u00e5\u00e6\5\"\22\2\u00e6\u00e7\7\f\2\2\u00e7\u010c\3\2" +
                    "\2\2\u00e8\u00e9\7-\2\2\u00e9\u00ea\7+\2\2\u00ea\u00ef\7-\2\2\u00eb\u00ec" +
                    "\7+\2\2\u00ec\u00ee\7-\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef" +
                    "\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2" +
                    "\2\2\u00f2\u00f3\7*\2\2\u00f3\u00f4\5\"\22\2\u00f4\u00f5\7\f\2\2\u00f5" +
                    "\u010c\3\2\2\2\u00f6\u00fb\7-\2\2\u00f7\u00f8\7+\2\2\u00f8\u00fa\7-\2" +
                    "\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc" +
                    "\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0107\7\'\2\2\u00ff" +
                    "\u0104\5\"\22\2\u0100\u0101\7\r\2\2\u0101\u0103\5\"\22\2\u0102\u0100\3" +
                    "\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105" +
                    "\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0108\3\2" +
                    "\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7(\2\2\u010a\u010c\7\f\2\2\u010b" +
                    "\u00a5\3\2\2\2\u010b\u00ad\3\2\2\2\u010b\u00ae\3\2\2\2\u010b\u00b6\3\2" +
                    "\2\2\u010b\u00bc\3\2\2\2\u010b\u00c6\3\2\2\2\u010b\u00cc\3\2\2\2\u010b" +
                    "\u00d2\3\2\2\2\u010b\u00d7\3\2\2\2\u010b\u00e8\3\2\2\2\u010b\u00f6\3\2" +
                    "\2\2\u010c\33\3\2\2\2\u010d\u010e\5\32\16\2\u010e\35\3\2\2\2\u010f\u0110" +
                    "\5\32\16\2\u0110\37\3\2\2\2\u0111\u0112\5\32\16\2\u0112!\3\2\2\2\u0113" +
                    "\u0114\b\22\1\2\u0114\u0115\7-\2\2\u0115\u0116\7%\2\2\u0116\u0117\5\"" +
                    "\22\2\u0117\u011e\7&\2\2\u0118\u0119\7%\2\2\u0119\u011a\5\"\22\2\u011a" +
                    "\u011b\7&\2\2\u011b\u011d\3\2\2\2\u011c\u0118\3\2\2\2\u011d\u0120\3\2" +
                    "\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u016b\3\2\2\2\u0120" +
                    "\u011e\3\2\2\2\u0121\u0122\7-\2\2\u0122\u012b\7\'\2\2\u0123\u0128\5\"" +
                    "\22\2\u0124\u0125\7\r\2\2\u0125\u0127\5\"\22\2\u0126\u0124\3\2\2\2\u0127" +
                    "\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2" +
                    "\2\2\u012a\u0128\3\2\2\2\u012b\u0123\3\2\2\2\u012b\u012c\3\2\2\2\u012c" +
                    "\u012d\3\2\2\2\u012d\u016b\7(\2\2\u012e\u012f\7-\2\2\u012f\u0130\7+\2" +
                    "\2\u0130\u0135\7-\2\2\u0131\u0132\7+\2\2\u0132\u0134\7-\2\2\u0133\u0131" +
                    "\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136" +
                    "\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0141\7\'\2\2\u0139\u013e\5\"" +
                    "\22\2\u013a\u013b\7\r\2\2\u013b\u013d\5\"\22\2\u013c\u013a\3\2\2\2\u013d" +
                    "\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0142\3\2" +
                    "\2\2\u0140\u013e\3\2\2\2\u0141\u0139\3\2\2\2\u0141\u0142\3\2\2\2\u0142" +
                    "\u0143\3\2\2\2\u0143\u016b\7(\2\2\u0144\u0145\7-\2\2\u0145\u0146\7+\2" +
                    "\2\u0146\u014b\7-\2\2\u0147\u0148\7+\2\2\u0148\u014a\7-\2\2\u0149\u0147" +
                    "\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c" +
                    "\u016b\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7$\2\2\u014f\u016b\5\"" +
                    "\22\26\u0150\u0151\7\30\2\2\u0151\u0152\5\24\13\2\u0152\u0153\7%\2\2\u0153" +
                    "\u0154\7.\2\2\u0154\u015a\7&\2\2\u0155\u0156\7%\2\2\u0156\u0157\7.\2\2" +
                    "\u0157\u0159\7&\2\2\u0158\u0155\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158" +
                    "\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u016b\3\2\2\2\u015c\u015a\3\2\2\2\u015d" +
                    "\u015e\7\30\2\2\u015e\u015f\7-\2\2\u015f\u0160\7\'\2\2\u0160\u016b\7(" +
                    "\2\2\u0161\u016b\7.\2\2\u0162\u016b\7/\2\2\u0163\u016b\7,\2\2\u0164\u016b" +
                    "\7-\2\2\u0165\u016b\7\31\2\2\u0166\u0167\7\'\2\2\u0167\u0168\5\"\22\2" +
                    "\u0168\u0169\7(\2\2\u0169\u016b\3\2\2\2\u016a\u0113\3\2\2\2\u016a\u0121" +
                    "\3\2\2\2\u016a\u012e\3\2\2\2\u016a\u0144\3\2\2\2\u016a\u014e\3\2\2\2\u016a" +
                    "\u0150\3\2\2\2\u016a\u015d\3\2\2\2\u016a\u0161\3\2\2\2\u016a\u0162\3\2" +
                    "\2\2\u016a\u0163\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0165\3\2\2\2\u016a" +
                    "\u0166\3\2\2\2\u016b\u018f\3\2\2\2\u016c\u016d\f\23\2\2\u016d\u016e\7" +
                    "#\2\2\u016e\u018e\5\"\22\24\u016f\u0170\f\22\2\2\u0170\u0171\7\"\2\2\u0171" +
                    "\u018e\5\"\22\23\u0172\u0173\f\21\2\2\u0173\u0174\7 \2\2\u0174\u018e\5" +
                    "\"\22\22\u0175\u0176\f\20\2\2\u0176\u0177\7!\2\2\u0177\u018e\5\"\22\21" +
                    "\u0178\u0179\f\17\2\2\u0179\u017a\7\33\2\2\u017a\u018e\5\"\22\20\u017b" +
                    "\u017c\f\16\2\2\u017c\u017d\7\35\2\2\u017d\u018e\5\"\22\17\u017e\u017f" +
                    "\f\r\2\2\u017f\u0180\7\34\2\2\u0180\u018e\5\"\22\16\u0181\u0182\f\f\2" +
                    "\2\u0182\u0183\7\36\2\2\u0183\u018e\5\"\22\r\u0184\u0185\f\13\2\2\u0185" +
                    "\u0186\7\37\2\2\u0186\u018e\5\"\22\f\u0187\u0188\f\n\2\2\u0188\u0189\7" +
                    "\32\2\2\u0189\u018e\5\"\22\13\u018a\u018b\f\t\2\2\u018b\u018c\7\63\2\2" +
                    "\u018c\u018e\5\"\22\n\u018d\u016c\3\2\2\2\u018d\u016f\3\2\2\2\u018d\u0172" +
                    "\3\2\2\2\u018d\u0175\3\2\2\2\u018d\u0178\3\2\2\2\u018d\u017b\3\2\2\2\u018d" +
                    "\u017e\3\2\2\2\u018d\u0181\3\2\2\2\u018d\u0184\3\2\2\2\u018d\u0187\3\2" +
                    "\2\2\u018d\u018a\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f" +
                    "\u0190\3\2\2\2\u0190#\3\2\2\2\u0191\u018f\3\2\2\2 \'\639OU[kw\u0080\u0085" +
                    "\u009a\u00a2\u00a9\u00e1\u00ef\u00fb\u0104\u0107\u010b\u011e\u0128\u012b" +
                    "\u0135\u013e\u0141\u014b\u015a\u016a\u018d\u018f";
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
        CLASS18, CLASS19, CLASS20, CLASS21, CLASS22, CLASS23, CLASS24, CLASS25, CLASS1_ARR, CLASS2_ARR, CLASS3_ARR, CLASS4_ARR,
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

        public static JavaParser.Type getType(int i) {
            return JavaParser.Type.values()[8 + i];
        }

        public static boolean isClassType(JavaParser.Type myType) {
            return CLASS.contains(myType);
        }
    }
}