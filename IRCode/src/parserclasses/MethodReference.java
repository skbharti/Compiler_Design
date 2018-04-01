package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaParser;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MethodReference extends Statements {
		public ExpressionName expressionName() {
			return getRule(ExpressionName.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArguments typeArguments() {
			return getRule(TypeArguments.class,0);
		}
		public ReferenceType referenceType() {
			return getRule(ReferenceType.class,0);
		}
		public Primary primary() {
			return getRule(Primary.class,0);
		}
		public TypeName typeName() {
			return getRule(TypeName.class,0);
		}
		public ClassType classType() {
			return getRule(ClassType.class,0);
		}
		public ArrayType arrayType() {
			return getRule(ArrayType.class,0);
		}
		public MethodReference(Statements parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}
