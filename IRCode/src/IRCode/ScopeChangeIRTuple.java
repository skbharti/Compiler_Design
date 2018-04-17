package IRCode.src.IRCode;

public class ScopeChangeIRTuple extends ThreeAddCode{

    public ScopeChangeIRTuple(String exitTrue,String enterScopeName,String exitScopeName){
        opcode = exitTrue;
        arg0 = enterScopeName;
        arg1 = exitScopeName;
    }

    @Override
    public String toString() {
        return "exit"+opcode+" change"+arg1+"->"+arg0;
    }
}
