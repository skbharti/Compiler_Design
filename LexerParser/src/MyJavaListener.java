package src;

import IRCode.src.IRCode.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import src.SymbolsAndScopes.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.regex.Pattern;

import static IRCode.src.helperclasses.Constants.*;

public class MyJavaListener extends JavaBaseListener {

    public GlobalRecord globalRecord = MyParser.globalRecord;
    private int tempCounter = 0;
    private int labelCounter = 0;
    public Scope currentScope = MyParser.currentScope;
    private boolean errorFlag = false;

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (errorFlag)
            return;
        super.enterEveryRule(ctx);
        replaceParentWithChildren(ctx);
    }


    public String getVar() {
        return "var" + tempCounter++;
    }

    public String getLabel() {
        return "label" + labelCounter++ + currentScope.scopeName;
    }

    public static JavaParser.Type getType(String type) {
        boolean arr = false;
        if (type.contains("[]")) {
            arr = true;
            type = type.replace("[]", "");
        }
        switch (type) {
            case "boolean":
                return arr ? JavaParser.Type.BOOLEAN_ARR : JavaParser.Type.BOOLEAN;
            case "int":
                return arr ? JavaParser.Type.INT_ARR : JavaParser.Type.INT;
            case "float":
                return arr ? JavaParser.Type.FLOAT_ARR : JavaParser.Type.FLOAT;
            case "char":
                return arr ? JavaParser.Type.CHAR_ARR : JavaParser.Type.CHAR;
            default:
                System.out.println("Error in type");
                return JavaParser.Type.VOID;
        }
    }

    public static String getChildList(ParserRuleContext ctx) {
        int len = ctx.getChildCount();

        String childList = "";
        for (int i = 0; i < len; i++) {
            ParseTree child = ctx.getChild(i);
            if (child.getClass().getSimpleName().contentEquals("TerminalNodeImpl"))
                childList += child.getText();
            else if (child.getClass().getSimpleName().contentEquals("ErrorNodeImpl"))
                childList += "";
            else
                childList += child.getClass().getSimpleName();

            if (i < len - 1) childList += "\t";
        }
        return childList;
    }

    public static void replaceParentWithChildren(ParserRuleContext parent) {
        String parentToken = parent.getClass().getSimpleName();
        String childList = getChildList(parent);
        String highlightParentToken = (MyParser.sentence).replaceFirst(Pattern.quote(parentToken), "<b> " + parentToken + " </b>");
        try {
            MyParser.writer.write(highlightParentToken + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        MyParser.sentence = (MyParser.sentence).replaceFirst(Pattern.quote(parentToken), childList);
    }

    @Override
    public void enterGoal(JavaParser.GoalContext ctx) {
        // Initializing global scope and making it current scope.
        currentScope.insertGlobal(globalRecord);

        int numOfClass = ctx.getChildCount() - 1;
        for (int i = 0; i < numOfClass; i++) {
            // Create new scope for every class, with scopeType classClassName. For every class, a classRecord is pushed to global scope to maintain a reference to that classScope.
            JavaParser.Type classType = JavaParser.Type.getType(i+1);
            Scope classScope = new Scope(currentScope, Scope.CLASS + ctx.getChild(i).getChild(1).getText(), classType);
            ClassRecord classRecord = new ClassRecord(classScope, classType);
            globalRecord.insertClassRecord(Scope.CLASS + ctx.getChild(i).getChild(1).getText(), classRecord);
        }

    }


    @Override
    public void exitGoal(JavaParser.GoalContext ctx) {

        JavaParser.MainClassContext child0 = (JavaParser.MainClassContext) ctx.getChild(0);
        ctx.codes.addAll(child0.codes);
        ctx.codes.add(new ExitIRTuple());
        int count = ctx.getChildCount();

        for (int i = 1; i < count - 1; i++) {
            JavaParser.ClassDeclarationContext child1 = (JavaParser.ClassDeclarationContext) ctx.getChild(i);
            ctx.codes.addAll(child1.codes);
        }

    }


    @Override
    public void enterMainClass(JavaParser.MainClassContext ctx) {
        // While entering a class fetch its scope from the class record hashmap stored in global record
        ClassRecord mainClassRecord = globalRecord.getClassRecord(Scope.CLASS + ctx.getChild(1).getText());
        ctx.codes.add(new ScopeChangeIRTuple("false", mainClassRecord.getClassScope().scopeName, currentScope.scopeName));
        currentScope = mainClassRecord.getClassScope();

    }


    @Override
    public void exitMainClass(JavaParser.MainClassContext ctx) {
        JavaParser.StatementContext child14 = (JavaParser.StatementContext) ctx.getChild(14);
        ctx.codes.addAll(child14.codes);
        ctx.codes.add(new ScopeChangeIRTuple("true", currentScope.scopeName, currentScope.parentScope.scopeName));
        currentScope = currentScope.parentScope;
    }


    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        ClassRecord thisClassRecord = globalRecord.getClassRecord(Scope.CLASS + ctx.getChild(1).getText());
        ctx.codes.add(new ScopeChangeIRTuple("false", thisClassRecord.getClassScope().scopeName, currentScope.scopeName));
        currentScope = thisClassRecord.getClassScope();
    }


    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {

        int child_count = ctx.getChildCount();

        for (int i = 0; i < child_count - 1; i++) {
            if (ctx.getChild(i).getClass().getSimpleName().equals("MethodDeclarationContext")) {
                JavaParser.MethodDeclarationContext child6 = (JavaParser.MethodDeclarationContext) ctx.getChild(i);
                ctx.codes.addAll(child6.codes);
            }
        }
        ctx.codes.add(new ScopeChangeIRTuple("true", currentScope.scopeName, currentScope.parentScope.scopeName));

        currentScope = currentScope.parentScope;
    }


    @Override
    public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
    }


    @Override
    public void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        JavaParser.VarDeclarationContext child0 = (JavaParser.VarDeclarationContext) ctx.getChild(0);
        ctx.codes.addAll(child0.codes);
    }


    @Override
    public void enterVarDeclaration(JavaParser.VarDeclarationContext ctx) {
    }


    @Override
    public void exitVarDeclaration(JavaParser.VarDeclarationContext ctx) {
        JavaParser.TypeDimContext typeDimContext = (JavaParser.TypeDimContext) ctx.getChild(0);
        if (typeDimContext.getChildCount() > 1) {

            typeDimContext.numberOfDimensions = (typeDimContext.getChild(1).getChildCount()) / 2;
            System.out.println("Number of dimensions   " + typeDimContext.numberOfDimensions);

            currentScope.insertArray(ctx.getChild(1).getText(), getType(typeDimContext.getChild(0).getText() + "[]"),
                    typeDimContext.numberOfDimensions,
                    null);

        } else {
            currentScope.insertVariable(ctx.getChild(1).getText(), getType(ctx.getChild(0).getText()));
        }

    }


    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        if (ctx.getChild(5) instanceof JavaParser.ParameterListContext) {
            JavaParser.ParameterListContext p = (JavaParser.ParameterListContext) ctx.getChild(5);
            currentScope.insertMethod(ctx.getChild(2).getText(), getType(ctx.getChild(1).getText()), (p.getChildCount() + 1) / 2, p.paramList);
        } else {
            currentScope.insertMethod(ctx.getChild(2).getText(), getType(ctx.getChild(1).getText()), 0, null);
        }
        Scope methodScope = new Scope(currentScope, Scope.METHOD, currentScope.classType);
        ctx.codes.add(new ScopeChangeIRTuple("false", methodScope.scopeName, currentScope.scopeName));
        currentScope = methodScope;
    }

    @Override
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        ctx.codes.add(new LabelIRTuple(ctx.getChild(2).getText() + currentScope.scopeName));
        int child_count = ctx.getChildCount();

        for (int i = 0; i < child_count; i++) {
            if (ctx.getChild(i).getClass().getSimpleName().equals("ParameterListContext")) {
                JavaParser.ParameterListContext childParam = (JavaParser.ParameterListContext) ctx.getChild(i);
                ctx.codes.addAll(childParam.codes);
            }
            if (ctx.getChild(i) instanceof JavaParser.MethodBodyContext) {
                JavaParser.MethodBodyContext child7 = (JavaParser.MethodBodyContext) ctx.getChild(i);
                ctx.codes.addAll(child7.codes);
                JavaParser.TypeDimContext type = (JavaParser.TypeDimContext) ctx.getChild(1);
                ParseTree ctxChild = child7.getChild(child7.getChildCount() - 2);
                if (ctxChild instanceof JavaParser.ExpressionContext) {
                    if (((JavaParser.ExpressionContext) ctxChild).type != getType(type.getText())) {
                        printError((ParserRuleContext) ctxChild);
                        errorFlag = true;
                        return;
                    }
                } else if (getType(type.getText()) != JavaParser.Type.VOID) {
                    printError((ParserRuleContext) ctxChild);
                    errorFlag = true;
                    return;

                }
            }
        }

        ctx.codes.add(new ScopeChangeIRTuple("true", currentScope.scopeName, currentScope.parentScope.scopeName));
        currentScope = currentScope.parentScope;

    }


    @Override
    public void enterParameterList(JavaParser.ParameterListContext ctx) {
    }


    @Override
    public void exitParameterList(JavaParser.ParameterListContext ctx) {

        int child_count = ctx.getChildCount();
        for (int i = 0, paramNum = 0; i < child_count; i++) {
            if (ctx.getChild(i).getClass().getSimpleName().equals("ParameterContext")) {
                JavaParser.ParameterContext childParameter = (JavaParser.ParameterContext) ctx.getChild(i);
                ctx.codes.add(new ParamInitIRTuple(childParameter.getChild(0).getText(), (paramNum++) + "", childParameter.getChild(1).getText()));
            }
        }

    }

    @Override
    public void enterParameter(JavaParser.ParameterContext ctx) {
    }


    @Override
    public void exitParameter(JavaParser.ParameterContext ctx) {

    }


    @Override
    public void enterMethodBody(JavaParser.MethodBodyContext ctx) {

        int child_count = ctx.getChildCount();

        JavaParser.ExpressionContext childReturn = (JavaParser.ExpressionContext) ctx.getChild(child_count - 2);
        childReturn.place = getVar();


    }


    @Override
    public void exitMethodBody(JavaParser.MethodBodyContext ctx) {

        int child_count = ctx.getChildCount();


        for (int i = 0; i < child_count - 3; i++) {
            //System.out.println("MeB Print ---- "+ctx.getChild(i).getClass().getSimpleName());
            JavaParser.StatementContext child1 = (JavaParser.StatementContext) ctx.getChild(i);
            ctx.codes.addAll(child1.codes);
        }


        JavaParser.ExpressionContext childReturn = (JavaParser.ExpressionContext) ctx.getChild(child_count - 2);
        ctx.codes.addAll(childReturn.codes);


        ctx.codes.add(new ReturnIRTuple(childReturn.place));

    }


    @Override
    public void enterType(JavaParser.TypeContext ctx) {
    }


    @Override
    public void exitType(JavaParser.TypeContext ctx) {
    }

    @Override
    public void enterTypeDim(JavaParser.TypeDimContext ctx) {
    }


    @Override
    public void exitTypeDim(JavaParser.TypeDimContext ctx) {
        int childCount = ctx.getChildCount();
        ctx.numberOfDimensions = (childCount - 1) / 2;
    }


    @Override
    public void enterDims(JavaParser.DimsContext ctx) {

    }


    @Override
    public void exitDims(JavaParser.DimsContext ctx) {

    }


    @Override
    public void enterNestedStatement(JavaParser.NestedStatementContext ctx) {
    }


    @Override
    public void exitNestedStatement(JavaParser.NestedStatementContext ctx) {

        int count = ctx.getChildCount();

        for (int i = 1; i < count - 1; i++) {
            JavaParser.StatementContext child0 = (JavaParser.StatementContext) ctx.getChild(i);
            ctx.codes.addAll(child0.codes);
        }

    }

    @Override
    public void exitDeclaration(JavaParser.DeclarationContext ctx) {

    }

    @Override
    public void enterDeclaration(JavaParser.DeclarationContext ctx) {

    }


    @Override
    public void enterIfElseStatement(JavaParser.IfElseStatementContext ctx) {

        JavaParser.ExpressionContext childExpr = (JavaParser.ExpressionContext) ctx.getChild(2);
        JavaParser.ElseBlockContext childElse = (JavaParser.ElseBlockContext) ctx.getChild(6);
        JavaParser.IfBlockContext childIf = (JavaParser.IfBlockContext) ctx.getChild(4);


        childExpr.place = getVar();


    }


    @Override
    public void exitIfElseStatement(JavaParser.IfElseStatementContext ctx) {

        JavaParser.ExpressionContext childExpr = (JavaParser.ExpressionContext) ctx.getChild(2);
        JavaParser.ElseBlockContext childElse = (JavaParser.ElseBlockContext) ctx.getChild(6);
        JavaParser.IfBlockContext childIf = (JavaParser.IfBlockContext) ctx.getChild(4);

        String labelIf = getLabel();
        String end = getLabel();
        if (childExpr.type != JavaParser.Type.BOOLEAN && childExpr.type != JavaParser.Type.INT) {
            printError(childExpr);
            errorFlag = true;
            return;
        }
        ctx.codes.addAll(childExpr.codes);
        ctx.codes.add(new StoreStackIRTuple());
        ctx.codes.add(new ConditionalJumpIRTuple(IFTRUE, childExpr.place, labelIf));
        ctx.codes.addAll(childElse.codes);
        ctx.codes.add(new StoreStackIRTuple());
        ctx.codes.add(new UnconditionalJumpIRTuple(end));
        ctx.codes.add(new LabelIRTuple(labelIf));
        ctx.codes.addAll(childIf.codes);
        ctx.codes.add(new StoreStackIRTuple());
        ctx.codes.add(new LabelIRTuple(end));

    }


    @Override
    public void enterWhileStatement(JavaParser.WhileStatementContext ctx) {
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        child2.place = getVar();
        Scope blockScope = new Scope(currentScope, Scope.BLOCK, currentScope.classType);
        ctx.codes.add(new ScopeChangeIRTuple("false", blockScope.scopeName, currentScope.scopeName));
        currentScope = blockScope;
    }


    @Override
    public void exitWhileStatement(JavaParser.WhileStatementContext ctx) {
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        String labelExpr = getLabel();
        String labelEnd = getLabel();
        if (child2.type != JavaParser.Type.BOOLEAN && child2.type != JavaParser.Type.INT) {
            printError(child2);
            errorFlag = true;
            return;
        }
        ctx.codes.add(new StoreStackIRTuple());
        ctx.codes.add(new LabelIRTuple(labelExpr));
        ctx.codes.addAll(child2.codes);
        ctx.codes.add(new StoreStackIRTuple());
        ctx.codes.add(new ConditionalJumpIRTuple(IFFALSE, child2.place, labelEnd));
        ctx.codes.addAll(((JavaParser.WhileBlockContext) ctx.getChild(4)).codes);
        ctx.codes.add(new StoreStackIRTuple());
        ctx.codes.add(new UnconditionalJumpIRTuple(labelExpr));
        ctx.codes.add(new LabelIRTuple(labelEnd));
        ctx.codes.add(new ScopeChangeIRTuple("true", currentScope.scopeName, currentScope.parentScope.scopeName));
        currentScope = currentScope.parentScope;
    }


    @Override
    public void enterForStatement(JavaParser.ForStatementContext ctx) {
        JavaParser.ExpressionContext child4 = (JavaParser.ExpressionContext) ctx.getChild(4);
        child4.place = getVar();
        Scope blockScope = new Scope(currentScope, Scope.BLOCK, currentScope.classType);
        ctx.codes.add(new ScopeChangeIRTuple("false", blockScope.scopeName, currentScope.scopeName));
        currentScope = blockScope;
    }


    @Override
    public void exitForStatement(JavaParser.ForStatementContext ctx) {
        JavaParser.StatementContext child2 = (JavaParser.StatementContext) ctx.getChild(2);
        JavaParser.StatementContext child6 = (JavaParser.StatementContext) ctx.getChild(6);
        JavaParser.ExpressionContext child4 = (JavaParser.ExpressionContext) ctx.getChild(4);
        JavaParser.WhileBlockContext child8 = (JavaParser.WhileBlockContext) ctx.getChild(8);
        String labelExpr = getLabel();
        String labelEnd = getLabel();
        if (child4.type != JavaParser.Type.BOOLEAN && child4.type != JavaParser.Type.INT) {
            printError(child4);
            errorFlag = true;
            return;
        }
        ctx.codes.add(new StoreStackIRTuple());
        ctx.codes.addAll(child2.codes);
        ctx.codes.add(new LabelIRTuple(labelExpr));
        ctx.codes.addAll(child4.codes);
        ctx.codes.add(new StoreStackIRTuple());
        ctx.codes.add(new ConditionalJumpIRTuple(IFFALSE, child4.place, labelEnd));
        ctx.codes.addAll(child8.codes);
        ctx.codes.addAll(child6.codes);
        ctx.codes.add(new StoreStackIRTuple());
        ctx.codes.add(new UnconditionalJumpIRTuple(labelExpr));
        ctx.codes.add(new LabelIRTuple(labelEnd));
        ctx.codes.add(new ScopeChangeIRTuple("true", currentScope.scopeName, currentScope.parentScope.scopeName));

        currentScope = currentScope.parentScope;
    }


    @Override
    public void enterPrintStatement(JavaParser.PrintStatementContext ctx) {
        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(2);
        child1.place = getVar();

    }


    @Override
    public void exitPrintStatement(JavaParser.PrintStatementContext ctx) {

        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(2);
        ctx.codes.addAll(child1.codes);

        // checkpoint whether any class type or current class type
        if (JavaParser.Type.isClassType(child1.type) || JavaParser.Type.ARRAY.contains(child1.type)) {
            printError(child1);
            errorFlag = true;
            return;
        }
        ctx.codes.add(new PrintIRTuple(child1.type.toString(), child1.place));
    }


    @Override
    public void enterVariableAssignmentStatement(JavaParser.VariableAssignmentStatementContext ctx) {
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        child2.place = getVar();
    }


    @Override
    public void exitVariableAssignmentStatement(JavaParser.VariableAssignmentStatementContext ctx) {

        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        String child0 = ctx.getChild(0).getText();
        try {
            Record bRecord = currentScope.lookup(child0);
            if ((bRecord instanceof VariableRecord) && ((VariableRecord) bRecord).getVariableType() != child2.type) {
                printError(child2);
                errorFlag = true;
                return;
            } else if ((bRecord instanceof ArrayRecord) && ((ArrayRecord) bRecord).getArrayType() != child2.type) {
                printError(child2);
                errorFlag = true;
                return;
            }
        } catch (Exception e) {
            System.err.println(e);
            printError(ctx);
            errorFlag = true;
            return;
        }
        ctx.codes.addAll(child2.codes);
        ctx.codes.add(new AssignmentIRTuple(ADD, (ctx.getChild(0)).getText(), child2.place, "0"));
    }


    @Override
    public void enterArrayAssignmentStatement(JavaParser.ArrayAssignmentStatementContext ctx) {

        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        JavaParser.ExpressionContext child3 = (JavaParser.ExpressionContext) ctx.getChild(5);

        child2.place = getVar();
        child3.place = getVar();

    }


    @Override
    public void exitArrayAssignmentStatement(JavaParser.ArrayAssignmentStatementContext ctx) {
        ParserRuleContext child0 = (ParserRuleContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        JavaParser.ExpressionContext child3 = (JavaParser.ExpressionContext) ctx.getChild(5);
        try {
            currentScope.lookup(child0.getText());
            if (JavaParser.Type.arrToNormal(((VariableRecord) currentScope.lookup(child0.getText())).getVariableType()) != child3.type) {
                printError(child3);
                errorFlag = true;
                return;
            }
        } catch (Exception e) {
            System.err.println(e);
            printError(child0);
            errorFlag = true;
            return;
        }
        if (child2.type != JavaParser.Type.INT) {
            printError(child2);
            errorFlag = true;
            return;
        }

        ctx.codes.addAll(child2.codes);
        ctx.codes.addAll(child3.codes);
        ctx.codes.add(new ArrayAssignmentIRTuple(VARTOARR, ctx.getChild(0).getText(), child2.place, child3.place));

    }


    @Override
    public void enterIfBlock(JavaParser.IfBlockContext ctx) {
        Scope blockScope = new Scope(currentScope, Scope.BLOCK, currentScope.classType);
        ctx.codes.add(new ScopeChangeIRTuple("false", blockScope.scopeName, currentScope.scopeName));
        currentScope = blockScope;
    }


    @Override
    public void exitIfBlock(JavaParser.IfBlockContext ctx) {

        JavaParser.StatementContext child0 = (JavaParser.StatementContext) ctx.getChild(0);
        ctx.codes.addAll(child0.codes);
        ctx.codes.add(new ScopeChangeIRTuple("true", currentScope.scopeName, currentScope.parentScope.scopeName));

        currentScope = currentScope.parentScope;
    }


    @Override
    public void enterElseBlock(JavaParser.ElseBlockContext ctx) {
        Scope blockScope = new Scope(currentScope, Scope.BLOCK, currentScope.classType);
        ctx.codes.add(new ScopeChangeIRTuple("false", blockScope.scopeName, currentScope.scopeName));
        currentScope = blockScope;
    }


    @Override
    public void exitElseBlock(JavaParser.ElseBlockContext ctx) {
        JavaParser.StatementContext child0 = (JavaParser.StatementContext) ctx.getChild(0);
        ctx.codes.addAll(child0.codes);
        ctx.codes.add(new ScopeChangeIRTuple("true", currentScope.scopeName, currentScope.parentScope.scopeName));
        currentScope = currentScope.parentScope;

    }


    @Override
    public void enterWhileBlock(JavaParser.WhileBlockContext ctx) {
        Scope blockScope = new Scope(currentScope, Scope.BLOCK, currentScope.classType);
        ctx.codes.add(new ScopeChangeIRTuple("false", blockScope.scopeName, currentScope.scopeName));
        currentScope = blockScope;
    }


    @Override
    public void exitWhileBlock(JavaParser.WhileBlockContext ctx) {
        JavaParser.StatementContext child0 = (JavaParser.StatementContext) ctx.getChild(0);
        ctx.codes.addAll(child0.codes);
        ctx.codes.add(new ScopeChangeIRTuple("true", currentScope.scopeName, currentScope.parentScope.scopeName));
        currentScope = currentScope.parentScope;
    }


    @Override
    public void enterLtExpression(JavaParser.LtExpressionContext ctx) {
        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);

        child1.place = getVar();
        child2.place = getVar();

    }


    @Override
    public void exitLtExpression(JavaParser.LtExpressionContext ctx) {
        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        if (child1.type != JavaParser.Type.BOOLEAN && child1.type != JavaParser.Type.INT && child1.type != JavaParser.Type.FLOAT) {
            printError(child1);
            errorFlag = true;
            return;
        }
        if (child2.type != JavaParser.Type.BOOLEAN && child2.type != JavaParser.Type.INT && child1.type != JavaParser.Type.FLOAT) {
            printError(child2);
            errorFlag = true;
            return;
        }
        ctx.type = JavaParser.Type.BOOLEAN;
        ctx.codes.addAll(child1.codes);
        ctx.codes.addAll(child2.codes);
        ctx.codes.add(new AssignmentIRTuple(LT, ctx.place, child1.place, child2.place));
    }


    @Override
    public void enterObjectInstantiationExpression(JavaParser.ObjectInstantiationExpressionContext ctx) {
    }


    @Override
    public void exitObjectInstantiationExpression(JavaParser.ObjectInstantiationExpressionContext ctx) {
    }


    @Override
    public void enterArrayInstantiationExpression(JavaParser.ArrayInstantiationExpressionContext ctx) {
    }


    @Override
    public void exitArrayInstantiationExpression(JavaParser.ArrayInstantiationExpressionContext ctx) {
        ctx.type = getType(ctx.getChild(1).getText() + "[]");

        String lhsName = ctx.getParent().getChild(0).getText();
        JavaParser.Type lhsType = null;
        int lhsDim = 0;
        try {
            Record record = currentScope.lookup(lhsName);
            if (!(record instanceof ArrayRecord)) {
                System.err.println("Variable not declared!");
            }

            ArrayRecord arrayRecord = (ArrayRecord) currentScope.lookup(lhsName);
            lhsType = arrayRecord.getArrayType();
            lhsDim = arrayRecord.getnumberOfDimensions();
            if (lhsDim != (ctx.getChildCount() - 2) / 3) {
                System.err.println("Array dimensions not matching!");
            }
        } catch (Exception e) {
            System.err.println(e);
            return;
        }

        //type checking for variables
        if (lhsType != getType(ctx.getChild(1).getText() + "[]")) {
            System.err.println("Variable types do not match");
            return;
            //type casting can be implemented here!
        }
        int[] dimensions = new int[(ctx.getChildCount() - 2) / 3];
        for (int j = 0, i = 1; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i - 1).getText().equals("[")) {
                dimensions[j++] = Integer.parseInt(ctx.getChild(i).getText());
            }
        }
        OptionalInt prod = Arrays.stream(dimensions).reduce((x, y) -> x * y);
        if (prod.isPresent())
            ctx.codes.add(new NewArrayIRTuple(ctx.place, ctx.getChild(1).getText(), prod.getAsInt() + ""));
        else {
            printError(ctx);
        }
        currentScope.insertArray(ctx.place, ctx.type, 1, dimensions);

    }

    @Override public void enterObjectMethodCallExpression(JavaParser.ObjectMethodCallExpressionContext ctx) { }

    @Override public void exitObjectMethodCallExpression(JavaParser.ObjectMethodCallExpressionContext ctx) {
        int childCount = ctx.getChildCount();
        for(int i=0; i < childCount; i+=2){
            // check whether identifier is an object
            if(i<childCount-1){
                String identifier = ctx.getChild(i).getText();
                try {
                    JavaParser.Type type = ((VariableRecord) currentScope.lookup(identifier)).getVariableType();
                    ctx.codes.add(new ScopeChangeIRTuple("false", type.name(), currentScope.classType.name()));
                } catch (Exception e) {
                    System.err.println(e);
                    printError(ctx);
                    errorFlag = true;
                    return;
                }
            }
        }
    }


    @Override public void enterObjectVariableReferenceExpression(JavaParser.ObjectVariableReferenceExpressionContext ctx) { }

    @Override public void exitObjectVariableReferenceExpression(JavaParser.ObjectVariableReferenceExpressionContext ctx) {
        int childCount = ctx.getChildCount();

        for(int i=0; i < childCount; i+=2){
            // check whether identifier is an object
            if(i<childCount-1){
                String identifier = ctx.getChild(i).getText();
                try {
                    JavaParser.Type type = ((VariableRecord) currentScope.lookup(identifier)).getVariableType();
                    ctx.codes.add(new ScopeChangeIRTuple("false", type.name(), currentScope.classType.name()));
                } catch (Exception e) {
                    System.err.println(e);
                    printError(ctx);
                    errorFlag = true;
                    return;
                }
            }

        }
    }


    @Override
    public void enterPowExpression(JavaParser.PowExpressionContext ctx) {
    }


    @Override
    public void exitPowExpression(JavaParser.PowExpressionContext ctx) {
    }


    @Override
    public void enterIdentifierExpression(JavaParser.IdentifierExpressionContext ctx) {

    }


    @Override
    public void exitIdentifierExpression(JavaParser.IdentifierExpressionContext ctx) {
        try {
            ctx.type = ((VariableRecord) currentScope.lookup(ctx.getText())).getVariableType();
            ctx.codes.add(new AssignmentIRTuple(ADD, ctx.place, ctx.getText(), "0"));
        } catch (Exception e) {
            System.err.println(e);
            printError(ctx);
            errorFlag = true;
            return;
        }

    }


    @Override
    public void enterMethodCallExpression(JavaParser.MethodCallExpressionContext ctx) {

        int child_count = ctx.getChildCount();

        for (int i = 0; i < child_count; i++) {
            if (ctx.getChild(i) instanceof JavaParser.ExpressionContext) {
                JavaParser.ExpressionContext child = (JavaParser.ExpressionContext) ctx.getChild(i);
                child.place = getVar();
            }
        }

    }


    @Override
    public void exitMethodCallExpression(JavaParser.MethodCallExpressionContext ctx) {
        try {
            MethodRecord methodRecord = (MethodRecord) currentScope.lookup(ctx.getChild(0).getText());

            int child_count = ctx.getChildCount();
            String parampos = getVar();
            int paramNum = 0;
            for (int i = 0; i < child_count; i++) {
                //System.out.println(ctx.getChild(i).getClass().getSimpleName());
                if (ctx.getChild(i) instanceof JavaParser.ExpressionContext) {
                    JavaParser.ExpressionContext child = (JavaParser.ExpressionContext) ctx.getChild(i);
                    ctx.codes.addAll(child.codes);
                    ctx.codes.add(new ParamIRTuple(child.place, (paramNum++) + "", parampos));
                } else if (ctx.getChild(i) instanceof JavaParser.ParameterListContext) {
                    JavaParser.ParameterListContext parameterListContext = (JavaParser.ParameterListContext) ctx.getChild(i);
                    if (parameterListContext.getChildCount() != methodRecord.getParamCount()) {
                        printError(ctx);
                        errorFlag = true;
                        return;
                    }
                    for (i = 0; i < methodRecord.getParamCount(); i++)
                        if (methodRecord.getParamType().get(i) != getType(parameterListContext.getChild(i).getChild(0).getText())) {
                            printError(ctx);
                            errorFlag = true;
                            return;
                        }

                }
            }
            ctx.type = ((VariableRecord) currentScope.lookup(ctx.getChild(0).getText())).getVariableType();
            ctx.codes.add(new StoreStackIRTuple());
            if (paramNum > 0)
                ctx.codes.add(new FunctionCallIRTuple(ctx.getChild(0).getText(), parampos, ctx.place));
            else
                ctx.codes.add(new FunctionCallIRTuple(ctx.getChild(0).getText(), "null", ctx.place));
        } catch (Exception e) {
            System.err.println(e);
            printError(ctx);
            errorFlag = true;
            return;
        }
    }


    @Override
    public void enterNotExpression(JavaParser.NotExpressionContext ctx) {

        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(1);
        child1.place = getVar();

    }


    @Override
    public void exitNotExpression(JavaParser.NotExpressionContext ctx) {
        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(1);
        if (child1.type != JavaParser.Type.BOOLEAN && child1.type != JavaParser.Type.INT) {
            printError(child1);
            errorFlag = true;
            return;
        }
        ctx.type = JavaParser.Type.BOOLEAN;
        ctx.codes.addAll(child1.codes);
        ctx.codes.add(new UnaryAssignmentIRTuple(NOT, child1.place, ctx.place));
    }


    @Override
    public void enterBooleanLitExpression(JavaParser.BooleanLitExpressionContext ctx) {

    }


    @Override
    public void exitBooleanLitExpression(JavaParser.BooleanLitExpressionContext ctx) {
        if (ctx.getText().equals("true"))
            ctx.codes.add(new AssignmentIRTuple(ADD, ctx.place, "0", "1"));
        else
            ctx.codes.add(new AssignmentIRTuple(ADD, ctx.place, "0", "0"));
        ctx.type = JavaParser.Type.BOOLEAN;
    }


    @Override
    public void enterParenExpression(JavaParser.ParenExpressionContext ctx) {

        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(1);
        child1.place = ctx.place;


    }


    @Override
    public void exitParenExpression(JavaParser.ParenExpressionContext ctx) {
        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(1);
        ctx.codes.addAll(child1.codes);
        ctx.type = child1.type;
    }


    @Override
    public void enterIntLitExpression(JavaParser.IntLitExpressionContext ctx) {
    }


    @Override
    public void exitIntLitExpression(JavaParser.IntLitExpressionContext ctx) {
        ctx.codes.add(new AssignmentIRTuple(ADD, ctx.place, ctx.getText(), "0"));
        ctx.type = JavaParser.Type.INT;
    }


    @Override
    public void enterDecLitExpression(JavaParser.DecLitExpressionContext ctx) {
    }

    @Override
    public void exitDecLitExpression(JavaParser.DecLitExpressionContext ctx) {
        //TODO handle floats
        ctx.codes.add(new AssignmentIRTuple(ADD, ctx.place, ctx.getText(), "0"));
        ctx.type = JavaParser.Type.FLOAT;
    }

    @Override
    public void enterAndExpression(JavaParser.AndExpressionContext ctx) {
        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);

        child1.place = getVar();
        child2.place = getVar();
    }


    @Override
    public void exitAndExpression(JavaParser.AndExpressionContext ctx) {
        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        if (child1.type != JavaParser.Type.BOOLEAN && child1.type != JavaParser.Type.INT) {
            printError(child1);
            errorFlag = true;
            return;
        }
        if (child2.type != JavaParser.Type.BOOLEAN && child2.type != JavaParser.Type.INT) {
            printError(child2);
            errorFlag = true;
            return;
        }
        ctx.type = JavaParser.Type.BOOLEAN;
        ctx.codes.addAll(child1.codes);
        ctx.codes.addAll(child2.codes);
        ctx.codes.add(new AssignmentIRTuple(AND, ctx.place, child1.place, child2.place));

    }


    @Override
    public void enterArrayAccessExpression(JavaParser.ArrayAccessExpressionContext ctx) {

        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);

        child1.place = getVar();
        child2.place = getVar();
    }


    @Override
    public void exitArrayAccessExpression(JavaParser.ArrayAccessExpressionContext ctx) {

        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        try {
            Record name = currentScope.lookup(ctx.getChild(0).getText());
            if (child2.type != JavaParser.Type.INT) {
                printError(child2);
                errorFlag = true;
                return;
            }
            if (name == null) {
                printError((ParserRuleContext) ctx.getChild(0));
                errorFlag = true;
                return;
            }
            ctx.type = JavaParser.Type.arrToNormal(((VariableRecord) name).getVariableType());
            ctx.codes.addAll(child1.codes);
            ctx.codes.addAll(child2.codes);
            ctx.codes.add(new ArrayAssignmentIRTuple(ARRTOVAR, child1.place, child2.place, ctx.place));
        } catch (Exception e) {
            System.err.println(e);
        }
    }


    @Override
    public void enterAddExpression(JavaParser.AddExpressionContext ctx) {

        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);

        child1.place = getVar();
        child2.place = getVar();

    }


    @Override
    public void exitAddExpression(JavaParser.AddExpressionContext ctx) {

        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        if (!JavaParser.Type.ARITHEMATIC.contains(child1.type)) {
            printError(child1);
            errorFlag = true;
            return;
        }
        if (!JavaParser.Type.ARITHEMATIC.contains(child2.type)) {
            printError(child2);
            errorFlag = true;
            return;
        }
        if ((child1.type == JavaParser.Type.CHAR
                && !JavaParser.Type.CHARS.contains(child2.type))
                || (child2.type == JavaParser.Type.CHAR
                && !JavaParser.Type.CHARS.contains(child1.type))) {
            printError(ctx);
            errorFlag = true;
            return;
        }
        if (child1.type == JavaParser.Type.FLOAT || child2.type == JavaParser.Type.FLOAT)
            ctx.type = JavaParser.Type.FLOAT;
        else if (child1.type == JavaParser.Type.CHAR || child2.type == JavaParser.Type.CHAR)
            ctx.type = JavaParser.Type.CHAR;
        else ctx.type = JavaParser.Type.INT;

        ctx.codes.addAll(child1.codes);
        ctx.codes.addAll(child2.codes);
        ctx.codes.add(new AssignmentIRTuple(ADD, ctx.place, child1.place, child2.place));

    }


    @Override
    public void enterThisExpression(JavaParser.ThisExpressionContext ctx) {
    }


    @Override
    public void exitThisExpression(JavaParser.ThisExpressionContext ctx) {
    }

    @Override
    public void enterSubExpression(JavaParser.SubExpressionContext ctx) {
        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);

        child1.place = getVar();
        child2.place = getVar();
    }


    @Override
    public void exitSubExpression(JavaParser.SubExpressionContext ctx) {
        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        if (!JavaParser.Type.ARITHEMATIC.contains(child1.type)) {
            printError(child1);
            errorFlag = true;
            return;
        }
        if (!JavaParser.Type.ARITHEMATIC.contains(child2.type)) {
            printError(child2);
            errorFlag = true;
            return;
        }
        if ((child1.type == JavaParser.Type.CHAR
                && !JavaParser.Type.CHARS.contains(child2.type))
                || (child2.type == JavaParser.Type.CHAR
                && !JavaParser.Type.CHARS.contains(child1.type))) {
            printError(ctx);
            errorFlag = true;
            return;
        }
        if (child1.type == JavaParser.Type.FLOAT || child2.type == JavaParser.Type.FLOAT)
            ctx.type = JavaParser.Type.FLOAT;
        else if (child1.type == JavaParser.Type.CHAR || child2.type == JavaParser.Type.CHAR)
            ctx.type = JavaParser.Type.CHAR;
        else ctx.type = JavaParser.Type.INT;

        ctx.codes.addAll(child1.codes);
        ctx.codes.addAll(child2.codes);
        ctx.codes.add(new AssignmentIRTuple(SUB, ctx.place, child1.place, child2.place));
    }


    @Override
    public void enterMulExpression(JavaParser.MulExpressionContext ctx) {
        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);

        child1.place = getVar();
        child2.place = getVar();
    }


    @Override
    public void exitMulExpression(JavaParser.MulExpressionContext ctx) {
        JavaParser.ExpressionContext child1 = (JavaParser.ExpressionContext) ctx.getChild(0);
        JavaParser.ExpressionContext child2 = (JavaParser.ExpressionContext) ctx.getChild(2);
        if (!JavaParser.Type.ARITHEMATIC.contains(child1.type)) {
            printError(child1);
            errorFlag = true;
            return;
        }
        if (!JavaParser.Type.ARITHEMATIC.contains(child2.type)) {
            printError(child2);
            errorFlag = true;
            return;
        }
        if ((child1.type == JavaParser.Type.CHAR
                && !JavaParser.Type.CHARS.contains(child2.type))
                || (child2.type == JavaParser.Type.CHAR
                && !JavaParser.Type.CHARS.contains(child1.type))) {
            printError(ctx);
            errorFlag = true;
            return;
        }
        if (child1.type == JavaParser.Type.FLOAT || child2.type == JavaParser.Type.FLOAT)
            ctx.type = JavaParser.Type.FLOAT;
        else if (child1.type == JavaParser.Type.CHAR || child2.type == JavaParser.Type.CHAR)
            ctx.type = JavaParser.Type.CHAR;
        else ctx.type = JavaParser.Type.INT;

        ctx.codes.addAll(child1.codes);
        ctx.codes.addAll(child2.codes);
        ctx.codes.add(new AssignmentIRTuple(MUL, ctx.place, child1.place, child2.place));

    }


    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode node) {
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
    }

    public void printError(ParserRuleContext ctx) {
        System.err.println("Type Check Error " + ctx.getText());
    }
}
