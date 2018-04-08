package src.SymbolsAndScopes;

import java.util.List;

public class ArrayRecord extends Record {
    public String arrayType;
    public int arrayDim;
    public List<String> dimLengthVar;

    public ArrayRecord(String type, int dim, List<String> dimLenVar){
        this.arrayType = type;
        this.arrayDim = dim;
        this.dimLengthVar = dimLenVar;
    }

    public int getArrayDim() {
        return arrayDim;
    }

    public String getArrayType() {
        return arrayType;
    }

    public List<String> getDimLength() {
        return dimLengthVar;
    }

    public void setArrayDim(int arrayDim) {
        this.arrayDim = arrayDim;
    }

    public void setArrayType(String arrayType) {
        this.arrayType = arrayType;
    }

    public void setDimLength(List<String> dimLenVar) {
        this.dimLengthVar = dimLenVar;
    }
}

