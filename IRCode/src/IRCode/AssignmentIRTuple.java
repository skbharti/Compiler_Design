package IRCode;

public class AssignmentIRTuple extends FourAddressTuple {

    public AssignmentIRTuple(Object op, Object res, Object a0, Object a1){
        opcode = op;
        result = res;
        arg0 = a0;
        arg1 = a1;
    }

    @Override
    public String toString() {
        return result+" = "+arg0+" "+opcode+" "+arg1;
    }
}
