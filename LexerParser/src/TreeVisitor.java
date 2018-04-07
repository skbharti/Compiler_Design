package src;

import IRCode.src.IRCode.*;
import src.Node.*;
import src.Node.MainClass;

import java.util.ArrayList;

import static IRCode.src.helperclasses.Constants.*;

public class TreeVisitor<T> extends JavaBaseVisitor<T> {
    ArrayList<ThreeAddCode> globalIRList = new ArrayList<>();


    private int tempCounter = 0;
    private int labelCounter = 0;

    public String getVar() {
        return "var" + tempCounter++;
    }

    public String getLablel() {
        return "label" + labelCounter++;
    }


    public void visit(AddExpression node) {
        Node child1 = node.getChild(0);
        child1.place = getVar();
        Node child2 = node.getChild(2);
        child2.place = getVar();
        child1.accept(this);
        child2.accept(this);
        globalIRList.add(new AssignmentIRTuple(ADD, node.place, child1.place, child2.place));

    }

    public void visit(AndExpression node) {
        Node child1 = node.getChild(0);
        child1.place = getVar();
        Node child2 = node.getChild(2);
        child2.place = getVar();
        child1.accept(this);
        child2.accept(this);
        globalIRList.add(new AssignmentIRTuple(AND, node.place, child1.place, child2.place));
    }

    public void visit(ArrayAccessExpression node) {
        //TODO multidimensional
        Node child1 = node.getChild(0);
        child1.place = getVar();
        Node child2 = node.getChild(2);
        child2.place = getVar();
        child1.accept(this);
        child2.accept(this);
        globalIRList.add(new ArrayAssignmentIRTuple(ARRTOVAR, child1.place, child2.place, node.place));
    }

    public void visit(ArrayAssignmentStatement node) {
        //TODO multidimensional
        Node child1 = node.getChild(0);
        child1.place = getVar();
        Node child2 = node.getChild(2);
        child2.place = getVar();
        Node child3 = node.getChild(5);
        child1.place = getVar();
        child1.accept(this);
        child2.accept(this);
        child3.accept(this);
        globalIRList.add(new ArrayAssignmentIRTuple(VARTOARR, child1.place, child2.place, child3.place));
    }

    public void visit(ArrayInstantiationExpression node) {
        //TODO multidimensional
        Node child3 = node.getChild(3);
        child3.place = getVar();
        child3.accept(this);
        globalIRList.add(new NewArrayIRTuple(node.place, "int", child3.place));

    }

    public int visit(ArrayLengthExpression node) {
        return 0;
    }

    public void visit(BooleanLitExpression node) {
        if (node.getText().equals("true"))
            globalIRList.add(new AssignmentIRTuple(ADD, node.place, 0, 1));
        else
            globalIRList.add(new AssignmentIRTuple(ADD, node.place, 0, 0));

    }

    public void visit(ClassDeclaration node) {
        node.getChild(6).accept(this);
    }

    public void visit(Dims node) {
        //TODO multidim arrays
    }

    public void visit(ElseBlock node) {
        node.getChild(0).accept(this);
    }

    public void visit(FieldDeclaration node) {
        //TODO HANDLE declarations
        node.getChild(0).accept(this);
    }

    public void visit(Goal node) {
        //TODO class creation
        node.getChild(0).accept(this);
        node.getChild(1).accept(this);
    }

    public void visit(IdentifierExpression node) {
        globalIRList.add(new AssignmentIRTuple(ADD, node.place, node.getChild(0).getText(), 0));
    }

    public void visit(IfBlock node) {

        node.getChild(0).accept(this);
    }

    public void visit(IfElseStatement node) {
        String labelIf = getLablel();
        String end = getLablel();
        Node childExpr = node.getChild(2);
        Node childElse = node.getChild(6);
        Node childIf = node.getChild(4);
        childExpr.place = getVar();
        childExpr.accept(this);
        globalIRList.add(new ConditionalJumpIRTuple(IFTRUE, childExpr.place, labelIf));
        childElse.accept(this);
        globalIRList.add(new UnconditionalJumpIRTuple(end));
        globalIRList.add(new LabelIRTuple(labelIf));
        childIf.accept(this);
        globalIRList.add(new LabelIRTuple(end));
    }

