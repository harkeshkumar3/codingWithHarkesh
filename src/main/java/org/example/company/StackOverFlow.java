package org.example.company;

public class StackOverFlow {

    public static void main(String[] args) {
        int[] hellojavas = freqAnalyse("Hellojavaaa");
//        System.out.println( freqAnalyse("Hellojavaaa").length);
        for (int i : hellojavas) {
            System.out.println(i);
        }
    }

    public static int[] freqAnalyse(String text) {
        int[] frequencies = new int[26];
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        text = text.toUpperCase();
        for (int i = 0; i < 26; i++) {
            int finalI = i;
            frequencies[i] = (int) text.chars()
                    .filter(k -> k == alphabet.charAt(finalI))
                    .count();
        }
        return frequencies;
    }

}
