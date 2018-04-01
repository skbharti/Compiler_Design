package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class FormalParameters extends Statements {
    public List<FormalParameter> formalParameter() {
        return getRules(FormalParameter.class);
    }
    public FormalParameter formalParameter(int i) {
        return getRule(FormalParameter.class,i);
    }
    public ReceiverParameter receiverParameter() {
        return getRule(ReceiverParameter.class,0);
    }
    public FormalParameters(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_formalParameters; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterFormalParameters(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitFormalParameters(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitFormalParameters(this);
        else return visitor.visitChildren(this);
    }
}
