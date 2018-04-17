package src.SymbolsAndScopes;

import src.JavaParser;

public class VariableRecord extends Record{
    public JavaParser.Type variableType;
    public int stackPointerOffset;
    public VariableRecord(JavaParser.Type type, int stackPointerOffset){
        this.variableType = type;
        this.stackPointerOffset = stackPointerOffset;
    }

    public JavaParser.Type getVariableType() {
        return variableType;
    }

    public void setVariableType(JavaParser.Type variableType) {
        this.variableType = variableType;
    }
}
