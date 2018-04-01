package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class ArrayAccess_lfno_primary extends Statements {
    public ExpressionName expressionName() {
        return getRule(ExpressionName.class,0);
    }
    public List<Expression> expression() {
        return getRules(Expression.class);
    }
    public Expression expression(int i) {
        return getRule(Expression.class,i);
    }
    public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
        return getRule(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary.class,0);
    }
    public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
        return getRules(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary.class);
    }
    public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
        return getRule(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary.class,i);
    }
    public ArrayAccess_lfno_primary(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterArrayAccess_lfno_primary(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitArrayAccess_lfno_primary(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
        else return visitor.visitChildren(this);
    }
}
