package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaParser;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MethodReference_lf_primary extends Statements {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArguments typeArguments() {
			return getRule(TypeArguments.class,0);
		}
		public MethodReference_lf_primary(Statements parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).exitMethodReference_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}
