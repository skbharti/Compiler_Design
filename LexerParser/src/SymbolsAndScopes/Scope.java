package src.SymbolsAndScopes;

import java.util.HashMap;

public class Scope {
    public static final String GLOBAL = "global";
    public static final String METHOD = "method";
    public static final String BLOCK = "block";

    public Scope parentScope;      // The scope inside which this scope lies.
    public String scopeType;        // scopeType can be global/function/block
    protected HashMap<String, Record> symbolTable = new HashMap<String, Record>();

    public Scope(Scope parentScope, String scopeType) {
        this.parentScope = parentScope;
        this.scopeType = scopeType;
    }

    public void insert(String name, Record record) {
        if (symbolTable.containsKey(name)) {
            System.err.println("Symbol table can't contain two same name variable.");
            System.exit(1);
        }
        symbolTable.put(name, record);
    }

    public Record lookup(String name) {
        if (symbolTable.containsKey(name)) {
            return symbolTable.get(name);
        } else if (parentScope != null)
            return parentScope.lookup(name);
        else {
            System.err.println("Symbol table does not have the variable "+name);
            return null;
        }
    }


}
