package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class MethodHeader extends Statements {
    public Result result() {
        return getRule(Result.class,0);
    }
    public MethodDeclarator methodDeclarator() {
        return getRule(MethodDeclarator.class,0);
    }
    public TypeParameters typeParameters() {
        return getRule(TypeParameters.class,0);
    }
    public MethodHeader(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_methodHeader; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterMethodHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitMethodHeader(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitMethodHeader(this);
        else return visitor.visitChildren(this);
    }
}
