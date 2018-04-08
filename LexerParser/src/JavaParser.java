// Generated from /home/varun/IdeaProjects/Compiler_Design/LexerParser/src/Java.g4 by ANTLR 4.7
package src;

import IRCode.src.IRCode.ThreeAddCode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

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
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, AND = 23, LT = 24, PLUS = 25,
            MINUS = 26, TIMES = 27, POWER = 28, NOT = 29, LSB = 30, RSB = 31, DOTLENGTH = 32, LP = 33,
            RP = 34, RETURN = 35, EQ = 36, BooleanLiteral = 37, Identifier = 38, IntegerLiteral = 39,
            DecimalLiteral = 40, WS = 41, MULTILINE_COMMENT = 42, LINE_COMMENT = 43;
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
            "'&&'", "'<'", "'+'", "'-'", "'*'", "'**'", "'!'", "'['", "']'", "'.length'",
            "'('", "')'", "'return'", "'='"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, "AND",
            "LT", "PLUS", "MINUS", "TIMES", "POWER", "NOT", "LSB", "RSB", "DOTLENGTH",
            "LP", "RP", "RETURN", "EQ", "BooleanLiteral", "Identifier", "IntegerLiteral",
            "DecimalLiteral", "WS", "MULTILINE_COMMENT", "LINE_COMMENT"
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
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(34);
                mainClass();
                setState(38);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__0) {
                    {
                        {
                            setState(35);
                            classDeclaration();
                        }
                    }
                    setState(40);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
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
                setState(61);
                match(T__0);
                setState(62);
                match(Identifier);
                setState(65);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__8) {
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
                while (_la == T__2) {
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
                setState(82);
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

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
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
                setState(84);
                type();
                setState(85);
                match(Identifier);
                setState(86);
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

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
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
                setState(88);
                match(T__2);
                setState(89);
                type();
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
        public List<JavaParser.Type> paramList;

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
                setState(100);
                parameter();
                setState(105);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
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
                setState(108);
                typeDim();
                setState(109);
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
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

        public TerminalNode RETURN() {
            return getToken(JavaParser.RETURN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
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
                setState(118);
                expression(0);
                setState(119);
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
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

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
                setState(121);
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
            setState(138);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(123);
                    match(T__11);
                    setState(124);
                    dims();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(125);
                    match(T__12);
                    setState(126);
                    dims();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(127);
                    match(T__13);
                    setState(128);
                    dims();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(129);
                    match(T__14);
                    setState(130);
                    dims();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(131);
                    match(Identifier);
                    setState(132);
                    dims();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(133);
                    match(T__11);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(134);
                    match(T__12);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(135);
                    match(T__13);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(136);
                    match(T__14);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(137);
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
        public List<String> dimLength;

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
                setState(140);
                match(LSB);
                setState(141);
                match(RSB);
                setState(146);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LSB) {
                    {
                        {
                            setState(142);
                            match(LSB);
                            setState(143);
                            match(RSB);
                        }
                    }
                    setState(148);
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

    public static class ArrayAssignmentStatementContext extends StatementContext {
        public TerminalNode Identifier() {
            return getToken(JavaParser.Identifier, 0);
        }

        public TerminalNode LSB() {
            return getToken(JavaParser.LSB, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode RSB() {
            return getToken(JavaParser.RSB, 0);
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
            setState(201);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                case 1:
                    _localctx = new NestedStatementContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(149);
                    match(T__1);
                    setState(153);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << Identifier))) != 0)) {
                        {
                            {
                                setState(150);
                                statement();
                            }
                        }
                        setState(155);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(156);
                    match(T__7);
                }
                break;
                case 2:
                    _localctx = new DeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(157);
                    fieldDeclaration();
                }
                break;
                case 3:
                    _localctx = new IfElseStatementContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(158);
                    match(T__15);
                    setState(159);
                    match(LP);
                    setState(160);
                    expression(0);
                    setState(161);
                    match(RP);
                    setState(162);
                    ifBlock();
                    setState(163);
                    match(T__16);
                    setState(164);
                    elseBlock();
                }
                break;
                case 4:
                    _localctx = new WhileStatementContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(166);
                    match(T__17);
                    setState(167);
                    match(LP);
                    setState(168);
                    expression(0);
                    setState(169);
                    match(RP);
                    setState(170);
                    whileBlock();
                }
                break;
                case 5:
                    _localctx = new ForStatementContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(172);
                    match(T__18);
                    setState(173);
                    match(LP);
                    setState(174);
                    statement();
                    setState(175);
                    match(T__9);
                    setState(176);
                    expression(0);
                    setState(177);
                    match(T__9);
                    setState(178);
                    statement();
                    setState(179);
                    match(RP);
                    setState(180);
                    whileBlock();
                }
                break;
                case 6:
                    _localctx = new PrintStatementContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(182);
                    match(T__19);
                    setState(183);
                    match(LP);
                    setState(184);
                    expression(0);
                    setState(185);
                    match(RP);
                    setState(186);
                    match(T__9);
                }
                break;
                case 7:
                    _localctx = new VariableAssignmentStatementContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(188);
                    match(Identifier);
                    setState(189);
                    match(EQ);
                    setState(190);
                    expression(0);
                    setState(191);
                    match(T__9);
                }
                break;
                case 8:
                    _localctx = new ArrayAssignmentStatementContext(_localctx);
                    enterOuterAlt(_localctx, 8);
                {
                    setState(193);
                    match(Identifier);
                    setState(194);
                    match(LSB);
                    setState(195);
                    expression(0);
                    setState(196);
                    match(RSB);
                    setState(197);
                    match(EQ);
                    setState(198);
                    expression(0);
                    setState(199);
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
                setState(203);
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
                setState(205);
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
                setState(207);
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

    public static class ArrayInstantiationExpressionContext extends ExpressionContext {
        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode LSB() {
            return getToken(JavaParser.LSB, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RSB() {
            return getToken(JavaParser.RSB, 0);
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

    public static class ArrayAccessExpressionContext extends ExpressionContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode LSB() {
            return getToken(JavaParser.LSB, 0);
        }

        public TerminalNode RSB() {
            return getToken(JavaParser.RSB, 0);
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

    public static class ArrayLengthExpressionContext extends ExpressionContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode DOTLENGTH() {
            return getToken(JavaParser.DOTLENGTH, 0);
        }

        public ArrayLengthExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterArrayLengthExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitArrayLengthExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor)
                return ((JavaVisitor<? extends T>) visitor).visitArrayLengthExpression(this);
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
                setState(244);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                    case 1: {
                        _localctx = new MethodCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(210);
                        match(Identifier);
                        setState(211);
                        match(LP);
                        setState(220);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << NOT) | (1L << LP) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << DecimalLiteral))) != 0)) {
                            {
                                setState(212);
                                expression(0);
                                setState(217);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__10) {
                                    {
                                        {
                                            setState(213);
                                            match(T__10);
                                            setState(214);
                                            expression(0);
                                        }
                                    }
                                    setState(219);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(222);
                        match(RP);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(223);
                        match(NOT);
                        setState(224);
                        expression(15);
                    }
                    break;
                    case 3: {
                        _localctx = new ArrayInstantiationExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(225);
                        match(T__20);
                        setState(226);
                        type();
                        setState(227);
                        match(LSB);
                        setState(228);
                        expression(0);
                        setState(229);
                        match(RSB);
                    }
                    break;
                    case 4: {
                        _localctx = new ObjectInstantiationExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(231);
                        match(T__20);
                        setState(232);
                        match(Identifier);
                        setState(233);
                        match(LP);
                        setState(234);
                        match(RP);
                    }
                    break;
                    case 5: {
                        _localctx = new IntLitExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(235);
                        match(IntegerLiteral);
                    }
                    break;
                    case 6: {
                        _localctx = new DecLitExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(236);
                        match(DecimalLiteral);
                    }
                    break;
                    case 7: {
                        _localctx = new BooleanLitExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(237);
                        match(BooleanLiteral);
                    }
                    break;
                    case 8: {
                        _localctx = new IdentifierExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(238);
                        match(Identifier);
                    }
                    break;
                    case 9: {
                        _localctx = new ThisExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(239);
                        match(T__21);
                    }
                    break;
                    case 10: {
                        _localctx = new ParenExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(240);
                        match(LP);
                        setState(241);
                        expression(0);
                        setState(242);
                        match(RP);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(273);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(271);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                                case 1: {
                                    _localctx = new PowExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(246);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(247);
                                    match(POWER);
                                    setState(248);
                                    expression(13);
                                }
                                break;
                                case 2: {
                                    _localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(249);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(250);
                                    match(TIMES);
                                    setState(251);
                                    expression(12);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(252);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(253);
                                    match(PLUS);
                                    setState(254);
                                    expression(11);
                                }
                                break;
                                case 4: {
                                    _localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(255);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(256);
                                    match(MINUS);
                                    setState(257);
                                    expression(10);
                                }
                                break;
                                case 5: {
                                    _localctx = new LtExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(258);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(259);
                                    match(LT);
                                    setState(260);
                                    expression(9);
                                }
                                break;
                                case 6: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(261);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(262);
                                    match(AND);
                                    setState(263);
                                    expression(8);
                                }
                                break;
                                case 7: {
                                    _localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(264);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(265);
                                    match(LSB);
                                    setState(266);
                                    expression(0);
                                    setState(267);
                                    match(RSB);
                                }
                                break;
                                case 8: {
                                    _localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(269);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(270);
                                    match(DOTLENGTH);
                                }
                                break;
                            }
                        }
                    }
                    setState(275);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
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
                return precpred(_ctx, 12);
            case 1:
                return precpred(_ctx, 11);
            case 2:
                return precpred(_ctx, 10);
            case 3:
                return precpred(_ctx, 9);
            case 4:
                return precpred(_ctx, 8);
            case 5:
                return precpred(_ctx, 7);
            case 6:
                return precpred(_ctx, 18);
            case 7:
                return precpred(_ctx, 17);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0117\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4D\n\4" +
                    "\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\4\3\4\3" +
                    "\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\7\3\7\3\7\3\7\3" +
                    "\7\3\b\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\t\3\t\3\t\3\n\7\ns\n\n\f\n\16" +
                    "\nv\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f" +
                    "\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008d\n\f\3\r\3\r\3\r\3\r\7\r\u0093\n\r\f" +
                    "\r\16\r\u0096\13\r\3\16\3\16\7\16\u009a\n\16\f\16\16\16\u009d\13\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\5\16\u00cc\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\7\22\u00da\n\22\f\22\16\22\u00dd\13\22\5\22\u00df" +
                    "\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f7\n\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0112\n\22\f\22\16" +
                    "\22\u0115\13\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 " +
                    "\"\2\3\4\2\16\21((\2\u0131\2$\3\2\2\2\4-\3\2\2\2\6?\3\2\2\2\bT\3\2\2\2" +
                    "\nV\3\2\2\2\fZ\3\2\2\2\16f\3\2\2\2\20n\3\2\2\2\22t\3\2\2\2\24{\3\2\2\2" +
                    "\26\u008c\3\2\2\2\30\u008e\3\2\2\2\32\u00cb\3\2\2\2\34\u00cd\3\2\2\2\36" +
                    "\u00cf\3\2\2\2 \u00d1\3\2\2\2\"\u00f6\3\2\2\2$(\5\4\3\2%\'\5\6\4\2&%\3" +
                    "\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\2\2\3,\3" +
                    "\3\2\2\2-.\7\3\2\2./\7(\2\2/\60\7\4\2\2\60\61\7\5\2\2\61\62\7\6\2\2\62" +
                    "\63\7\7\2\2\63\64\7\b\2\2\64\65\7#\2\2\65\66\7\t\2\2\66\67\7 \2\2\678" +
                    "\7!\2\289\7(\2\29:\7$\2\2:;\7\4\2\2;<\5\32\16\2<=\7\n\2\2=>\7\n\2\2>\5" +
                    "\3\2\2\2?@\7\3\2\2@C\7(\2\2AB\7\13\2\2BD\7(\2\2CA\3\2\2\2CD\3\2\2\2DE" +
                    "\3\2\2\2EI\7\4\2\2FH\5\b\5\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J" +
                    "O\3\2\2\2KI\3\2\2\2LN\5\f\7\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2" +
                    "PR\3\2\2\2QO\3\2\2\2RS\7\n\2\2S\7\3\2\2\2TU\5\n\6\2U\t\3\2\2\2VW\5\24" +
                    "\13\2WX\7(\2\2XY\7\f\2\2Y\13\3\2\2\2Z[\7\5\2\2[\\\5\24\13\2\\]\7(\2\2" +
                    "]_\7#\2\2^`\5\16\b\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7$\2\2bc\7\4\2\2" +
                    "cd\5\22\n\2de\7\n\2\2e\r\3\2\2\2fk\5\20\t\2gh\7\r\2\2hj\5\20\t\2ig\3\2" +
                    "\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mk\3\2\2\2no\5\26\f\2op" +
                    "\7(\2\2p\21\3\2\2\2qs\5\32\16\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2" +
                    "\2uw\3\2\2\2vt\3\2\2\2wx\7%\2\2xy\5\"\22\2yz\7\f\2\2z\23\3\2\2\2{|\t\2" +
                    "\2\2|\25\3\2\2\2}~\7\16\2\2~\u008d\5\30\r\2\177\u0080\7\17\2\2\u0080\u008d" +
                    "\5\30\r\2\u0081\u0082\7\20\2\2\u0082\u008d\5\30\r\2\u0083\u0084\7\21\2" +
                    "\2\u0084\u008d\5\30\r\2\u0085\u0086\7(\2\2\u0086\u008d\5\30\r\2\u0087" +
                    "\u008d\7\16\2\2\u0088\u008d\7\17\2\2\u0089\u008d\7\20\2\2\u008a\u008d" +
                    "\7\21\2\2\u008b\u008d\7(\2\2\u008c}\3\2\2\2\u008c\177\3\2\2\2\u008c\u0081" +
                    "\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0087\3\2\2\2\u008c" +
                    "\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2" +
                    "\2\2\u008d\27\3\2\2\2\u008e\u008f\7 \2\2\u008f\u0094\7!\2\2\u0090\u0091" +
                    "\7 \2\2\u0091\u0093\7!\2\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094" +
                    "\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\31\3\2\2\2\u0096\u0094\3\2\2" +
                    "\2\u0097\u009b\7\4\2\2\u0098\u009a\5\32\16\2\u0099\u0098\3\2\2\2\u009a" +
                    "\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2" +
                    "\2\2\u009d\u009b\3\2\2\2\u009e\u00cc\7\n\2\2\u009f\u00cc\5\b\5\2\u00a0" +
                    "\u00a1\7\22\2\2\u00a1\u00a2\7#\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00a4\7" +
                    "$\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7\5\36\20\2" +
                    "\u00a7\u00cc\3\2\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab" +
                    "\5\"\22\2\u00ab\u00ac\7$\2\2\u00ac\u00ad\5 \21\2\u00ad\u00cc\3\2\2\2\u00ae" +
                    "\u00af\7\25\2\2\u00af\u00b0\7#\2\2\u00b0\u00b1\5\32\16\2\u00b1\u00b2\7" +
                    "\f\2\2\u00b2\u00b3\5\"\22\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5\5\32\16\2" +
                    "\u00b5\u00b6\7$\2\2\u00b6\u00b7\5 \21\2\u00b7\u00cc\3\2\2\2\u00b8\u00b9" +
                    "\7\26\2\2\u00b9\u00ba\7#\2\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc\7$\2\2\u00bc" +
                    "\u00bd\7\f\2\2\u00bd\u00cc\3\2\2\2\u00be\u00bf\7(\2\2\u00bf\u00c0\7&\2" +
                    "\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\7\f\2\2\u00c2\u00cc\3\2\2\2\u00c3" +
                    "\u00c4\7(\2\2\u00c4\u00c5\7 \2\2\u00c5\u00c6\5\"\22\2\u00c6\u00c7\7!\2" +
                    "\2\u00c7\u00c8\7&\2\2\u00c8\u00c9\5\"\22\2\u00c9\u00ca\7\f\2\2\u00ca\u00cc" +
                    "\3\2\2\2\u00cb\u0097\3\2\2\2\u00cb\u009f\3\2\2\2\u00cb\u00a0\3\2\2\2\u00cb" +
                    "\u00a8\3\2\2\2\u00cb\u00ae\3\2\2\2\u00cb\u00b8\3\2\2\2\u00cb\u00be\3\2" +
                    "\2\2\u00cb\u00c3\3\2\2\2\u00cc\33\3\2\2\2\u00cd\u00ce\5\32\16\2\u00ce" +
                    "\35\3\2\2\2\u00cf\u00d0\5\32\16\2\u00d0\37\3\2\2\2\u00d1\u00d2\5\32\16" +
                    "\2\u00d2!\3\2\2\2\u00d3\u00d4\b\22\1\2\u00d4\u00d5\7(\2\2\u00d5\u00de" +
                    "\7#\2\2\u00d6\u00db\5\"\22\2\u00d7\u00d8\7\r\2\2\u00d8\u00da\5\"\22\2" +
                    "\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc" +
                    "\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00d6\3\2\2\2\u00de" +
                    "\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00f7\7$\2\2\u00e1\u00e2\7\37" +
                    "\2\2\u00e2\u00f7\5\"\22\21\u00e3\u00e4\7\27\2\2\u00e4\u00e5\5\24\13\2" +
                    "\u00e5\u00e6\7 \2\2\u00e6\u00e7\5\"\22\2\u00e7\u00e8\7!\2\2\u00e8\u00f7" +
                    "\3\2\2\2\u00e9\u00ea\7\27\2\2\u00ea\u00eb\7(\2\2\u00eb\u00ec\7#\2\2\u00ec" +
                    "\u00f7\7$\2\2\u00ed\u00f7\7)\2\2\u00ee\u00f7\7*\2\2\u00ef\u00f7\7\'\2" +
                    "\2\u00f0\u00f7\7(\2\2\u00f1\u00f7\7\30\2\2\u00f2\u00f3\7#\2\2\u00f3\u00f4" +
                    "\5\"\22\2\u00f4\u00f5\7$\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00d3\3\2\2\2\u00f6" +
                    "\u00e1\3\2\2\2\u00f6\u00e3\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6\u00ed\3\2" +
                    "\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6" +
                    "\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\u0113\3\2\2\2\u00f8\u00f9\f\16" +
                    "\2\2\u00f9\u00fa\7\36\2\2\u00fa\u0112\5\"\22\17\u00fb\u00fc\f\r\2\2\u00fc" +
                    "\u00fd\7\35\2\2\u00fd\u0112\5\"\22\16\u00fe\u00ff\f\f\2\2\u00ff\u0100" +
                    "\7\33\2\2\u0100\u0112\5\"\22\r\u0101\u0102\f\13\2\2\u0102\u0103\7\34\2" +
                    "\2\u0103\u0112\5\"\22\f\u0104\u0105\f\n\2\2\u0105\u0106\7\32\2\2\u0106" +
                    "\u0112\5\"\22\13\u0107\u0108\f\t\2\2\u0108\u0109\7\31\2\2\u0109\u0112" +
                    "\5\"\22\n\u010a\u010b\f\24\2\2\u010b\u010c\7 \2\2\u010c\u010d\5\"\22\2" +
                    "\u010d\u010e\7!\2\2\u010e\u0112\3\2\2\2\u010f\u0110\f\23\2\2\u0110\u0112" +
                    "\7\"\2\2\u0111\u00f8\3\2\2\2\u0111\u00fb\3\2\2\2\u0111\u00fe\3\2\2\2\u0111" +
                    "\u0101\3\2\2\2\u0111\u0104\3\2\2\2\u0111\u0107\3\2\2\2\u0111\u010a\3\2" +
                    "\2\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113" +
                    "\u0114\3\2\2\2\u0114#\3\2\2\2\u0115\u0113\3\2\2\2\22(CIO_kt\u008c\u0094" +
                    "\u009b\u00cb\u00db\u00de\u00f6\u0111\u0113";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public enum Type {
        INT, INT_ARR, FLOAT, FLOAT_ARR, CHAR, CHAR_ARR, BOOLEAN, BOOLEAN_ARR, VOID, CLASS;

        public static EnumSet<JavaParser.Type> ARRAY = EnumSet.of(INT_ARR, FLOAT_ARR, BOOLEAN_ARR, CHAR_ARR);
        public static EnumSet<JavaParser.Type> ARITHEMATIC = EnumSet.of(INT, FLOAT, BOOLEAN, CHAR);
        public static EnumSet<JavaParser.Type> CHARS = EnumSet.of(INT, BOOLEAN, CHAR);
        public static EnumSet<JavaParser.Type> NON_ARRAY = EnumSet.of(INT, FLOAT, CHAR, BOOLEAN, CLASS);

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
    }
}