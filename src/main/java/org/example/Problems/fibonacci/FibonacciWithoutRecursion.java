package org.example.Problems.fibonacci;

public class FibonacciWithoutRecursion {

    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {
        int count = 10;
        System.out.printf(n1 + " " + n2);

        for (int n = 2; n < count; n++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.printf(" " + n3);

        }
    }
}
