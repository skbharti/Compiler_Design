package IRCode.src.CodeGenerator;

import IRCode.src.FlowGraph.AddrTableEntry;
import IRCode.src.FlowGraph.Tables;
import IRCode.src.IRCode.*;
import IRCode.src.helperclasses.ArgumentVariable;
import src.JavaParser;
import src.MyParser;
import src.SymbolsAndScopes.Record;
import src.SymbolsAndScopes.Scope;
import src.SymbolsAndScopes.VariableRecord;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Hashtable;

import static IRCode.src.helperclasses.Constants.*;

public class CodeGen {
    private int count = 0;
    private Hashtable<String, AddrTableEntry> curAddTable;
    private Hashtable<String, AddrTableEntry> preAddTable;
    private Hashtable<Integer, String> regTable;
    private static BufferedWriter writer = MyParser.writer;
    private Scope currentScope;

    public static void updateMainStackPointer(int size) throws Exception{
        writer.write("addi $sp, $sp, "+4*size+"\n");
    }

    public void generateMips(ThreeAddCode q, Hashtable<String,
            AddrTableEntry> curAddTable, Hashtable<String,
            AddrTableEntry> preAddTable, Hashtable<Integer,
            String> regTable, Scope currentScope) throws Exception {

        this.curAddTable = curAddTable;
        this.preAddTable = preAddTable;
        this.regTable = regTable;
        this.currentScope = currentScope;

        if (q instanceof StoreStackIRTuple)
            storeStack();
        else if (q instanceof ExitIRTuple)
            exit();
        else if (q instanceof AssignmentIRTuple)
            assignmentEvaluation((AssignmentIRTuple) q);
        else if (q instanceof NewObjectIRTuple)
            newObjectInstance((NewObjectIRTuple) q);
        else if (q instanceof ParamIRTuple)
            param((ParamIRTuple) q);
        else if (q instanceof FunctionCallIRTuple)
            functionCall((FunctionCallIRTuple) q);
        else if (q instanceof ReturnIRTuple)
            functionReturn((ReturnIRTuple) q);
        else if (q instanceof UnaryAssignmentIRTuple)
            unaryAssignment((UnaryAssignmentIRTuple) q);
        else if (q instanceof UnconditionalJumpIRTuple)
            unconditionalJump((UnconditionalJumpIRTuple) q);
        else if (q instanceof ConditionalJumpIRTuple)
            conditonalJump((ConditionalJumpIRTuple) q);
        else if (q instanceof NewArrayIRTuple)
            newArrayInitialize((NewArrayIRTuple) q);
        else if (q instanceof ArrayAssignmentIRTuple) {
            if (q.getOpcode().equals(ARRTOVAR))
                arrayIndexLoad((ArrayAssignmentIRTuple) q);
            else
                arrayIndexAssignment((ArrayAssignmentIRTuple) q);
        } else if (q instanceof LabelIRTuple)
            labelDefine((LabelIRTuple) q);
        else if (q instanceof PrintIRTuple)
            printMips((PrintIRTuple) q);
        else if (q instanceof ParamInitIRTuple)
            paramInit((ParamInitIRTuple)q);

    }
    private void exit() throws IOException{
        writer.write(HelperFunctions.printExitCode());
    }

    private void storeStack() throws IOException {
        for (String key : curAddTable.keySet()) {
            writer.write("sw " + ArgumentVariable.getRegName(curAddTable.get(key).getReg()) + ", " + Tables.getStackPointer(key, currentScope) + "($sp)\n");
        }
    }

    private void paramInit(ParamInitIRTuple instr) throws IOException{
        ArgumentVariable par = new ArgumentVariable(instr.getResult());
        int offset =  Integer.parseInt(instr.getArg0());
        writer.write("lw "+par.getValue(curAddTable)+", "+offset*4+"($a0)");

    }

    private void param(ParamIRTuple instr) throws IOException {
        ArgumentVariable param = new ArgumentVariable(instr.getArg0());
        int paramNum = Integer.parseInt(instr.getArg1());
        ArgumentVariable paramPos = new ArgumentVariable(instr.getResult());
        writer.write("sw " + param.getValue(curAddTable)+", " + paramNum * 4 + "(" + paramPos.getValue(curAddTable) + ")\n");
    }

