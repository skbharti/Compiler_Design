package IRCode.src.IRCode;

public class ParamInitIRTuple extends  ThreeAddCode{

    public ParamInitIRTuple (Object type ,  Object par ){
        opcode = "ParamInit";
        arg0 = type;
        arg1 = par;
        result = null;
    }

    @Override
    public String toString()
    {
        return opcode + " " +  arg0 + " " + arg1;
    }

}
