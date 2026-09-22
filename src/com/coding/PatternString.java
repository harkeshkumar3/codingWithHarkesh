package org.example.Coding;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PatternString {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = Arrays.stream(array).filter(i -> i % 2 == 0).sum();
        System.out.println("original value" + sum);

        int sum1 = IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).sum();
        System.out.println("original valueSum1" + sum1);

        Stream<Integer> integerStream = Stream.of(2, 4, 6, 8, 10);
        integerStream.collect(Collectors. summingInt(i -> i));

        System.out.println(integerStream);

        Integer reduce = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .stream().filter(i -> i % 2 == 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println("original reduce" + reduce);

        Integer integer = IntStream.generate(() -> 10)
                .limit(3)
                .boxed()
                .collect(Collectors
                        .reducing((a, b) -> a + b))
                .orElse(0);

        System.out.println("original integer" + integer);
    }

}
