package org.example.core.Overloading;

import java.util.HashMap;
import java.util.Map;

class OverloadingExample {
    public int add(Integer a, Integer b) {
        System.out.println("Integer Called");
        return a * b;
    }

    public int add(int a, int b) {
        System.out.println("Int called ");
        return a * b;
    }
}

public class OverLoading {
    public static void main(String[] args) {

        new OverloadingExample().add(2, 3);


        String text = "helloworld";

        Map<Character, Integer> map = stringToMapMethod(text);

        char maxChar = ' ';

        int max = 1;
        for (Map.Entry m : map.entrySet()) {

            if (max < (int) m.getValue()) {
                max=(int) m.getValue();
                maxChar = (Character) m.getKey();
            }
        }
        System.out.println(maxChar);
    }

    private static Map<Character, Integer> stringToMapMethod(String text) {
        Map<Character, Integer> map = new HashMap<>();
        text.toCharArray();
        for (Character character : text.toCharArray()) {
            if (map.containsKey(character)) {
                map.replace(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        return map;
    }
}


