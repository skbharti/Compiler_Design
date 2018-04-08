package src.SymbolsAndScopes;

import src.JavaParser;

public class VariableRecord extends Record{
    public JavaParser.Type variableType;


    public VariableRecord(JavaParser.Type type){
        this.variableType = type;
    }

    public JavaParser.Type getVariableType() {
        return variableType;
    }

    public void setVariableType(JavaParser.Type variableType) {
        this.variableType = variableType;
    }
}
