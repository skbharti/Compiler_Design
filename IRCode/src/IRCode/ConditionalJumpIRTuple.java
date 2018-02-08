package IRCode;

public class ConditionalJumpIRTuple extends ThreeAddressTuple {

    public ConditionalJumpIRTuple(Object op, Object operand0, Object operand1, Object label) {
        opcode = op;
        arg0 = operand0;             //x
        arg1 = operand1;        //goto
        result = label;       //LABEL
    }

    public ConditionalJumpIRTuple(Object op, Object operand0, Object label) {
        opcode = op;
        arg0 = operand0;             //x
        arg1 = "null";        //goto
        result = label;       //LABEL
    }

    public String toString()
    {
        if(arg1.toString().contentEquals("null"))
            return "if " + arg0 + " " + opcode + " then goto " + result;
        else
            return "if " + arg0 + " " + opcode + " "+ arg1 + " then goto " + result;

    }
}