package IRCode.src.FlowGraph;
import IRCode.src.IRCode.ThreeAddCode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FullProgramRegAlloc
{
    List<ThreeAddCode> InstructionList;
    BlockGraph GraphofBlock;
    List<Block>  BlocksList;
    List<RegTablePerLine> FullRegTable;

    public FullProgramRegAlloc(List<ThreeAddCode> Instr)
    {
        InstructionList = Instr;
        GraphofBlock = new BlockGraph();
        GraphofBlock.CreateGraph(Instr);
        BlocksList = GraphofBlock.Graph;
    }

    public void FullRegAlloc()
    {
        try {

            FileWriter fw = new FileWriter("mips.s");
            BufferedWriter writer = new BufferedWriter(fw);



            for (int i = 0; i < BlocksList.size(); i++)
            {
                Tables tb = new Tables(BlocksList.get(i).ListOfInstructions);
                tb.RegisterAllocator();

                for (int j = 1; j <= 10; j++)
                {
                    if (tb.RegesterTable.containsKey(j))
                    {
                        String temp = "sw $t"+(j-1) +" " + tb.RegesterTable.get(j);
                        writer.write(temp);
                    }

                }

                for (int j = 0; j < 6; j++)
                {
                    if (tb.RegesterTable.containsKey(10+j+1))
                    {
                        String temp = "sw  $s"+j +" " + tb.RegesterTable.get(j);
                        writer.write(temp);
                    }

                }

            }


        }
        catch (IOException e)
        {
            System.out.println(""+e);
        }

    }


}
