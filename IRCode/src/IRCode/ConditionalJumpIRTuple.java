package IRCode;

public class ConditionalJumpIRTuple extends ThreeAddressTuple {

    //if x is true goto LABEL
    public ConditionalJumpIRTuple(Object x, Object label) {
        opcode = "iftrue";       
        arg0 = x;             //x
        arg1 = "goto";        //goto
        result = label;       //LABEL
    }

    public String toString()
    {
        return "if " + arg0 + " istrue then " + arg1 + " " + result;
    }
}