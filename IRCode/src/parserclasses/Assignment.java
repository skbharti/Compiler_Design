package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class Assignment extends Statements {
    public LeftHandSide leftHandSide() {
        return getRule(LeftHandSide.class,0);
    }
    public AssignmentOperator assignmentOperator() {
        return getRule(AssignmentOperator.class,0);
    }
    public Expression expression() {
        return getRule(Expression.class,0);
    }
    public Assignment(Statements parent, int invokingState) {
        super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_assignment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterAssignment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitAssignment(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitAssignment(this);
        else return visitor.visitChildren(this);
    }
}
