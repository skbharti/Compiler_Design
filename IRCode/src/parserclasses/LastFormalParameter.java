package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class LastFormalParameter extends Statements {
    public VariableDeclaratorId variableDeclaratorId() {
        return getRule(VariableDeclaratorId.class,0);
    }
    public FormalParameter formalParameter() {
        return getRule(FormalParameter.class,0);
    }
    public LastFormalParameter(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_lastFormalParameter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterLastFormalParameter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitLastFormalParameter(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitLastFormalParameter(this);
        else return visitor.visitChildren(this);
    }
}
