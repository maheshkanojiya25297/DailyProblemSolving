import java.util.Arrays;

public class CheckAngramRemoveIfNot {
    public static void main(String[] args) {
        String S1 = "cddgk";
        String S2 = "gcd";
        int result = deleteifnotExist(S1, S2);
        System.out.println(result);
    }

    private static int deleteifnotExist(String S1, String S2) {

        int deletedLetter = 0;
        int[] freq = new int[26];

        for (char c : S1.toCharArray()) {
            freq[c - 'a']--;
        }

        for (char c : S2.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int count : freq) {
            deletedLetter = deletedLetter - count;
        }
        return deletedLetter;
    }
}
