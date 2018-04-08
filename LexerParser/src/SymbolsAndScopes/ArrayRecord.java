package src.SymbolsAndScopes;

public class ArrayRecord extends Record {
    public String arrayType;
    public int arrayDim;
    public int[] dimLength;

    public ArrayRecord(String type, int dim, int[] dimLen){
        this.arrayType = type;
        this.arrayDim = dim;
        this.dimLength = dimLen;
    }

    public int getArrayDim() {
        return arrayDim;
    }

    public String getArrayType() {
        return arrayType;
    }

    public int[] getDimLength() {
        return dimLength;
    }

    public void setArrayDim(int arrayDim) {
        this.arrayDim = arrayDim;
    }

    public void setArrayType(String arrayType) {
        this.arrayType = arrayType;
    }

    public void setDimLength(int[] dimLength) {
        this.dimLength = dimLength;
    }
}

