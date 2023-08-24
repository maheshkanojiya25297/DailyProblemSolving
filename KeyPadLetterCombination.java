import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyPadLetterCombination {
    public static void main(String[] args) {
        int[] input = {2, 3, 5};
        List<String> combination = generateKeyPadCombination(input);
        for (String out : combination) {
            System.out.println("out: " + out);
        }
    }

    private static List<String> generateKeyPadCombination(int[] input) {

        Map<Integer, String> map = new HashMap<>();
        map.put(2, "ABC");
        map.put(3, "DEF");
        map.put(4, "GHI");
        map.put(5, "JKL");
        map.put(6, "MNO");
        map.put(7, "MNO");
        map.put(8, "PQRS");
        map.put(9, "TUV");
        map.put(10, "WXYZ");

        List<String> combination = new ArrayList<>();
        trackCombination(input, 0, "", combination, map);
        return combination;
    }

    private static void trackCombination(int[] input, int i, String s,
                                         List<String> combination, Map<Integer, String> map) {
        if (i == input.length) {
            combination.add(s);
            return;
        }

        int ip = input[i];
        String letters = map.get(ip);
        System.out.println(letters);

        for (char letter : letters.toCharArray()) {
            trackCombination(input, i + 1, s + letter, combination, map);
        }
    }
}
