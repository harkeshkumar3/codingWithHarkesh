package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Highest2 {
    public static void main(String[] args) {
        String name = "java";
        System.out.println(removeDuplicate(name));


    }

    public static String removeDuplicate(String text) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (Character character : text.toCharArray()) {
            if (!set.contains(character)) {
                set.add(character);
                sb.append(character);
            }
        }
        return sb.toString();
    }

    private static int findSecondHigh(List<Integer> list) {
        int high = 0;
        int secHigh = 0;
        for (Integer i : list) {
            if (i > high) {
                secHigh = high;
                high = i;
            } else if (i > secHigh) {
                secHigh = i;
            }
        }
        return secHigh;
    }
}
