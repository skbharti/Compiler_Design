package src.SymbolsAndScopes;

import src.JavaParser;

import java.util.List;

public class ArrayRecord extends Record {
    public JavaParser.Type arrayType;
    public int arrayDim;
    public List<String> dimLengthVar;

    public ArrayRecord(JavaParser.Type type, int dim, List<String> dimLenVar){
        this.arrayType = type;
        this.arrayDim = dim;
        this.dimLengthVar = dimLenVar;
    }

    public int getArrayDim() {
        return arrayDim;
    }

    public JavaParser.Type getArrayType() {
        return arrayType;
    }

    public List<String> getDimLength() {
        return dimLengthVar;
    }

    public void setArrayDim(int arrayDim) {
        this.arrayDim = arrayDim;
    }

    public void setArrayType(JavaParser.Type arrayType) {
        this.arrayType = arrayType;
    }

    public void setDimLength(List<String> dimLenVar) {
        this.dimLengthVar = dimLenVar;
    }
}

