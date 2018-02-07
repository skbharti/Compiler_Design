package IRCode;

public class AssignmentIRTuple extends ThreeAddressTuple {

    public AssignmentIRTuple(Object opcode, Object assignVariable, Object oprand0, Object oprand1){
        opcode = opcode;
        arg0 = oprand0;
        arg1 = oprand1;
        result = assignVariable;
    }

    @Override
    public String toString() {
        return result+" = "+arg0+" "+opcode+" "+arg1;
    }
}