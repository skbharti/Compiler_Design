package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class ReferenceType extends Statements {
    public ClassOrInterfaceType classOrInterfaceType() {
        return getRule(ClassOrInterfaceType.class,0);
    }
    public TypeVariable typeVariable() {
        return getRule(TypeVariable.class,0);
    }
    public ArrayType arrayType() {
        return getRule(ArrayType.class,0);
    }
    public ReferenceType(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_referenceType; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterReferenceType(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitReferenceType(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitReferenceType(this);
        else return visitor.visitChildren(this);
    }
}
