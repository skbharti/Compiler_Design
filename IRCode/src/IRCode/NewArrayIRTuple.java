package IRCode.src.IRCode;
public class NewArrayIRTuple extends ThreeAddCode {

    public NewArrayIRTuple(String assignVariable, String arrayType, String count){
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
