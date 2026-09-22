package org.example.company;

import java.util.Arrays;

public class Challenge {


    public static void main(String[] args) {
        // write your code here
        int a[] = {16, 28};
        sumDigProd(a);
    }

    public static long sumDigProd(int... nums) {
        long n = Arrays.stream(nums).sum();
        while (n > 9) {
            n = multiplyDigits(n);
        }
        System.out.println(n);
        return n;
    }

    private static long multiplyDigits(long n) {
        long prod = 1;
        System.out.println("number"+n);
        while (n > 0 || prod > 9) {
            if (n == 0) {
                n = prod;
                prod = 1;
            }
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }
}