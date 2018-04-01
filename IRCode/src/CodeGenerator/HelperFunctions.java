package IRCode.src.CodeGenerator;

public class HelperFunctions {

    public static String printIntegerFromString(String input){
        String mipscode = "li $v0, 1\n" +
                "lw $a0, "+input+"\n"+
                "syscall\n";

        return mipscode;
    }

    public static String printIntegerFromRegister(String input){
        String mipscode = "li $v0, 1\n" +
                "move $a0, "+input+"\n"+
                "syscall\n";

        return mipscode;
    }

    public static String printString(String input){
        String mipscode = "li $v0, 4\n" +
                "la $a0, "+input+"\n"+
                "syscall\n";

        return mipscode;
    }

    public static String printExitCode(){
        String mipscode = "li $v0, 10 \nsyscall\n";
        return  mipscode;
    }
}
