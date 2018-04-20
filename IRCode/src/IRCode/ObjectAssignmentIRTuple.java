package IRCode.src.IRCode;

public class ObjectAssignmentIRTuple extends ThreeAddCode{
    public ObjectAssignmentIRTuple(String offset,String result){
        arg0 = offset;
        this.result = result;
    }
    @Override
    public String toString(){
        return arg0+"($sp)="+result;
    }
}
