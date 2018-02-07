package IRCode;

public class NewArrayIRTuple extends ThreeAddressTuple {

    public NewArrayIRTuple(Object arrayType, Object count, Object assignVariable){
        opcode = "new";
        arg0 = arrayType;
        arg1 = count;
        result = assignVariable;
    }

    @Override
    public String toString() {
        return result+" = "+opcode+" "+arg0+"["+arg1+"]";
    }
}
