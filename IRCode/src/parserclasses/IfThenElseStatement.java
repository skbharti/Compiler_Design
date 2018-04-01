package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class IfThenElseStatement extends Statements {
    public Expression expression() {
        return getRule(Expression.class,0);
    }
    public StatementNoShortIf statementNoShortIf() {
        return getRule(StatementNoShortIf.class,0);
    }
    public Statements statement() {
        return getRule(Statements.class,0);
    }
    public IfThenElseStatement(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterIfThenElseStatement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitIfThenElseStatement(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitIfThenElseStatement(this);
        else return visitor.visitChildren(this);
    }
}
