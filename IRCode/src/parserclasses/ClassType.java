package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaParser;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ClassType extends Statements {
    public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
    public TypeArguments typeArguments() {
        return getRule(TypeArguments.class,0);
    }
    public ClassOrInterfaceType classOrInterfaceType() {
        return getRule(ClassOrInterfaceType.class,0);
    }
    public ClassType(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_classType; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterClassType(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitClassType(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitClassType(this);
        else return visitor.visitChildren(this);
    }
}
