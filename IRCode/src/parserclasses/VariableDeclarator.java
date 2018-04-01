package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class VariableDeclarator extends Statements {
    public VariableDeclaratorId variableDeclaratorId() {
        return getRule(VariableDeclaratorId.class,0);
    }
    public VariableInitializer variableInitializer() {
        return getRule(VariableInitializer.class,0);
    }
    public VariableDeclarator(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_variableDeclarator; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterVariableDeclarator(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitVariableDeclarator(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarator(this);
        else return visitor.visitChildren(this);
    }
}
