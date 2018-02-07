package IRCode;

public class UnaryAssignmentIRTuple extends ThreeAddressTuple {


    // op a0 res    =>   res = ++ a0
    public UnaryAssignmentIRTuple(Object operator, Object operand, Object assignVariable){
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
