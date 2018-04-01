package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaParser;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ClassType_lf_classOrInterfaceType extends Statements {
    public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
    public TypeArguments typeArguments() {
        return getRule(TypeArguments.class,0);
    }
    public ClassType_lf_classOrInterfaceType(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterClassType_lf_classOrInterfaceType(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitClassType_lf_classOrInterfaceType(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
        else return visitor.visitChildren(this);
    }
}
