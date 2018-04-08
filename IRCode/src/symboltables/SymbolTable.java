package IRCode.src.symboltables;

import src.JavaParser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class SymbolTable {
    protected Stack<Scope> scopestack;
    protected ArrayList<Scope> allscope;

    public SymbolTable() {
        init();
    }
    //TODO
    public JavaParser.Type getType(String name){return JavaParser.Type.INT}
    public boolean lookUp(String name){return true;}
    protected void init() {
        scopestack = new Stack<>();   //check the usage of new class
        allscope = new ArrayList<>();
        Scope globals = new Scope("GLOBAL", null); // no enclosing scope for the Global scope
        scopestack.push(globals);
        allscope.add(globals);
    }

    public Scope pushScope(String scopetype) {            // we need a scopetype here
        Scope enclosingscope = scopestack.peek();
        Scope scope = new Scope(scopetype, enclosingscope);
        scopestack.push(scope);
        allscope.add(scope);
        return scope;
    }


    public Scope pushScopeBack(Scope scope) {            // we need a scopetype here
        scopestack.push(scope);
        return scope;
    }


    public Scope popScope() {
        return scopestack.pop();
    }


    public List<String> checkDuplicate() {
        List<String> nameArray = new ArrayList();
        List<String> outDuplicate = new ArrayList();
        Set<String> array = new HashSet();
        for (Scope scope : scopestack.subList(0, scopestack.size())) {
            nameArray.addAll(scope.symbolMap.keySet());
        }
        for (String k : nameArray) {
            if (!array.add(k)) {
                outDuplicate.add(k);
            }
        }
        return outDuplicate;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Scope scope : scopestack.subList(0, scopestack.size())) {
            sb.append("Symbol table " + scope.Scopetype + "\n" + scope.toString() + "\n");
        }
        String temp = sb.toString().replace("[", "").replace("]", "");
        String temp2 = temp.replaceAll(", ", "");
        return temp2;
    }


}