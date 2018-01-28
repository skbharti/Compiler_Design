import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import java.io.ByteArrayInputStream;
import java.io.FileReader;

class Main {

    // function to retrieve index of string y from string array v. Default returns x.
    public static int getIndex(int x, String y, String[]v){
        for(int m = 0; m < v.length; m++){
            if (v[m].equalsIgnoreCase(y)){
                x = m;
            }
        }
        return x;
    }

    public static void main(String[] args) throws Exception {

        String fileContents = "";
        try{
            FileReader fileReader = new FileReader(args[0]);
            int i ;
            while((i =  fileReader.read())!=-1){
                char ch = (char)i;
                fileContents = fileContents + ch;
            }
        }
        catch (Exception e){
            System.out.println("Something Went Word!");
            System.out.println(e.getMessage());
        }

        int ruleLength = JavaLexer.ruleNames.length;
        int[] arr = new int[ruleLength] ;
        String [] lexeme = new String[ruleLength];

        CharStream stream = new ANTLRInputStream(new ByteArrayInputStream(fileContents.toString().getBytes()));
        JavaLexer lexer = new JavaLexer(stream);
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            String tokenType = JavaLexer.VOCABULARY.getSymbolicName(token.getType());
            int index = getIndex(-1,tokenType, JavaLexer.ruleNames);
            arr[index]++;
            if(lexeme[index]!=null){
                if (!(lexeme[index]).contains(token.getText())) {
                    lexeme[index] = lexeme[index] + " " + token.getText();
                }
            }
            else {
                lexeme[index] = token.getText();
            }
        }

        //Printing Token Counts
        System.out.format("%20s %10s %5s %s", "Tokens","Count","     ","Lexemes\n");
        System.out.println("---------------------------------------------------------------");

        for(int i=0; i<ruleLength; i++){
            if(arr[i]>0){
                System.out.format("%20s %10d %5s %s", JavaLexer.ruleNames[i],arr[i],"     ",lexeme[i]);
                System.out.println();
            }
        }
    }
}
