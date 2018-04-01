package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class PrimaryNoNewArray_lfno_arrayAccess extends Statements {
    public Literal literal() {
        return getRule(Literal.class,0);
    }
    public TypeName typeName() {
        return getRule(TypeName.class,0);
    }
    public Expression expression() {
        return getRule(Expression.class,0);
    }
    public ClassInstanceCreationExpression classInstanceCreationExpression() {
        return getRule(ClassInstanceCreationExpression.class,0);
    }
    public FieldAccess fieldAccess() {
        return getRule(FieldAccess.class,0);
    }
    public MethodInvocation methodInvocation() {
        return getRule(MethodInvocation.class,0);
    }
    public MethodReference methodReference() {
        return getRule(MethodReference.class,0);
    }
    public PrimaryNoNewArray_lfno_arrayAccess(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
        else return visitor.visitChildren(this);
    }
}
