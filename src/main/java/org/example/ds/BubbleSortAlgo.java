package org.example.ds;

import java.util.Arrays;
/*
    Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

    Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
    Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
    Auxiliary Space: O(1)
    Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
* */

public class BubbleSortAlgo {
    public static void main(String[] args) {

        int[] array = {7, 4, 1, 5, 8, 7, 5};
        BubbleSortAlgo.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array) {

        for (int i = 0; i < array.length; i++)
            for (int j = 1; j < array.length; j++)
                if (array[j] < array[j - 1])
                    swap(array, j, j - 1);


    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
