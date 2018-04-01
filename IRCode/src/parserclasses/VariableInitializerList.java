package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class VariableInitializerList extends Statements {
    public List<VariableInitializer> variableInitializer() {
        return getRules(VariableInitializer.class);
    }
    public VariableInitializer variableInitializer(int i) {
        return getRule(VariableInitializer.class,i);
    }
    public VariableInitializerList(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_variableInitializerList; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterVariableInitializerList(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitVariableInitializerList(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitVariableInitializerList(this);
        else return visitor.visitChildren(this);
    }
}
