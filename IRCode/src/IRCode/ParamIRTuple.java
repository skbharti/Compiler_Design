package IRCode.src.IRCode;

public class ParamIRTuple extends  ThreeAddCode{

    public ParamIRTuple ( Object par , Object funcName ){
        opcode = "Param";
        arg0 = par;
        arg1 = funcName;
        result = null;
    }

    @Override
    public String toString()
    {
        return opcode + " " + arg0 + " " + arg1;
    }

}
