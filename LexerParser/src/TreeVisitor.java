package src;

import IRCode.src.IRCode.ThreeAddCode;
import src.Node.*;

import java.util.ArrayList;

public class TreeVisitor extends JavaBaseVisitor {
    ArrayList<ThreeAddCode> globalIRList = new ArrayList<>();

    int tempCounter = 0;

    public String getVar()
    {
        return  "var"+tempCounter++;
    }



    public int visit(AddExpression node) {
        return 0;
    }

    public int visit(AndExpression node) {
        Node child1 = node.getChild(0);
        child1.place = getVar();
        Node child2 = node.getChild(2);
        child2.place = getVar();
        child1.accept(this);
        child2.accept(this);
        globalIRList.add(new IRCode.src.IRCode.AssignmentIRTuple("and",node.place,child1.place, child2.place));
        return 0;
    }

    public int visit(ArrayAccessExpression node) {
        Node child1 = node.getChild(0);
        child1.place = getVar();
        Node child2 = node.getChild(2);
        child2.place = getVar();
        child1.accept(this);
        child2.accept(this);
        globalIRList.add(new IRCode.src.IRCode.AssignmentIRTuple("and",node.place,child1.place, child2.place));
        return 0;
        return 0;
    }

    public int visit(ArrayAssignmentStatement node) {
        return 0;
    }

    public int visit(ArrayInstantiationExpression node) {
        return 0;
    }

    public int visit(ArrayLengthExpression node) {
        return 0;
    }

    public int visit(BooleanLitExpression node) {
        return 0;
    }

    public int visit(ClassDeclaration node) {
        return 0;
    }

    public int visit(Dims node) {
        return 0;
    }

    public int visit(ElseBlock node) {
        return 0;
    }

    public int visit(FieldDeclaration node) {
        return 0;
    }

    public int visit(Goal node) {
        return 0;
    }

    public int visit(IdentifierExpression node) {
        return 0;
    }

    public int visit(IfBlock node) {
        return 0;
    }

    public int visit(IfElseStatement node) {
        return 0;
    }

    public int visit(IntLitExpression node) {
        return 0;
    }

    public int visit(LocalDeclaration node) {
        return 0;
    }

    public int visit(LtExpression node) {
        return 0;
    }

    public int visit(MainClass node) {
        return 0;
    }

    public int visit(MethodBody node) {
        return 0;
    }

    public int visit(MethodCallExpression node) {
        return 0;
    }

    public int visit(MethodDeclaration node) {
        return 0;
    }

    public int visit(MulExpression node) {
        return 0;
    }

    public int visit(NestedStatement node) {
        return 0;
    }

    public int visit(NotExpression node) {
        return 0;
    }

    public int visit(ObjectInstantiationExpression node) {
        return 0;
    }

    public int visit(Parameter node) {
        return 0;
    }

    public int visit(ParameterList node) {
        return 0;
    }

    public int visit(ParenExpression node) {
        return 0;
    }

    public int visit(PowExpression node) {
        return 0;
    }

    public int visit(PrintStatement node) {
        return 0;
    }

    public int visit(SubExpression node) {
        return 0;
    }

    public int visit(ThisExpression node) {
        return 0;
    }

    public int visit(Type node) {
        return 0;
    }

    public int visit(VarDeclaration node) {
        return 0;
    }

    public int visit(VariableAssignmentStatement node) {
        return 0;
    }

    public int visit(WhileBlock node) {
        return 0;
    }

    public int visit(WhileStatement node) {
        return 0;
    }


}

