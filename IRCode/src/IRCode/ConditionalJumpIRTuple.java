package IRCode;

public class ConditionalJumpIRTuple extends FourAddressTuple{

    //if x is true goto LABEL
    public ConditionalJumpIRTuple(Object x, Object label) {
        opcode = "iftrue";       
        arg0 = x;             //x
        arg1 = "goto";        //goto
        result = label;       //LABEL
    }

    public String toString()
    {
        return opcode + " " + arg0 + " " + arg1 + " " + result;
    }
}