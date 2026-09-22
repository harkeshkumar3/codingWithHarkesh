package org.example.core.Collections;

import java.util.Arrays;
import java.util.Comparator;

class Sort implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

public class CustomerSort {
    public static void main(String[] args) {

        Integer intArray[] = {2, 3, 1};
        Arrays.sort(intArray, new Sort());
        for (int i : intArray) {
            System.out.printf(i + "");
        }
    }
}
