package IRCode.src.IRCode;
public class FunctionCallIRTuple extends ThreeAddCode {

    public FunctionCallIRTuple(String functionName, String paramValue, String returnValue){
        opcode = "call";
        arg0 = functionName;
        arg1 = paramValue;
        result = returnValue;
    }

    @Override
    public String toString() {
        if(result.contentEquals("null")) {
            if(arg1.contentEquals("null"))
                return opcode + " " + arg0 + "()";
            else
                return opcode + " " + arg0 + "(" + arg1 + ")";
        }
        else
            return result+" = "+opcode+" "+arg0+"("+arg1+")";
    }
}

