package src.SymbolsAndScopes;

import src.JavaParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Scope {
    public static final String GLOBAL = "global";
    public static final String CLASS = "class";
    public static final String METHOD = "method";
    public static final String BLOCK = "block";
    public static int stackPointerOffset = 0;

    public static int ScopeCounter = 0;
    public Scope parentScope;      // The scope inside which this scope lies.
    public String scopeType;        // scopeType can be global/function/block
    protected HashMap<String, Record> symbolTable = new HashMap<String, Record>();

    public Scope(Scope parentScope, String scopeType) {
        this.parentScope = parentScope;
        this.scopeType = scopeType;

    }

    public static String getScopeName() {
        return "scope" + ScopeCounter++;
    }

    public void insertMethod(String name, JavaParser.Type methodType, int pCount, List<JavaParser.Type> pType) {
        if (symbolTable.containsKey(name)) {
            System.err.println("Symbol table can't contain two same name variable.");
            System.exit(1);
        }
        Record record = new MethodRecord(methodType, pCount, pType);
        symbolTable.put(name, record);
    }

    public void insertArray(String name, JavaParser.Type variableType, int dim, int[] dimLenVar) {
        if (symbolTable.containsKey(name)) {
            System.err.println("Symbol table can't contain two same name variable.");
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
            System.err.println("Symbol table can't contain two same name variable.");
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
        } else if (parentScope != null)
            return parentScope.lookupOffset(name, offset - 4 * symbolTable.size());
        return 1;
    }

    public Record lookup(String name) {
        if (symbolTable.containsKey(name)) {
            return symbolTable.get(name);
        } else if (parentScope != null)
            return parentScope.lookup(name);
        else {
            System.err.println("Symbol table does not have the variable " + name);
            return null;
        }
    }
}
