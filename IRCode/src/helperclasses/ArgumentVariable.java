package IRCode.src.helperclasses;

import IRCode.src.symboltables.SymbolTable;

public class ArgumentVariable {
    public String type;
    private String value;

    public String getValue(SymbolTable st){
        if(type.equals("constant"))
            return value;
        else
            return st.getReg(value);
    }

}
