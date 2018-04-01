package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class ArrayCreationExpression extends Statements {
    public PrimitiveType primitiveType() {
        return getRule(PrimitiveType.class,0);
    }
    public DimExprs dimExprs() {
        return getRule(DimExprs.class,0);
    }
    public Dims dims() {
        return getRule(Dims.class,0);
    }
    public ClassOrInterfaceType classOrInterfaceType() {
        return getRule(ClassOrInterfaceType.class,0);
    }
    public ArrayInitializer arrayInitializer() {
        return getRule(ArrayInitializer.class,0);
    }
    public ArrayCreationExpression(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterArrayCreationExpression(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitArrayCreationExpression(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
        else return visitor.visitChildren(this);
    }
}
