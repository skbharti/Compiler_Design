package IRCode.src.CodeGenerator;
import IRCode.src.FlowGraph.AddrTableEntry;
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
    private int count =0;
    private Hashtable<String,AddrTableEntry> curAddTable;
    private Hashtable<String,AddrTableEntry> preAddTable;
    private Hashtable<Integer,String> regTable;
    public BufferedWriter writer;

    public CodeGen(BufferedWriter writer) {

        try {
            this.writer = writer;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void generateMips(ThreeAddCode q, Hashtable<String,AddrTableEntry> curAddTable, Hashtable<String,AddrTableEntry> preAddTable, Hashtable<Integer,String> regTable, boolean store){
        try {
            this.curAddTable = curAddTable;
            this.preAddTable = preAddTable;
            this.regTable = regTable;

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

            if(store){
                for (int i : regTable.keySet()){
                    writer.write("sw "+ArgumentVariable.getRegName(i)+", "+regTable.get(i)+"\n");
                }
            }
        }catch (IOException e){
            System.out.println(""+e);
        }
    }

    public void closeWriter(){
        try {
            //Close output file resources
            if (writer != null)
                writer.close();
        }catch (IOException e){
            System.out.println(e);
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
        ArgumentVariable arg0 = new ArgumentVariable(instr.getArg0(),writer);
        ArgumentVariable arg1 = new ArgumentVariable(instr.getArg1(),writer);
        String stresult = (new ArgumentVariable(instr.getResult(),writer)).getValue(curAddTable);
        String argstr0 = arg0.getValue(curAddTable), argstr1= arg1.getValue(curAddTable);

        if (arg0.type.equals("constant")) {
            if (arg1.type.equals("constant")) {
                writer.write("li $s6, "+argstr0+"\n");
                applyOp(op,stresult,"$s6",argstr1,true,writer);
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
            String L1, L2;

            //Assuming unary minus is handled in the value of arg2
//            if(op=="-")
//                arg2 = "-"+arg2;
            switch(op) {
                case ADD:
                    bw.write("addi " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case LSL:
                    bw.write("sll " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case LSR:
                    bw.write("srl " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case GT:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub "+result+", "+arg1+", "+arg0+"\n");
                    bw.write("blez " + result + ", $zero,"  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                case LTE:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub "+result+", "+arg0+", "+arg1+"\n");
                    bw.write("blez " + result + ", $zero,"  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                case EQU:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("beq " + arg0 + ", "+ arg1 +","  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                case NEQ:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("bne " + arg0 + ", "+ arg1 +","  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                case GTE:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub "+result+", "+arg1+", "+arg0+"\n");
                    bw.write("bltz " + result + ", $zero,"  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                case LT:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub "+result+", "+arg0+", "+arg1+"\n");
                    bw.write("bltz " + result + ", $zero,"  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                default:
                    System.out.println(op+"Invalid  Operator");
            }
        }
        else{
            String L1,L2;
            switch (op) {

                case ADD:
                    bw.write("add " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case SUB:
                    bw.write("sub " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case MUL:
                    bw.write("mult " + arg0 + "," + arg1 + "\n");
                    bw.write("mflo "+ result+"\n");
                    break;
                case DIV:
                    bw.write("div " + arg0 + "," + arg1 + "\n");
                    bw.write("mflo "+ result+"\n");
                    break;
                case MOD:
                    bw.write("div " + arg0 + "," + arg1 + "\n");
                    bw.write("mfhi "+ result+"\n");
                    break;
                case GT:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub "+result+", "+arg1+", "+arg0+"\n");
                    bw.write("blez " + result + ", $zero,"  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                case LTE:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub "+result+", "+arg0+", "+arg1+"\n");
                    bw.write("blez " + result + ", $zero,"  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                case AND:
                    bw.write("and " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case OR:
                    bw.write("or " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case EQU:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("beq " + arg0 + ", "+ arg1 +","  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                case NEQ:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("bne " + arg0 + ", "+ arg1 +","  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                case GTE:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub "+result+", "+arg1+", "+arg0+"\n");
                    bw.write("bltz " + result + ", $zero,"  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                case LT:
                    L1 = "@L"+(count++)+":\n";
                    L2 = "@L"+(count++)+":\n";

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub "+result+", "+arg0+", "+arg1+"\n");
                    bw.write("bltz " + result + ", $zero,"  + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + "\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + "\n");

                    break;
                default:
                    System.out.println(op+"Invalid  Operator");

            }
        }
    }

    private void arrayIndexAssignment(ThreeAddCode instr, BufferedWriter writer) throws IOException{
        ArgumentVariable arg0 = new ArgumentVariable(instr.getArg0(),writer);
        ArgumentVariable arg1 = new ArgumentVariable(instr.getArg1(),writer);
        ArgumentVariable result = new ArgumentVariable(instr.getResult(),writer);
        String argresult =result.getValue(curAddTable), argstr0 = arg0.getValue(curAddTable);
        if(arg0.type.equals("constant")) {
            writer.write("li " + "$s6" + "," + argstr0 + "\n");
            argstr0 = "$s6";
        }
        writer.write("sll "+argstr0+","+argstr0+", 2\n");
        writer.write("addi "+argstr0+", "+argstr0+", 4\n");
        writer.write("add "+argresult+", "+argresult+", "+argstr0+"\n");
        if(arg1.type.equals("constant")) {
            String tmp = "$s7";
            writer.write("li " + tmp + "," + argstr0 + "\n");
            writer.write("sw " + tmp + ", 0(" + argresult + ")\n");
        }
        else {
            writer.write("sw " + arg1.getValue(curAddTable) + ", 0(" + argresult + ")\n");
        }
        writer.write("sub "+argresult+", "+argresult+", "+argstr0+"\n");
        if (!arg0.type.equals("constant")){
            writer.write("addi "+argstr0+", "+argstr0+", -4\n");
            writer.write("srl "+argstr0+", "+argstr0+", 2\n");
        }

    }

    private void newArrayInitialize(NewArrayIRTuple instr, BufferedWriter writer) throws IOException{
        //Notes:
        //		$a0 - Holds the number of bytes
        //		$v0 - On return, holds the memory address (with address 0 holding the 4 byte length)

        String type = (String)instr.getArg0();
        ArgumentVariable arg1 = new ArgumentVariable(instr.getArg1(),writer);
        ArgumentVariable result = new ArgumentVariable(instr.getResult(),writer);

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
            writer.write("li $a0, " + arg1.getValue(curAddTable) + "\n");
        else
            writer.write("move $a0, " + arg1.getValue(curAddTable) + "\n");
        if(type.equals("int"))
            writer.write("sll $a0, $a0, 2\n");

        //Call the function of "_new_array"
        writer.write("jal _new_array\n");
        writer.write("lw $t0, 8($sp)\n");
        writer.write("lw $t1, 4($sp)\n");

        writer.write("lw $a0, 12($sp)\n");
        writer.write("move " + result.getValue(curAddTable) + ", $v0\n");

        writer.write("lw $v0, 0($sp)\n");
        writer.write("lw $ra, 16($sp)\n");
        writer.write("addi $sp, $sp, 20\n");

    }


    private void unaryAssignment(UnaryAssignmentIRTuple instr, BufferedWriter writer) throws IOException{
        String op = (String)instr.getOpcode();

        ArgumentVariable result = new ArgumentVariable(instr.getResult(),writer);
        ArgumentVariable arg1 = new ArgumentVariable(instr.getArg1(),writer);
        String resultReg = result.getValue(curAddTable);

        //Handle arg1 -- Store the first parameter in the result register
        if(arg1.type.equals("constant"))
            writer.write("li " + resultReg + ", " + arg1.getValue(curAddTable) + "\n");
        else //Variable arg1
            writer.write("move " + resultReg + ", " + arg1.getValue(curAddTable) + "\n");

        if(op.equals("!"))
        {
            String L1 = "@L1:\n";
            String L2 = "@L2:\n";

            //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
            writer.write("beq " + resultReg + ", $zero, " + L1 + "\n");

            //Otherwise, fallthrough and store "-" in result reg
            writer.write("add " + resultReg + ", $zero, $zero\n");
            writer.write("j " + L2 + "\n");
            writer.write(L1 + "\n");
            writer.write("addi " + resultReg + ", $zero, 1\n");
            writer.write(L2 + "\n");
        }
        writer.write("move " + result.getValue(curAddTable) + ", " + resultReg + "\n");
    }


    private void conditonalJump(ConditionalJumpIRTuple instr, BufferedWriter writer) throws IOException{
        String label = (new ArgumentVariable(instr.getResult(),writer)).getValue(curAddTable);
        ArgumentVariable arg0 = new ArgumentVariable(instr.getArg0(),writer);
        String opcode = instr.getOpcode().toString();
        switch (opcode){
            case IFTRUE:
                writer.write("beq "+arg0.getValue(curAddTable)+", $zero, "+label+"\n");
            case IFFALSE:
                writer.write("bne "+arg0.getValue(curAddTable)+", $zero, "+label+"\n");
            case IFLT:
                writer.write("bltz "+arg0.getValue(curAddTable)+", $zero, "+label+"\n");
            case IFLTE:
                writer.write("blez "+arg0.getValue(curAddTable)+", $zero, "+label+"\n");
            case IFGT:
                writer.write("bgtz "+arg0.getValue(curAddTable)+", $zero, "+label+"\n");
            case IFGTE:
                writer.write("bgez "+arg0.getValue(curAddTable)+", $zero, "+label+"\n");
            case IFNEQ:
                writer.write("bne "+arg0.getValue(curAddTable)+", $zero, "+label+"\n");
            case IFEQ:
                writer.write("beq "+arg0.getValue(curAddTable)+", $zero, "+label+"\n");
        }
    }

    private void functionCall(ThreeAddCode instr, BufferedWriter writer) throws IOException{
        String function = (new ArgumentVariable(instr.getArg0(),writer)).getValue(curAddTable);
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
            ArgumentVariable result = new ArgumentVariable(instr.getResult(),writer);
            writer.write("move " + result.getValue(curAddTable) + ", $v0\n");
        }
        //Restore $v0-$v1 from the stack
        writer.write("lw $v0, 4($sp)\n");
        writer.write("lw $v1, 0($sp)\n");

        //Restore $ra from the stack
        writer.write("lw $ra, 8($sp)\n");
        writer.write("addi $sp, $sp, 12\n");
    }

    private void functionReturn(ReturnIRTuple instr, BufferedWriter writer) throws IOException{
        ArgumentVariable arg0 = new ArgumentVariable(instr.getArg0(),writer);
        if(arg0.type.equals("constant"))
            writer.write("li $v0, "+arg0.getValue(curAddTable)+"\n");
        else
            writer.write("mov $v0, "+arg0.getValue(curAddTable)+"\n");
        writer.write("jr $ra\n");
    }

    private void arrayIndexLoad(ArrayAssignmentIRTuple instr, BufferedWriter writer) throws IOException{
        ArgumentVariable arg0 = new ArgumentVariable(instr.getArg0(),writer);
        ArgumentVariable arg1 = new ArgumentVariable(instr.getArg1(),writer);
        ArgumentVariable result = new ArgumentVariable(instr.getResult(),writer);
        String argstr0 = arg0.getValue(curAddTable), argstr1 = arg1.getValue(curAddTable);
        if(arg1.type.equals("constant")) {
            String tmp ="$s6";
            writer.write("li " + tmp + "," + argstr1 + "\n");
            argstr1 = tmp;
        }
        writer.write("sll "+argstr1+","+argstr1+", 2\n");
        writer.write("addi "+argstr1+", "+argstr1+", 4\n");
        writer.write("add "+argstr0+", "+argstr0+", "+argstr1+"\n");
        writer.write("lw "+result.getValue(curAddTable)+", 0("+argstr0+")\n");

        writer.write("sub "+argstr0+", "+argstr0+", "+argstr1+"\n");
        if (!arg1.type.equals("constant")){
            writer.write("addi "+argstr1+", "+argstr1+", -4\n");
            writer.write("srl "+argstr1+", "+argstr1+", 2\n");
        }
    }
}