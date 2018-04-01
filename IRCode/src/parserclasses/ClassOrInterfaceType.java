package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class ClassOrInterfaceType extends Statements {
    public ClassType_lfno_classOrInterfaceType classType_lfno_classOrInterfaceType() {
        return getRule(ClassType_lfno_classOrInterfaceType.class,0);
    }
    public List<ClassType_lf_classOrInterfaceType> classType_lf_classOrInterfaceType() {
        return getRules(ClassType_lf_classOrInterfaceType.class);
    }
    public ClassType_lf_classOrInterfaceType classType_lf_classOrInterfaceType(int i) {
        return getRule(ClassType_lf_classOrInterfaceType.class,i);
    }
    public ClassOrInterfaceType(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterClassOrInterfaceType(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitClassOrInterfaceType(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
        else return visitor.visitChildren(this);
    }
}
