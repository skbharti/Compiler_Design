package src.SymbolsAndScopes;

import java.util.HashMap;

public class ClassRecord extends Record {
    private Scope classScope;

    public ClassRecord(){
    }

    public ClassRecord(Scope classScope){
        this.classScope = classScope;
    }

    public void setClassScope(Scope classScope) {
        this.classScope = classScope;
    }

    public Scope getClassScope() {
        return classScope;
    }
}
