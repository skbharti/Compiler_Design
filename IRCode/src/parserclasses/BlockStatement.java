package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class BlockStatement extends Statements {
    public LocalVariableDeclarationStatement localVariableDeclarationStatement() {
        return getRule(LocalVariableDeclarationStatement.class,0);
    }
    public ClassDeclaration classDeclaration() {
        return getRule(ClassDeclaration.class,0);
    }
    public Statements statement() {
        return getRule(Statements.class,0);
    }
    public BlockStatement(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_blockStatement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterBlockStatement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitBlockStatement(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitBlockStatement(this);
        else return visitor.visitChildren(this);
    }
}
