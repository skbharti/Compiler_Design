package IRCode;

public class ReturnIRTuple extends ThreeAddressTuple {

    public ReturnIRTuple(Object a0){
        opcode = "return";
        arg0 = a0;
        arg1 = null;
        result = null;
    }

    @Override
    public String toString() {
        if(arg0 == null)
            return opcode+"";
        else
            return opcode+" "+arg0;
    }
}
