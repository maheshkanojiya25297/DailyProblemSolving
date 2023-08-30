import java.util.Arrays;

public class CheckStringInterpret {
    public static void main(String args[]) {
        String command = "G()(al)";
        System.out.println(command.replace("()", "o").replace("(al)", "al"));
    }
}
