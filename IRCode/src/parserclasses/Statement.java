package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class Statement extends Statements {
    public StatementWithoutTrailingSubstatement statementWithoutTrailingSubstatement() {
        return getRule(StatementWithoutTrailingSubstatement.class,0);
    }
    public LabeledStatement labeledStatement() {
        return getRule(LabeledStatement.class,0);
    }
    public IfThenStatement ifThenStatement() {
        return getRule(IfThenStatement.class,0);
    }
    public IfThenElseStatement ifThenElseStatement() {
        return getRule(IfThenElseStatement.class,0);
    }
    public WhileStatement whileStatement() {
        return getRule(WhileStatement.class,0);
    }
    public ForStatement forStatement() {
        return getRule(ForStatement.class,0);
    }
    public Statements(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_statement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterStatement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitStatement(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitStatement(this);
        else return visitor.visitChildren(this);
    }
}
