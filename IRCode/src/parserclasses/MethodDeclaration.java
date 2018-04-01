package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class MethodDeclaration extends Statements {
    public MethodHeader methodHeader() {
        return getRule(MethodHeader.class,0);
    }
    public MethodBody methodBody() {
        return getRule(MethodBody.class,0);
    }
    public List<MethodModifier> methodModifier() {
        return getRules(MethodModifier.class);
    }
    public MethodModifier methodModifier(int i) {
        return getRule(MethodModifier.class,i);
    }
    public MethodDeclaration(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_methodDeclaration; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterMethodDeclaration(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitMethodDeclaration(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
        else return visitor.visitChildren(this);
    }
}
