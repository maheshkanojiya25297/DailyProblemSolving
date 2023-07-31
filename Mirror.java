//Given an array of pairs of integers, find all symmetric pairs, i.e., pairs that mirror each other. For instance, pairs (x, y) and (y, x) are mirrors of each other.
//        For example:
//        Input:  {3, 4}, {1, 2}, {5, 2}, {7, 10}, {4, 3}, {2, 5}
//
//        Output:
//
//        {4, 3} | {3, 4}
//        {2, 5} | {5, 2}


//Solution

import java.util.*;
import java.util.stream.*;

public class Mirror {
    public static void main(String args[]) {
        int[][] list = {{3, 4}, {1, 2}, {5, 2}, {7, 10}, {4, 3}, {2, 5}};

        for (int i = 0; i <= list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if (Arrays.stream(list[i]).sorted().equals(Arrays.stream(list[j]))) {
                    System.out.println(list[i] + "" + list[j]);
                }
            }
        }

    }
}
