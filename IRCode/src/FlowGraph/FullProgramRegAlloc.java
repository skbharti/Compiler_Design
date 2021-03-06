package IRCode.src.FlowGraph;
import IRCode.src.CodeGenerator.CodeGen;
import IRCode.src.IRCode.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class FullProgramRegAlloc
{
    List<ThreeAddCode> InstructionList;
    BlockGraph GraphofBlock;
    List<Block>  BlocksList;
    List<RegTablePerLine> FullRegTable;
    private static BufferedWriter writer = MainClass.writer;
    private static CodeGen codegen = MainClass.codegen;

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
            Liveness lv = new Liveness(InstructionList);
            lv.FindVariablesUsesDefs();
            Iterator<String> iterator = lv.Variables.iterator();

            writer.write(".data\n\n");

            while(iterator.hasNext())
            {
                String s = iterator.next();
                if(!lv.Arrays.containsKey(s))
                {
                    String p =s+": .word 0";
                    System.out.println(p);
                    writer.write(p+"\n");
                }
                else
                {
                    String p = s+": .space "+lv.Arrays.get(s);
                    System.out.println(p);
                    writer.write(p+"\n");
                }
            }
            writer.write("newline: .asciiz \"\\n\"\n");
            writer.write("\n.text\n\nmain:\n\n");


            for (int i = 0; i < BlocksList.size(); i++)
            {
                if(BlocksList.get(i).ListOfInstructions.get(0) instanceof LabelIRTuple && ( (BlocksList.get(i).getListOfInstructions().get(0))).getArg0().equals("exit"))
                    continue;
                Tables tb = new Tables(BlocksList.get(i).ListOfInstructions);
                tb.RegisterAllocator();

                int sz  = BlocksList.get(i).ListOfInstructions.size();

                if ( !(BlocksList.get(i).ListOfInstructions.get(sz-1) instanceof ConditionalJumpIRTuple || BlocksList.get(i).ListOfInstructions.get(sz-1) instanceof UnconditionalJumpIRTuple) )
                {
                    for (int j = 1; j <= 10; j++)
                    {
                        if (tb.RegesterTable.containsKey(j))
                        {
                            String temp = "sw $t" + (j - 1) + ", " + tb.RegesterTable.get(j) + "\n";
                            writer.write(temp);
                        }
                    }

                    for (int j = 0; j < 6; j++)
                    {
                        if (tb.RegesterTable.containsKey(10 + j + 1))
                        {
                            String temp = "sw  $s" + j + ", " + tb.RegesterTable.get(10 + j + 1) + "\n";
                            writer.write(temp);
                        }

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
