package org.example.Problems;

public class KnapsackProblem {

    static int value[] = {};
    static int weight[] = {};

    public static void main(String[] args) {

        value = new int[]{150, 300, 200};
        weight = new int[]{1,4 , 3};
        int c = 4;
        int n = value.length;

        int i = method1(c, n);
        System.out.println(i);
    }

    private static int method1(int c, int n) {

        if (n == 0 || c <= 0) { /// current capacity of bag with no of item
            return 0;
        }
        if (weight[n - 1] > c) { // item n have has more weight then its capacity
            return method1(c,n-1);
        }
        int item_selected = value[n - 1] + method1(c - weight[n - 1], n - 1);  // selected value 200 + call method again with remain C =1 and list size -3
        int item_not_selected = method1(c, n - 1); // 4, 3
        return  Math.max(item_not_selected, item_selected);
    }


}
