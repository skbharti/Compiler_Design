package src.SymbolsAndScopes;

import src.JavaParser;

import java.util.HashMap;

public class GlobalRecord extends Record{

    // Global record contains pointers to records of classes in the program.
    // any time a class scope/record is required, just fetch it from global class record.

    private HashMap<String, ClassRecord> classRecordList;
    private HashMap<JavaParser.Type, String> classTypeToNameMap;

    public GlobalRecord(){
        this.classRecordList = new HashMap<>();
        this.classTypeToNameMap = new HashMap<>();
    }

    public void insertClassRecord(String className, ClassRecord classRecord){
        this.classRecordList.put(className, classRecord);
        this.classTypeToNameMap.put(classRecord.getClassType(),className);
    }

    public String getClassNameFromType(JavaParser.Type type){
        return this.classTypeToNameMap.get(type);
    }

    public ClassRecord getClassRecord(String className){
        return this.classRecordList.get(className);
    }

    public ClassRecord getClassRecord(JavaParser.Type classType){
        return this.classRecordList.get(classTypeToNameMap.get(classType));
    }


    public int getClassCount(){
        return classRecordList.size();
    }

    public String getClassName(JavaParser.Type classType){
        return this.classTypeToNameMap.get(classType);
    }
}
