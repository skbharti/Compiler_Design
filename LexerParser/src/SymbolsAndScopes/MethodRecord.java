package src.SymbolsAndScopes;

public class MethodRecord extends Record {
    private String returnType;   // can be int/float/boolean/char etc
    private int paramCount;
    private String[] paramType;

    public MethodRecord(String rType, int pCount, String[] pType){
        this.returnType = rType;
        this.paramCount = pCount;
        this.paramType = pType;
    }

    public int getParamCount() {
        return paramCount;
    }

    public String getReturnType() {
        return returnType;
    }

    public String[] getParamType() {
        return paramType;
    }

    public void setParamCount(int paramCount) {
        this.paramCount = paramCount;
    }

    public void setParamType(String[] paramType) {
        this.paramType = paramType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }
}
