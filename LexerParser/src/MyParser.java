package src;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import src.SymbolsAndScopes.Scope;

import java.io.*;

public class MyParser {
    public static final String INPUT_FILE = "input";
    public static String sentence = "";
    public static BufferedWriter writer;
    public static Scope globalScope = new Scope(null, Scope.GLOBAL);
    public static Scope currentScope = globalScope;

    public static void main(String args[]) {
        FileInputStream fileInputStream;
        JavaLexer lexer;

        try {
            fileInputStream = new FileInputStream(INPUT_FILE);
        } catch (FileNotFoundException e) {
            System.err.println("Input file not found!");
            return;
        }

        try {
            lexer = new JavaLexer(new ANTLRInputStream(fileInputStream));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokenStream);
        JavaParser.GoalContext tree = parser.goal();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyJavaListener listener = new MyJavaListener();
        sentence = "<p> "+ JavaParser.GoalContext.class.getSimpleName()+" </p>";

        try {
            writer = new BufferedWriter(new FileWriter("tree_output.html"));
            writer.write("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<body>\n");
        }
        catch (Exception e){
            System.out.println("Output File Not Found Error!");
        }

        walker.walk(listener,tree);

        try {
            writer.write(sentence);
            writer.write("</body>\n" +
                    "</html>");
            writer.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Derivation Generated. Kindly check root folder for html file!");
    }
}
