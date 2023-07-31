/*Replace every array element with the product of every other element
        Given an integer array, replace each element with the product of every other element without using the division operator.
        For example:
        Input:  { 1, 2, 3, 4, 5 }
        Output: { 120, 60, 40, 30, 24 }

        Input:  { 5, 3, 4, 2, 6, 8 }
        Output: { 1152, 1920, 1440, 2880, 960, 720 }*/

//Solution
import java.util.*;
public class Mul_0f_Array {
    public static void main(String[] args){
                int [] arr = {5,3,4,2,6,8};
                int[] arr1 = new int[arr.length];
                for(int i=0;i<arr.length;i++){
                    int mul =1;
                    for(int j=0;j<arr.length;j++){
                        if(i==j) {
                            continue;
                        }
                        mul = mul * arr[j];
                    }
                    arr1[i]=mul;
                }
                for (int a:arr1) {
                    System.out.println(a);
                }
                System.out.println(Arrays.toString(arr1));
            }
        }
