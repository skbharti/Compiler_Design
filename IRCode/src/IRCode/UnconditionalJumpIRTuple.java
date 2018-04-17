package IRCode.src.IRCode;
public class UnconditionalJumpIRTuple extends ThreeAddCode{

    public UnconditionalJumpIRTuple(String label)
    {
        opcode = "goto";
        arg1 = null;
        arg0 = null;
        result = label;
    }

    public String toString()
    {
        return opcode + " " + result;
    }
}