package IRCode.src.IRCode;

public class ParamInitIRTuple extends  ThreeAddCode{

    public ParamInitIRTuple (String type, String offset ,  String par ){
        opcode = "ParamInit";
        arg0 = offset;
        arg1 = type;
        result = par;
    }

    @Override
    public String toString()
    {
        return opcode + " " +  arg0 + " " + arg1;
    }

}
