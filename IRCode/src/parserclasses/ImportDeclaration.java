package IRCode.src.parserclasses;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class ImportDeclaration extends Statements {
    public SingleTypeImportDeclaration singleTypeImportDeclaration() {
        return getRule(SingleTypeImportDeclaration.class,0);
    }
    public TypeImportOnDemandDeclaration typeImportOnDemandDeclaration() {
        return getRule(TypeImportOnDemandDeclaration.class,0);
    }
    public SinglImportDeclaration singlImportDeclaration() {
        return getRule(SinglImportDeclaration.class,0);
    }
    publicImportOnDemandDeclarationImportOnDemandDeclaration() {
        return getRuleImportOnDemandDeclaration.class,0);
    }
    public ImportDeclaration(Statements parent, int invokingState) {
        super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() { return RULE_importDeclaration; }

    @Override
    public void enterRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).enterImportDeclaration(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
        if ( listener instanceof JavaListener) ((JavaListener)listener).exitImportDeclaration(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        if ( visitor instanceof JavaVisitor) return ((JavaVisitor<? extends T>)visitor).visitImportDeclaration(this);
        else return visitor.visitChildren(this);
    }
}
