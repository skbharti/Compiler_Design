package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class Primary extends Statements {
    public PrimaryNoNewArray_lfno_primary primaryNoNewArray_lfno_primary() {
        return getRule(PrimaryNoNewArray_lfno_primary.class,0);
    }
    public ArrayCreationExpression arrayCreationExpression() {
        return getRule(ArrayCreationExpression.class,0);
    }
    public List<PrimaryNoNewArray_lf_primary> primaryNoNewArray_lf_primary() {
        return getRules(PrimaryNoNewArray_lf_primary.class);
    }
    public PrimaryNoNewArray_lf_primary primaryNoNewArray_lf_primary(int i) {
        return getRule(PrimaryNoNewArray_lf_primary.class,i);
    }
    public Primary(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_primary; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterPrimary(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitPrimary(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitPrimary(this);
        else return visitor.visitChildren(this);
    }
}
