package org.example.company;

public class BasicCalculator {
    public static void main(String[] args) {
        int value = calculator(5, '*', 2);
        System.out.println(value);
    }

    public static int calculator(int num1, char operator, int num2) {

        String op = String.valueOf(operator);
        if (op.equals("*")) {
            return num1 * num2;
        } else if (op.equals("/")) {
            return num1 / num2;
        } else if (op.equals("+")) {
            return num1 + num2;
        } else {
            return num1 - num2;
        }
    }
}