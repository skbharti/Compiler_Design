package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class ConstructorDeclarator extends Statements {
    public SimpleTypeName simpleTypeName() {
        return getRule(SimpleTypeName.class,0);
    }
    public TypeParameters typeParameters() {
        return getRule(TypeParameters.class,0);
    }
    public FormalParameterList formalParameterList() {
        return getRule(FormalParameterList.class,0);
    }
    public ConstructorDeclarator(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_constructorDeclarator; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterConstructorDeclarator(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitConstructorDeclarator(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitConstructorDeclarator(this);
        else return visitor.visitChildren(this);
    }
}
