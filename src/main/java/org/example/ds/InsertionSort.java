package org.example.ds;

import java.util.Arrays;

/*
    Insertion Sort Algo
        - Insertion sort is a simple Algo that work similar to the way you sort playing cards in your hand.
           The array is virtually sorted and an unsorted part. Values form unsorted part are picked and placed at correct place in part of sorted

    Algorithm
        # To Sort  an array of size n in ascending order
        1. iterate from arr[1] to arr[n]
        2. Compare the current element (key) with predecessor
        3. if the key element  is smaller  then predecessor, compare it to the element before.
            Move  the greater  elements on position up to make space for swap element

    Time Complexity: O(n*2)
    Auxiliary Space: O(1)
    Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.
    Algorithmic Paradigm: Incremental Approach
    Sorting In Place: Yes
    Stable: Yes
    Online: Yes

* */

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
