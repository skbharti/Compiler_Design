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
        String instrMips = "j "+ (String) instr.getArg2()+"\n";
        writer.write(instrMips);
        System.out.println("File written Successfully");
    }

    private void assignmentEvaluation(ThreeAddCode instr, BufferedWriter writer) throws IOException{
        String op = (String)instr.getOpcode();
        ArgumentVariable arg1 = (ArgumentVariable)instr.getArg2();
        ArgumentVariable arg2 = (ArgumentVariable)instr.getArg2();
        String stresult = st.getReg((String)instr.getResult());
        String argstr1 = arg1.getValue(st), argstr2= arg2.getValue(st);

        if (arg1.type.equals("constant")) {
            if (arg2.type.equals("constant")) {
                writer.write("li "+st.getReg("temp")+","+argstr1+"\n");
                applyOp(op,stresult,st.getReg("temp"),argstr2,true,writer);
            }
            else
                System.out.println("error arg2 is variable while arg1 is const");
        }
        else {
            if (arg2.type.equals("constant")) {
                applyOp(op,stresult,argstr1,argstr2,true,writer);
            }
            else{
                applyOp(op,stresult,argstr1,argstr2,false,writer);
            }
        }

    }
    private void applyOp(String op, String result, String arg1, String arg2, boolean immediate, BufferedWriter bw) throws IOException{
        if(immediate){
//Assuming unary minus is handled in the value of arg2
//            if(op=="-")
//                arg2 = "-"+arg2;
// TODO: Add logic operations here
            switch(op) {
                case "+":
                    bw.write("addi " + result + "," + arg1 + "," + arg2 + "\n");
                    break;
                case "<<":
                    bw.write("sll " + result + "," + arg1 + "," + arg2 + "\n");
                    break;
                case ">>":
                    bw.write("srl " + result + "," + arg1 + "," + arg2 + "\n");
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
        }
        else switch (op) {
            case "+":
                bw.write("add " + result + "," + arg1 + "," + arg2 + "\n");
                break;
            case "-":
                bw.write("sub " + result + "," + arg1 + "," + arg2 + "\n");
                break;
            case "*":
                bw.write("mult " + arg1 + "," + arg2 + "\n");
                bw.write("mflo "+ result+"\n");
                break;
            case "/":
                bw.write("div " + arg1 + "," + arg2 + "\n");
                bw.write("mflo "+ result+"\n");
                break;
            case "%":
                bw.write("div " + arg1 + "," + arg2 + "\n");
                bw.write("mfhi "+ result+"\n");
                break;
            default:
                System.out.println("Invalid  Operator");

        }
    }
    private void conditionalJump(ThreeAddCode instr, BufferedWriter writer) throws IOException{

    }
}
