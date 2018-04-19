package src.SymbolsAndScopes;

import src.JavaParser;
import src.MyParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Scope {
    public static final String GLOBAL = "global";
    public static final String CLASS = "class";
    public static final String METHOD = "method";
    public static final String BLOCK = "block";
    public JavaParser.Type classType;
    private int stackPointerOffset = 0;
    private static int ScopeCounter = 0;
    public Scope parentScope;      // The scope inside which this scope lies.
    public String scopeType;        // scopeType can be global/function/block
    public HashMap<String, Record> symbolTable = new HashMap<String, Record>();
    public String scopeName;

    public Scope(Scope parentScope, String scopeType){
        if(parentScope!=null){
            System.err.println("ClassType must be passed to child scope");
        }
        this.parentScope = parentScope;
        this.scopeType = scopeType;
        this.scopeName = getScopeName();
        MyParser.scopeMapping.put(this.scopeName,this);
    }

    public Scope(Scope parentScope, String scopeType, JavaParser.Type classType) {
        this.parentScope = parentScope;
        this.scopeType = scopeType;
        this.scopeName = getScopeName();
        this.classType = classType;
        MyParser.scopeMapping.put(this.scopeName,this);
    }

    public int getVariableSize(){
        int count =0;
        for (String key: symbolTable.keySet()) {
            if (symbolTable.get(key) instanceof ArrayRecord || symbolTable.get(key) instanceof VariableRecord)
                count++;
        }
        return count;
    }

    public ArrayList<String> getVariables(){
        ArrayList<String> varNames = new ArrayList<>();
        for (String key: symbolTable.keySet()) {
            if (symbolTable.get(key) instanceof ArrayRecord || symbolTable.get(key) instanceof VariableRecord)
                varNames.add(key);
        }
        return varNames;
    }

    private static String getScopeName() {
        return "_scope" + ScopeCounter++;
    }

    public void insertMethod(String name, JavaParser.Type methodType, int pCount, List<JavaParser.Type> pType) {
        if (symbolTable.containsKey(name)) {
            System.err.println("Symbol table can't contain two same name variable."+name);
            System.exit(1);
        }
        Record record = new MethodRecord(methodType, pCount, pType);
        symbolTable.put(name, record);
    }

    public void insertArray(String name, JavaParser.Type variableType, int dim, int[] dimLenVar) {
        if (symbolTable.containsKey(name)) {
            System.err.println("Symbol table can't contain two same name variable."+name);
            System.exit(1);
        }
        Record record = new ArrayRecord(variableType, dim, dimLenVar, stackPointerOffset);
        stackPointerOffset += 4;
        symbolTable.put(name, record);
    }

    public void insertGlobal(GlobalRecord globalRecord) {
        symbolTable.put(Scope.GLOBAL, globalRecord);
    }

    public void insertVariable(String name, JavaParser.Type variableType) {
        if (symbolTable.containsKey(name)) {

            System.err.println("Symbol table can't contain two same name variable."+name);
            System.exit(1);
        }
        Record record = new VariableRecord(variableType, stackPointerOffset);
        stackPointerOffset += 4;

        symbolTable.put(name, record);
    }


    public int lookupOffset(String name, int offset) {
        if (symbolTable.containsKey(name)) {
            Record record = symbolTable.get(name);
            if (record instanceof VariableRecord)
                return offset - 4 * symbolTable.size() + ((VariableRecord) record).stackPointerOffset;
            else if (record instanceof ArrayRecord)
                return offset - 4 * symbolTable.size() + ((ArrayRecord) record).stackPointerOffset;
            else return 1;
        } else if (parentScope != null) {
            return parentScope.lookupOffset(name, offset - 4 * symbolTable.size());
        }
        else {
            return 1;
        }
    }

    public Record lookup(String name) throws Exception{
        if (symbolTable.containsKey(name)) {
            return symbolTable.get(name);
        } else if (parentScope != null)
            return parentScope.lookup(name);
        else {
            throw new Exception("Symbol table does not have the variable" + name);
        }
    }
}
