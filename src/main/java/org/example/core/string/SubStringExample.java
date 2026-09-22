package org.example.core.string;

public class SubStringExample {
    public static void main(String[] args) {
        String message = "Hello world!";
        int length = message.length();
        System.out.println(length);
        String newMessage =  message.substring(12, 6);
        System.out.println(newMessage);
    }
}
