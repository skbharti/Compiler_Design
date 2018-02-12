package IRCode.src.CodeGenerator;

public class HelperFunctions {

    public static String printIntegerFromString(String input){
        String mipscode = "li $v0, 1\n" +
                    "lw $t0, "+input+"\n"+
                    "syscall";

        return mipscode;
    }

    public static String printIntegerFromRegister(String input){
        String mipscode = "li $v0, 1\n" +
                    "mv $t0, "+input+"\n"+
                    "syscall";

        return mipscode;
    }

    public static String printExitCode(){
        String mipscode = "li $v0, 10 \nsyscall";
        return  mipscode;
    }
}
