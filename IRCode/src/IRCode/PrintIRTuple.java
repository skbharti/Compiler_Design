package IRCode.src.IRCode;
public class PrintIRTuple extends ThreeAddCode {

    public PrintIRTuple(String dataType, String value, String newline){
        opcode = dataType;
        arg0 = value;
        arg1 = newline;
        result = null;
    }

    @Override
    public String toString() {
        return opcode+" "+arg0;
    }
}
