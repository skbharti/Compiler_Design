package IRCode;

public class FunctionCallIRTuple extends ThreeAddressTuple {

    public FunctionCallIRTuple(Object functionName, Object paramValue, Object returnValue){
        opcode = "call";
        arg0 = functionName;
        arg1 = paramValue;
        result = returnValue;
    }

    @Override
    public String toString() {
        if(result == null)
            return opcode+" "+arg0+"("+arg1+")";
        else
            return result+" = "+opcode+" "+arg0+"("+arg1+")";
    }
}

