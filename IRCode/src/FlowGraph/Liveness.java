package IRCode.src.FlowGraph;

import IRCode.src.IRCode.ArrayAssignmentIRTuple;
import IRCode.src.IRCode.*;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Liveness
{
    List<ThreeAddCode> InstructionList;
    List<String> Variables;
    Hashtable<String, List<Integer>> Used;
    Hashtable<String , List<Integer> > Defined;

    public Liveness(List<ThreeAddCode> Instr)
    {
        InstructionList = Instr;
        Variables = new ArrayList<String>();
        Used = new Hashtable<String, List<Integer>>();
        Defined = new Hashtable<String, List<Integer>>();
        FindVariablesUsesDefs();
    }


    public boolean Isnum( String s)
    {
        try {
            double d = Double.parseDouble(s);
            return true;
            //string is a number
        } catch (NumberFormatException e) {
            // string is not a number
            return false;
        }
    }


    public int getNextUse(String var, int num)
    {
        List<Integer> temp = Used.get(var);

        if(temp == null)
            return -1;

        for(int i = 0; i < temp.size(); i++)
        {
            if(temp.get(i) > num )
                return temp.get(i);
        }

        return -1;
    }

    public int getNextDef(String var, int num)
    {
        List<Integer> temp = Defined.get(var);

        for(int i = 0; i < temp.size(); i++)
        {
            if(temp.get(i) > num )
                return temp.get(i);
        }

        return -1;
    }

    public boolean IsAliveAfter(String var, int num)
    {
        int num1 = getNextUse(var, num);

        if(num1 == -1)
            return false;

        int num2 = getNextDef(var,num);

        if (num2 == -1)
            return true;

        if(num2 < num1 )
            return false;

        else
            return true;

    }

    public void InsertInUsed(String var, int i)
    {
        if(var == null)
            return;
        if(Isnum(var))
            return;
        if(var.equals("null") )
            return;

        if(Used.get(var) == null )
        {
            List<Integer> NumList = new ArrayList<Integer>();
            NumList.add(i);
            Used.put(var,NumList);
        }
        else
        {
            Used.get(var).add(i);
        }
    }

    public void InsertInDef(String var, int i)
    {
        if(var == null)
            return;
        if(Isnum(var))
            return;
        if(var.equals("null") )
            return;

        if(Defined.get(var) == null )
        {
            List<Integer> NumList = new ArrayList<Integer>();
            NumList.add(i);
            Defined.put(var,NumList);
        }
        else
        {
            Defined.get(var).add(i);
        }

    }

    public void InsertInVariable(String var)
    {


        if(var == null)
            return;
        if(Isnum(var))
            return;
        if(var.equals("null") )
            return;

        if(!Variables.contains(var))
        {
            Variables.add(var);
            //System.out.println("Variable : " + var);
        }
    }


    public void FindVariablesUsesDefs()
    {
        for(int i = 0; i< InstructionList.size(); i++)
        {
            ThreeAddCode q = InstructionList.get(i);

            if(q instanceof ArrayAssignmentIRTuple)
            {

                String var1 = (String) q.getArg1();
                InsertInVariable(var1);
                InsertInUsed(var1, i);

                String var2 = (String) q.getResult();
                InsertInVariable(var2);
                InsertInUsed(var2, i);

            }

            if(q instanceof AssignmentIRTuple)
            {

                if(q.getArg0() != null) {
                    String var1 = q.getArg0().toString();
                    InsertInVariable(var1);
                    InsertInUsed(var1, i);
                }
                if(q.getArg1() != null) {
                    String var2 = q.getArg1().toString();
                    InsertInVariable(var2);
                    InsertInUsed(var2, i);
                }
                if(q.getResult() != null) {
                    String res = q.getResult().toString();
                    InsertInVariable(res);
                    InsertInDef(res, i);


                }

            }

            if(q instanceof ConditionalJumpIRTuple)
            {
                String var1 = q.getArg0().toString();

                InsertInVariable(var1);
                InsertInUsed(var1, i);
            }

            if(q instanceof CopyIRTuple)
            {
                String var1 = q.getArg0().toString();
                String res = q.getResult().toString();

                InsertInVariable(var1);
                InsertInVariable(res);

                InsertInUsed(var1, i);
                InsertInDef(res, i);
            }

            if(q instanceof FunctionCallIRTuple)
            {
                String res = q.getResult().toString();

                InsertInVariable(res);
                InsertInDef(res, i); ;
            }

            if(q instanceof NewArrayIRTuple)
            {
                String var1 = q.getArg1().toString();

                InsertInVariable(var1);
                InsertInUsed(var1, i);
            }

            if(q instanceof PrintIRTuple)
            {
                String var1 = q.getArg0().toString();
                InsertInVariable(var1);
                InsertInUsed(var1, i);
            }

            if(q instanceof  UnaryAssignmentIRTuple)
            {
                String res = q.getResult().toString();

                InsertInVariable(res);
                InsertInDef(res, i);
            }

        }

        Variables.remove("null");
        Used.remove("null");
        Defined.remove("null");



    }

    public void PrintTest()
    {
        System.out.println("Variable List");
        System.out.println(Variables);
        System.out.println("Used List");
        System.out.println(Used);
        System.out.println("Defined List");
        System.out.println(Defined);

    }




}
