package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class FormalParameterList extends Statements {
    public FormalParameters formalParameters() {
        return getRule(FormalParameters.class,0);
    }
    public LastFormalParameter lastFormalParameter() {
        return getRule(LastFormalParameter.class,0);
    }
    public FormalParameterList(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_formalParameterList; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterFormalParameterList(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitFormalParameterList(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitFormalParameterList(this);
        else return visitor.visitChildren(this);
    }
}
