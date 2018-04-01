package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class TypeArgumentList extends Statements {
    public List<TypeArgument> typeArgument() {
        return getRules(TypeArgument.class);
    }
    public TypeArgument typeArgument(int i) {
        return getRule(TypeArgument.class,i);
    }
    public TypeArgumentList(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_typeArgumentList; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterTypeArgumentList(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitTypeArgumentList(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitTypeArgumentList(this);
        else return visitor.visitChildren(this);
    }
}
