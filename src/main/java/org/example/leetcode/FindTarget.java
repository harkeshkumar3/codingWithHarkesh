package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class FindTarget {

    public static void main(String[] args) {
//        nums = [2,15,7,11], target = 9
//        Output: [0,2]
//        sum of numbers should be equal to target

        int[] nums = {2, 15, 7, 11};
        int[] ints = sumTwo(nums, 13);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] sumTwo(int[] a, int total) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int num = total - a[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }
            map.put(a[i], i);
        }
        return null;
    }
}


//Person {
//id int,
//name String,
//pincodes List<String>
//}
//List<Person> persons