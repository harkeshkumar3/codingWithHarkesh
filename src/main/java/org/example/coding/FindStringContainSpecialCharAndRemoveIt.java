package org.example.coding;

public class FindStringContainSpecialCharAndRemoveIt {
    public static void main(String[] args) {
        System.out.println(findAndRemoveSpecialChar("Country@3@#!"));
    }

    private static String findAndRemoveSpecialChar(String text){
int count = 0;
        String finalString = "";
        for(Character ch: text.toCharArray()){
            if(!Character.isDigit(ch) && !Character.isAlphabetic(ch) && !Character.isWhitespace(ch)){
                count++;

            }else {
                finalString += ch;
            }
        }
        System.out.println(count);
        return finalString;
    }
}
