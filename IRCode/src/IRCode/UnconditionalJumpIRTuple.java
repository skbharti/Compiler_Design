package IRCode;

public class UnconditionalJumpIRTuple extends FourAddressTuple {

    public UnconditionalJumpIRTuple(Object label)
    {
        opcode = "goto";
        arg0 = null;
        arg1 = null;
        result = label;
    }

    public String toString()
    {
        return opcode + " " + result;
    }
}