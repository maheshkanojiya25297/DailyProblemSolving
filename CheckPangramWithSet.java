import java.util.HashSet;
import java.util.Set;

public class CheckPangramWithSet {
    public static void main(String[] args) {
        String s1 = "thequickbrownfoxjumpsoverthelazydog";
        String s2 = "abcdefghijhklmnopqrstuvwxyz";

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int m = 0; m < s1.length(); m++) {
            set1.add(s1.charAt(m));
        }
        System.out.println("set1: " + set1);

        for (int n = 0; n < s2.length(); n++) {
            set2.add(s2.charAt(n));
        }
        System.out.println("set2: " + set2);

        if (set1.equals(set2)) {
            System.out.println("Yes its anagram");
        } else {
            System.out.println("Yes its Not anagram");
        }
    }
}
