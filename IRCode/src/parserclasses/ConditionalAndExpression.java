package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class ConditionalAndExpression extends Statements {
    public InclusiveOrExpression inclusiveOrExpression() {
        return getRule(InclusiveOrExpression.class,0);
    }
    public ConditionalAndExpression conditionalAndExpression() {
        return getRule(ConditionalAndExpression.class,0);
    }
    public ConditionalAndExpression(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterConditionalAndExpression(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitConditionalAndExpression(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
        else return visitor.visitChildren(this);
    }
}
