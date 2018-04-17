package src.SymbolsAndScopes;

import src.JavaParser;

public class ArrayRecord extends Record {
    public JavaParser.Type arrayType;
    public int numberOfDimensions;
    public int[] lengthOfDimensions;

    public ArrayRecord(JavaParser.Type type, int dim, int[] dimLenVar){
        this.arrayType = type;
        this.numberOfDimensions = dim;
        this.lengthOfDimensions = dimLenVar;
    }

    public int getnumberOfDimensions() {
        return numberOfDimensions;
    }

    public JavaParser.Type getArrayType() {
        return arrayType;
    }

    public int[] getDimLength() {
        return lengthOfDimensions;
    }

    public void setnumberOfDimensions(int numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions;
    }

    public void setArrayType(JavaParser.Type arrayType) {
        this.arrayType = arrayType;
    }

    public void setDimLength(int[] dimLenVar) {
        this.lengthOfDimensions = dimLenVar;
    }
}

