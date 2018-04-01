package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class PrimaryNoNewArray_lfno_primary extends Statements {
    public Literal literal() {
        return getRule(Literal.class,0);
    }
    public TypeName typeName() {
        return getRule(TypeName.class,0);
    }
    public Expression expression() {
        return getRule(Expression.class,0);
    }
    public ClassInstanceCreationExpression_lfno_primary classInstanceCreationExpression_lfno_primary() {
        return getRule(ClassInstanceCreationExpression_lfno_primary.class,0);
    }
    public FieldAccess_lfno_primary fieldAccess_lfno_primary() {
        return getRule(FieldAccess_lfno_primary.class,0);
    }
    public ArrayAccess_lfno_primary arrayAccess_lfno_primary() {
        return getRule(ArrayAccess_lfno_primary.class,0);
    }
    public MethodInvocation_lfno_primary methodInvocation_lfno_primary() {
        return getRule(MethodInvocation_lfno_primary.class,0);
    }
    public MethodReference_lfno_primary methodReference_lfno_primary() {
        return getRule(MethodReference_lfno_primary.class,0);
    }
    public PrimaryNoNewArray_lfno_primary(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
        else return visitor.visitChildren(this);
    }
}
