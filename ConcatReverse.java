import java.util.Arrays;

public class ConcatReverse {
    public static void main(String args[]) {
        String mk = "mahesh Kanojiya";
        String[] splitMk = mk.split(" ");
        System.out.println(splitMk + " : splitMk " + splitMk[0] + " : splitMk[0] " + splitMk[1] + " : splitMk[1]");
        String first = splitMk[1];
        System.out.println("first: " + first);
        String Second = splitMk[0];
        System.out.println("Second: " + Second);
        String out = first + " " + Second;
        System.out.println("out: " + out);
    }
}
