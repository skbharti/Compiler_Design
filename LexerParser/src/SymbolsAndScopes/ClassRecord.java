package src.SymbolsAndScopes;

import java.util.HashMap;

public class ClassRecord extends Record {
    private Scope classScope;
    private HashMap<String, VariableRecord> classVariables;
    private HashMap<String, MethodRecord> classMethods;

    public ClassRecord(){
    }

    public ClassRecord(Scope classScope){
        this.classScope = classScope;
    }

    public HashMap<String, VariableRecord> getClassVariables() {
        return classVariables;
    }

    public HashMap<String, MethodRecord> getClassMethods() {
        return classMethods;
    }

    public void insertClassVariables(String variableName, VariableRecord variableRecord) {
        this.classVariables.put(variableName, variableRecord);
    }

    public void insertClassMethods(String methodName, MethodRecord methodRecord) {
        this.classMethods.put(methodName, methodRecord);
    }

    public void setClassScope(Scope classScope) {
        this.classScope = classScope;
    }

    public Scope getClassScope() {
        return classScope;
    }
}
