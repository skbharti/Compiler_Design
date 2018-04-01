package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class BasicForStatement extends Statements {
    public Statements statement() {
        return getRule(Statements.class,0);
    }
    public ForInit forInit() {
        return getRule(ForInit.class,0);
    }
    public Expression expression() {
        return getRule(Expression.class,0);
    }
    public ForUpdate forUpdate() {
        return getRule(ForUpdate.class,0);
    }
    public BasicForStatement(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_basicForStatement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterBasicForStatement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitBasicForStatement(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitBasicForStatement(this);
        else return visitor.visitChildren(this);
    }
}
