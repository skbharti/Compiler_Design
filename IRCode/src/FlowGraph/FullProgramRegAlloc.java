package IRCode.src.FlowGraph;
import IRCode.src.CodeGenerator.CodeGen;
import IRCode.src.IRCode.*;
import src.MyParser;
import src.SymbolsAndScopes.Scope;

import java.io.BufferedWriter;

import java.util.HashMap;
import java.util.List;

public class FullProgramRegAlloc
{
    private List<ThreeAddCode> InstructionList;
    private BlockGraph GraphofBlock;
    private List<Block>  BlocksList;
    private static BufferedWriter writer = MyParser.writer;
    public static HashMap<String,Scope> scopeMapping;
    public FullProgramRegAlloc(List<ThreeAddCode> Instr, HashMap<String,Scope> scopeMapping)
    {
        InstructionList = Instr;
        GraphofBlock = new BlockGraph();
        GraphofBlock.CreateGraph(Instr);
        BlocksList = GraphofBlock.Graph;
        this.scopeMapping = scopeMapping;
    }

    public void FullRegAlloc() throws Exception{
            Liveness lv = new Liveness(InstructionList,scopeMapping);
            lv.FindVariablesUsesDefs();
            writer.write("\n.data\n\tnewline:\t.asciiz\t\"\\n\"\n");
            writer.write("\n.text\n\nmain:\n\n");

            for (int i = 0; i < BlocksList.size(); i++)
            {   List<ThreeAddCode> list =BlocksList.get(i).getListOfInstructions();
                Tables tb = new Tables(list,lv);
                tb.RegisterAllocator();
            }
    }


}
