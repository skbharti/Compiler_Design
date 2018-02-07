package IRCode;

public class LabelIRTuple extends ThreeAddressTuple {

    public LabelIRTuple(Object labelName){
        arg0 = labelName;
    }

    @Override
    public String toString() {
        return "label"+" "+arg0;
    }
}
