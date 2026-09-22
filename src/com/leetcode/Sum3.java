package org.example.leetcode;

/*
* Problem:
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.
Note: Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
The solution set must not contain duplicate triplets.
For example, given array S = {-1 0 1 2 -1 -4},
A solution set is:
(-1, 0, 1)
(-1, -1, 2)
* */

import java.util.ArrayList;
import java.util.Arrays;

public class Sum3 {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2,  -4};
        ArrayList<ArrayList<Integer>> arrayLists = threeSum(a);
        arrayLists.forEach(System.out::println);
    }

    public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> each = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] > 0 && nums[j] > 0) {
                    break;
                }
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        each.add(nums[i]);
                        each.add(nums[j]);
                        each.add(nums[k]);
                        result.add(each);
                        each.clear();
                    }

                }
            }
        }
        return result;
    }

}
