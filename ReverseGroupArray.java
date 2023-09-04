import java.util.Arrays;

public class ReverseGroupArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
        int k = 3;
        reverseGroupArr(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseGroupArr(int[] arr, int k) {
        int n = arr.length;


        for (int i = 0; i < n; i = i + k) {
            int j = Math.min(i + k - 1, n - 1);
            System.out.println("i: " + i + " j:" + j);

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }

        }
    }
}
