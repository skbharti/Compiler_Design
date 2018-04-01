package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class PrimaryNoNewArray_lf_primary extends Statements {
    public ClassInstanceCreationExpression_lf_primary classInstanceCreationExpression_lf_primary() {
        return getRule(ClassInstanceCreationExpression_lf_primary.class,0);
    }
    public FieldAccess_lf_primary fieldAccess_lf_primary() {
        return getRule(FieldAccess_lf_primary.class,0);
    }
    public ArrayAccess_lf_primary arrayAccess_lf_primary() {
        return getRule(ArrayAccess_lf_primary.class,0);
    }
    public MethodInvocation_lf_primary methodInvocation_lf_primary() {
        return getRule(MethodInvocation_lf_primary.class,0);
    }
    public MethodReference_lf_primary methodReference_lf_primary() {
        return getRule(MethodReference_lf_primary.class,0);
    }
    public PrimaryNoNewArray_lf_primary(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterPrimaryNoNewArray_lf_primary(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitPrimaryNoNewArray_lf_primary(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
        else return visitor.visitChildren(this);
    }
}
