import java.util.Arrays;

public class SurpasserCount {
    public static void main(String[] args) {
        int[] input = {4, 6, 3, 9, 7, 10};
        int[] output = surpassTest(input);
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(output));
    }

    private static int[] surpassTest(int[] n) {
        int N = n.length;
        int[] sort = Arrays.copyOf(n, N);
        Arrays.sort(sort);
        int[] counts = new int[N];
        for (int m = 0; m < N; m++) {
            int index = Arrays.binarySearch(sort, n[m]);
            counts[m] = N - 1 - index;
        }
        return counts;
    }
}
