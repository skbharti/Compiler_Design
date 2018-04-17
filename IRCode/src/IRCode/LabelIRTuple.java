package IRCode.src.IRCode;

public class LabelIRTuple extends ThreeAddCode {

    public LabelIRTuple(String labelName){
        arg0 = labelName;
    }

    @Override
    public String toString() {
        return "label"+" "+arg0;
    }
}
