package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class ExplicitConstructorInvocation extends Statements {
    public TypeArguments typeArguments() {
        return getRule(TypeArguments.class,0);
    }
    public ArgumentList argumentList() {
        return getRule(ArgumentList.class,0);
    }
    public ExpressionName expressionName() {
        return getRule(ExpressionName.class,0);
    }
    public Primary primary() {
        return getRule(Primary.class,0);
    }
    public ExplicitConstructorInvocation(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterExplicitConstructorInvocation(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitExplicitConstructorInvocation(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
        else return visitor.visitChildren(this);
    }
}
