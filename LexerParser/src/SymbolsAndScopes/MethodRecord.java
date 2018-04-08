package src.SymbolsAndScopes;

import src.JavaParser;

import java.util.List;

public class MethodRecord extends Record {
    private JavaParser.Type returnType;   // can be int/float/boolean/char etc
    private int paramCount;
    private List<JavaParser.Type> paramType;

    public MethodRecord(JavaParser.Type rType, int pCount, List<JavaParser.Type> pType){
        this.returnType = rType;
        this.paramCount = pCount;
        this.paramType = pType;
    }

    public int getParamCount() {
        return paramCount;
    }

    public JavaParser.Type getReturnType() {
        return returnType;
    }

    public List<JavaParser.Type> getParamType() {
        return paramType;
    }

    public void setParamCount(int paramCount) {
        this.paramCount = paramCount;
    }

    public void setParamType(List<JavaParser.Type> paramType) {
        this.paramType = paramType;
    }

    public void setReturnType(JavaParser.Type returnType) {
        this.returnType = returnType;
    }
}
