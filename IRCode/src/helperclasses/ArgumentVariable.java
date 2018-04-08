package IRCode.src.helperclasses;

import IRCode.src.FlowGraph.AddrTableEntry;
import IRCode.src.IRCode.MainClass;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Hashtable;

public class ArgumentVariable {
    public String type;
    private String value;
    private static BufferedWriter writer = MainClass.writer;;
    public ArgumentVariable(Object arg){
        this.value = (String) arg;
        this.type = getType();
    }

    public String getValue(Hashtable<String,AddrTableEntry> curAddTable) {
        if (type.equals("constant")) {


            return value;
        } else {
            if (curAddTable.containsKey(value)) {

            AddrTableEntry add = curAddTable.get(value);
            String regName = getRegName(add.getReg());
            if (add.getWriteToMemory()) {
                try {
                    writer.write("sw " + regName + ", " + value + "\n");
                } catch (IOException e) {

                }
            }
            return regName;
        }
        System.out.println("No register allocation"+value);
        return "null";
    }
    }
    public static String getRegName(int i){
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