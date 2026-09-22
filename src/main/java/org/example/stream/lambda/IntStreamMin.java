package org.example.stream.lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamMin {
    public static void main(String[] args) {
        int [] number = {1,23,5,2,5,6,7,9,12};
        OptionalInt min = IntStream.of(number).min();
        System.out.println(min);
        int asInt = IntStream.of(number).min().getAsInt();
        System.out.println(asInt);

        IntStream.of(number).min().ifPresent(System.out::println);
    }
}
