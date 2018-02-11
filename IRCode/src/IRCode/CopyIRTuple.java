package IRCode.src.IRCode;
public class CopyIRTuple extends ThreeAddCode {

    public CopyIRTuple(Object assignVariable, Object operand) {
        opcode = null;
        arg0 = operand;
        arg1 = null;
        result = assignVariable;
    }

    public String toString()
    {
        return result+" = "+arg0;
    }

}

