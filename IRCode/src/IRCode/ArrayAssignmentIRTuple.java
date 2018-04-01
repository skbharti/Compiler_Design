package IRCode.src.IRCode;

import static IRCode.src.helperclasses.Constants.*;

public class ArrayAssignmentIRTuple extends ThreeAddCode {

    public ArrayAssignmentIRTuple(Object assignType, Object pointer, Object index, Object assignVariable){
        opcode = assignType;
        arg0 = pointer;
        arg1 = index;
        result = assignVariable;
    }

    @Override
    public String toString() {
        if(opcode.toString().contentEquals(ARRTOVAR))
            return result+" = "+arg0+" ["+arg1+"]";
        else
            return arg0+"["+arg1+"] = "+result;
    }
}
