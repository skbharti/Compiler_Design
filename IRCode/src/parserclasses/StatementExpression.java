package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class StatementExpression extends Statements {
    public Assignment assignment() {
        return getRule(Assignment.class,0);
    }
    public PreIncrementExpression preIncrementExpression() {
        return getRule(PreIncrementExpression.class,0);
    }
    public PreDecrementExpression preDecrementExpression() {
        return getRule(PreDecrementExpression.class,0);
    }
    public PostIncrementExpression postIncrementExpression() {
        return getRule(PostIncrementExpression.class,0);
    }
    public PostDecrementExpression postDecrementExpression() {
        return getRule(PostDecrementExpression.class,0);
    }
    public MethodInvocation methodInvocation() {
        return getRule(MethodInvocation.class,0);
    }
    public ClassInstanceCreationExpression classInstanceCreationExpression() {
        return getRule(ClassInstanceCreationExpression.class,0);
    }
    public StatementExpression(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_statementExpression; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterStatementExpression(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitStatementExpression(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitStatementExpression(this);
        else return visitor.visitChildren(this);
    }
}
