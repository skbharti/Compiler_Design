package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaParser;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Literal extends Statements {
    public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
    public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
    public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
    public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
    public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
    public TerminalNode NullLiteral() { return getToken(JavaParser.NullLiteral, 0); }
    public Literal(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_literal; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterLiteral(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitLiteral(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitLiteral(this);
        else return visitor.visitChildren(this);
    }
}
