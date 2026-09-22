package org.example.Problems;

public class LongestConsecutiveProblem {
    public static void main(String[] args) {
        int number = 110100111;
        int value = longestConsecutiveValue(number);
        System.out.println(value);
    }


    private static int longestConsecutiveValue(int number) {
        int count = 0;
        while (number > 0) {
            number = number & (number << 1);
            count++;
        }
        return count;
    }
}
