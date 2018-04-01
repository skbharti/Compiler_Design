package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaParser;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class NormalClassDeclaration extends Statements {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassBody classBody() {
			return getRule(ClassBody.class,0);
		}
		public List<ClassModifier> classModifier() {
			return getRules(ClassModifier.class);
		}
		public ClassModifier classModifier(int i) {
			return getRule(ClassModifier.class,i);
		}
		public TypeParameters typeParameters() {
			return getRule(TypeParameters.class,0);
		}
		public Superclass superclass() {
			return getRule(Superclass.class,0);
		}
		public NormalClassDeclaration(Statements parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
