package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class EqualityExpression extends Statements {
		public RelationalExpression relationalExpression() {
			return getRule(RelationalExpression.class,0);
		}
		public EqualityExpression equalityExpression() {
			return getRule(EqualityExpression.class,0);
		}
		public EqualityExpression(Statements parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
