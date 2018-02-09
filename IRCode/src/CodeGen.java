package IRCode.src;
import IRCode.src.IRCode.ThreeAddCode;
import IRCode.src.helperclasses.ArgumentVariable;
import IRCode.src.symboltables.SymbolTable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class CodeGen {
    File mipsCode = new File("mips.s");
    SymbolTable st = new SymbolTable();

    private void unconditonalJump (ThreeAddCode instr, BufferedWriter writer) throws IOException{

        // op=label arg1=labelname
        String instrMips = "j "+ (String) instr.getArg1()+"\n";
        writer.write(instrMips);
        System.out.println("File written Successfully");
    }

    private void assignmentEvaluation(ThreeAddCode instr, BufferedWriter writer) throws IOException{
        String op = (String)instr.getOpcode();
        ArgumentVariable arg0 = (ArgumentVariable)instr.getArg0();
        ArgumentVariable arg1 = (ArgumentVariable)instr.getArg1();
        String stresult = st.getReg((String)instr.getResult());
        String argstr0 = arg0.getValue(st), argstr1= arg1.getValue(st);

        if (arg0.type.equals("constant")) {
            if (arg1.type.equals("constant")) {
                writer.write("li "+st.getReg("temp")+","+argstr0+"\n");
                applyOp(op,stresult,st.getReg("temp"),argstr1,true,writer);
            }
            else
                System.out.println("error arg1 is variable while arg0 is const");
        }
        else {
            if (arg1.type.equals("constant")) {
                applyOp(op,stresult,argstr0,argstr1,true,writer);
            }
            else{
                applyOp(op,stresult,argstr0,argstr1,false,writer);
            }
        }

    }
    private void applyOp(String op, String result, String arg0, String arg1, boolean immediate, BufferedWriter bw) throws IOException{
        if(immediate){
//Assuming unary minus is handled in the value of arg2
//            if(op=="-")
//                arg2 = "-"+arg2;
// TODO: Add logic operations here
            switch(op) {
                case "+":
                    bw.write("addi " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case "<<":
                    bw.write("sll " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case ">>":
                    bw.write("srl " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
        }
        else switch (op) {
            case "+":
                bw.write("add " + result + "," + arg0 + "," + arg1 + "\n");
                break;
            case "-":
                bw.write("sub " + result + "," + arg0 + "," + arg1 + "\n");
                break;
            case "*":
                bw.write("mult " + arg0 + "," + arg1 + "\n");
                bw.write("mflo "+ result+"\n");
                break;
            case "/":
                bw.write("div " + arg0 + "," + arg1 + "\n");
                bw.write("mflo "+ result+"\n");
                break;
            case "%":
                bw.write("div " + arg0 + "," + arg1 + "\n");
                bw.write("mfhi "+ result+"\n");
                break;
            default:
                System.out.println("Invalid  Operator");

        }
    }
    private void conditionalJump(ThreeAddCode instr, BufferedWriter writer) throws IOException{

    }
}
