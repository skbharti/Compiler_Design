package src.SymbolsAndScopes;

public class VariableRecord extends Record{
    public String variableType;


    public VariableRecord(String type){
        this.variableType = type;
    }

    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }
}