    private void printMips(PrintIRTuple instr) throws IOException {
        ArgumentVariable arg0 = new ArgumentVariable(instr.getArg0());
        writer.write("addi $sp, $sp, -12\n");
        //Store $v0-$v1 on the stack for taking return value
        writer.write("sw $a0, 8($sp)\n");
        writer.write("sw $v0, 4($sp)\n");
        writer.write("sw $v1, 0($sp)\n");

        if (arg0.type.equals("constant")) {
            writer.write(HelperFunctions.printIntegerFromString(arg0.getValue(curAddTable)));
        } else if (!arg0.getValue(curAddTable).equals("null")) {
            writer.write(HelperFunctions.printIntegerFromRegister(arg0.getValue(curAddTable)));
        } else {
            System.out.println("error in arguments to print");
            writer.write(HelperFunctions.printExitCode()); //Error
        }
        //Restore $v0-$v1 from the stack
        writer.write("lw $v0, 4($sp)\n");
        writer.write("lw $v1, 0($sp)\n");
        writer.write("lw $a0, 8($sp)\n");
        writer.write("addi $sp, $sp, 12\n");

    }

    private void newObjectInstance(NewObjectIRTuple instr) throws IOException {

        String type = (String) instr.getArg0();
        ArgumentVariable result = new ArgumentVariable(instr.getResult());

        //Store $ra on stack
        writer.write("addi $sp, $sp, -20\n");
        writer.write("sw $ra, 16($sp)\n");

        //Store $a0
        writer.write("sw $a0, 12($sp)\n");

        //Store $t0-$t1 on the stack
        for (int i = 0; i < 2; i++) {
            writer.write("sw $t" + i + ", " + (8 - (4 * i)) + "($sp)\n");
        }

        //Store $v0 on the stack
        writer.write("sw $v0, 0($sp)\n");
        writer.write("li $a0, " + MyParser.globalRecord.getClassRecord(type).getClassScope().getVariableSize() + "\n");
        writer.write("sll $a0, $a0, 2\n");

        //Call the function of "_new_array"
        writer.write("li $v0, 9\n");
        writer.write("syscall\n");
        writer.write("lw $t0, 8($sp)\n");
        writer.write("lw $t1, 4($sp)\n");

        writer.write("lw $a0, 12($sp)\n");
        writer.write("move " + result.getValue(curAddTable) + ", $v0\n");

        writer.write("lw $v0, 0($sp)\n");
        writer.write("lw $ra, 16($sp)\n");
        writer.write("addi $sp, $sp, 20\n");
    }

    private void labelDefine(LabelIRTuple q) throws IOException {
        writer.write(q.getArg0() + ":\n");
    }

    private void unconditionalJump(UnconditionalJumpIRTuple instr) throws IOException {

        // op=label arg1=labelname
        String instrMips = "j " + instr.getResult() + "\n";
        writer.write(instrMips);

    }

    private void assignmentEvaluation(AssignmentIRTuple instr) throws IOException {
        String op = (String) instr.getOpcode();
        ArgumentVariable arg0 = new ArgumentVariable(instr.getArg0());
        ArgumentVariable arg1 = new ArgumentVariable(instr.getArg1());
        ArgumentVariable res = new ArgumentVariable(instr.getResult());
        String stresult = res.getValue(curAddTable);
        String argstr0 = arg0.getValue(curAddTable), argstr1 = arg1.getValue(curAddTable);

        if (arg0.type.equals("constant")) {
            if (arg1.type.equals("constant")) {
                writer.write("li $s6, " + argstr0 + "\n");
                applyOp(op, stresult, "$s6", argstr1, true, writer);
            } else
                System.out.println("error arg1 is variable while arg0 is const");
        } else {
            if (arg1.type.equals("constant")) {
                applyOp(op, stresult, argstr0, argstr1, true, writer);
            } else {
                applyOp(op, stresult, argstr0, argstr1, false, writer);
            }
        }

    }

