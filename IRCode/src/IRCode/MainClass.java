package IRCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

    public final static String COPY = "copy";
    public final static String ADD = "add";
    public final static String SUB = "sub";
    public final static String MUL = "mul";
    public final static String DIV = "div";
    public final static String MOD = "mod";
    public final static String LEQ = "leq";         // Less than Equal
    public final static String AND = "and";
    public final static String OR = "or";
    public final static String LSL = "lsl";         // Logical Shift Left
    public final static String LSR = "lsr";         // Logical Shift Right
    public final static String EQU = "equ";         // Equal
    public final static String NEQ = "neq";         // Not Equal
    public final static String GTE = "gte";         // Greater than Equal
    public final static String GT = "gt";           // Greater than
    public final static String LTE = "lte";         // Less than Equal
    public final static String LT = "lt";           // Less than
    public final static String NOT = "not";
    public final static String IFTRUE = "is true";   // Conditional Jump on True
    public final static String IFFALSE = "is false";
    public final static String IFGTE = "is gte";
    public final static String IFGT = "is gt";
    public final static String IFLTE = "is lte";
    public final static String IFLT = "is lt";
    public final static String IFNEQ = "is neq";
    public final static String IFEQ = "is eq";
    public final static String CALL = "call";
    public final static String RETURN = "return";
    public final static String LABEL = "label";
    public final static String PRINT = "print";
    public final static String NEW = "new";         // New Array creation

    public static void printList(ArrayList<ThreeAddressTuple> list){
        Iterator<ThreeAddressTuple> iterator = list.iterator();
        while (iterator.hasNext()) {
            ThreeAddressTuple t = iterator.next();
            System.out.println(t.toString());
        }
    }

    public static ThreeAddressTuple getIRTuple(String st[]){
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

        ArrayList<ThreeAddressTuple> iList = new ArrayList<ThreeAddressTuple>();
        String st;
        while ((st = br.readLine()) != null) {
            String tokens[] = st.split(",");
            ThreeAddressTuple temp = getIRTuple(tokens);
            iList.add(temp);
        }

        printList(iList);
    }

}
