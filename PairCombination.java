import java.lang.reflect.Array;
import java.util.Arrays;

public class PairCombination {
    public static void main(String args[]) {
        int[] red = {6, 3, 2, 8, 7};
        int[] blue = {8, 6, 7, 2, 3};

        pairJugs(red, blue);

    }

    private static void pairJugs(int[] red, int[] blue) {
        Arrays.sort(red);
        Arrays.sort(blue);

        System.out.println("red jugs:" + Arrays.toString(red));
        System.out.println("blue jugs:" + Arrays.toString(blue));
    }
}
