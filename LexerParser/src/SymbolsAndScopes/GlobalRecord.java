package src.SymbolsAndScopes;

import java.util.HashMap;

public class GlobalRecord extends Record{

    // Global record contains pointers to records of classes in the program.
    // any time a class scope/record is required, just fetch it from global class record.

    private HashMap<String, ClassRecord> classRecordList;

    public GlobalRecord(){
        this.classRecordList = new HashMap<>();
    }

    public void insertClassRecord(String className, ClassRecord classRecord){
        this.classRecordList.put(className, classRecord);
    }

    public ClassRecord getClassRecord(String className){
        return this.classRecordList.get(className);
    }

    public int getClassCount(){
        return classRecordList.size();
    }
}
