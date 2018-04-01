package IRCode.src.FlowGraph;

public class AddrTableEntry {



    boolean IsInReg;
    int Reg;
    boolean WriteToMemory;


    public  AddrTableEntry()
    {
        IsInReg = false;
        Reg = -1;
        WriteToMemory = false;
    }

    public void setIsInReg()
    {
        IsInReg = true;
    }

    public void DesetIsInReg()
    {
        IsInReg = false;
    }

    public void setReg(int n)
    {
        Reg = n;
    }

    public boolean getIsInReg()
    {
        return IsInReg;
    }

    public int getReg()
    {
        return Reg;
    }

    public void setWriteToMemory()
    {
        WriteToMemory = true;
    }

    public void DesetWriteToMemory()
    {
        WriteToMemory = false;
    }

    public boolean getWriteToMemory()
    {
        return WriteToMemory;
    }



}
