package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaParser;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LabeledStatementNoShortIf extends Statements {
    public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
    public StatementNoShortIf statementNoShortIf() {
        return getRule(StatementNoShortIf.class,0);
    }
    public LabeledStatementNoShortIf(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterLabeledStatementNoShortIf(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitLabeledStatementNoShortIf(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
        else return visitor.visitChildren(this);
    }
}
