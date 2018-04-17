package IRCode.src.IRCode;

import IRCode.src.CodeGenerator.CodeGen;
import IRCode.src.FlowGraph.FullProgramRegAlloc;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import static IRCode.src.helperclasses.Constants.*;
public class MainClass {

    public static BufferedWriter writer;
    public static CodeGen codegen;
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
            case PARAMINIT:
                return new ParamInitIRTuple((st[0]).trim(), (st[1]).trim());
            case PARAM:
                return new ParamIRTuple((st[0]).trim(), st[1].trim()  );
            case COPY:
                return new CopyIRTuple((st[1]).trim(), (st[2]).trim());
            case ADD:
            case SUB:
            case MUL:
            case DIV:
            case MOD:
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
            case ARRTOVAR:
                return new ArrayAssignmentIRTuple(ARRTOVAR,(st[1]).trim(), (st[2]).trim(), (st[3]).trim());
            case VARTOARR:
                return new ArrayAssignmentIRTuple(VARTOARR,(st[1]).trim(), (st[2]).trim(), (st[3]).trim());

            default:
                return null;
        }
    }

    public static void main(String args[]) throws IOException {
        FileReader file = new FileReader("test1.txt");
        BufferedReader br = new BufferedReader(file);
        ArrayList<ThreeAddCode> iList = new ArrayList<ThreeAddCode>();
        String st;
        while ((st = br.readLine()) != null) {
            String tokens[] = st.split(",");
            ThreeAddCode temp = getIRTuple(tokens);
            iList.add(temp);
        }

        printList(iList);
        try {
            writer = new BufferedWriter(new FileWriter("mips.s"));
            codegen = new CodeGen();
        }
        catch (Exception e){
            System.out.println("Error!");
        }

        FullProgramRegAlloc f = new FullProgramRegAlloc(iList);
        f.FullRegAlloc();

        try {
            writer.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
