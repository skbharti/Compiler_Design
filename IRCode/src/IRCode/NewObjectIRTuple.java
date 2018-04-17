package IRCode.src.IRCode;

public class NewObjectIRTuple extends ThreeAddCode{
    public NewObjectIRTuple(String assignVariable, String objectType, String count){
        opcode = "new";
        arg0 = objectType;
        result = assignVariable;
    }
    @Override
    public String toString() {
            return result+" = "+opcode+" "+arg0+"["+arg1+"]";
    }
}
