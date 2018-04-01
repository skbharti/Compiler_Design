package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class StatementWithoutTrailingSubstatement extends Statements {
    public Block block() {
        return getRule(Block.class,0);
    }
    public EmptyStatement emptyStatement() {
        return getRule(EmptyStatement.class,0);
    }
    public ExpressionStatement expressionStatement() {
        return getRule(ExpressionStatement.class,0);
    }
    public BreakStatement breakStatement() {
        return getRule(BreakStatement.class,0);
    }
    public ContinueStatement continueStatement() {
        return getRule(ContinueStatement.class,0);
    }
    public ReturnStatement returnStatement() {
        return getRule(ReturnStatement.class,0);
    }
    public StatementWithoutTrailingSubstatement(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterStatementWithoutTrailingSubstatement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitStatementWithoutTrailingSubstatement(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
        else return visitor.visitChildren(this);
    }
}
