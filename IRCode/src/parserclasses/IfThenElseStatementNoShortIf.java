package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class IfThenElseStatementNoShortIf extends Statements {
    public Expression expression() {
        return getRule(Expression.class,0);
    }
    public List<StatementNoShortIf> statementNoShortIf() {
        return getRules(StatementNoShortIf.class);
    }
    public StatementNoShortIf statementNoShortIf(int i) {
        return getRule(StatementNoShortIf.class,i);
    }
    public IfThenElseStatementNoShortIf(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterIfThenElseStatementNoShortIf(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitIfThenElseStatementNoShortIf(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
        else return visitor.visitChildren(this);
    }
}
