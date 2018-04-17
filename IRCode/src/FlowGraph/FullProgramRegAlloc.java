package IRCode.src.FlowGraph;
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
            Liveness lv = new Liveness(InstructionList);
            lv.FindVariablesUsesDefs();
            writer.write("\n.text\n\nmain:\n\n");
            Scope currentScope = MyParser.currentScope;
            for (int i = 0; i < BlocksList.size(); i++)
            {   List<ThreeAddCode> list =BlocksList.get(i).getListOfInstructions();
                if (list.get(0) instanceof LabelIRTuple)
                    currentScope = scopeMapping.get(((String)list.get(0).getArg0()).split("_")[1]);
                Tables tb = new Tables(list,currentScope);
                tb.RegisterAllocator();
            }
    }


}
