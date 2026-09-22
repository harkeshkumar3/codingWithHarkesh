package org.example.core.string;

public class DotReplaceString {
    public static void main(String[] args) {
        String xpath = "I.01";
        String str = xpath.replaceAll("\\.", "");
        System.out.println(str);
    }
}
