package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaParser;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class ClassInstanceCreationExpression_lfno_primary extends Statements {
    public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
    public TerminalNode Identifier(int i) {
        return getToken(JavaParser.Identifier, i);
    }
    public TypeArguments typeArguments() {
        return getRule(TypeArguments.class,0);
    }
    public TypeArgumentsOrDiamond typeArgumentsOrDiamond() {
        return getRule(TypeArgumentsOrDiamond.class,0);
    }
    public ArgumentList argumentList() {
        return getRule(ArgumentList.class,0);
    }
    public ClassBody classBody() {
        return getRule(ClassBody.class,0);
    }
    public ExpressionName expressionName() {
        return getRule(ExpressionName.class,0);
    }
    public ClassInstanceCreationExpression_lfno_primary(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
        else return visitor.visitChildren(this);
    }
}
