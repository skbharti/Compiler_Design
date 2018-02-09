package IRCode.src.IRCode;
public class ReturnIRTuple extends ThreeAddCode{


    public ReturnIRTuple(){
        opcode = "return";
        arg0 = null;
        arg1 = null;
        result = null;
    }

    public ReturnIRTuple(Object a0){
        opcode = "return";
        arg0 = a0;
        arg1 = null;
        result = null;
    }

    @Override
    public String toString() {
        if(arg0.toString().contentEquals("null"))
            return opcode+"";
        else
            return opcode+" "+arg0;
    }
}
