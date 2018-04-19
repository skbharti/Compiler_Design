package src.SymbolsAndScopes;

import src.JavaParser;

public class ClassRecord extends Record {
    private Scope classScope;
    private JavaParser.Type classType;
    public ClassRecord(){
    }

    public ClassRecord(Scope classScope, JavaParser.Type classType){
        this.classScope = classScope;
        this.classType = classType;
    }

    public void setClassScope(Scope classScope) {
        this.classScope = classScope;
    }

    public Scope getClassScope() {
        return classScope;
    }

    public JavaParser.Type getClassType() {
        return classType;
    }
}
