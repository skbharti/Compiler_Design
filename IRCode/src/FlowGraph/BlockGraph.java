package IRCode.src.FlowGraph;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import IRCode.src.FlowGraph.Block;
import IRCode.src.IRCode.*;

public class BlockGraph
{
    List<Integer> Leaders;
    List<Block> Graph;
    Hashtable<String,  Integer> LabelList;

    public BlockGraph()
    {
        Leaders = new ArrayList<Integer>();
        Graph = new ArrayList<Block>();
        LabelList = new Hashtable<String, Integer>();
    }

    public boolean IsGotoStatement(ThreeAddCode instr)
    {
        if(instr  instanceof FunctionCallIRTuple )
            return true;
        if(instr instanceof ConditionalJumpIRTuple )
            return true;
        if(instr instanceof UnconditionalJumpIRTuple)
            return true;

        return false;
    }

    public String getLabelName(ThreeAddCode q)
    {
        if(q instanceof ConditionalJumpIRTuple)
            return (String) q.getResult();

        if(q instanceof  UnconditionalJumpIRTuple)
            return (String) q.getResult();

        if(q instanceof FunctionCallIRTuple)
            return (String) q.getArg0();

        else return null;
    }


    public void CreateLabelList(List<ThreeAddCode> Instr)
    {
        for(int i = 0; i < Instr.size(); i++)
        {
            ThreeAddCode q = Instr.get(i);
//            System.out.println("In Graph : " + q.toString());

            if(q instanceof LabelIRTuple)
            {

                if(q.getArg0() != null)
                {
                    LabelList.put((String) q.getArg0(), i);
                    System.out.println("Label Instance");
                }
            }

        }
    }



    public void FindLeaders(List<ThreeAddCode> Instr )
    {
        this.CreateLabelList(Instr);

        List<ThreeAddCode> InstructionList = Instr;
        Leaders.add(0);

        for(int i = 1; i < InstructionList.size(); i++)
        {
            ThreeAddCode q = InstructionList.get(i);

            if( IsGotoStatement(q) )
            {
                if(!Leaders.contains(i+1))
                {
                    Leaders.add(i+1);
                }

                int LineNum = LabelList.get(this.getLabelName(q));

                if(!Leaders.contains(LineNum))
                {
                    Leaders.add(LineNum);
                }

            }
        }

        Collections.sort(Leaders);

    }





    public void CreateGraph(List<ThreeAddCode> Instr )
    {
        this.FindLeaders(Instr);

        for(int i =0; i< Leaders.size(); i++)
        {
            List<ThreeAddCode> temp = new ArrayList<ThreeAddCode>();

            if(i != Leaders.size()-1 )
            {
                for (int j = Leaders.get(i); j < Leaders.get(i + 1); j++)
                {
                    temp.add(Instr.get(j));
                }
            }
            else
            {
                for (int j = Leaders.get(i); j < Instr.size() ; j++)
                {
                    temp.add(Instr.get(j));
                }
            }

            Block tempBlock = new Block(temp);
            tempBlock.setBlockStartNum(Leaders.get(i));
            Graph.add(tempBlock);

        }

        for (int i = 0; i< Leaders.size(); i++)
        {
            if(i != Leaders.size()-1 )
            {
                Graph.get(i).setCaseFalse(Graph.get(i+1));
            }

            int BlockSize = Graph.get(i).ListOfInstructions.size();
            ThreeAddCode LastInstr = Graph.get(i).ListOfInstructions.get(BlockSize-1);

            if(IsGotoStatement(LastInstr))
            {
                String tempLabel = getLabelName(LastInstr);
                if (tempLabel != null)
                {
                    int nextBlockStartLineNum = LabelList.get(tempLabel);
                    int nextBlockindex = GetBlockIndex(nextBlockStartLineNum);
                    if(nextBlockindex != -1)
                    {
                        Graph.get(i).setCaseTrue(Graph.get(nextBlockindex));
                    }
                }

            }

        }

    }

    public int GetBlockIndex(int stnum)
    {
        for(int i = 0; i< Graph.size(); i++)
        {
            if(stnum == Graph.get(i).getBlockStartNum())
            {
                return i;
            }

        }

        return -1;
    }


    public void PrintLeaders()
    {
        System.out.println(Leaders);
    }

    public void PrintLabelList()
    {
        System.out.println(LabelList);
    }

    public void PrintGraph()
    {
        System.out.println("------------------------------------------------");
        for(int i = 0; i< Graph.size(); i++)
        {
            System.out.println("Block " + i);
            Block tempBlock = Graph.get(i);

            for(int j =0; j<tempBlock.ListOfInstructions.size(); j++ )
            {
                System.out.println(tempBlock.ListOfInstructions.get(j).toString());
            }

            System.out.println("------------------------------------------------");
        }
    }


}






























