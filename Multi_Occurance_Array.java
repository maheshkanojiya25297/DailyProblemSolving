/*Given an unsorted integer array containing many duplicate elements, rearrange it such that the same element appears together and the relative order of the first occurrence of each element remains unchanged.
For example:
Input:  { 1, 2, 3, 1, 2, 1 }
Output: { 1, 1, 1, 2, 2, 3 }
*/


import java.util.*;

public class Multi_Occurance_Array {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 1, 2, 1};
        System.out.println("InPut: " + a);

        String visted[] = new String[a.length];
        for (int m = 0; m < a.length; m++) {
            visted[m] = "No";
        }
        for (int m = 0; m < a.length; m++) {

            if (visted[m] != "Yes") {
                System.out.println(a[m]);
                for (int l = m + 1; l < a.length; l++) {
                    if (a[m] == a[l]) {
                        System.out.println(a[m]);
                        visted[l] = "Yes";

                    }

                }
            }

        }
    }

}
