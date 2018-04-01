package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class StatementNoShortIf extends Statements {
    public StatementWithoutTrailingSubstatement statementWithoutTrailingSubstatement() {
        return getRule(StatementWithoutTrailingSubstatement.class,0);
    }
    public LabeledStatementNoShortIf labeledStatementNoShortIf() {
        return getRule(LabeledStatementNoShortIf.class,0);
    }
    public IfThenElseStatementNoShortIf ifThenElseStatementNoShortIf() {
        return getRule(IfThenElseStatementNoShortIf.class,0);
    }
    public WhileStatementNoShortIf whileStatementNoShortIf() {
        return getRule(WhileStatementNoShortIf.class,0);
    }
    public ForStatementNoShortIf forStatementNoShortIf() {
        return getRule(ForStatementNoShortIf.class,0);
    }
    public StatementNoShortIf(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_statementNoShortIf; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterStatementNoShortIf(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitStatementNoShortIf(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitStatementNoShortIf(this);
        else return visitor.visitChildren(this);
    }
}
