package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class ConstructorDeclaration extends Statements {
    public ConstructorDeclarator constructorDeclarator() {
        return getRule(ConstructorDeclarator.class,0);
    }
    public ConstructorBody constructorBody() {
        return getRule(ConstructorBody.class,0);
    }
    public List<ConstructorModifier> constructorModifier() {
        return getRules(ConstructorModifier.class);
    }
    public ConstructorModifier constructorModifier(int i) {
        return getRule(ConstructorModifier.class,i);
    }
    public ConstructorDeclaration(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_constructorDeclaration; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterConstructorDeclaration(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitConstructorDeclaration(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
        else return visitor.visitChildren(this);
    }
}
