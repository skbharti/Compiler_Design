package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class VariableDeclaratorList extends Statements {
    public List<VariableDeclarator> variableDeclarator() {
        return getRules(VariableDeclarator.class);
    }
    public VariableDeclarator variableDeclarator(int i) {
        return getRule(VariableDeclarator.class,i);
    }
    public VariableDeclaratorList(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterVariableDeclaratorList(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitVariableDeclaratorList(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclaratorList(this);
        else return visitor.visitChildren(this);
    }
}
