package org.example.company;



/*
Write a function that takes a string as an argument and returns the left most digit in the string.

        Examples
        leftDigit("TrAdE2W1n95!") ➞ 2

        leftDigit("V3r1ta$") ➞ 3

        leftDigit("U//DertHe1nflu3nC3") ➞ 1

        leftDigit("J@v@5cR1PT") ➞ 5
*/


public class LeftDigit {

    public static void main(String[] args) {
        int i = leftDigit("J@v@5cR1PT");
        System.out.println(i);
    }

    public static int leftDigit(String str) {

        for (int i = 0; i < str.length(); i++) {
            Boolean flag = Character.isDigit(str.charAt(i));
            if (flag) {
                return Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return -1;
    }
}
