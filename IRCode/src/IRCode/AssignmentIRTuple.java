package IRCode.src.IRCode;

public class AssignmentIRTuple extends ThreeAddCode {

    public AssignmentIRTuple(Object op, Object assignVariable, Object oprand0, Object oprand1){
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
