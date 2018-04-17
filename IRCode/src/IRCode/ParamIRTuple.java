package IRCode.src.IRCode;

public class ParamIRTuple extends  ThreeAddCode{

    public ParamIRTuple ( Object par , Object paramNum, Object parampos){
        opcode = "Param";
        arg0 = par;
        arg1 = paramNum;
        result = parampos;
    }

    @Override
    public String toString()
    {
        return opcode + " " + arg0 + " " + arg1;
    }

}
