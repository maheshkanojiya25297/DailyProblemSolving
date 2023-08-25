import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SecLargEleFromArr {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 8, 9, 11};
        Arrays.sort(a);
        System.out.println("sorted:" + Arrays.toString(a));
        Collections.reverse(Arrays.asList(a));

        int total = a.length;
        System.out.println("total:" + total);
        System.out.println(a[total - 2]);

    }
}
