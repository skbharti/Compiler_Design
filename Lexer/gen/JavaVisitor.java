// Generated from /media/shubham/GyanSangraha/Courses/CS335/Compiler_Design/Lexer/src/Java.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(JavaParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(JavaParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(JavaParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(JavaParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(JavaParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(JavaParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(JavaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(JavaParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(JavaParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(JavaParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JavaParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JavaParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JavaParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(JavaParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JavaParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(JavaParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(JavaParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(JavaParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(JavaParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(JavaParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(JavaParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(JavaParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(JavaParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(JavaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(JavaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(JavaParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(JavaParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(JavaParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(JavaParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JavaParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(JavaParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(JavaParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(JavaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(JavaParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(JavaParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(JavaParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(JavaParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(JavaParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(JavaParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JavaParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JavaParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(JavaParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(JavaParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(JavaParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(JavaParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(JavaParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(JavaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(JavaParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(JavaParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(JavaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(JavaParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(JavaParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(JavaParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(JavaParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(JavaParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(JavaParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JavaParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(JavaParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(JavaParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(JavaParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(JavaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(JavaParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(JavaParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(JavaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JavaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(JavaParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(JavaParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(JavaParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(JavaParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(JavaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JavaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(JavaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(JavaParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(JavaParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JavaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(JavaParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(JavaParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JavaParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JavaParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JavaParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(JavaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(JavaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(JavaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(JavaParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JavaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(JavaParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JavaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(JavaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(JavaParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(JavaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(JavaParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(JavaParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(JavaParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(JavaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(JavaParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(JavaParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(JavaParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(JavaParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(JavaParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JavaParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(JavaParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(JavaParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(JavaParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(JavaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(JavaParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(JavaParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(JavaParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(JavaParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JavaParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(JavaParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(JavaParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(JavaParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(JavaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(JavaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(JavaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(JavaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(JavaParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JavaParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JavaParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(JavaParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JavaParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JavaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JavaParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(JavaParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(JavaParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(JavaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(JavaParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(JavaParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(JavaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(JavaParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(JavaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(JavaParser.CastExpressionContext ctx);
}