package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class BasicForStatementNoShortIf extends Statements {
    public StatementNoShortIf statementNoShortIf() {
        return getRule(StatementNoShortIf.class,0);
    }
    public ForInit forInit() {
        return getRule(ForInit.class,0);
    }
    public Expression expression() {
        return getRule(Expression.class,0);
    }
    public ForUpdate forUpdate() {
        return getRule(ForUpdate.class,0);
    }
    public BasicForStatementNoShortIf(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterBasicForStatementNoShortIf(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitBasicForStatementNoShortIf(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitBasicForStatementNoShortIf(this);
        else return visitor.visitChildren(this);
    }
}
