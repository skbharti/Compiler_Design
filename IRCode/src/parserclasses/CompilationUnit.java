package IRCode.src.parserclasses;

import LexerParser.src.JavaListener;
import LexerParser.src.JavaParser;
import LexerParser.src.JavaVisitor;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class CompilationUnit extends Statements {
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclaration packageDeclaration() {
			return getRule(PackageDeclaration.class,0);
		}
		public List<ImportDeclaration> importDeclaration() {
			return getRules(ImportDeclaration.class);
		}
		public ImportDeclaration importDeclaration(int i) {
			return getRule(ImportDeclaration.class,i);
		}
		public List<TypeDeclaration> typeDeclaration() {
			return getRules(TypeDeclaration.class);
		}
		public TypeDeclaration typeDeclaration(int i) {
			return getRule(TypeDeclaration.class,i);
		}
		public CompilationUnit(Statements parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener) ((JavaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}
