package IRCode.src.FlowGraph;
import IRCode.src.IRCode.ThreeAddCode;

import java.util.List;

public class Block
{
    List<ThreeAddCode> ListOfInstructions;
    Block CaseTrue;
    Block CaseFalse;
    int BlockStartNum;

    public Block(List<ThreeAddCode> I )
    {
        ListOfInstructions = I;
        CaseTrue = null;
        CaseFalse = null;
    }

    public Block(List<ThreeAddCode> I, Block tr , Block fl )
    {
        ListOfInstructions = I;
        CaseTrue = tr;
        CaseFalse = fl;
    }

    public void setCaseTrue(Block tr)
    {
        CaseTrue = tr;
    }

    public void setCaseFalse(Block fl)
    {
        CaseFalse = fl;
    }

    public Block getCaseTrue()
    {
        return CaseTrue;
    }

    public Block getCaseFalse() {
        return CaseFalse;
    }

    public void setBlockStartNum(int n)
    {
        BlockStartNum = n;
    }

    public int getBlockStartNum()
    {
        return BlockStartNum;
    }

    public List<ThreeAddCode> getListOfInstructions() {
        return ListOfInstructions;
    }

}
