import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckPangramWithHashMmap {
    public static void main(String[] args) {
        String s1 = "thequickbrownfoxjumpsoverthelazydog";
        String s2 = "abcdefghijhklmnopqrstuvwxyz";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int m = 0; m < s1.length(); m++) {
            map1.put(s1.charAt(m), map1.getOrDefault(s1.charAt(m), 0) + 1);
        }
        System.out.println("map1: " + map1.keySet());

        for (int n = 0; n < s2.length(); n++) {
            map2.put(s2.charAt(n), map2.getOrDefault(s2.charAt(n), 0) + 1);
        }
        System.out.println("map2: " + map2.keySet());

        if (map1.keySet().equals(map2.keySet())) {
            System.out.println("Yes its anagram");
        } else {
            System.out.println("Yes its Not anagram");
        }
    }
}
