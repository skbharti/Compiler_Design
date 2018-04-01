package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class PostfixExpression extends Statements {
    public Primary primary() {
        return getRule(Primary.class,0);
    }
    public ExpressionName expressionName() {
        return getRule(ExpressionName.class,0);
    }
    public List<PostIncrementExpression_lf_postfixExpression> postIncrementExpression_lf_postfixExpression() {
        return getRules(PostIncrementExpression_lf_postfixExpression.class);
    }
    public PostIncrementExpression_lf_postfixExpression postIncrementExpression_lf_postfixExpression(int i) {
        return getRule(PostIncrementExpression_lf_postfixExpression.class,i);
    }
    public List<PostDecrementExpression_lf_postfixExpression> postDecrementExpression_lf_postfixExpression() {
        return getRules(PostDecrementExpression_lf_postfixExpression.class);
    }
    public PostDecrementExpression_lf_postfixExpression postDecrementExpression_lf_postfixExpression(int i) {
        return getRule(PostDecrementExpression_lf_postfixExpression.class,i);
    }
    public PostfixExpression(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_postfixExpression; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterPostfixExpression(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitPostfixExpression(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitPostfixExpression(this);
        else return visitor.visitChildren(this);
    }
}
