package IRCode.src.IRCode;

public class ObjectReferenceIRTuple extends ThreeAddCode{
    public ObjectReferenceIRTuple(String offset,String place){
        arg0 = offset;
        arg1 = place;
    }
    @Override
    public String toString(){
        return arg1+ "="+ arg0+"($sp)";
    }
}
