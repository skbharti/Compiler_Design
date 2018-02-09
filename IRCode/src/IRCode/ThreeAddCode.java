package IRCode.src.IRCode;

public class ThreeAddCode {
        // Operation result = arg0 op arg1
        protected Object opcode;
        protected Object result;
        protected Object arg1;
        protected Object arg2;

    public Object getOpcode() {
        return opcode;
    }

    public void setOpcode(Object opcode) {
        this.opcode = opcode;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Object getArg1() {
        return arg1;
    }

    public void setArg1(Object arg1) {
        this.arg1 = arg1;
    }

    public Object getArg2() {
        return arg2;
    }

    public void setArg2(Object arg2) {
        this.arg2 = arg2;
    }
}
