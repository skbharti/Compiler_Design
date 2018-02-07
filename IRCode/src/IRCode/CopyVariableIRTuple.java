package IRCode;

public class CopyVariableIRTuple extends ThreeAddressTuple {

    public CopyVariableIRTuple(Object a0, Object res) {
        opcode = null;
        arg0 = a0;
        arg1 = null;
        result = res;
    }

    public String toString()
    {
        return result+" = "+arg0;
    }

}
