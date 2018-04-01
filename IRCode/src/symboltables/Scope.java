package IRCode.src.symboltables;


import IRCode.src.helperclasses.ArgumentVariable;

import java.util.HashMap;

public class Scope {


    public String Scopetype; // global, function, / block series number
    public Scope enclosingscope; // record the enclosing scope of current scope
    protected HashMap<String, ArgumentVariable> symbolMap = new HashMap<String, ArgumentVariable>(); // ArgumentVariable


    public Scope(String Scopetype, Scope enclosingscope) // constructor
    {
        this.Scopetype = Scopetype;
        this.enclosingscope = enclosingscope;

    }

    public void addsymbol(String name, String type, String value)// ArgumentVariable

    {
   
        if (symbolMap.containsKey(name)) {
            throw new IllegalArgumentException("DECLARATION ERROR " + name);
        }


        ArgumentVariable ArgumentVariable = new ArgumentVariable(name, type, value);
        symbolMap.put(name, ArgumentVariable);

    }
}