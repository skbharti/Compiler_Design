import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyParser {
    public static final String INPUT_FILE = "input";
    public static boolean start =  false;
    public static String sentence = "";

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
        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyJavaListener listener = new MyJavaListener();
        walker.walk(listener,tree);
        System.out.println(tree.toStringTree(parser));
    }
}
