package org.example.leetcode;

import java.util.*;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 **/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 4,3};
        Integer target = 6;

        Solution solution = new Solution();
        int[] ints = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(ints));

    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}


class LambdaArithmeticCalculator {
    interface IntegerArithmetic {
        int operation(int x, int y);
    }

    public int operate(int x, int y, IntegerArithmetic ia) {

        return ia.operation(x, y);
    }

    public static void main(String args[]) {
        LambdaArithmeticCalculator lq = new LambdaArithmeticCalculator();
        IntegerArithmetic multilply = (x, y) -> x * y;
        IntegerArithmetic divide = (x, y) -> x / y;
        System.out.println(lq.operate(5, 2, multilply));
        System.out.println(lq.operate(10, 2, divide));
    }
}


class qq20{
    public static void main(String[] args) {

        boolean testb = false;
        if(testb =true){
            System.out.println("B");
        }else {
            System.out.println("hehe");
        }

        System.out.println(Void.TYPE);
//       byte b=1;
//       b+=1;
//        System.out.println(b);
        String a = "hai";
        a.concat("hello");
        System.out.println(a);

        Calendar calendar = new GregorianCalendar(2013, 1, 28, 13, 24, 56);
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
    }
}

class  syncTest{
    public static void main(String[] args) {
        Thread t = new Thread(){
            Foo f = new Foo();
            public  void run(){
                f.incease(20);
            }
        };
        t.start();
    }
}
class Foo{
    private int data = 23;
    public void incease(int i) {
        int x = data;
        data = x+i;
    }
}



class testclass1{}
class testclass2 extends  testclass1{}
class testclass3 extends testclass1{}

class testg{
    public static void main(String[] args) {
        ArrayList<testclass1> olist = new ArrayList<>();
        testclass3 testclass3 = new testclass3();
        testclass2 testclass2 = new testclass2();
        testclass1 testclass1 = new testclass1();
        olist.add(testclass1);
        olist.add(testclass2);
        olist.add(testclass3);
    }
}
