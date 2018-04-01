package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class ClassMemberDeclaration extends Statements {
    public FieldDeclaration fieldDeclaration() {
        return getRule(FieldDeclaration.class,0);
    }
    public MethodDeclaration methodDeclaration() {
        return getRule(MethodDeclaration.class,0);
    }
    public ClassDeclaration classDeclaration() {
        return getRule(ClassDeclaration.class,0);
    }
    public ClassMemberDeclaration(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterClassMemberDeclaration(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitClassMemberDeclaration(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
        else return visitor.visitChildren(this);
    }
}
