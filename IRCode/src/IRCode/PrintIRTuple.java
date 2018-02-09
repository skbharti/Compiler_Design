package IRCode.src.IRCode;
public class PrintIRTuple extends ThreeAddCode {

    public PrintIRTuple(Object dataType, Object value){
        opcode = dataType;
        arg0 = value;
        arg1 = null;
        result = null;
    }

    @Override
    public String toString() {
        return opcode+" "+arg0;
    }
}
