package IRCode.src.parserclasses;

import LexerParser.gen.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class AdditiveExpression extends Statements {
    public MultiplicativeExpression multiplicativeExpression() {
        return getRule(MultiplicativeExpression.class,0);
    }
    public AdditiveExpression additiveExpression() {
        return getRule(AdditiveExpression.class,0);
    }
    public AdditiveExpression(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_additiveExpression; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterAdditiveExpression(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitAdditiveExpression(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitAdditiveExpression(this);
        else return visitor.visitChildren(this);
    }
}
