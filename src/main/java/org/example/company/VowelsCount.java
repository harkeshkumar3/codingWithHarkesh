package org.example.company;

public class VowelsCount {
    public static void main(String[] args) {

    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        // Your code here
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                vowelsCount++;
            }

        }

        return vowelsCount;
    }
}
