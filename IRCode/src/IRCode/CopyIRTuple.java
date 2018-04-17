package IRCode.src.IRCode;
public class CopyIRTuple extends ThreeAddCode {

    public CopyIRTuple(String assignVariable, String operand) {
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

