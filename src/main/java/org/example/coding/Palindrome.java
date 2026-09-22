package org.example.coding;

public class Palindrome {
    public static void main(String[] args) {
        boolean palindrome = checkPalindrome("madam");
        System.out.println(palindrome);
    }
    private static boolean checkPalindrome(String input){
        boolean result = true;
        char[] chars = input.toCharArray();
        for( int i =0; i< chars.length/2; i++){
            if(input.charAt(i) != input.charAt((chars.length -i)-1)){
                result =  false;
                break;
            }
        }
        return result;
    }
}
