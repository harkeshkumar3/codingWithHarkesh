package org.example.company;

import java.util.Arrays;

public class SevenBoom {
    public static void main(String[] args) {
        int list []= {1, 2, 3, 4, 5, 6, 7};
        String s = sevenBoom(list);
        System.out.println(s);
    }

    public static String sevenBoom(int[] arr) {

//        boolean contains = Arrays.asList(arr).contains("7");
//        contains?

        boolean b = Arrays.stream(arr).anyMatch(f -> String.valueOf(f).contains("7"));
        if(b){
            return "Boom!";
        }
        return "there is no 7 in the array";


    }
}
