package IRCode;

public abstract class FourAddressTuple {

    // Operation result = arg0 op arg1
    protected Object opcode;
    protected Object result;
    protected Object arg0;
    protected Object arg1;

    // To get a string representation of FAT
    public abstract String toString();

    public Object getOpCode(){
        return this.opcode;
    }

    public Object getResult(){
        return this.result;
    }

    public Object getArg0(){
        return this.arg0;
    }

    public Object getArg1(){
        return this.arg1;
    }

    public void setOpCode(Object opcode){
        this.opcode = opcode;
    }

    public void setResult(Object result) {
        this.result = result;
    }


    public void setArg0(Object arg0){
        this.arg0 = arg0;
    }

    public void setArg1(Object arg1){
        this.arg1 = arg1;
    }



}
