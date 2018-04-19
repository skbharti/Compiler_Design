// Generated from /media/shubham/GyanSangraha/Courses/CS335/Compiler_Design/LexerParser/src/Java.g4 by ANTLR 4.7
package src;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(JavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(JavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(JavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(JavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(JavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(JavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JavaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JavaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeDim}.
	 * @param ctx the parse tree
	 */
	void enterTypeDim(JavaParser.TypeDimContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeDim}.
	 * @param ctx the parse tree
	 */
	void exitTypeDim(JavaParser.TypeDimContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JavaParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JavaParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNestedStatement(JavaParser.NestedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNestedStatement(JavaParser.NestedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JavaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JavaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(JavaParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(JavaParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(JavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(JavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableAssignmentStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStatement(JavaParser.VariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableAssignmentStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStatement(JavaParser.VariableAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignmentStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentStatement(JavaParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignmentStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentStatement(JavaParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(JavaParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(JavaParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(JavaParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(JavaParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(JavaParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(JavaParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtExpression(JavaParser.LtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtExpression(JavaParser.LtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiationExpression(JavaParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiationExpression(JavaParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtExpression(JavaParser.GtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtExpression(JavaParser.GtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInstantiationExpression(JavaParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInstantiationExpression(JavaParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(JavaParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(JavaParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(JavaParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(JavaParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(JavaParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(JavaParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(JavaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(JavaParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLitExpression(JavaParser.BooleanLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLitExpression(JavaParser.BooleanLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(JavaParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(JavaParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLitExpression(JavaParser.IntLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLitExpression(JavaParser.IntLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decLitExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecLitExpression(JavaParser.DecLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decLitExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecLitExpression(JavaParser.DecLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectMethodCallExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectMethodCallExpression(JavaParser.ObjectMethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectMethodCallExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectMethodCallExpression(JavaParser.ObjectMethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gteExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGteExpression(JavaParser.GteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gteExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGteExpression(JavaParser.GteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEquExpression(JavaParser.EquExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEquExpression(JavaParser.EquExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(JavaParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(JavaParser.ArrayAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JavaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JavaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(JavaParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(JavaParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(JavaParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(JavaParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lteExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLteExpression(JavaParser.LteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lteExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLteExpression(JavaParser.LteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectVariableReferenceExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectVariableReferenceExpression(JavaParser.ObjectVariableReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectVariableReferenceExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectVariableReferenceExpression(JavaParser.ObjectVariableReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(JavaParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(JavaParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(JavaParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(JavaParser.MulExpressionContext ctx);
}