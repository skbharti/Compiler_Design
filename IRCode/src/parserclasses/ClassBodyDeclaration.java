package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class ClassBodyDeclaration extends Statements {
    public ClassMemberDeclaration classMemberDeclaration() {
        return getRule(ClassMemberDeclaration.class,0);
    }
    public InstanceInitializer instanceInitializer() {
        return getRule(InstanceInitializer.class,0);
    }
    publicInitializerInitializer() {
        return getRuleInitializer.class,0);
    }
    public ConstructorDeclaration constructorDeclaration() {
        return getRule(ConstructorDeclaration.class,0);
    }
    public ClassBodyDeclaration(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterClassBodyDeclaration(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitClassBodyDeclaration(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
        else return visitor.visitChildren(this);
    }
}
