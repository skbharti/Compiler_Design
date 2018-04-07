package src;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.regex.Pattern;

public class MyJavaListener extends JavaBaseListener {

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
        replaceParentWithChildren(ctx);
    }

    public static String getChildList(ParserRuleContext ctx){
        int len = ctx.getChildCount();

        String childList="";
        for(int i=0; i<len; i++){
            ParseTree child = ctx.getChild(i);
            if(child.getClass().getSimpleName().contentEquals("TerminalNodeImpl"))
                childList+=child.getText();
            else if(child.getClass().getSimpleName().contentEquals("ErrorNodeImpl"))
                childList+="";
            else
                childList += child.getClass().getSimpleName();

            if(i<len-1) childList+="\t";
        }
        return childList;
    }

    public static void replaceParentWithChildren(ParserRuleContext parent){
        String parentToken = parent.getClass().getSimpleName();
        String childList = getChildList(parent);
        String highlightParentToken = (MyParser.sentence).replaceFirst(Pattern.quote(parentToken), "<b> "+parentToken+" </b>");
        try {
            MyParser.writer.write(highlightParentToken+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        MyParser.sentence = (MyParser.sentence).replaceFirst(Pattern.quote(parentToken), childList);
    }



    @Override public void enterGoal(JavaParser.GoalContext ctx) { }
    
     
    @Override public void exitGoal(JavaParser.GoalContext ctx) { }
    
     
    @Override public void enterMainClass(JavaParser.MainClassContext ctx) { }
    
     
    @Override public void exitMainClass(JavaParser.MainClassContext ctx) { }
    
     
    @Override public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) { }
    
     
    @Override public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) { }
    
     
    @Override public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) { }
    
     
    @Override public void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) { }
    
     
    @Override public void enterLocalDeclaration(JavaParser.LocalDeclarationContext ctx) { }
    
     
    @Override public void exitLocalDeclaration(JavaParser.LocalDeclarationContext ctx) { }
    
     
    @Override public void enterVarDeclaration(JavaParser.VarDeclarationContext ctx) { }
    
     
    @Override public void exitVarDeclaration(JavaParser.VarDeclarationContext ctx) { }
    
     
    @Override public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) { }
    
     
    @Override public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) { }
    
     
    @Override public void enterParameterList(JavaParser.ParameterListContext ctx) { }
    
     
    @Override public void exitParameterList(JavaParser.ParameterListContext ctx) { }
    
     
    @Override public void enterParameter(JavaParser.ParameterContext ctx) { }
    
     
    @Override public void exitParameter(JavaParser.ParameterContext ctx) { }
    
     
    @Override public void enterMethodBody(JavaParser.MethodBodyContext ctx) { }
    
     
    @Override public void exitMethodBody(JavaParser.MethodBodyContext ctx) { }
    
     
    @Override public void enterType(JavaParser.TypeContext ctx) { }
    
     
    @Override public void exitType(JavaParser.TypeContext ctx) { }
    
     
    @Override public void enterDims(JavaParser.DimsContext ctx) { }
    
     
    @Override public void exitDims(JavaParser.DimsContext ctx) { }
    
     
    @Override public void enterNestedStatement(JavaParser.NestedStatementContext ctx) { }
    
     
    @Override public void exitNestedStatement(JavaParser.NestedStatementContext ctx) { }
    
     
    @Override public void enterIfElseStatement(JavaParser.IfElseStatementContext ctx) { }
    
     
    @Override public void exitIfElseStatement(JavaParser.IfElseStatementContext ctx) { }
    
     
    @Override public void enterWhileStatement(JavaParser.WhileStatementContext ctx) { }
    
     
    @Override public void exitWhileStatement(JavaParser.WhileStatementContext ctx) { }
    
     
    @Override public void enterForStatement(JavaParser.ForStatementContext ctx) { }
    
     
    @Override public void exitForStatement(JavaParser.ForStatementContext ctx) { }
    
     
    @Override public void enterPrintStatement(JavaParser.PrintStatementContext ctx) { }
    
     
    @Override public void exitPrintStatement(JavaParser.PrintStatementContext ctx) { }
    
     
    @Override public void enterVariableAssignmentStatement(JavaParser.VariableAssignmentStatementContext ctx) { }
    
     
    @Override public void exitVariableAssignmentStatement(JavaParser.VariableAssignmentStatementContext ctx) { }
    
     
    @Override public void enterArrayAssignmentStatement(JavaParser.ArrayAssignmentStatementContext ctx) { }
    
     
    @Override public void exitArrayAssignmentStatement(JavaParser.ArrayAssignmentStatementContext ctx) { }
    
     
    @Override public void enterIfBlock(JavaParser.IfBlockContext ctx) { }
    
     
    @Override public void exitIfBlock(JavaParser.IfBlockContext ctx) { }
    
     
    @Override public void enterElseBlock(JavaParser.ElseBlockContext ctx) { }
    
     
    @Override public void exitElseBlock(JavaParser.ElseBlockContext ctx) { }
    
     
    @Override public void enterWhileBlock(JavaParser.WhileBlockContext ctx) { }
    
     
    @Override public void exitWhileBlock(JavaParser.WhileBlockContext ctx) { }
    
     
    @Override public void enterLtExpression(JavaParser.LtExpressionContext ctx) { }
    
     
    @Override public void exitLtExpression(JavaParser.LtExpressionContext ctx) { }
    
     
    @Override public void enterObjectInstantiationExpression(JavaParser.ObjectInstantiationExpressionContext ctx) { }
    
     
    @Override public void exitObjectInstantiationExpression(JavaParser.ObjectInstantiationExpressionContext ctx) { }
    
     
    @Override public void enterArrayInstantiationExpression(JavaParser.ArrayInstantiationExpressionContext ctx) { }
    
     
    @Override public void exitArrayInstantiationExpression(JavaParser.ArrayInstantiationExpressionContext ctx) { }
    
     
    @Override public void enterPowExpression(JavaParser.PowExpressionContext ctx) { }
    
     
    @Override public void exitPowExpression(JavaParser.PowExpressionContext ctx) { }
    
     
    @Override public void enterIdentifierExpression(JavaParser.IdentifierExpressionContext ctx) { }
    
     
    @Override public void exitIdentifierExpression(JavaParser.IdentifierExpressionContext ctx) { }
    
     
    @Override public void enterMethodCallExpression(JavaParser.MethodCallExpressionContext ctx) { }
    
     
    @Override public void exitMethodCallExpression(JavaParser.MethodCallExpressionContext ctx) { }
    
     
    @Override public void enterNotExpression(JavaParser.NotExpressionContext ctx) { }
    
     
    @Override public void exitNotExpression(JavaParser.NotExpressionContext ctx) { }
    
     
    @Override public void enterBooleanLitExpression(JavaParser.BooleanLitExpressionContext ctx) { }
    
     
    @Override public void exitBooleanLitExpression(JavaParser.BooleanLitExpressionContext ctx) { }
    
     
    @Override public void enterParenExpression(JavaParser.ParenExpressionContext ctx) { }
    
     
    @Override public void exitParenExpression(JavaParser.ParenExpressionContext ctx) { }
    
     
    @Override public void enterIntLitExpression(JavaParser.IntLitExpressionContext ctx) { }
    
     
    @Override public void exitIntLitExpression(JavaParser.IntLitExpressionContext ctx) { }
    
     
    @Override public void enterAndExpression(JavaParser.AndExpressionContext ctx) { }
    
     
    @Override public void exitAndExpression(JavaParser.AndExpressionContext ctx) { }
    
     
    @Override public void enterArrayAccessExpression(JavaParser.ArrayAccessExpressionContext ctx) { }
    
     
    @Override public void exitArrayAccessExpression(JavaParser.ArrayAccessExpressionContext ctx) { }
    
     
    @Override public void enterAddExpression(JavaParser.AddExpressionContext ctx) { }
    
     
    @Override public void exitAddExpression(JavaParser.AddExpressionContext ctx) { }
    
     
    @Override public void enterThisExpression(JavaParser.ThisExpressionContext ctx) { }
    
     
    @Override public void exitThisExpression(JavaParser.ThisExpressionContext ctx) { }
    
     
    @Override public void enterArrayLengthExpression(JavaParser.ArrayLengthExpressionContext ctx) { }
    
     
    @Override public void exitArrayLengthExpression(JavaParser.ArrayLengthExpressionContext ctx) { }
    
     
    @Override public void enterSubExpression(JavaParser.SubExpressionContext ctx) { }
    
     
    @Override public void exitSubExpression(JavaParser.SubExpressionContext ctx) { }
    
     
    @Override public void enterMulExpression(JavaParser.MulExpressionContext ctx) { }
    
     
    @Override public void exitMulExpression(JavaParser.MulExpressionContext ctx) { }


    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }
    
    
}
