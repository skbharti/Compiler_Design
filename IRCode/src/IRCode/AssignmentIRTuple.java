package IRCode.src.IRCode;

public class AssignmentIRTuple extends ThreeAddCode {

    public AssignmentIRTuple(String op, String assignVariable, String oprand0, String oprand1){
        opcode = op;
        arg0 = oprand0;
        arg1 = oprand1;
        result = assignVariable;
    }

    @Override
    public String toString() {
        return result+" = "+arg0+" "+opcode+" "+arg1;
    }
}
