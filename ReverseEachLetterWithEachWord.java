import java.util.Arrays;

public class ReverseEachLetterWithEachWord {
    public static void main(String[] args) {
        String str = "God Ding";
        reverseEachLettersWithEachWord(str);
    }

    private static void reverseEachLettersWithEachWord(String str) {
        String[] strBreak = str.split(" ");
        System.out.println("strBreak: " + Arrays.toString(strBreak));
        String revStr = "";
        for (int m = 0; m < strBreak.length; m++) {
            System.out.println(strBreak[m]);
            revStr = revStr + " ";
            for (int l= strBreak[m].length()-1; l>=0; l--){
                System.out.println(strBreak[m].charAt(l));
                revStr = revStr + strBreak[m].charAt(l);
            }
        }
        System.out.println("revStr: " + revStr);

    }
}
