package src;

import IRCode.src.CodeGenerator.CodeGen;
import IRCode.src.FlowGraph.FullProgramRegAlloc;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import src.SymbolsAndScopes.GlobalRecord;
import src.SymbolsAndScopes.Scope;

import java.io.*;
import java.util.HashMap;

public class MyParser {
    public static final String INPUT_FILE = "input";
    public static String sentence = "";
    public static BufferedWriter writer;
    public static CodeGen codegen;
    public static HashMap<String,Scope> scopeMapping = new HashMap<>();
    public static Scope globalScope = new Scope(null, Scope.GLOBAL);
    public static Scope currentScope = globalScope;
    public static GlobalRecord globalRecord = new GlobalRecord();
    public static void main(String args[]) throws Exception {
    FileInputStream fileInputStream = new FileInputStream(INPUT_FILE);
    JavaLexer lexer = new JavaLexer(new ANTLRInputStream(fileInputStream));
    writer = new BufferedWriter(new FileWriter("mips.s"));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    JavaParser parser = new JavaParser(tokenStream);
    JavaParser.GoalContext tree = parser.goal();
    ParseTreeWalker walker = new ParseTreeWalker();
    MyJavaListener listener = new MyJavaListener();
    walker.walk(listener, tree);
    codegen = new CodeGen();
    FullProgramRegAlloc f = new FullProgramRegAlloc(tree.codes, scopeMapping);
    f.FullRegAlloc();
    writer.close();
    System.out.println("Derivation Generated. Kindly check root folder for html file!");
    }
}
