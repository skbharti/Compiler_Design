package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class ArrayType extends Statements {
    public PrimitiveType primitiveType() {
        return getRule(PrimitiveType.class,0);
    }
    public Dims dims() {
        return getRule(Dims.class,0);
    }
    public ClassOrInterfaceType classOrInterfaceType() {
        return getRule(ClassOrInterfaceType.class,0);
    }
    public TypeVariable typeVariable() {
        return getRule(TypeVariable.class,0);
    }
    public ArrayType(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_arrayType; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterArrayType(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitArrayType(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitArrayType(this);
        else return visitor.visitChildren(this);
    }
}
