package IRCode.src.IRCode;

public class ObjectReferenceIRTuple extends ThreeAddCode{
    public ObjectReferenceIRTuple(String offset,String place, String exactAddress){
        arg0 = offset;
        arg1 = place;
        opcode = exactAddress;
    }
    @Override
    public String toString(){
        return arg1+ "="+ arg0+"($sp)";
    }
}
