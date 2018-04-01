package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class ArrayAccess_lf_primary extends Statements {
    public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
        return getRule(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary.class,0);
    }
    public List<Expression> expression() {
        return getRules(Expression.class);
    }
    public Expression expression(int i) {
        return getRule(Expression.class,i);
    }
    public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
        return getRules(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary.class);
    }
    public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
        return getRule(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary.class,i);
    }
    public ArrayAccess_lf_primary(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterArrayAccess_lf_primary(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitArrayAccess_lf_primary(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
        else return visitor.visitChildren(this);
    }
}
