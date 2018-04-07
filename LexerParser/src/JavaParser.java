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
            T__17 = 18, T__18 = 19, T__19 = 20, AND = 21, LT = 22, PLUS = 23, MINUS = 24, TIMES = 25,
            POWER = 26, NOT = 27, LSB = 28, RSB = 29, DOTLENGTH = 30, LP = 31, RP = 32, RETURN = 33,
            EQ = 34, BooleanLiteral = 35, Identifier = 36, IntegerLiteral = 37, WS = 38, MULTILINE_COMMENT = 39,
            LINE_COMMENT = 40;
    public static final int
            RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_fieldDeclaration = 3,
            RULE_localDeclaration = 4, RULE_varDeclaration = 5, RULE_methodDeclaration = 6,
            RULE_parameterList = 7, RULE_parameter = 8, RULE_methodBody = 9, RULE_type = 10,
            RULE_dims = 11, RULE_statement = 12, RULE_ifBlock = 13, RULE_elseBlock = 14,
            RULE_whileBlock = 15, RULE_expression = 16;
    public static final String[] ruleNames = {
            "goal", "mainClass", "classDeclaration", "fieldDeclaration", "localDeclaration",
            "varDeclaration", "methodDeclaration", "parameterList", "parameter", "methodBody",
            "type", "dims", "statement", "ifBlock", "elseBlock", "whileBlock", "expression"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'String'",
            "'}'", "'extends'", "';'", "','", "'int'", "'boolean'", "'if'", "'else'",
            "'while'", "'for'", "'println'", "'new'", "'this'", "'&&'", "'<'", "'+'",
            "'-'", "'*'", "'**'", "'!'", "'['", "']'", "'.length'", "'('", "')'",
            "'return'", "'='"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, "AND", "LT", "PLUS",
            "MINUS", "TIMES", "POWER", "NOT", "LSB", "RSB", "DOTLENGTH", "LP", "RP",
            "RETURN", "EQ", "BooleanLiteral", "Identifier", "IntegerLiteral", "WS",
            "MULTILINE_COMMENT", "LINE_COMMENT"
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
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << Identifier))) != 0)) {
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

    public static class LocalDeclarationContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

        public VarDeclarationContext varDeclaration() {
            return getRuleContext(VarDeclarationContext.class, 0);
        }

        public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_localDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).enterLocalDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JavaListener) ((JavaListener) listener).exitLocalDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>) visitor).visitLocalDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LocalDeclarationContext localDeclaration() throws RecognitionException {
        LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_localDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(84);
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
        enterRule(_localctx, 10, RULE_varDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(86);
                type();
                setState(87);
                match(Identifier);
                setState(88);
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
        enterRule(_localctx, 12, RULE_methodDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(90);
                match(T__2);
                setState(91);
                type();
                setState(92);
                match(Identifier);
                setState(93);
                match(LP);
                setState(95);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << Identifier))) != 0)) {
                    {
                        setState(94);
                        parameterList();
                    }
                }

                setState(97);
                match(RP);
                setState(98);
                match(T__1);
                setState(99);
                methodBody();
                setState(100);
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
        enterRule(_localctx, 14, RULE_parameterList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(102);
                parameter();
                setState(107);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(103);
                            match(T__10);
                            setState(104);
                            parameter();
                        }
                    }
                    setState(109);
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

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
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
        enterRule(_localctx, 16, RULE_parameter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(110);
                type();
                setState(111);
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

        public List<LocalDeclarationContext> localDeclaration() {
            return getRuleContexts(LocalDeclarationContext.class);
        }

        public LocalDeclarationContext localDeclaration(int i) {
            return getRuleContext(LocalDeclarationContext.class, i);
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
        enterRule(_localctx, 18, RULE_methodBody);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(116);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(113);
                                localDeclaration();
                            }
                        }
                    }
                    setState(118);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                }
                setState(122);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Identifier))) != 0)) {
                    {
                        {
                            setState(119);
                            statement();
                        }
                    }
                    setState(124);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(125);
                match(RETURN);
                setState(126);
                expression(0);
                setState(127);
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

        public DimsContext dims() {
            return getRuleContext(DimsContext.class, 0);
        }

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
        enterRule(_localctx, 20, RULE_type);
        try {
            setState(135);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(129);
                    match(T__11);
                    setState(130);
                    dims();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(131);
                    match(T__12);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(132);
                    match(T__11);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(133);
                    match(T__4);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(134);
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
                setState(137);
                match(LSB);
                setState(138);
                match(RSB);
                setState(143);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LSB) {
                    {
                        {
                            setState(139);
                            match(LSB);
                            setState(140);
                            match(RSB);
                        }
                    }
                    setState(145);
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

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
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
            setState(197);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                case 1:
                    _localctx = new NestedStatementContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(146);
                    match(T__1);
                    setState(150);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Identifier))) != 0)) {
                        {
                            {
                                setState(147);
                                statement();
                            }
                        }
                        setState(152);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(153);
                    match(T__7);
                }
                break;
                case 2:
                    _localctx = new IfElseStatementContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(154);
                    match(T__13);
                    setState(155);
                    match(LP);
                    setState(156);
                    expression(0);
                    setState(157);
                    match(RP);
                    setState(158);
                    ifBlock();
                    setState(159);
                    match(T__14);
                    setState(160);
                    elseBlock();
                }
                break;
                case 3:
                    _localctx = new WhileStatementContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(162);
                    match(T__15);
                    setState(163);
                    match(LP);
                    setState(164);
                    expression(0);
                    setState(165);
                    match(RP);
                    setState(166);
                    whileBlock();
                }
                break;
                case 4:
                    _localctx = new ForStatementContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(168);
                    match(T__16);
                    setState(169);
                    match(LP);
                    setState(170);
                    expression(0);
                    setState(171);
                    match(T__9);
                    setState(172);
                    expression(0);
                    setState(173);
                    match(T__9);
                    setState(174);
                    expression(0);
                    setState(175);
                    match(RP);
                    setState(176);
                    whileBlock();
                }
                break;
                case 5:
                    _localctx = new PrintStatementContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(178);
                    match(T__17);
                    setState(179);
                    match(LP);
                    setState(180);
                    expression(0);
                    setState(181);
                    match(RP);
                    setState(182);
                    match(T__9);
                }
                break;
                case 6:
                    _localctx = new VariableAssignmentStatementContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(184);
                    match(Identifier);
                    setState(185);
                    match(EQ);
                    setState(186);
                    expression(0);
                    setState(187);
                    match(T__9);
                }
                break;
                case 7:
                    _localctx = new ArrayAssignmentStatementContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(189);
                    match(Identifier);
                    setState(190);
                    match(LSB);
                    setState(191);
                    expression(0);
                    setState(192);
                    match(RSB);
                    setState(193);
                    match(EQ);
                    setState(194);
                    expression(0);
                    setState(195);
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
                setState(199);
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
                setState(201);
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

    public static class ExpressionContext extends ParserRuleContext {
        public ArrayList<ThreeAddCode> codes = new ArrayList<>();
        public String place;
        public String start;
        public String end;
        public int value;

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
                setState(239);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                    case 1: {
                        _localctx = new MethodCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(206);
                        match(Identifier);
                        setState(207);
                        match(LP);
                        setState(216);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << NOT) | (1L << LP) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << IntegerLiteral))) != 0)) {
                            {
                                setState(208);
                                expression(0);
                                setState(213);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__10) {
                                    {
                                        {
                                            setState(209);
                                            match(T__10);
                                            setState(210);
                                            expression(0);
                                        }
                                    }
                                    setState(215);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(218);
                        match(RP);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(219);
                        match(NOT);
                        setState(220);
                        expression(14);
                    }
                    break;
                    case 3: {
                        _localctx = new ArrayInstantiationExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(221);
                        match(T__18);
                        setState(222);
                        match(T__11);
                        setState(223);
                        match(LSB);
                        setState(224);
                        expression(0);
                        setState(225);
                        match(RSB);
                    }
                    break;
                    case 4: {
                        _localctx = new ObjectInstantiationExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(227);
                        match(T__18);
                        setState(228);
                        match(Identifier);
                        setState(229);
                        match(LP);
                        setState(230);
                        match(RP);
                    }
                    break;
                    case 5: {
                        _localctx = new IntLitExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(231);
                        match(IntegerLiteral);
                    }
                    break;
                    case 6: {
                        _localctx = new BooleanLitExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(232);
                        match(BooleanLiteral);
                    }
                    break;
                    case 7: {
                        _localctx = new IdentifierExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(233);
                        match(Identifier);
                    }
                    break;
                    case 8: {
                        _localctx = new ThisExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(234);
                        match(T__19);
                    }
                    break;
                    case 9: {
                        _localctx = new ParenExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(235);
                        match(LP);
                        setState(236);
                        expression(0);
                        setState(237);
                        match(RP);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(268);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(266);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                                case 1: {
                                    _localctx = new PowExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(241);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(242);
                                    match(POWER);
                                    setState(243);
                                    expression(12);
                                }
                                break;
                                case 2: {
                                    _localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(244);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(245);
                                    match(TIMES);
                                    setState(246);
                                    expression(11);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(247);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(248);
                                    match(PLUS);
                                    setState(249);
                                    expression(10);
                                }
                                break;
                                case 4: {
                                    _localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(250);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(251);
                                    match(MINUS);
                                    setState(252);
                                    expression(9);
                                }
                                break;
                                case 5: {
                                    _localctx = new LtExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(253);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(254);
                                    match(LT);
                                    setState(255);
                                    expression(8);
                                }
                                break;
                                case 6: {
                                    _localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(256);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(257);
                                    match(AND);
                                    setState(258);
                                    expression(7);
                                }
                                break;
                                case 7: {
                                    _localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(259);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(260);
                                    match(LSB);
                                    setState(261);
                                    expression(0);
                                    setState(262);
                                    match(RSB);
                                }
                                break;
                                case 8: {
                                    _localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(264);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(265);
                                    match(DOTLENGTH);
                                }
                                break;
                            }
                        }
                    }
                    setState(270);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
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
                return precpred(_ctx, 11);
            case 1:
                return precpred(_ctx, 10);
            case 2:
                return precpred(_ctx, 9);
            case 3:
                return precpred(_ctx, 8);
            case 4:
                return precpred(_ctx, 7);
            case 5:
                return precpred(_ctx, 6);
            case 6:
                return precpred(_ctx, 17);
            case 7:
                return precpred(_ctx, 16);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0112\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4D\n\4" +
                    "\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\4\3\4\3" +
                    "\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bb\n\b\3\b\3\b\3" +
                    "\b\3\b\3\b\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\n\3\n\3\n\3\13\7\13u" +
                    "\n\13\f\13\16\13x\13\13\3\13\7\13{\n\13\f\13\16\13~\13\13\3\13\3\13\3" +
                    "\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008a\n\f\3\r\3\r\3\r\3\r\7\r\u0090" +
                    "\n\r\f\r\16\r\u0093\13\r\3\16\3\16\7\16\u0097\n\16\f\16\16\16\u009a\13" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\5\16\u00c8\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\7\22\u00d6\n\22\f\22\16\22\u00d9\13\22\5\22\u00db" +
                    "\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f2\n\22\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u010d\n\22\f\22\16\22\u0110" +
                    "\13\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u0126" +
                    "\2$\3\2\2\2\4-\3\2\2\2\6?\3\2\2\2\bT\3\2\2\2\nV\3\2\2\2\fX\3\2\2\2\16" +
                    "\\\3\2\2\2\20h\3\2\2\2\22p\3\2\2\2\24v\3\2\2\2\26\u0089\3\2\2\2\30\u008b" +
                    "\3\2\2\2\32\u00c7\3\2\2\2\34\u00c9\3\2\2\2\36\u00cb\3\2\2\2 \u00cd\3\2" +
                    "\2\2\"\u00f1\3\2\2\2$(\5\4\3\2%\'\5\6\4\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2" +
                    "\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\2\2\3,\3\3\2\2\2-.\7\3\2\2./\7&\2" +
                    "\2/\60\7\4\2\2\60\61\7\5\2\2\61\62\7\6\2\2\62\63\7\7\2\2\63\64\7\b\2\2" +
                    "\64\65\7!\2\2\65\66\7\t\2\2\66\67\7\36\2\2\678\7\37\2\289\7&\2\29:\7\"" +
                    "\2\2:;\7\4\2\2;<\5\32\16\2<=\7\n\2\2=>\7\n\2\2>\5\3\2\2\2?@\7\3\2\2@C" +
                    "\7&\2\2AB\7\13\2\2BD\7&\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EI\7\4\2\2FH" +
                    "\5\b\5\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JO\3\2\2\2KI\3\2\2\2L" +
                    "N\5\16\b\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2" +
                    "RS\7\n\2\2S\7\3\2\2\2TU\5\f\7\2U\t\3\2\2\2VW\5\f\7\2W\13\3\2\2\2XY\5\26" +
                    "\f\2YZ\7&\2\2Z[\7\f\2\2[\r\3\2\2\2\\]\7\5\2\2]^\5\26\f\2^_\7&\2\2_a\7" +
                    "!\2\2`b\5\20\t\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\"\2\2de\7\4\2\2ef\5" +
                    "\24\13\2fg\7\n\2\2g\17\3\2\2\2hm\5\22\n\2ij\7\r\2\2jl\5\22\n\2ki\3\2\2" +
                    "\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\21\3\2\2\2om\3\2\2\2pq\5\26\f\2qr\7" +
                    "&\2\2r\23\3\2\2\2su\5\n\6\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w|" +
                    "\3\2\2\2xv\3\2\2\2y{\5\32\16\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2" +
                    "}\177\3\2\2\2~|\3\2\2\2\177\u0080\7#\2\2\u0080\u0081\5\"\22\2\u0081\u0082" +
                    "\7\f\2\2\u0082\25\3\2\2\2\u0083\u0084\7\16\2\2\u0084\u008a\5\30\r\2\u0085" +
                    "\u008a\7\17\2\2\u0086\u008a\7\16\2\2\u0087\u008a\7\7\2\2\u0088\u008a\7" +
                    "&\2\2\u0089\u0083\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089" +
                    "\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\27\3\2\2\2\u008b\u008c\7\36\2" +
                    "\2\u008c\u0091\7\37\2\2\u008d\u008e\7\36\2\2\u008e\u0090\7\37\2\2\u008f" +
                    "\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2" +
                    "\2\2\u0092\31\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098\7\4\2\2\u0095\u0097" +
                    "\5\32\16\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2" +
                    "\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u00c8" +
                    "\7\n\2\2\u009c\u009d\7\20\2\2\u009d\u009e\7!\2\2\u009e\u009f\5\"\22\2" +
                    "\u009f\u00a0\7\"\2\2\u00a0\u00a1\5\34\17\2\u00a1\u00a2\7\21\2\2\u00a2" +
                    "\u00a3\5\36\20\2\u00a3\u00c8\3\2\2\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6" +
                    "\7!\2\2\u00a6\u00a7\5\"\22\2\u00a7\u00a8\7\"\2\2\u00a8\u00a9\5 \21\2\u00a9" +
                    "\u00c8\3\2\2\2\u00aa\u00ab\7\23\2\2\u00ab\u00ac\7!\2\2\u00ac\u00ad\5\"" +
                    "\22\2\u00ad\u00ae\7\f\2\2\u00ae\u00af\5\"\22\2\u00af\u00b0\7\f\2\2\u00b0" +
                    "\u00b1\5\"\22\2\u00b1\u00b2\7\"\2\2\u00b2\u00b3\5 \21\2\u00b3\u00c8\3" +
                    "\2\2\2\u00b4\u00b5\7\24\2\2\u00b5\u00b6\7!\2\2\u00b6\u00b7\5\"\22\2\u00b7" +
                    "\u00b8\7\"\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00c8\3\2\2\2\u00ba\u00bb\7&" +
                    "\2\2\u00bb\u00bc\7$\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7\f\2\2\u00be" +
                    "\u00c8\3\2\2\2\u00bf\u00c0\7&\2\2\u00c0\u00c1\7\36\2\2\u00c1\u00c2\5\"" +
                    "\22\2\u00c2\u00c3\7\37\2\2\u00c3\u00c4\7$\2\2\u00c4\u00c5\5\"\22\2\u00c5" +
                    "\u00c6\7\f\2\2\u00c6\u00c8\3\2\2\2\u00c7\u0094\3\2\2\2\u00c7\u009c\3\2" +
                    "\2\2\u00c7\u00a4\3\2\2\2\u00c7\u00aa\3\2\2\2\u00c7\u00b4\3\2\2\2\u00c7" +
                    "\u00ba\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00ca\5\32\16" +
                    "\2\u00ca\35\3\2\2\2\u00cb\u00cc\5\32\16\2\u00cc\37\3\2\2\2\u00cd\u00ce" +
                    "\5\32\16\2\u00ce!\3\2\2\2\u00cf\u00d0\b\22\1\2\u00d0\u00d1\7&\2\2\u00d1" +
                    "\u00da\7!\2\2\u00d2\u00d7\5\"\22\2\u00d3\u00d4\7\r\2\2\u00d4\u00d6\5\"" +
                    "\22\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7" +
                    "\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00d2\3\2" +
                    "\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00f2\7\"\2\2\u00dd" +
                    "\u00de\7\35\2\2\u00de\u00f2\5\"\22\20\u00df\u00e0\7\25\2\2\u00e0\u00e1" +
                    "\7\16\2\2\u00e1\u00e2\7\36\2\2\u00e2\u00e3\5\"\22\2\u00e3\u00e4\7\37\2" +
                    "\2\u00e4\u00f2\3\2\2\2\u00e5\u00e6\7\25\2\2\u00e6\u00e7\7&\2\2\u00e7\u00e8" +
                    "\7!\2\2\u00e8\u00f2\7\"\2\2\u00e9\u00f2\7\'\2\2\u00ea\u00f2\7%\2\2\u00eb" +
                    "\u00f2\7&\2\2\u00ec\u00f2\7\26\2\2\u00ed\u00ee\7!\2\2\u00ee\u00ef\5\"" +
                    "\22\2\u00ef\u00f0\7\"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00cf\3\2\2\2\u00f1" +
                    "\u00dd\3\2\2\2\u00f1\u00df\3\2\2\2\u00f1\u00e5\3\2\2\2\u00f1\u00e9\3\2" +
                    "\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1" +
                    "\u00ed\3\2\2\2\u00f2\u010e\3\2\2\2\u00f3\u00f4\f\r\2\2\u00f4\u00f5\7\34" +
                    "\2\2\u00f5\u010d\5\"\22\16\u00f6\u00f7\f\f\2\2\u00f7\u00f8\7\33\2\2\u00f8" +
                    "\u010d\5\"\22\r\u00f9\u00fa\f\13\2\2\u00fa\u00fb\7\31\2\2\u00fb\u010d" +
                    "\5\"\22\f\u00fc\u00fd\f\n\2\2\u00fd\u00fe\7\32\2\2\u00fe\u010d\5\"\22" +
                    "\13\u00ff\u0100\f\t\2\2\u0100\u0101\7\30\2\2\u0101\u010d\5\"\22\n\u0102" +
                    "\u0103\f\b\2\2\u0103\u0104\7\27\2\2\u0104\u010d\5\"\22\t\u0105\u0106\f" +
                    "\23\2\2\u0106\u0107\7\36\2\2\u0107\u0108\5\"\22\2\u0108\u0109\7\37\2\2" +
                    "\u0109\u010d\3\2\2\2\u010a\u010b\f\22\2\2\u010b\u010d\7 \2\2\u010c\u00f3" +
                    "\3\2\2\2\u010c\u00f6\3\2\2\2\u010c\u00f9\3\2\2\2\u010c\u00fc\3\2\2\2\u010c" +
                    "\u00ff\3\2\2\2\u010c\u0102\3\2\2\2\u010c\u0105\3\2\2\2\u010c\u010a\3\2" +
                    "\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f" +
                    "#\3\2\2\2\u0110\u010e\3\2\2\2\23(CIOamv|\u0089\u0091\u0098\u00c7\u00d7" +
                    "\u00da\u00f1\u010c\u010e";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}