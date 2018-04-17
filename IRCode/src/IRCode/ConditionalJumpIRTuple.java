package IRCode.src.IRCode;
public class ConditionalJumpIRTuple extends ThreeAddCode
{

    public ConditionalJumpIRTuple(String op, String operand0, String operand1, String label) {
        opcode = op;
        arg0 = operand0;             //x
        arg1 = operand1;        //goto
        result = label;       //LABEL
    }

    public ConditionalJumpIRTuple(String op, String operand0, String label) {
        opcode = op;
        arg0 = operand0;             //x
        arg1 = "null";        //goto
        result = label;       //LABEL
        //System.out.println("arg1 Null");
    }

    public String toString()
    {
        if(arg1.toString().contentEquals("null")) {
            //System.out.println("arg1 is in toString Null");
            return "if " + arg0 + " " + opcode + " then goto " + result;
        }
        else
            return "if " + arg0 + " " + opcode + " "+ arg1 + " then goto " + result;

    }
}




