package IRCode.src.IRCode;
import IRCode.src.IRCode.ThreeAddCode;

public class UnaryAssignmentIRTuple extends ThreeAddCode {


    // op a0 res    =>   res = ++ a0
    public UnaryAssignmentIRTuple(String operator, String operand, String assignVariable){
        opcode = operator;
        arg0 = operand;
        arg1 = null;
        result = assignVariable;
    }

    @Override
    public String toString() {
        return result+" = "+opcode+arg0;
    }
}
