// Generated from /Users/karthikeyan/IdeaProjects/Compiler_Design/LexerParser/src/Java.g4 by ANTLR 4.7
package src;
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
	 * Visit a parse tree produced by the {@code java1}
	 * labeled alternative in {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava1(JavaParser.Java1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java2}
	 * labeled alternative in {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava2(JavaParser.Java2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java3}
	 * labeled alternative in {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava3(JavaParser.Java3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java4}
	 * labeled alternative in {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava4(JavaParser.Java4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java5}
	 * labeled alternative in {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava5(JavaParser.Java5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java6}
	 * labeled alternative in {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava6(JavaParser.Java6Context ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(JavaParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code java7}
	 * labeled alternative in {@link JavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava7(JavaParser.Java7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java8}
	 * labeled alternative in {@link JavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava8(JavaParser.Java8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java9}
	 * labeled alternative in {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava9(JavaParser.Java9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java10}
	 * labeled alternative in {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava10(JavaParser.Java10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java11}
	 * labeled alternative in {@link JavaParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava11(JavaParser.Java11Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java12}
	 * labeled alternative in {@link JavaParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava12(JavaParser.Java12Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java13}
	 * labeled alternative in {@link JavaParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava13(JavaParser.Java13Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java14}
	 * labeled alternative in {@link JavaParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava14(JavaParser.Java14Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java15}
	 * labeled alternative in {@link JavaParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava15(JavaParser.Java15Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java16}
	 * labeled alternative in {@link JavaParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava16(JavaParser.Java16Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java17}
	 * labeled alternative in {@link JavaParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava17(JavaParser.Java17Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java18}
	 * labeled alternative in {@link JavaParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava18(JavaParser.Java18Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java19}
	 * labeled alternative in {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava19(JavaParser.Java19Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java20}
	 * labeled alternative in {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava20(JavaParser.Java20Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java21}
	 * labeled alternative in {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava21(JavaParser.Java21Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java22}
	 * labeled alternative in {@link JavaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava22(JavaParser.Java22Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java23}
	 * labeled alternative in {@link JavaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava23(JavaParser.Java23Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java24}
	 * labeled alternative in {@link JavaParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava24(JavaParser.Java24Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java25}
	 * labeled alternative in {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava25(JavaParser.Java25Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java26}
	 * labeled alternative in {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava26(JavaParser.Java26Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java27}
	 * labeled alternative in {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava27(JavaParser.Java27Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java28}
	 * labeled alternative in {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava28(JavaParser.Java28Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java29}
	 * labeled alternative in {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava29(JavaParser.Java29Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java30}
	 * labeled alternative in {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava30(JavaParser.Java30Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java31}
	 * labeled alternative in {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava31(JavaParser.Java31Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java32}
	 * labeled alternative in {@link JavaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava32(JavaParser.Java32Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java33}
	 * labeled alternative in {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava33(JavaParser.Java33Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java34}
	 * labeled alternative in {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava34(JavaParser.Java34Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java35}
	 * labeled alternative in {@link JavaParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava35(JavaParser.Java35Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java36}
	 * labeled alternative in {@link JavaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava36(JavaParser.Java36Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java37}
	 * labeled alternative in {@link JavaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava37(JavaParser.Java37Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java39}
	 * labeled alternative in {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava39(JavaParser.Java39Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java38}
	 * labeled alternative in {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava38(JavaParser.Java38Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java40}
	 * labeled alternative in {@link JavaParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava40(JavaParser.Java40Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java41}
	 * labeled alternative in {@link JavaParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava41(JavaParser.Java41Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java43}
	 * labeled alternative in {@link JavaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava43(JavaParser.Java43Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java42}
	 * labeled alternative in {@link JavaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava42(JavaParser.Java42Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java44}
	 * labeled alternative in {@link JavaParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava44(JavaParser.Java44Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java45}
	 * labeled alternative in {@link JavaParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava45(JavaParser.Java45Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java46}
	 * labeled alternative in {@link JavaParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava46(JavaParser.Java46Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java48}
	 * labeled alternative in {@link JavaParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava48(JavaParser.Java48Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java47}
	 * labeled alternative in {@link JavaParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava47(JavaParser.Java47Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java49}
	 * labeled alternative in {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava49(JavaParser.Java49Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java50}
	 * labeled alternative in {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava50(JavaParser.Java50Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java51}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava51(JavaParser.Java51Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java52}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava52(JavaParser.Java52Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java53}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava53(JavaParser.Java53Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java54}
	 * labeled alternative in {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava54(JavaParser.Java54Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java55}
	 * labeled alternative in {@link JavaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava55(JavaParser.Java55Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java56}
	 * labeled alternative in {@link JavaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava56(JavaParser.Java56Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java57}
	 * labeled alternative in {@link JavaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava57(JavaParser.Java57Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java58}
	 * labeled alternative in {@link JavaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava58(JavaParser.Java58Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java59}
	 * labeled alternative in {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava59(JavaParser.Java59Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java60}
	 * labeled alternative in {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava60(JavaParser.Java60Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java61}
	 * labeled alternative in {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava61(JavaParser.Java61Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java62}
	 * labeled alternative in {@link JavaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava62(JavaParser.Java62Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java63}
	 * labeled alternative in {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava63(JavaParser.Java63Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java64}
	 * labeled alternative in {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava64(JavaParser.Java64Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java65}
	 * labeled alternative in {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava65(JavaParser.Java65Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java66}
	 * labeled alternative in {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava66(JavaParser.Java66Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java67}
	 * labeled alternative in {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava67(JavaParser.Java67Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java68}
	 * labeled alternative in {@link JavaParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava68(JavaParser.Java68Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java69}
	 * labeled alternative in {@link JavaParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava69(JavaParser.Java69Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java70}
	 * labeled alternative in {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava70(JavaParser.Java70Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java71}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava71(JavaParser.Java71Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java72}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava72(JavaParser.Java72Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java73}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava73(JavaParser.Java73Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java74}
	 * labeled alternative in {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava74(JavaParser.Java74Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java75}
	 * labeled alternative in {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava75(JavaParser.Java75Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java76}
	 * labeled alternative in {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava76(JavaParser.Java76Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java77}
	 * labeled alternative in {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava77(JavaParser.Java77Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java78}
	 * labeled alternative in {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava78(JavaParser.Java78Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java79}
	 * labeled alternative in {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava79(JavaParser.Java79Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java80}
	 * labeled alternative in {@link JavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava80(JavaParser.Java80Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java81}
	 * labeled alternative in {@link JavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava81(JavaParser.Java81Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java82}
	 * labeled alternative in {@link JavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava82(JavaParser.Java82Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java83}
	 * labeled alternative in {@link JavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava83(JavaParser.Java83Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java84}
	 * labeled alternative in {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava84(JavaParser.Java84Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java85}
	 * labeled alternative in {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava85(JavaParser.Java85Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java86}
	 * labeled alternative in {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava86(JavaParser.Java86Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java87}
	 * labeled alternative in {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava87(JavaParser.Java87Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java88}
	 * labeled alternative in {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava88(JavaParser.Java88Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java89}
	 * labeled alternative in {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava89(JavaParser.Java89Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java90}
	 * labeled alternative in {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava90(JavaParser.Java90Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java91}
	 * labeled alternative in {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava91(JavaParser.Java91Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java92}
	 * labeled alternative in {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava92(JavaParser.Java92Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java93}
	 * labeled alternative in {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava93(JavaParser.Java93Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java94}
	 * labeled alternative in {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava94(JavaParser.Java94Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java95}
	 * labeled alternative in {@link JavaParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava95(JavaParser.Java95Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java96}
	 * labeled alternative in {@link JavaParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava96(JavaParser.Java96Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java97}
	 * labeled alternative in {@link JavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava97(JavaParser.Java97Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java98}
	 * labeled alternative in {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava98(JavaParser.Java98Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java99}
	 * labeled alternative in {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava99(JavaParser.Java99Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java100}
	 * labeled alternative in {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava100(JavaParser.Java100Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java101}
	 * labeled alternative in {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava101(JavaParser.Java101Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java102}
	 * labeled alternative in {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava102(JavaParser.Java102Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java103}
	 * labeled alternative in {@link JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava103(JavaParser.Java103Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java104}
	 * labeled alternative in {@link JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava104(JavaParser.Java104Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java105}
	 * labeled alternative in {@link JavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava105(JavaParser.Java105Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java106}
	 * labeled alternative in {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava106(JavaParser.Java106Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java107}
	 * labeled alternative in {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava107(JavaParser.Java107Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java108}
	 * labeled alternative in {@link JavaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava108(JavaParser.Java108Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java109}
	 * labeled alternative in {@link JavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava109(JavaParser.Java109Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java110}
	 * labeled alternative in {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava110(JavaParser.Java110Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java111}
	 * labeled alternative in {@link JavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava111(JavaParser.Java111Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java112}
	 * labeled alternative in {@link JavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava112(JavaParser.Java112Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java113}
	 * labeled alternative in {@link JavaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava113(JavaParser.Java113Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java114}
	 * labeled alternative in {@link JavaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava114(JavaParser.Java114Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java115}
	 * labeled alternative in {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava115(JavaParser.Java115Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java116}
	 * labeled alternative in {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava116(JavaParser.Java116Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java117}
	 * labeled alternative in {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava117(JavaParser.Java117Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java118}
	 * labeled alternative in {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava118(JavaParser.Java118Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java119}
	 * labeled alternative in {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava119(JavaParser.Java119Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java120}
	 * labeled alternative in {@link JavaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava120(JavaParser.Java120Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java121}
	 * labeled alternative in {@link JavaParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava121(JavaParser.Java121Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java122}
	 * labeled alternative in {@link JavaParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava122(JavaParser.Java122Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java123}
	 * labeled alternative in {@link JavaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava123(JavaParser.Java123Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java124}
	 * labeled alternative in {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava124(JavaParser.Java124Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java125}
	 * labeled alternative in {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava125(JavaParser.Java125Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java126}
	 * labeled alternative in {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava126(JavaParser.Java126Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java127}
	 * labeled alternative in {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava127(JavaParser.Java127Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java128}
	 * labeled alternative in {@link JavaParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava128(JavaParser.Java128Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java129}
	 * labeled alternative in {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava129(JavaParser.Java129Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java130}
	 * labeled alternative in {@link JavaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava130(JavaParser.Java130Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java131}
	 * labeled alternative in {@link JavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava131(JavaParser.Java131Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java132}
	 * labeled alternative in {@link JavaParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava132(JavaParser.Java132Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java133}
	 * labeled alternative in {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava133(JavaParser.Java133Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java134}
	 * labeled alternative in {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava134(JavaParser.Java134Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java135}
	 * labeled alternative in {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava135(JavaParser.Java135Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java136}
	 * labeled alternative in {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava136(JavaParser.Java136Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java137}
	 * labeled alternative in {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava137(JavaParser.Java137Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java138}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava138(JavaParser.Java138Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java139}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava139(JavaParser.Java139Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java140}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava140(JavaParser.Java140Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java141}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava141(JavaParser.Java141Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java142}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava142(JavaParser.Java142Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java143}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava143(JavaParser.Java143Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java144}
	 * labeled alternative in {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava144(JavaParser.Java144Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java145}
	 * labeled alternative in {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava145(JavaParser.Java145Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java146}
	 * labeled alternative in {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava146(JavaParser.Java146Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java147}
	 * labeled alternative in {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava147(JavaParser.Java147Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java148}
	 * labeled alternative in {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava148(JavaParser.Java148Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java149}
	 * labeled alternative in {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava149(JavaParser.Java149Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java150}
	 * labeled alternative in {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava150(JavaParser.Java150Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java151}
	 * labeled alternative in {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava151(JavaParser.Java151Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java152}
	 * labeled alternative in {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava152(JavaParser.Java152Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java153}
	 * labeled alternative in {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava153(JavaParser.Java153Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java154}
	 * labeled alternative in {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava154(JavaParser.Java154Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java155}
	 * labeled alternative in {@link JavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava155(JavaParser.Java155Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java156}
	 * labeled alternative in {@link JavaParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava156(JavaParser.Java156Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java157}
	 * labeled alternative in {@link JavaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava157(JavaParser.Java157Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java158}
	 * labeled alternative in {@link JavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava158(JavaParser.Java158Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java159}
	 * labeled alternative in {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava159(JavaParser.Java159Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java160}
	 * labeled alternative in {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava160(JavaParser.Java160Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java161}
	 * labeled alternative in {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava161(JavaParser.Java161Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java162}
	 * labeled alternative in {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava162(JavaParser.Java162Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java163}
	 * labeled alternative in {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava163(JavaParser.Java163Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java164}
	 * labeled alternative in {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava164(JavaParser.Java164Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java165}
	 * labeled alternative in {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava165(JavaParser.Java165Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java166}
	 * labeled alternative in {@link JavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava166(JavaParser.Java166Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java167}
	 * labeled alternative in {@link JavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava167(JavaParser.Java167Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java168}
	 * labeled alternative in {@link JavaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava168(JavaParser.Java168Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java169}
	 * labeled alternative in {@link JavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava169(JavaParser.Java169Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java170}
	 * labeled alternative in {@link JavaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava170(JavaParser.Java170Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java171}
	 * labeled alternative in {@link JavaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava171(JavaParser.Java171Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java172}
	 * labeled alternative in {@link JavaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava172(JavaParser.Java172Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java173}
	 * labeled alternative in {@link JavaParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava173(JavaParser.Java173Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java174}
	 * labeled alternative in {@link JavaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava174(JavaParser.Java174Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java175}
	 * labeled alternative in {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava175(JavaParser.Java175Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java176}
	 * labeled alternative in {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava176(JavaParser.Java176Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java177}
	 * labeled alternative in {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava177(JavaParser.Java177Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java178}
	 * labeled alternative in {@link JavaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava178(JavaParser.Java178Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java179}
	 * labeled alternative in {@link JavaParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava179(JavaParser.Java179Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java180}
	 * labeled alternative in {@link JavaParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava180(JavaParser.Java180Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java181}
	 * labeled alternative in {@link JavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava181(JavaParser.Java181Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java182}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava182(JavaParser.Java182Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java183}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava183(JavaParser.Java183Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java184}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava184(JavaParser.Java184Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java185}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava185(JavaParser.Java185Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java186}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava186(JavaParser.Java186Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java187}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava187(JavaParser.Java187Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java188}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava188(JavaParser.Java188Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java189}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava189(JavaParser.Java189Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java190}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava190(JavaParser.Java190Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java191}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava191(JavaParser.Java191Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java192}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava192(JavaParser.Java192Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java193}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava193(JavaParser.Java193Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java194}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava194(JavaParser.Java194Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java195}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava195(JavaParser.Java195Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java196}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava196(JavaParser.Java196Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java197}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava197(JavaParser.Java197Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java198}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava198(JavaParser.Java198Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java199}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava199(JavaParser.Java199Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java200}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava200(JavaParser.Java200Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java201}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava201(JavaParser.Java201Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java202}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava202(JavaParser.Java202Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java203}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava203(JavaParser.Java203Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java204}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava204(JavaParser.Java204Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java205}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava205(JavaParser.Java205Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java206}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava206(JavaParser.Java206Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java207}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava207(JavaParser.Java207Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java208}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava208(JavaParser.Java208Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java209}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava209(JavaParser.Java209Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java210}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava210(JavaParser.Java210Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java211}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava211(JavaParser.Java211Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java212}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava212(JavaParser.Java212Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java213}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava213(JavaParser.Java213Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java214}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava214(JavaParser.Java214Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java215}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava215(JavaParser.Java215Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java216}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava216(JavaParser.Java216Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java217}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava217(JavaParser.Java217Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java218}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava218(JavaParser.Java218Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java219}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava219(JavaParser.Java219Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java220}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava220(JavaParser.Java220Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java221}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava221(JavaParser.Java221Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java222}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava222(JavaParser.Java222Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java223}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava223(JavaParser.Java223Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java224}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava224(JavaParser.Java224Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java225}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava225(JavaParser.Java225Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java226}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava226(JavaParser.Java226Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java227}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava227(JavaParser.Java227Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java228}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava228(JavaParser.Java228Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java229}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava229(JavaParser.Java229Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java230}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava230(JavaParser.Java230Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java231}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava231(JavaParser.Java231Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java232}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava232(JavaParser.Java232Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java233}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava233(JavaParser.Java233Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java234}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava234(JavaParser.Java234Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java235}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava235(JavaParser.Java235Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java236}
	 * labeled alternative in {@link JavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava236(JavaParser.Java236Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java237}
	 * labeled alternative in {@link JavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava237(JavaParser.Java237Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java238}
	 * labeled alternative in {@link JavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava238(JavaParser.Java238Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java239}
	 * labeled alternative in {@link JavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava239(JavaParser.Java239Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java240}
	 * labeled alternative in {@link JavaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava240(JavaParser.Java240Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java241}
	 * labeled alternative in {@link JavaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava241(JavaParser.Java241Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java242}
	 * labeled alternative in {@link JavaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava242(JavaParser.Java242Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java243}
	 * labeled alternative in {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava243(JavaParser.Java243Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java244}
	 * labeled alternative in {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava244(JavaParser.Java244Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java245}
	 * labeled alternative in {@link JavaParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava245(JavaParser.Java245Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java246}
	 * labeled alternative in {@link JavaParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava246(JavaParser.Java246Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java247}
	 * labeled alternative in {@link JavaParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava247(JavaParser.Java247Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java248}
	 * labeled alternative in {@link JavaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava248(JavaParser.Java248Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java249}
	 * labeled alternative in {@link JavaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava249(JavaParser.Java249Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java250}
	 * labeled alternative in {@link JavaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava250(JavaParser.Java250Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java251}
	 * labeled alternative in {@link JavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava251(JavaParser.Java251Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java252}
	 * labeled alternative in {@link JavaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava252(JavaParser.Java252Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java253}
	 * labeled alternative in {@link JavaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava253(JavaParser.Java253Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java254}
	 * labeled alternative in {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava254(JavaParser.Java254Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java255}
	 * labeled alternative in {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava255(JavaParser.Java255Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java256}
	 * labeled alternative in {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava256(JavaParser.Java256Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java257}
	 * labeled alternative in {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava257(JavaParser.Java257Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java258}
	 * labeled alternative in {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava258(JavaParser.Java258Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java259}
	 * labeled alternative in {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava259(JavaParser.Java259Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java260}
	 * labeled alternative in {@link JavaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava260(JavaParser.Java260Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java261}
	 * labeled alternative in {@link JavaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava261(JavaParser.Java261Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java262}
	 * labeled alternative in {@link JavaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava262(JavaParser.Java262Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java263}
	 * labeled alternative in {@link JavaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava263(JavaParser.Java263Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java264}
	 * labeled alternative in {@link JavaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava264(JavaParser.Java264Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java265}
	 * labeled alternative in {@link JavaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava265(JavaParser.Java265Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java266}
	 * labeled alternative in {@link JavaParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava266(JavaParser.Java266Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java267}
	 * labeled alternative in {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava267(JavaParser.Java267Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java268}
	 * labeled alternative in {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava268(JavaParser.Java268Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java269}
	 * labeled alternative in {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava269(JavaParser.Java269Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java270}
	 * labeled alternative in {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava270(JavaParser.Java270Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java271}
	 * labeled alternative in {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava271(JavaParser.Java271Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java272}
	 * labeled alternative in {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava272(JavaParser.Java272Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java273}
	 * labeled alternative in {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava273(JavaParser.Java273Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java274}
	 * labeled alternative in {@link JavaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava274(JavaParser.Java274Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java275}
	 * labeled alternative in {@link JavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava275(JavaParser.Java275Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java276}
	 * labeled alternative in {@link JavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava276(JavaParser.Java276Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java277}
	 * labeled alternative in {@link JavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava277(JavaParser.Java277Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java278}
	 * labeled alternative in {@link JavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava278(JavaParser.Java278Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java279}
	 * labeled alternative in {@link JavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava279(JavaParser.Java279Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java280}
	 * labeled alternative in {@link JavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava280(JavaParser.Java280Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java281}
	 * labeled alternative in {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava281(JavaParser.Java281Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java282}
	 * labeled alternative in {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava282(JavaParser.Java282Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java283}
	 * labeled alternative in {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava283(JavaParser.Java283Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java284}
	 * labeled alternative in {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava284(JavaParser.Java284Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java285}
	 * labeled alternative in {@link JavaParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava285(JavaParser.Java285Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java286}
	 * labeled alternative in {@link JavaParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava286(JavaParser.Java286Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java287}
	 * labeled alternative in {@link JavaParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava287(JavaParser.Java287Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java288}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava288(JavaParser.Java288Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java289}
	 * labeled alternative in {@link JavaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava289(JavaParser.Java289Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java290}
	 * labeled alternative in {@link JavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava290(JavaParser.Java290Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java291}
	 * labeled alternative in {@link JavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava291(JavaParser.Java291Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java292}
	 * labeled alternative in {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava292(JavaParser.Java292Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java293}
	 * labeled alternative in {@link JavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava293(JavaParser.Java293Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java294}
	 * labeled alternative in {@link JavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava294(JavaParser.Java294Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java295}
	 * labeled alternative in {@link JavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava295(JavaParser.Java295Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java296}
	 * labeled alternative in {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava296(JavaParser.Java296Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java297}
	 * labeled alternative in {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava297(JavaParser.Java297Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java298}
	 * labeled alternative in {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava298(JavaParser.Java298Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java299}
	 * labeled alternative in {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava299(JavaParser.Java299Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java300}
	 * labeled alternative in {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava300(JavaParser.Java300Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java301}
	 * labeled alternative in {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava301(JavaParser.Java301Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java302}
	 * labeled alternative in {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava302(JavaParser.Java302Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java303}
	 * labeled alternative in {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava303(JavaParser.Java303Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java304}
	 * labeled alternative in {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava304(JavaParser.Java304Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java305}
	 * labeled alternative in {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava305(JavaParser.Java305Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java306}
	 * labeled alternative in {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava306(JavaParser.Java306Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java307}
	 * labeled alternative in {@link JavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava307(JavaParser.Java307Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java308}
	 * labeled alternative in {@link JavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava308(JavaParser.Java308Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java310}
	 * labeled alternative in {@link JavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava310(JavaParser.Java310Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java309}
	 * labeled alternative in {@link JavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava309(JavaParser.Java309Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java312}
	 * labeled alternative in {@link JavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava312(JavaParser.Java312Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java311}
	 * labeled alternative in {@link JavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava311(JavaParser.Java311Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java314}
	 * labeled alternative in {@link JavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava314(JavaParser.Java314Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java313}
	 * labeled alternative in {@link JavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava313(JavaParser.Java313Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java316}
	 * labeled alternative in {@link JavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava316(JavaParser.Java316Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java315}
	 * labeled alternative in {@link JavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava315(JavaParser.Java315Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java317}
	 * labeled alternative in {@link JavaParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava317(JavaParser.Java317Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java318}
	 * labeled alternative in {@link JavaParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava318(JavaParser.Java318Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java321}
	 * labeled alternative in {@link JavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava321(JavaParser.Java321Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java320}
	 * labeled alternative in {@link JavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava320(JavaParser.Java320Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java319}
	 * labeled alternative in {@link JavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava319(JavaParser.Java319Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java327}
	 * labeled alternative in {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava327(JavaParser.Java327Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java325}
	 * labeled alternative in {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava325(JavaParser.Java325Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java326}
	 * labeled alternative in {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava326(JavaParser.Java326Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java323}
	 * labeled alternative in {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava323(JavaParser.Java323Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java324}
	 * labeled alternative in {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava324(JavaParser.Java324Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java322}
	 * labeled alternative in {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava322(JavaParser.Java322Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java328}
	 * labeled alternative in {@link JavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava328(JavaParser.Java328Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java330}
	 * labeled alternative in {@link JavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava330(JavaParser.Java330Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java329}
	 * labeled alternative in {@link JavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava329(JavaParser.Java329Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java332}
	 * labeled alternative in {@link JavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava332(JavaParser.Java332Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java333}
	 * labeled alternative in {@link JavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava333(JavaParser.Java333Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java331}
	 * labeled alternative in {@link JavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava331(JavaParser.Java331Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java336}
	 * labeled alternative in {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava336(JavaParser.Java336Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java337}
	 * labeled alternative in {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava337(JavaParser.Java337Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java334}
	 * labeled alternative in {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava334(JavaParser.Java334Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java335}
	 * labeled alternative in {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava335(JavaParser.Java335Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java338}
	 * labeled alternative in {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava338(JavaParser.Java338Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java339}
	 * labeled alternative in {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava339(JavaParser.Java339Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java340}
	 * labeled alternative in {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava340(JavaParser.Java340Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java341}
	 * labeled alternative in {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava341(JavaParser.Java341Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java342}
	 * labeled alternative in {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava342(JavaParser.Java342Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java343}
	 * labeled alternative in {@link JavaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava343(JavaParser.Java343Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java344}
	 * labeled alternative in {@link JavaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava344(JavaParser.Java344Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java345}
	 * labeled alternative in {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava345(JavaParser.Java345Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java346}
	 * labeled alternative in {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava346(JavaParser.Java346Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java347}
	 * labeled alternative in {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava347(JavaParser.Java347Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java348}
	 * labeled alternative in {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava348(JavaParser.Java348Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java349}
	 * labeled alternative in {@link JavaParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava349(JavaParser.Java349Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java350}
	 * labeled alternative in {@link JavaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava350(JavaParser.Java350Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java351}
	 * labeled alternative in {@link JavaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava351(JavaParser.Java351Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java352}
	 * labeled alternative in {@link JavaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava352(JavaParser.Java352Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java353}
	 * labeled alternative in {@link JavaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava353(JavaParser.Java353Context ctx);
	/**
	 * Visit a parse tree produced by the {@code java354}
	 * labeled alternative in {@link JavaParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava354(JavaParser.Java354Context ctx);
}