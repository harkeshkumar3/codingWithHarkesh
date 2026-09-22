package org.example.bms;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCap {
    public static void main(String[] args) {
        String text = "Harkesh kumar";

        String[] split = text.split("\\s");

        for (int k = 0; k <= split.length - 1; k++) {
            String s = reverseString(split[k]);
            System.out.print(s + " ");
        }

    }

    private static String reverseString(String value) {

        int size = value.length();
        String output = "";
        for (int i = size - 1; i >= 0; i--) {

            output = output + value.charAt(i);
        }
        return output;
    }

}


class TestArray {
    public static void main(String[] args) {
        int age = 69;
        boolean b = age <= 70;

        System.out.println(b);

    }
}


class test {
    public static void main(String[] args) {
//
        System.out.println("1");
        synchronized ((args)) {
            System.out.println("2");
            try {
                args.wait();
            } catch (InterruptedException e) {
            }
            System.out.println("3");
        }
    }
}
