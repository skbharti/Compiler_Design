package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class ConstantDeclaration extends Statements {
    public VariableDeclaratorList variableDeclaratorList() {
        return getRule(VariableDeclaratorList.class,0);
    }
    public List<ConstantModifier> constantModifier() {
        return getRules(ConstantModifier.class);
    }
    public ConstantModifier constantModifier(int i) {
        return getRule(ConstantModifier.class,i);
    }
    public ConstantDeclaration(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_constantDeclaration; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterConstantDeclaration(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitConstantDeclaration(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclaration(this);
        else return visitor.visitChildren(this);
    }
}
