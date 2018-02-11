package IRCode.src.IRCode;

import IRCode.src.FlowGraph.Tables;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import static IRCode.src.helperclasses.Constants.*;
public class MainClass {

    private static void printList(ArrayList<ThreeAddCode> list){
        Iterator<ThreeAddCode> iterator = list.iterator();
        //System.out.println(list);
        while (iterator.hasNext()) {
            ThreeAddCode t = iterator.next();
            if(t != null)
                System.out.println(t.toString());
        }
    }

    public static ThreeAddCode getIRTuple(String st[]){
        switch (st[0]){
            case COPY:
                return new CopyIRTuple((st[1]).trim(), (st[2]).trim());
            case ADD:
            case SUB:
            case MUL:
            case DIV:
            case MOD:
            case LEQ:
            case AND:
            case OR:
            case LSL:
            case LSR:
            case EQU:
            case NEQ:
            case GTE:
            case GT:
            case LTE:
            case LT:
            case NOT:
                return new AssignmentIRTuple((st[0]).trim(), (st[1]).trim(), (st[2]).trim(), (st[3]).trim());
            case IFTRUE:
            case IFFALSE:
            case IFLT:
            case IFLTE:
            case IFGT:
            case IFGTE:
            case IFNEQ:
            case IFEQ:
                return new ConditionalJumpIRTuple((st[0]).trim(), (st[1]).trim(), (st[3]).trim());
            case CALL:
                return new FunctionCallIRTuple((st[1]).trim(), (st[2]).trim(), (st[3]).trim());
            case RETURN:
                return new ReturnIRTuple((st[1]).trim());
            case LABEL:
                return new LabelIRTuple((st[1]).trim());
            case PRINT:
                return new PrintIRTuple((st[0]).trim(),(st[1]).trim());
            case NEW:
                return new NewArrayIRTuple((st[1]).trim(), (st[2]).trim(), (st[3]).trim());
            default:
                return null;
        }
    }

    public static void main(String args[]) throws IOException {
        FileReader file = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(file);

        ArrayList<ThreeAddCode> iList = new ArrayList<ThreeAddCode>();
        String st;
        while ((st = br.readLine()) != null) {
            String tokens[] = st.split(",");
            ThreeAddCode temp = getIRTuple(tokens);
            iList.add(temp);
        }

        printList(iList);

        Tables tb = new Tables(iList);
        tb.RegisterAllocator();


    }

}
