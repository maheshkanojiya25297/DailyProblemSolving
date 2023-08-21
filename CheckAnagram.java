import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String s1 = "broad";
        String s2 = "board";

        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        if (char1.length != char2.length) {
            System.out.println("Not Anagram");
        }

        Arrays.sort(char1);
        System.out.println("char1: " + Arrays.toString(char1));
        Arrays.sort(char2);
        System.out.println("char2: " + Arrays.toString(char2));

       // if (Arrays.equals(char1,char2) == true) {

        if(Arrays.toString(char1).equals(Arrays.toString(char2))){
            System.out.println("Anagram");
        }
    }
}
