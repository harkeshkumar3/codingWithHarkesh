package org.example.company;

import java.util.Arrays;
import java.util.Collections;

/*
Create a function that takes an array and returns the difference between the biggest and smallest numbers.

        Examples
        differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.

        differenceMaxMin([44, 32, 86, 19]) ➞ 67
// Smallest number is 19, biggest is 86.
*/
public class DifferenceMaxMin {
    public static void main(String[] args) {
        int list[]= {10, 4, 1, 2, 8, 91};
        int i = differenceMaxMin(list);
        System.out.println(i);
    }
    public static int differenceMaxMin(int[] arr) {

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        return max-min;

    }
}
