package src;

import IRCode.src.IRCode.ThreeAddCode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.ArrayList;

public class Node implements RuleNode {
    public ParserRuleContext parserRuleContext;
    public ArrayList<ThreeAddCode> codes;
    public String place;
    public String start;
    public String end;
    public int value;

    public Node(ParserRuleContext pr) {
        this.parserRuleContext = pr;
    }

    @Override
    public ParserRuleContext getRuleContext() {
        return this.parserRuleContext;
    }

    @Override
    public ParseTree getParent() {

        return parserRuleContext.getParent();
    }

    @Override
    public Node getChild(int i) {
        return (Node) parserRuleContext.getChild(i);
    }

    @Override
    public void setParent(RuleContext ruleContext) {
        parserRuleContext.setParent(ruleContext);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
        return parseTreeVisitor.visit(this);
    }

    @Override
    public String getText() {
        return parserRuleContext.getText();
    }

    @Override
    public String toStringTree(Parser parser) {
        return parserRuleContext.toStringTree(parser);
    }

    @Override
    public Interval getSourceInterval() {
        return parserRuleContext.getSourceInterval();
    }

    @Override
    public Object getPayload() {
        return parserRuleContext.getPayload();
    }

    @Override
    public int getChildCount() {
        return parserRuleContext.getChildCount();
    }

    @Override
    public String toStringTree() {
        return parserRuleContext.toStringTree();
    }


    public class AddExpression extends Node {
        public AddExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class AndExpression extends Node {
        public AndExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class ArrayAccessExpression extends Node {
        public ArrayAccessExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class ArrayAssignmentStatement extends Node {
        public ArrayAssignmentStatement(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class ArrayInstantiationExpression extends Node {
        public ArrayInstantiationExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class ArrayLengthExpression extends Node {
        public ArrayLengthExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class BooleanLitExpression extends Node {
        public BooleanLitExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class ClassDeclaration extends Node {
        public ClassDeclaration(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class Dims extends Node {
        public Dims(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class ElseBlock extends Node {
        public ElseBlock(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class FieldDeclaration extends Node {
        public FieldDeclaration(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class Goal extends Node {
        public Goal(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class IdentifierExpression extends Node {
        public IdentifierExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class IfBlock extends Node {
        public IfBlock(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class IfElseStatement extends Node {
        public IfElseStatement(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class IntLitExpression extends Node {
        public IntLitExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class LocalDeclaration extends Node {
        public LocalDeclaration(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class LtExpression extends Node {
        public LtExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class MainClass extends Node {
        public MainClass(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class MethodBody extends Node {
        public MethodBody(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class MethodCallExpression extends Node {
        public MethodCallExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class MethodDeclaration extends Node {
        public MethodDeclaration(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class MulExpression extends Node {
        public MulExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class NestedStatement extends Node {
        public NestedStatement(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class NotExpression extends Node {
        public NotExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class ObjectInstantiationExpression extends Node {
        public ObjectInstantiationExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class Parameter extends Node {
        public Parameter(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class ParameterList extends Node {
        public ParameterList(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class ParenExpression extends Node {
        public ParenExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class PowExpression extends Node {
        public PowExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class PrintStatement extends Node {
        public PrintStatement(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class SubExpression extends Node {
        public SubExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class ThisExpression extends Node {
        public ThisExpression(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class Type extends Node {
        public Type(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class VarDeclaration extends Node {
        public VarDeclaration(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class VariableAssignmentStatement extends Node {
        public VariableAssignmentStatement(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class WhileBlock extends Node {
        public WhileBlock(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

    public class WhileStatement extends Node {
        public WhileStatement(ParserRuleContext pr) {
            super(pr);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
            return parseTreeVisitor.visit(this);
        }
    }

}