    private void applyOp(String op, String result, String arg0, String arg1, boolean immediate, BufferedWriter bw) throws IOException {
        if (immediate) {
            String L1, L2;

            //Assuming unary minus is handled in the value of arg2
//            if(op=="-")
//                arg2 = "-"+arg2;
            switch (op) {
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
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub " + result + ", " + arg1 + ", " + arg0 + "\n");
                    bw.write("blez " + result + ", " + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                case LTE:
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub " + result + ", " + arg0 + ", " + arg1 + "\n");
                    bw.write("blez " + result + ", " + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                case EQU:
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("beq " + arg0 + ", " + arg1 + "," + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                case NEQ:
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("bne " + arg0 + ", " + arg1 + "," + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                case GTE:
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub " + result + ", " + arg1 + ", " + arg0 + "\n");
                    bw.write("bltz " + result + ", " + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                case LT:
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub " + result + ", " + arg0 + ", " + arg1 + "\n");
                    bw.write("bltz " + result + ", " + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                default:
                    System.out.println(op + "Invalid  Operator");
            }
        } else {
            String L1, L2;
            switch (op) {

                case ADD:
                    bw.write("add " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case SUB:
                    bw.write("sub " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case MUL:
                    bw.write("mult " + arg0 + "," + arg1 + "\n");
                    bw.write("mflo " + result + "\n");
                    break;
                case DIV:
                    bw.write("div " + arg0 + "," + arg1 + "\n");
                    bw.write("mflo " + result + "\n");
                    break;
                case MOD:
                    bw.write("div " + arg0 + "," + arg1 + "\n");
                    bw.write("mfhi " + result + "\n");
                    break;
                case GT:
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub " + result + ", " + arg1 + ", " + arg0 + "\n");
                    bw.write("blez " + result + ", " + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                case LTE:
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub " + result + ", " + arg0 + ", " + arg1 + "\n");
                    bw.write("blez " + result + ", " + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                case AND:
                    bw.write("and " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case OR:
                    bw.write("or " + result + "," + arg0 + "," + arg1 + "\n");
                    break;
                case EQU:
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("beq " + arg0 + ", " + arg1 + "," + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                case NEQ:
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("bne " + arg0 + ", " + arg1 + "," + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                case GTE:
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub " + result + ", " + arg1 + ", " + arg0 + "\n");
                    bw.write("bltz " + result + ", " + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                case LT:
                    L1 = "_L" + (count++);
                    L2 = "_L" + (count++);

                    //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
                    bw.write("sub " + result + ", " + arg0 + ", " + arg1 + "\n");
                    bw.write("bltz " + result + ", " + L1 + "\n");

                    //Otherwise, fallthrough and store "-" in result reg
                    bw.write("add " + result + ", $zero, $zero\n");
                    bw.write("j " + L2 + "\n");
                    bw.write(L1 + ":\n");
                    bw.write("addi " + result + ", $zero, 1\n");
                    bw.write(L2 + ":\n");

                    break;
                default:
                    System.out.println(op + "Invalid  Operator");

            }
        }
    }

    private void arrayIndexAssignment(ArrayAssignmentIRTuple instr) throws IOException {
        ArgumentVariable pointer = new ArgumentVariable(instr.getArg0());
        ArgumentVariable index = new ArgumentVariable(instr.getArg1());
        ArgumentVariable result = new ArgumentVariable(instr.getResult());
        String argresult = result.getValue(curAddTable), indexstr = index.getValue(curAddTable);
        if (index.type.equals("constant")) {
            writer.write("li " + "$s6" + "," + indexstr + "\n");
            indexstr = "$s6";
        }
        writer.write("sll " + indexstr + "," + indexstr + ", 2\n");
        writer.write("addi " + indexstr + ", " + indexstr + ", 4\n");
        // writer.write("add "+argresult+", "+argresult+", "+argstr0+"\n");
        if (result.type.equals("constant")) {
            String tmp = "$s7";
            writer.write("li " + tmp + "," + result + "\n");
            writer.write("sw " + tmp + ", " + instr.getArg0().toString() + "(" + indexstr + ")\n");
        } else {
            writer.write("sw " + result.getValue(curAddTable) + ", " + instr.getArg0().toString() + "(" + indexstr + ")\n");
        }
        if (!index.type.equals("constant")) {
            writer.write("addi " + indexstr + ", " + indexstr + ", -4\n");
            writer.write("srl " + indexstr + ", " + indexstr + ", 2\n");
        }

    }

    private void newArrayInitialize(NewArrayIRTuple instr) throws IOException {
        //Notes:
        //		$a0 - Holds the number of bytes
        //		$v0 - On return, holds the memory address (with address 0 holding the 4 byte length)

        String type = (String) instr.getArg0();
        ArgumentVariable arg1 = new ArgumentVariable(instr.getArg1());
        ArgumentVariable result = new ArgumentVariable(instr.getResult());

        //Store $ra on stack
        writer.write("addi $sp, $sp, -20\n");
        writer.write("sw $ra, 16($sp)\n");

        //Store $a0
        writer.write("sw $a0, 12($sp)\n");

        //Store $t0-$t1 on the stack
        for (int i = 0; i < 2; i++) {
            writer.write("sw $t" + i + ", " + (8 - (4 * i)) + "($sp)\n");
        }

        //Store $v0 on the stack
        writer.write("sw $v0, 0($sp)\n");

        if (arg1.type.equals("constant"))
            writer.write("li $a0, " + arg1.getValue(curAddTable) + "\n");
        else
            writer.write("move $a0, " + arg1.getValue(curAddTable) + "\n");
        if (type.equals("int"))
            writer.write("sll $a0, $a0, 2\n");

        //Call the function of "_new_array"
        writer.write("li $v0, 9\n");
        writer.write("syscall\n");
        writer.write("lw $t0, 8($sp)\n");
        writer.write("lw $t1, 4($sp)\n");

        writer.write("lw $a0, 12($sp)\n");
        writer.write("move " + result.getValue(curAddTable) + ", $v0\n");

        writer.write("lw $v0, 0($sp)\n");
        writer.write("lw $ra, 16($sp)\n");
        writer.write("addi $sp, $sp, 20\n");

    }


    private void unaryAssignment(UnaryAssignmentIRTuple instr) throws Exception {
        String op = (String) instr.getOpcode();

        ArgumentVariable result = new ArgumentVariable(instr.getResult());
        ArgumentVariable arg1 = new ArgumentVariable(instr.getArg1());
        String resultReg = result.getValue(curAddTable);

        //Handle arg1 -- Store the first parameter in the result register
        if (arg1.type.equals("constant"))
            writer.write("li " + resultReg + ", " + arg1.getValue(curAddTable) + "\n");
        else {//Variable arg1
            Record record = currentScope.lookup(arg1.getValue(curAddTable));
            if (record instanceof VariableRecord && ((VariableRecord) record).getVariableType() == JavaParser.Type.FLOAT)
                writer.write("move.s " + resultReg + ", " + arg1.getValue(curAddTable) + "\n");
            else
                writer.write("move " + resultReg + ", " + arg1.getValue(curAddTable) + "\n");

        }
        if (op.equals("!")) {
            String L1 = "_L1\n";
            String L2 = "_L2\n";

            //Check if we have 0 (false), if so, jump to new label L1 and store "1" in the resultReg
            writer.write("beq " + resultReg + ", $zero, " + L1 + "\n");

            //Otherwise, fallthrough and store "-" in result reg
            writer.write("add " + resultReg + ", $zero, $zero\n");
            writer.write("j " + L2 + "\n");
            writer.write(L1 + ":\n");
            writer.write("addi " + resultReg + ", $zero, 1\n");
            writer.write(L2 + ":\n");
        }
        writer.write("move " + result.getValue(curAddTable) + ", " + resultReg + "\n");
    }


    private void conditonalJump(ConditionalJumpIRTuple instr) throws IOException {
        String label = instr.getResult().toString();
        ArgumentVariable arg0 = new ArgumentVariable(instr.getArg0());
        String opcode = instr.getOpcode().toString();
        switch (opcode) {
            case IFTRUE:
                writer.write("beq " + arg0.getValue(curAddTable) + ", $zero, " + label + "\n");
                break;
            case IFFALSE:
                writer.write("bne " + arg0.getValue(curAddTable) + ", $zero, " + label + "\n");
                break;
            case IFLT:
                writer.write("bltz " + arg0.getValue(curAddTable) + ", " + label + "\n");
                break;
            case IFLTE:
                writer.write("blez " + arg0.getValue(curAddTable) + ", " + label + "\n");
                break;
            case IFGT:
                writer.write("bgtz " + arg0.getValue(curAddTable) + ", " + label + "\n");
                break;
            case IFGTE:
                writer.write("bgez " + arg0.getValue(curAddTable) + ", " + label + "\n");
                break;
            case IFNEQ:
                writer.write("bne " + arg0.getValue(curAddTable) + ", $zero, " + label + "\n");
                break;
            case IFEQ:
                writer.write("beq " + arg0.getValue(curAddTable) + ", $zero, " + label + "\n");
                break;
        }
    }

    private void functionCall(FunctionCallIRTuple instr) throws IOException {
        String function = instr.getArg0().toString();
        ArgumentVariable paramPos = new ArgumentVariable(instr.getArg1().toString());
        if (function.equals("exit")) {
            writer.write(HelperFunctions.printExitCode());
            return;
        }
        //Assuming all variables as global and no parameters
        //Store $ra on stack
        writer.write("addi $sp, $sp, -12\n");
        writer.write("sw $ra, 8($sp)\n");
        //Store $v0-$v1 on the stack for taking return value
        writer.write("sw $v0, 4($sp)\n");
        writer.write("sw $v1, 0($sp)\n");
        writer.write("move $v0, " + paramPos.getValue(curAddTable));
        //Jump to the function
        writer.write("jal " + function + "\n");

        //Move return value into the result register
        if (!function.equals("print")) {
            ArgumentVariable result = new ArgumentVariable(instr.getResult());
            if (!result.getValue(curAddTable).equals("null"))
                writer.write("move " + result.getValue(curAddTable) + ", $v0\n");
        }
        //Restore $v0-$v1 from the stack
        writer.write("lw $v0, 4($sp)\n");
        writer.write("lw $v1, 0($sp)\n");

        //Restore $ra from the stack
        writer.write("lw $ra, 8($sp)\n");
        writer.write("addi $sp, $sp, 12\n");
    }

    private void functionReturn(ReturnIRTuple instr) throws IOException {
        ArgumentVariable arg0 = new ArgumentVariable(instr.getArg0());
        if (!arg0.getValue(curAddTable).equals("null")) {
            if (arg0.type.equals("constant"))
                writer.write("li $v0, " + arg0.getValue(curAddTable) + "\n");
            else
                writer.write("move $v0, " + arg0.getValue(curAddTable) + "\n");
        }
        writer.write("jr $ra\n");
    }

    private void arrayIndexLoad(ArrayAssignmentIRTuple instr) throws IOException {
        String assignmentType = instr.getOpcode().toString();
        ArgumentVariable arg0 = new ArgumentVariable(instr.getArg0());
        ArgumentVariable arg1 = new ArgumentVariable(instr.getArg1());
        ArgumentVariable result = new ArgumentVariable(instr.getResult());
        String argstr0 = arg0.getValue(curAddTable), argstr1 = arg1.getValue(curAddTable);
        if (arg1.type.equals("constant")) {
            String tmp = "$s6";
            writer.write("li " + tmp + "," + argstr1 + "\n");
            argstr1 = tmp;
        }
        writer.write("sll " + argstr1 + "," + argstr1 + ", 2\n");
        writer.write("addi " + argstr1 + ", " + argstr1 + ", 4\n");
        writer.write("lw " + result.getValue(curAddTable) + ", " + instr.getArg0().toString() + "(" + argstr1 + ")\n");
        if (!arg1.type.equals("constant")) {
            writer.write("addi " + argstr1 + ", " + argstr1 + ", -4\n");
            writer.write("srl " + argstr1 + ", " + argstr1 + ", 2\n");
        }
    }
}