package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class ClassBody extends Statements {
    public List<ClassBodyDeclaration> classBodyDeclaration() {
        return getRules(ClassBodyDeclaration.class);
    }
    public ClassBodyDeclaration classBodyDeclaration(int i) {
        return getRule(ClassBodyDeclaration.class,i);
    }
    public ClassBody(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_classBody; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterClassBody(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitClassBody(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitClassBody(this);
        else return visitor.visitChildren(this);
    }
}