    public void visit(IntLitExpression node) {
        globalIRList.add(new AssignmentIRTuple(ADD, node.place, node.getChild(0).getText(), 0));
    }

    public void visit(LocalDeclaration node)
    {
        node.getChild(0).accept(this);
    }

    public void visit(LtExpression node) {
        Node child1 = node.getChild(0);
        child1.place = getVar();
        Node child2 = node.getChild(2);
        child2.place = getVar();
        child1.accept(this);
        child2.accept(this);
        globalIRList.add(new AssignmentIRTuple(LT, node.place, child1.place, child2.place));
    }

    public void visit(MainClass node) {
        //TODO object oriented
        node.getChild(14).accept(this);
    }

    public void visit(MethodBody node) {
        node.getChild(0).accept(this);
        node.getChild(1).accept(this);
        Node childReturn = node.getChild(3);
        childReturn.place = getVar();
        childReturn.accept(this);
        globalIRList.add(new ReturnIRTuple(childReturn.place));
    }

    public void visit(MethodCallExpression node) {
        //TODO parameter supply
        globalIRList.add(new FunctionCallIRTuple(node.getChild(0).getText(), "null", node.place));
    }

    public void visit(MethodDeclaration node) {
        globalIRList.add(new LabelIRTuple(node.getChild(2).getText()));
        node.getChild(7).accept(this);
    }

    public void visit(MulExpression node) {
        Node child1 = node.getChild(0);
        child1.place = getVar();
        Node child2 = node.getChild(2);
        child2.place = getVar();
        child1.accept(this);
        child2.accept(this);
        globalIRList.add(new AssignmentIRTuple(MUL, node.place, child1.place, child2.place));
    }

    public void visit(NestedStatement node) {
        node.getChild(0).accept(this);
    }

    public void visit(NotExpression node) {
        Node child1 = node.getChild(1);
        child1.place = getVar();
        child1.accept(this);
        globalIRList.add(new UnaryAssignmentIRTuple(NOT, child1.place, node.place));
    }

    public int visit(ObjectInstantiationExpression node) {
        return 0;
    }

    public int visit(Parameter node) {
        //TODO params in functions
        return 0;
    }

    public int visit(ParameterList node) {
        return 0;
    }

    public void visit(ParenExpression node) {
        node.getChild(1).place = node.place;
        node.getChild(1).accept(this);
    }

    public int visit(PowExpression node) {
        return 0;
    }

    public void visit(PrintStatement node) {
        Node child1 = node.getChild(2);
        child1.place = getVar();
        child1.accept(this);
        globalIRList.add(new PrintIRTuple("int", child1.place));
    }

    public void visit(SubExpression node) {
        Node child1 = node.getChild(0);
        child1.place = getVar();
        Node child2 = node.getChild(2);
        child2.place = getVar();
        child1.accept(this);
        child2.accept(this);
        globalIRList.add(new AssignmentIRTuple(SUB, node.place, child1.place, child2.place));

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

    public void visit(VariableAssignmentStatement node) {
        Node child2 = node.getChild(2);
        Node child0 = node.getChild(0);
        child2.place = getVar();
        child2.accept(this);
        globalIRList.add(new AssignmentIRTuple(ADD, child0.getText(), child2.place, 0));
    }

    public void visit(WhileBlock node) {
        node.getChild(0).accept(this);
    }

    public void visit(WhileStatement node) {
        String labelExpr = getLablel();
        String labelEnd = getLablel();
        globalIRList.add(new LabelIRTuple(labelExpr));
        Node child2 = node.getChild(2);
        child2.place = getVar();
        Node child4 = node.getChild(4);

        child2.accept(this);
        globalIRList.add(new ConditionalJumpIRTuple(IFFALSE, child2.place, labelEnd));
        child4.accept(this);
        globalIRList.add(new UnconditionalJumpIRTuple(labelExpr));
        globalIRList.add(new LabelIRTuple(labelEnd));
    }


}

