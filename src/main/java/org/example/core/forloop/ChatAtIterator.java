package org.example.core.forloop;

public class ChatAtIterator {

    public static void main(String[] args) {
        String message = "hello";
        for (int i = 0; i < message.length(); i++) {
            System.out.println(message.charAt(i + 1));

        }

    }

}
