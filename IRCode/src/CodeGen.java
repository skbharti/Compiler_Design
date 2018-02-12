package IRCode.src;
import IRCode.src.FlowGraph.FullProgramRegAlloc;
import IRCode.src.IRCode.*;
import IRCode.src.helperclasses.ArgumentVariable;
import IRCode.src.symboltables.SymbolTable;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import static IRCode.src.helperclasses.Constants.*;

public class CodeGen {
    private String output;
    private ArrayList<ThreeAddCode> IRList;
    private Hashtable<ThreeAddCode, ArrayList<Label>> labels;
    private FullProgramRegAlloc allocator;
    private SymbolTable st;

    public CodeGen(ArrayList<ThreeAddCode> list, Hashtable<ThreeAddCode, ArrayList<Label>> label, FullProgramRegAlloc alloc,SymbolTable symTable)
    {
        IRList = list;
        output = "mips.s";
        labels = label;
        allocator = alloc;
        st = symTable;
    }

    public void generateMips(){
        try {
            FileWriter fw = new FileWriter(output);
            BufferedWriter writer = new BufferedWriter(fw);

            writer.write(".text\n", 0, 6);
            writer.write("main:\n", 0, 6);

            //Iterate through the IR instructions
            for(int i = 0; i < IRList.size(); i++)
            {
                ThreeAddCode q = IRList.get(i);

                ArrayList<Label> labelList = labels.get(q);
// TODO Check for label utility
//                //Print any labels before this instruction
//                if(labelList != null)
//                {
//                    for(Label l : labelList)
//                    {
//                        if(l.printBefore == true)
//                        {
//                            //Print label
//                            String temp = l.toString() + "\n";
//                            writer.write(temp, 0, temp.length());
//                        }
//                    }
//                }

                if(q instanceof AssignmentIRTuple)
                {
                    assignmentEvaluation((AssignmentIRTuple)q, writer);
                }
                else if(q instanceof FunctionCallIRTuple)
                {
                    functionCall(q, writer);
                }
                else if(q instanceof ReturnIRTuple)
                {
                    functionReturn((ReturnIRTuple)q, writer);
                }
                else if(q instanceof UnaryAssignmentIRTuple)
                {
                    unaryAssignment((UnaryAssignmentIRTuple)q, writer);
                }
                else if(q instanceof UnconditionalJumpIRTuple)
                {
                    unconditonalJump((UnconditionalJumpIRTuple)q, writer);
                }
                else if(q instanceof ConditionalJumpIRTuple)
                {
                    conditonalJump((ConditionalJumpIRTuple)q, writer);
                }
                else if(q instanceof NewArrayIRTuple)
                {
                    newArrayInitialize((NewArrayIRTuple) q, writer);
                }
                else if(q instanceof ArrayAssignmentIRTuple)
                {
                    arrayIndexLoad((ArrayAssignmentIRTuple) q, writer);
                }
// TODO check for label utility
                //Print any labels after
//                if(labelList != null)
//                {
//                    for(Label l : labelList)
//                    {
//                        if(l.printBefore == false)
//                        {
//                            //Print label
//                            String temp = l.toString() + "\n";
//                            writer.write(temp, 0, temp.length());
//                        }
//                    }
//                }
            }

            //Close output file resources
            if(writer != null)
                writer.close();

        }catch (IOException e){
            System.out.println(""+e);
        }
    }

    private void unconditonalJump (UnconditionalJumpIRTuple instr, BufferedWriter writer) throws IOException{

        // op=label arg1=labelname
        String instrMips = "j "+ (String) instr.getArg1()+"\n";
        writer.write(instrMips);
        System.out.println("File written Successfully");
    }

