package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class UnaryExpression extends Statements {
		public PreIncrementExpression preIncrementExpression() {
			return getRule(PreIncrementExpression.class,0);
		}
		public PreDecrementExpression preDecrementExpression() {
			return getRule(PreDecrementExpression.class,0);
		}
		public UnaryExpression unaryExpression() {
			return getRule(UnaryExpression.class,0);
		}
		public UnaryExpressionNotPlusMinus unaryExpressionNotPlusMinus() {
			return getRule(UnaryExpressionNotPlusMinus.class,0);
		}
		public UnaryExpression(Statements parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
