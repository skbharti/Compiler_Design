package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class ArrayAccess extends Statements {
    public ExpressionName expressionName() {
        return getRule(ExpressionName.class,0);
    }
    public List<Expression> expression() {
        return getRules(Expression.class);
    }
    public Expression expression(int i) {
        return getRule(Expression.class,i);
    }
    public PrimaryNoNewArray_lfno_arrayAccess primaryNoNewArray_lfno_arrayAccess() {
        return getRule(PrimaryNoNewArray_lfno_arrayAccess.class,0);
    }
    public List<PrimaryNoNewArray_lf_arrayAccess> primaryNoNewArray_lf_arrayAccess() {
        return getRules(PrimaryNoNewArray_lf_arrayAccess.class);
    }
    public PrimaryNoNewArray_lf_arrayAccess primaryNoNewArray_lf_arrayAccess(int i) {
        return getRule(PrimaryNoNewArray_lf_arrayAccess.class,i);
    }
    public ArrayAccess(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_arrayAccess; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterArrayAccess(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitArrayAccess(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitArrayAccess(this);
        else return visitor.visitChildren(this);
    }
}
