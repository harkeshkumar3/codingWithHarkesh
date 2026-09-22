package org.example.stream.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<UserTest> users = Arrays.asList(new UserTest("hello"));
        users.stream().forEach(new Consumer<UserTest>() {
            @Override
            public void accept(UserTest userTest) {
                calculateTax(userTest);
            }
        });
    }

    private static void calculateTax(UserTest userTest) {
    }
}
