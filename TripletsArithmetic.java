import java.util.*;


public class TripletsArithmetic {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 8, 9, 15};
        System.out.println("array: " + Arrays.toString(array));
        tripletSolve(array);
    }

    public static void tripletSolve(int[] array) {
        int j = 1;
        for (j = 1; j < array.length - 1; j++) {
            int i = j - 1, k = j + 1;
            while (i >= 0 && k < array.length) {
                if (array[i] + array[k] == 2 * array[j]) {
                    System.out.println(array[i] + " " + array[j] + " " + array[k]);
                    k++;
                    i--;
                } else if (array[i] + array[k] < 2 * array[j]) {
                    k++;
                } else {
                    i--;
                }
            }
        }

    }


}