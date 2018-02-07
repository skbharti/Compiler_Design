package IRCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {
    static final String COPY = "copy";
    static final String ADD = "add";
    static final String LEQ = "leq";
    static final String IFTRUE = "iftrue";
    static final String CALL = "call";
    static final String RETURN = "return";
    static final String LABEL = "label";
    static final String PRINT = "print";


    public static void printList(ArrayList<ThreeAddressTuple> list){
        Iterator<ThreeAddressTuple> iterator = list.iterator();
        while (iterator.hasNext()) {
            ThreeAddressTuple t = iterator.next();
            System.out.println(t.toString());
        }
    }

    public static void main(String args[]) throws IOException {
        FileReader file = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(file);

        ArrayList<ThreeAddressTuple> iList = new ArrayList<ThreeAddressTuple>();
        String st;
        while ((st = br.readLine()) != null) {
            String tokens[] = st.split(",");
            ThreeAddressTuple temp = getIRTuple(tokens);
            iList.add(temp);
        }

        printList(iList);
    }

    public static ThreeAddressTuple getIRTuple(String st[]){
        switch (st[0]){
            case COPY:
                return new CopyIRTuple((st[1]).trim(), (st[2]).trim());
            case ADD:
                return new AssignmentIRTuple((st[0]).trim(), (st[1]).trim(), (st[2]).trim(), (st[3]).trim());
            case LEQ:
                return new AssignmentIRTuple((st[0]).trim(), (st[1]).trim(), (st[2]).trim(), (st[3]).trim());
            case IFTRUE:
                return new ConditionalJumpIRTuple((st[1]).trim(), (st[3]).trim());
            case CALL:
                return new FunctionCallIRTuple((st[1]).trim(), (st[2]).trim(), (st[3]).trim());
            case RETURN:
                return new ReturnIRTuple((st[1]).trim());
            case LABEL:
                return new LabelIRTuple((st[1]).trim());
            case PRINT:
                return new PrintIRTuple((st[0]).trim(),(st[1]).trim());
            default:
                return null;
        }
    }
}
