import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.regex.Pattern;

public class MyJavaListener extends JavaBaseListener {

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
        System.out.println(ctx.getText());
    }
}
