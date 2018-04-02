package src;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import src.JavaBaseListener;

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
}
