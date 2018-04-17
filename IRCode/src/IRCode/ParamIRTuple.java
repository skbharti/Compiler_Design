package IRCode.src.IRCode;

public class ParamIRTuple extends  ThreeAddCode{

    public ParamIRTuple ( String par , String paramNum, String parampos){
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
