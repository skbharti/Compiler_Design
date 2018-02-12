package IRCode.src.FlowGraph;
import IRCode.src.CodeGenerator.CodeGen;
import IRCode.src.IRCode.ThreeAddCode;

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
    BufferedWriter writer;
    CodeGen cg;

    public FullProgramRegAlloc(List<ThreeAddCode> Instr)
    {
        InstructionList = Instr;
        GraphofBlock = new BlockGraph();
        GraphofBlock.CreateGraph(Instr);
        BlocksList = GraphofBlock.Graph;
        try {
            writer = new BufferedWriter(new FileWriter("mips.s"));
        }
        catch (Exception e){
            System.out.println("Error!");
        }
            cg = new CodeGen(writer);
    }

    public void FullRegAlloc()
    {
        try {
            Liveness lv = new Liveness(InstructionList);
            lv.FindVariablesUsesDefs();
            Iterator<String> iterator = lv.Variables.iterator();

            writer.write(".text\n\n");

            while(iterator.hasNext())
            {
                String s = iterator.next();
                if(!lv.Arrays.containsKey(s))
                {
                    String p =s+": .word";
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

            writer.write("\n\nmain:\n\n");


            for (int i = 0; i < BlocksList.size(); i++)
            {
                Tables tb = new Tables(BlocksList.get(i).ListOfInstructions, cg);
                tb.RegisterAllocator();

                for (int j = 1; j <= 10; j++)
                {
                    if (tb.RegesterTable.containsKey(j))
                    {
                        String temp = "sw $t"+(j-1) +" " + tb.RegesterTable.get(j)+"\n";
                        writer.write(temp);
                    }

                }

                for (int j = 0; j < 6; j++)
                {
                    if (tb.RegesterTable.containsKey(10+j+1))
                    {
                        String temp = "sw  $s"+j +" " + tb.RegesterTable.get(j)+"\n";
                        writer.write(temp);
                    }

                }

            }


        }
        catch (IOException e)
        {
            System.out.println(""+e);
        }
        try {
            writer.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
