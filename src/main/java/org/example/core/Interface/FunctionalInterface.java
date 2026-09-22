package org.example.core.Interface;

@java.lang.FunctionalInterface
interface Interface1 {
    void method1();

    default void log(String s) {
        System.out.println("Logging " + s);
    }

    static void print(String s) {
        System.out.println("print" + s);
    }
}

@java.lang.FunctionalInterface
interface Interface2 {
    void method2();
    default void log(String s) {
        System.out.println("Logging " + s);
    }

}

public class FunctionalInterface implements Interface1, Interface2 {

    @Override
    public void method1() {

    }

    @Override
    public void log(String s) {
        Interface1.super.log(s);
    }

    @Override
    public void method2() {

    }
}
