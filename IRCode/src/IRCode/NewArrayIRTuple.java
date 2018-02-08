package IRCode;

public class NewArrayIRTuple extends ThreeAddressTuple {

    public NewArrayIRTuple(Object assignVariable, Object arrayType, Object count){
        opcode = "new";
        arg0 = arrayType;
        arg1 = count;
        result = assignVariable;
    }

    @Override
    public String toString() {
        if(arg1.toString().contentEquals("null"))
            return result+" = "+opcode+" "+arg0+"[]";

        else
            return result+" = "+opcode+" "+arg0+"["+arg1+"]";
    }
}
