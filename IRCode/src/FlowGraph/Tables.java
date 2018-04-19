package IRCode.src.FlowGraph;

import IRCode.src.CodeGenerator.CodeGen;
import IRCode.src.IRCode.ScopeChangeIRTuple;
import IRCode.src.IRCode.ThreeAddCode;
import IRCode.src.helperclasses.ArgumentVariable;
import src.MyParser;
import src.SymbolsAndScopes.ArrayRecord;
import src.SymbolsAndScopes.Record;
import src.SymbolsAndScopes.Scope;
import src.SymbolsAndScopes.VariableRecord;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class Tables {
    Hashtable<Integer, String> RegesterTable;
    Hashtable<String, AddrTableEntry> AddressTable;
    Hashtable<String, AddrTableEntry> PrevAddressTable;
    List<ThreeAddCode> InstructionList;
    Liveness InstrLiveness;
    CodeGen codegen = MyParser.codegen;
    int MaxReg = 16;
    public static Scope currentScope=MyParser.globalScope;
    private static Scope prevScope;

    public Tables(List<ThreeAddCode> Instr, Liveness liveness) {
        InstructionList = Instr;
        RegesterTable = new Hashtable<>();
        AddressTable = new Hashtable<>();
        PrevAddressTable = new Hashtable<>();
        InstrLiveness = liveness;
    }


    public int getFreeRegister() {
        for (int i = 1; i <= MaxReg; i++) {
            if (RegesterTable.get(i) == null)
                return i;
        }
        return -1;
    }


    public void AddInRegAddrTables(int n, String var) {
        if (!InstrLiveness.Variables.contains(var))
            return;
        else {
            if (RegesterTable.containsKey(n))
                RegesterTable.remove(n);

            RegesterTable.put(n, var);

            AddrTableEntry tempentry = new AddrTableEntry();
            tempentry.setIsInReg();
            tempentry.setReg(n);

            if (AddressTable.containsKey(var))
                AddressTable.remove(var);

            AddressTable.put(var, tempentry);
        }

    }


    public boolean isVariable(String value) {
        if (value == null)
            return false;
        if (value.equals("null")) {
            return false;
        }
        try {
            double d = Double.parseDouble(value);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }


    public void SwapInRegAddrTables1(int n, String oldvar, String newvar) {
        //System.out.println("In Add reg method: " + oldvar + "  " + newvar);
        //System.out.println("Entered Swap ----   " + newvar + " ---- "+ oldvar );
        if (!InstrLiveness.Variables.contains(oldvar))
            return;

        if (!InstrLiveness.Variables.contains(newvar))
            return;

        // Store content of Reg-n in memory of var2.

        RegesterTable.remove(n);
        RegesterTable.put(n, newvar);

        AddrTableEntry tempentry = new AddrTableEntry();
        tempentry.setIsInReg();
        tempentry.setReg(n);

        if (AddressTable.containsKey(newvar))
            AddressTable.remove(newvar);
        AddressTable.put(newvar, tempentry);
        AddressTable.get(oldvar).DesetIsInReg();

    }

    public void SwapInRegAddrTables(int n, String oldvar, String newvar) {
        if (!InstrLiveness.Variables.contains(oldvar))
            return;

        if (!InstrLiveness.Variables.contains(newvar))
            return;

        // Store content of Reg-n in memory of var2.

        AddressTable.get(oldvar).setWriteToMemory();
        if (RegesterTable.containsKey(n))
            RegesterTable.remove(n);

        RegesterTable.put(n, newvar);

        AddrTableEntry tempentry = new AddrTableEntry();
        tempentry.setIsInReg();
        tempentry.setReg(n);

        if (AddressTable.containsKey(newvar))
            AddressTable.remove(newvar);

        AddressTable.put(newvar, tempentry);
        AddressTable.get(oldvar).DesetIsInReg();


    }

    public boolean CheckIfDead(String var, int num) {
        return !InstrLiveness.IsAliveAfter(var, num);
    }


    public int NextUse(String var, int num) {
        return InstrLiveness.getNextUse(var, num);
    }


    public int FartestNextUse(int num, int exceptnum1, int exceptnum2) {
        int max = 0;
        int max_num = 1;

        for (int i = 1; i <= MaxReg; i++) {

            if ((i == exceptnum1) || (i == exceptnum2))
                continue;

            if (!RegesterTable.containsKey(i))
                return i;

            int x = NextUse(RegesterTable.get(i), num);

            if (x == -1)
                return i;
            else {
                if (x > max) {
                    max = x;
                    max_num = i;
                }

            }

        }

        return max_num;
    }

    public int GetDeadReg(int num) {
        for (int i = 1; i <= MaxReg; i++) {
            if (RegesterTable.containsKey(i)) {
                if (CheckIfDead(RegesterTable.get(i), num)) {
                    return i;
                }
            } else {
                return 0;
            }

        }

        return -1;
    }


    public int AllocateRegister(String var, int linenum, int exceptnum1, int exceptnum2) {
        int regnum;
        if (AddressTable.containsKey(var)) {
            if (AddressTable.get(var).getIsInReg()) {
                return AddressTable.get(var).getReg();
            } else {
                regnum = getFreeRegister();
                if (regnum != -1) {
                    AddInRegAddrTables(regnum, var);
                } else {

                    {
                        regnum = FartestNextUse(linenum, exceptnum1, exceptnum2);
                        String oldvar = RegesterTable.get(regnum).toString();
                        SwapInRegAddrTables(regnum, oldvar, var);
                    }
                }

            }
        } else {
            regnum = getFreeRegister();
            if (regnum != -1) {
                AddInRegAddrTables(regnum, var);
            } else {
                {
                    regnum = FartestNextUse(linenum, exceptnum1, exceptnum2);
                    //System.out.println("Register number fartest : "+regnum);
                    String oldvar = RegesterTable.get(regnum).toString();
                    SwapInRegAddrTables(regnum, oldvar, var);
                }
            }

        }

        return regnum;

    }

    public static int getStackPointer(String name, Scope currentScope) {

        return currentScope.lookupOffset(name,0);
    }

    public void RegisterAllocator() throws Exception {
        for (int i = 0; i < InstructionList.size(); i++) {
            int flag = 0;
            ThreeAddCode q = InstructionList.get(i);

            if (q instanceof ScopeChangeIRTuple) {
                prevScope = currentScope;
                currentScope = FullProgramRegAlloc.scopeMapping.get(q.getArg0());
                if (q.getOpcode().equals("true"))
                    CodeGen.updateMainStackPointer(-currentScope.getVariableSize());
                else
                    CodeGen.updateMainStackPointer(prevScope.getVariableSize());
            }
            int regnum1 = -1;
            int regnum2 = -1;
            int regnum3 = -1;

            String var1 = null;
            String var2 = null;
            String res = null;

            //System.out.println(q.getArg0().toString());
            if (q.getArg0() != null)
                var1 = q.getArg0().toString();

            if (q.getArg1() != null)
                var2 = q.getArg1().toString();

            if (q.getResult() != null)
                res = q.getResult().toString();

            if (InstrLiveness.Variables.contains(var1)) {
                regnum1 = AllocateRegister(var1, i, -1, -1);
            }
            if (InstrLiveness.Variables.contains(var2)) {
                regnum2 = AllocateRegister(var2, i, regnum1, -1);
            }
            if (InstrLiveness.Variables.contains(res)) {

                if (AddressTable.containsKey(res) && AddressTable.get(res).getIsInReg()) {
                    regnum3 = AddressTable.get(res).getReg();
                    System.out.println(i + " Regnum3 :" + regnum3);
                } else {


                    if (false && InstrLiveness.Variables.contains(var1) && CheckIfDead(var1, i) && AddressTable.containsKey(var1)) {
                        //System.out.println("Var1 id dead in Line " + (i+1) );
                        regnum3 = regnum1;

                        AddressTable.get(var1).setWriteToMemory();
                        flag = 1;

                        // AddressTable shows both res and var1 has same register.
                        AddrTableEntry tempentry = new AddrTableEntry();
                        tempentry.setIsInReg();
                        tempentry.setReg(regnum3);

                        if (AddressTable.containsKey(res))
                            AddressTable.remove(res);

                        AddressTable.put(res, tempentry);


                    } else if (false && InstrLiveness.Variables.contains(var2) && CheckIfDead(var2, i) && AddressTable.containsKey(var2)) {
                        // System.out.println("Var2 id dead in Line " + (i+1) );
                        regnum3 = regnum2;
                        AddressTable.get(var2).setWriteToMemory();
                        flag = 2;

                        // AddressTable shows both res and var2 has same register.
                        AddrTableEntry tempentry = new AddrTableEntry();
                        tempentry.setIsInReg();
                        tempentry.setReg(regnum3);

                        if (AddressTable.containsKey(res))
                            AddressTable.remove(res);

                        AddressTable.put(res, tempentry);

                    } else {
                        regnum3 = AllocateRegister(res, i, regnum1, regnum2);
                    }


                }
            }

            RegTablePerLine tempTable = new RegTablePerLine();
            tempTable.RegTableEntry = RegesterTable;

            if (flag == 1 && regnum3 != -1)
                SwapInRegAddrTables1(regnum3, var1, res);

            if (flag == 2 && regnum3 != -1)
                SwapInRegAddrTables1(regnum3, var2, res);

            for (String Key : AddressTable.keySet()) {
                if (AddressTable.get(Key).getWriteToMemory())
                    MyParser.writer.write("sw " + ArgumentVariable.getRegName(PrevAddressTable.get(Key).getReg()) + " " + getStackPointer(Key, this.currentScope) + "($sp)" + "\n");
            }

            String arg0 = q.getArg0();
            String arg1 = q.getArg1();
            if (isVariable(arg0) && !PrevAddressTable.containsKey(arg0) && AddressTable.containsKey(arg0))
                MyParser.writer.write("lw " + ArgumentVariable.getRegName(AddressTable.get(arg0).getReg()) + " " + getStackPointer(arg0,this.currentScope) + "($sp)" + "\n");
            if (isVariable(arg1) && !this.PrevAddressTable.containsKey(arg1) && AddressTable.containsKey(arg1))
                MyParser.writer.write("lw " + ArgumentVariable.getRegName(AddressTable.get(arg1).getReg()) + " " + getStackPointer(arg1,this.currentScope) + "($sp)" + "\n");

            // Call the translater
            codegen.generateMips(q, AddressTable, PrevAddressTable, RegesterTable, currentScope);


            Set<String> keysTemp = AddressTable.keySet();
            for (String key : keysTemp) {
                AddressTable.get(key).DesetWriteToMemory();

            }

            // Make write to memory of all variables false, After translating and before proceeding to next step.


            Set<String> keys = AddressTable.keySet();
            for (String key : keys) {
                AddressTable.get(key).DesetWriteToMemory();

                AddrTableEntry tempentry = new AddrTableEntry();

                if (AddressTable.get(key).getIsInReg())
                    tempentry.setIsInReg();

                tempentry.setReg(AddressTable.get(key).getReg());

                PrevAddressTable.put(key, tempentry);
            }


        }

    }


}























