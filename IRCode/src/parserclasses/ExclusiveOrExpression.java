package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class ExclusiveOrExpression extends Statements {
    public AndExpression andExpression() {
        return getRule(AndExpression.class,0);
    }
    public ExclusiveOrExpression exclusiveOrExpression() {
        return getRule(ExclusiveOrExpression.class,0);
    }
    public ExclusiveOrExpression(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterExclusiveOrExpression(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitExclusiveOrExpression(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
        else return visitor.visitChildren(this);
    }
}
