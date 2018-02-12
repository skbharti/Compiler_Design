package IRCode.src.helperclasses;

import IRCode.src.FlowGraph.AddrTableEntry;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Hashtable;

public class ArgumentVariable {
    public String type;
    private String value;
    private BufferedWriter writer;
    public ArgumentVariable(Object arg, BufferedWriter writer){
        this.value = (String) arg;
        this.type = getType();
        this.writer = writer;
    }
    public String getValue(Hashtable<String,AddrTableEntry> curAddTable){
        if(type.equals("constant"))
            return value;
        else {
            AddrTableEntry add = curAddTable.get(value);
            String regName = getRegName(add.getReg());
            if(add.getWriteToMemory()){
                try {
                    writer.write("sw " + regName + ", " + value + "\n");
                }catch(IOException e){

                }
            }
            return regName;
        }
    }
    private String getRegName(int i){
        if (i <= 10)
            return "$t"+(i-1);
        else
            return "$s"+(i-11);
    }
    public String getType(){
        try {
            double d = Double.parseDouble(value);
            return "constant";
        } catch (NumberFormatException e) {
            return "variable";
        }
    }

}