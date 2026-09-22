package org.example.Problems;

import java.util.Arrays;


/**
 * Problem Statement-
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount
 * of money you can rob tonight without alerting the police.
 */
public class BankRob {

    static int totalMoney = 0;
    static int maxIdx = 0;
    static int house[] = {2, 7, 9, 11, 4, 5, 2, 8, 55};


    public static void main(String[] args) {

        totalMoney = getMaxMoney(house);
        System.out.printf("total money rob " + totalMoney);


        method1(house);
        method4(house);


    }

    public static void method1(int[] A) {
        long startTime = 0, endTime = 0, executionTime = 0;
        startTime = System.nanoTime();
        System.out.println("robM1 result:" + robM1(A, A.length - 1));
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("executionTime for robM1() :" + executionTime + " ns \n");
    }

    public static int robM1(int[] A, int i) {
        if (A == null || A.length == 0)
            return 0;

        if (A.length == 1)
            return A[0];

        if (i < 0)
            return 0;

        int ith_house_is_selected = robM1(A, i - 2) + A[i];
        int ith_house_is_not_selected = robM1(A, i - 1);
        int max = Math.max(ith_house_is_selected, ith_house_is_not_selected);
        return max;

    }

    public static void method4(int[] A) {
        long startTime = 0, endTime = 0, executionTime = 0;
        startTime = System.nanoTime();
        System.out.println("robM4 result:" + robM4(A));
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("executionTime for robM4() :" + executionTime + " ns \n");
    }

    public static int robM4(int[] A) {
        if (A == null || A.length == 0)
            return 0;

        if (A.length == 1)
            return A[0];

        int prev2 = A[0];
        int prev1 = Math.max(A[0], A[1]);
//         static int house[] = {2, 7, 9, 11, 12, 4, 5, 2, 8, 1};
        for (int i = 2; i < A.length; i++) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + A[i], prev1);
            //     System.out.println(A[i]);
            //     System.out.println("tmp"+tmp+ " and prev1 "+prev1);
            prev2 = tmp;
        }
        return prev1;

    }

    static int getMaxMoney(int[] list) {
        if (list == null || list.length == 0) {
            return 0;
        }
        if (list.length == 1) {
            return list[0];
        }

        int prev2 = list[0];
        int prev1 = Math.max(list[0], list[1]);
        for (int i = 2; i < list.length; i++) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + list[i], prev1);
            prev2 = tmp;
        }
        return prev1;
    }


}