    private void assignmentEvaluation(AssignmentIRTuple instr, BufferedWriter writer) throws IOException{
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

    private void arrayIndexAssignment(ThreeAddCode instr, BufferedWriter writer) throws IOException{
        ArgumentVariable arg0 = (ArgumentVariable)instr.getArg0();
        ArgumentVariable arg1 = (ArgumentVariable)instr.getArg1();
        ArgumentVariable result = (ArgumentVariable)instr.getResult();
        ////TODO add pointer data type if available
        if(result.type.equals("int[]")){//assuming only integer arrays or pointers
            String argresult =result.getValue(st), argstr0 = arg0.getValue(st);
            if(arg0.type.equals("constant")) {
                String tmp = st.getReg("temp");
                writer.write("li " + tmp + "," + argstr0 + "\n");
                argstr0 = tmp;
            }
            writer.write("sll "+argstr0+","+argstr0+", 2\n");
            writer.write("addi "+argstr0+", "+argstr0+", 4\n");
            writer.write("add "+argresult+", "+argresult+", "+argstr0+"\n");
            if(arg1.type.equals("constant")) {
                String tmp = st.getReg("temp2");
                writer.write("li " + tmp + "," + argstr0 + "\n");
                writer.write("sw " + tmp + ", 0(" + argresult + ")\n");
            }
            else {
                writer.write("sw " + arg1.getValue(st) + ", 0(" + argresult + ")\n");
            }
            writer.write("sub "+argresult+", "+argresult+", "+argstr0+"\n");
            if (!arg0.type.equals("constant")){
                writer.write("addi "+argstr0+", "+argstr0+", -4\n");
                writer.write("srl "+argstr0+", "+argstr0+", 2\n");
            }else{
                st.freeTemp();
            }
        }else{
            System.out.println("Not valid type of array");
        }

    }

    private void newArrayInitialize(NewArrayIRTuple instr, BufferedWriter writer) throws IOException{
        //Notes:
        //		$a0 - Holds the number of bytes
        //		$v0 - On return, holds the memory address (with address 0 holding the 4 byte length)

        String type = (String)instr.getArg0();
        ArgumentVariable arg1 = (ArgumentVariable)instr.getArg1();
        ArgumentVariable result = (ArgumentVariable) instr.getResult();
        String temp;

        //Store $ra on stack
        writer.write("addi $sp, $sp, -20\n");
        writer.write("sw $ra, 16($sp)\n");

        //Store $a0
        writer.write("sw $a0, 12($sp)\n");

        //Store $t0-$t1 on the stack
        for(int i = 0; i < 2; i++)
        {
            writer.write("sw $t" + i + ", " + (8 - (4*i)) + "($sp)\n");
        }

        //Store $v0 on the stack
        writer.write("sw $v0, 0($sp)\n");

        if(arg1.type.equals("constant"))
            writer.write("li $a0, " + arg1.getValue(st) + "\n");
        else
            writer.write("move $a0, " + arg1.getValue(st) + "\n");
        ///TODO Update Pointer Requirements
        if(type.equals("int"))
            writer.write("sll $a0, $a0, 2\n");

        //Call the function of "_new_array"
        writer.write("jal _new_array\n");
        writer.write("lw $t0, 8($sp)\n");
        writer.write("lw $t1, 4($sp)\n");

        writer.write("lw $a0, 12($sp)\n");
        writer.write("move " + result.getValue(st) + ", $v0\n");

        writer.write("lw $v0, 0($sp)\n");
        writer.write("lw $ra, 16($sp)\n");
        writer.write("addi $sp, $sp, 20\n");

    }


    private void unaryAssignment(UnaryAssignmentIRTuple instr, BufferedWriter writer) throws IOException{

    }


    private void conditonalJump(ConditionalJumpIRTuple instr, BufferedWriter writer) throws IOException{
        String label = ((ArgumentVariable)instr.getResult()).getValue(st);
        ArgumentVariable arg0 = (ArgumentVariable) instr.getArg0();
        String opcode = instr.getOpcode().toString();
        ///TODO remove IFTRUE if not needed currently they are same. Multiple register handling
        switch (opcode){
            case IFTRUE:
                writer.write("beq "+arg0.getValue(st)+", $zero, "+label+"\n");
            case IFFALSE:
                writer.write("bne "+arg0.getValue(st)+", $zero, "+label+"\n");
            case IFLT:
                writer.write("bltz "+arg0.getValue(st)+", $zero, "+label+"\n");
            case IFLTE:
                writer.write("blez "+arg0.getValue(st)+", $zero, "+label+"\n");
            case IFGT:
                writer.write("bgtz "+arg0.getValue(st)+", $zero, "+label+"\n");
            case IFGTE:
                writer.write("bgez "+arg0.getValue(st)+", $zero, "+label+"\n");
            case IFNEQ:
                writer.write("bne "+arg0.getValue(st)+", $zero, "+label+"\n");
            case IFEQ:
                writer.write("beq "+arg0.getValue(st)+", $zero, "+label+"\n");
        }
    }

    private void functionCall(ThreeAddCode instr, BufferedWriter writer) throws IOException{
        String function = ((ArgumentVariable)(instr.getArg0())).getValue(st);
        if(function.equals("_system_exit"))
        {
            writer.write("jal " + function + "\n");
            return;
        }
        //Assuming all variables as global and no parameters
        //Store $ra on stack
        writer.write("addi $sp, $sp, -12\n");
        writer.write("sw $ra, 8($sp)\n");
        //Store $v0-$v1 on the stack for taking return value
        writer.write("sw $v0, 4($sp)\n");
        writer.write("sw $v1, 0($sp)\n");

        //Jump to the function
        writer.write("jal " + function + "\n");

        //Move return value into the result register
        if(!function.equals("print"))
        {
            ArgumentVariable result = (ArgumentVariable) instr.getResult();
            writer.write("move " + result.getValue(st) + ", $v0\n");
        }
        //Restore $v0-$v1 from the stack
        writer.write("lw $v0, 4($sp)\n");
        writer.write("lw $v1, 0($sp)\n");

        //Restore $ra from the stack
        writer.write("lw $ra, 8($sp)\n");
        writer.write("addi $sp, $sp, 12\n");
    }

    private void functionReturn(ReturnIRTuple instr, BufferedWriter writer) throws IOException{
        ArgumentVariable arg0 = (ArgumentVariable) instr.getArg0();
        if(arg0.type.equals("constant"))
            writer.write("li $v0, "+arg0.getValue(st)+"\n");
        else
            writer.write("mov $v0, "+arg0.getValue(st)+"\n");
        writer.write("jr $ra\n");
    }

    private void arrayIndexLoad(ArrayAssignmentIRTuple instr, BufferedWriter writer) throws IOException{
        ArgumentVariable arg0 = (ArgumentVariable)instr.getArg0();
        ArgumentVariable arg1 = (ArgumentVariable)instr.getArg1();
        ArgumentVariable result = (ArgumentVariable)instr.getResult();
        ////TODO add pointer data type if available
        if(arg0.type.equals("int[]")){//assuming only integer arrays or pointers
            String argstr0 = arg0.getValue(st), argstr1 = arg1.getValue(st);
            if(arg1.type.equals("constant")) {
                String tmp = st.getReg("temp");
                writer.write("li " + tmp + "," + argstr1 + "\n");
                argstr1 = tmp;
            }
            writer.write("sll "+argstr1+","+argstr1+", 2\n");
            writer.write("addi "+argstr1+", "+argstr1+", 4\n");
            writer.write("add "+argstr0+", "+argstr0+", "+argstr1+"\n");
            writer.write("lw "+result.getValue(st)+", 0("+argstr0+")\n");

            writer.write("sub "+argstr0+", "+argstr0+", "+argstr1+"\n");
            if (!arg1.type.equals("constant")){
                writer.write("addi "+argstr1+", "+argstr1+", -4\n");
                writer.write("srl "+argstr1+", "+argstr1+", 2\n");
            }else{
                st.freeTemp();
            }
        }else{
            System.out.println("Not valid type of array");
        }

    }
}
