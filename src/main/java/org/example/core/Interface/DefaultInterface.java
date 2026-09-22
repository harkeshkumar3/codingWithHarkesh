package org.example.core.Interface;

interface One {
    default void method() {
        System.out.println("One");
    }
}

interface Two {
    default void method() {
        System.out.println("Two");
    }
}

public class DefaultInterface implements One, Two {
    @Override
    public void method() {
        One.super.method();
        Two.super.method();

    }


    public static void main(String[] args) {
        new DefaultInterface().method();
    }
}
