import java.util.HashSet;

public class CheckFascinatingNo {
    public static void main(String[] args) {
        int n2 = 192;
        System.out.println(ifCheckFascinatingNo(n2));
    }

    public static String ifCheckFascinatingNo(int n0) {
        String res = "Not Fascinating";
        String n01 = Integer.toString(n0);
        String n02 = Integer.toString(n0 * 2);
        String n03 = Integer.toString(n0 * 3);
        String Str = n01 + n02 + n03;
        System.out.println("Str: " + Str);
        HashSet<Character> hs = new HashSet<>();
        for (Character character : Str.toCharArray()) {
            if (character != '0') {
                hs.add(character);
            }
            if (hs.size() == 9) {
                res = "Fascinating";
            }
        }
        return res;
    }

}
