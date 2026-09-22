package org.example.stream.lambda;

import java.util.stream.IntStream;

public class Find3DistinctNumber {
    public static void main(String[] args) {
        int [] number = {1,1,23,5,2,5,6,7,9,12};
        IntStream.of(number)
                .distinct()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}
