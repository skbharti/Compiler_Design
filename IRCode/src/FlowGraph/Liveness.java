package IRCode.src.FlowGraph;

import IRCode.src.IRCode.ArrayAssignmentIRTuple;
import IRCode.src.IRCode.*;
import src.SymbolsAndScopes.Scope;
import src.SymbolsAndScopes.VariableRecord;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Liveness {
    List<ThreeAddCode> InstructionList;
    List<String> Variables;
    Hashtable<String, List<Integer>> Used;
    Hashtable<String, List<Integer>> Defined;
    Hashtable<String, Integer> Arrays = new Hashtable<String, Integer>();
    HashMap<String, Scope> scopeHashMap;

    public Liveness(List<ThreeAddCode> Instr, HashMap<String, Scope> scopeHashMap) {
        InstructionList = Instr;
        this.scopeHashMap = scopeHashMap;
        Variables = new ArrayList<String>();
        Used = new Hashtable<String, List<Integer>>();
        Defined = new Hashtable<String, List<Integer>>();
        FindVariablesUsesDefs();
    }

    public void InsertInArrays(String ptr, String size) {
        this.Arrays.put(ptr, 4 * Integer.parseInt(size));
    }

    public boolean Isnum(String s) {
        try {
            double d = Double.parseDouble(s);
            return true;
            //string is a number
        } catch (NumberFormatException e) {
            // string is not a number
            return false;
        }
    }


    public int getNextUse(String var, int num) {
        List<Integer> temp = Used.get(var);

        if (temp == null)
            return -1;

        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) > num)
                return temp.get(i);
        }

        return -1;
    }

    public int getNextDef(String var, int num) {
        List<Integer> temp = Defined.get(var);

        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) > num)
                return temp.get(i);
        }

        return -1;
    }

    public boolean IsAliveAfter(String var, int num) {
        int num1 = getNextUse(var, num);

        if (num1 == -1)
            return false;

        int num2 = getNextDef(var, num);

        if (num2 == -1)
            return true;

        if (num2 < num1)
            return false;

        else
            return true;

    }

    public void InsertInUsed(String var, int i) {
        if (var == null)
            return;
        if (Isnum(var))
            return;
        if (var.equals("null"))
            return;

        if (Used.get(var) == null) {
            List<Integer> NumList = new ArrayList<Integer>();
            NumList.add(i);
            Used.put(var, NumList);
        } else {
            Used.get(var).add(i);
        }
    }

    public void InsertInDef(String var, int i) {
        if (var == null)
            return;
        if (Isnum(var))
            return;
        if (var.equals("null"))
            return;

        if (Defined.get(var) == null) {
            List<Integer> NumList = new ArrayList<Integer>();
            NumList.add(i);
            Defined.put(var, NumList);
        } else {
            Defined.get(var).add(i);
        }

    }

    public void InsertInVariable(String var) {
        boolean flag = false;
        try {
            for (Scope scope : scopeHashMap.values())
                if ((scope.lookup(var) instanceof VariableRecord)) {
                    flag = true;
                    break;
                }
        } catch (Exception e) {

        }
        if (var.contains("var"))
            flag = true;
        if (!flag)
            return;
        if (!Variables.contains(var)) {
            Variables.add(var);
            //System.out.println("Variable : " + var);
        }
    }


    public void FindVariablesUsesDefs() {
        for (int i = 0; i < InstructionList.size(); i++) {
            ThreeAddCode q = InstructionList.get(i);

            if (q instanceof ArrayAssignmentIRTuple) {

                if (q.getOpcode().equals("ArrToVar")) {
                    String pointer = q.getArg0().toString();
                    String index = q.getArg1().toString();
                    String assignVariable = q.getResult().toString();
                    InsertInVariable(pointer);
                    InsertInVariable(index);
                    InsertInVariable(assignVariable);
                    InsertInUsed(pointer, i);
                    InsertInUsed(index, i);
                    InsertInDef(assignVariable, i);


                } else {
                    String pointer = q.getArg0().toString();
                    String index = q.getArg1().toString();
                    String assignVariable = q.getResult().toString();
                    InsertInVariable(pointer);
                    InsertInVariable(index);
                    InsertInVariable(assignVariable);
                    InsertInUsed(assignVariable, i);
                    InsertInUsed(index, i);
                    InsertInUsed(assignVariable, i);
                }
            }

            if (q instanceof AssignmentIRTuple) {

                if (q.getArg0() != null) {
                    String var1 = q.getArg0().toString();
                    InsertInVariable(var1);
                    InsertInUsed(var1, i);
                }
                if (q.getArg1() != null) {
                    String var2 = q.getArg1().toString();
                    InsertInVariable(var2);
                    InsertInUsed(var2, i);
                }
                if (q.getResult() != null) {
                    String res = q.getResult().toString();
                    InsertInVariable(res);
                    InsertInDef(res, i);


                }

            }

            if (q instanceof ConditionalJumpIRTuple) {
                String var1 = q.getArg0().toString();

                InsertInVariable(var1);
                InsertInUsed(var1, i);
            }

            if (q instanceof CopyIRTuple) {
                String var1 = q.getArg0().toString();
                String res = q.getResult().toString();

                InsertInVariable(var1);
                InsertInVariable(res);

                InsertInUsed(var1, i);
                InsertInDef(res, i);
            }

            if (q instanceof FunctionCallIRTuple) {
                String res = q.getResult().toString();

                InsertInVariable(res);
                InsertInDef(res, i);
                ;
            }

            if (q instanceof NewArrayIRTuple) {
                String count = q.getArg1().toString();
                String assignVariable = q.getResult().toString();
                InsertInVariable(count);
                InsertInVariable(assignVariable);
                InsertInArrays(assignVariable, count);
                InsertInUsed(count, i);
                InsertInDef(assignVariable, i);
            }

            if (q instanceof PrintIRTuple) {
                String var1 = q.getArg0().toString();
                InsertInVariable(var1);
                InsertInUsed(var1, i);
            }

            if (q instanceof UnaryAssignmentIRTuple) {
                String res = q.getResult().toString();

                InsertInVariable(res);
                InsertInDef(res, i);
            }

        }

        Variables.remove("null");
        Used.remove("null");
        Defined.remove("null");


    }

    public void PrintTest() {
        System.out.println("Variable List");
        System.out.println(Variables);
        System.out.println("Used List");
        System.out.println(Used);
        System.out.println("Defined List");
        System.out.println(Defined);

    }


}