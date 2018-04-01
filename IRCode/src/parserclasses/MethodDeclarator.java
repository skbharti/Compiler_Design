package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaParser;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MethodDeclarator extends Statements {
    public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
    public FormalParameterList formalParameterList() {
        return getRule(FormalParameterList.class,0);
    }
    public Dims dims() {
        return getRule(Dims.class,0);
    }
    public MethodDeclarator(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_methodDeclarator; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterMethodDeclarator(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitMethodDeclarator(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclarator(this);
        else return visitor.visitChildren(this);
    }
}
