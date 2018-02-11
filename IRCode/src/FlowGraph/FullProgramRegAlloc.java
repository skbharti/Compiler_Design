package IRCode.src.FlowGraph;
import IRCode.src.IRCode.ThreeAddCode;

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
        FullRegTable = new ArrayList<RegTablePerLine>();
    }

    public void FullRegAlloc()
    {
        for(int i = 0; i< BlocksList.size(); i++)
        {
            Tables tb = new Tables(BlocksList.get(i).ListOfInstructions);
            tb.RegisterAllocator();
        }

    }



}
