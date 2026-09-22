package org.example.coding;

public class StaticMethod {

    public static void main(String[] args) {
        someMethod(null);
    }

    private static void someMethod(Object o) {
        System.out.println("Object");
    }
    private static void someMethod(String o) {
        System.out.println("String");
    }
}
