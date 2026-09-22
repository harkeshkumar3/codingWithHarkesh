package org.example.core;


@FunctionalInterface
interface ShortToByteFunction {
    byte applyAsByte(short s);

    default void doSomeMoreWork1() {
        System.out.println("Do some work");
    }

    default void doSomeMoreWork2() {
        //Method body
    }
}


public class FunctionalInterfaces implements ShortToByteFunction {
    @Override
    public byte applyAsByte(short s) {
        return 0;
    }


}
