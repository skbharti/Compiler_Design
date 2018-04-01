package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

public class StatementExpressionList extends Statements {
		public List<StatementExpression> statementExpression() {
			return getRules(StatementExpression.class);
		}
		public StatementExpression statementExpression(int i) {
			return getRule(StatementExpression.class,i);
		}
		public StatementExpressionList(Statements parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).exitStatementExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}
