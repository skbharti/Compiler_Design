package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class ClassDeclaration extends Statements {
    public NormalClassDeclaration normalClassDeclaration() {
        return getRule(NormalClassDeclaration.class,0);
    }
    public ClassDeclaration(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_classDeclaration; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterClassDeclaration(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitClassDeclaration(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
        else return visitor.visitChildren(this);
    }
}
