package org.example.stream.predicates;

import java.util.Arrays;
import java.util.List;

public class Predicate {
    public static void main(String[] args) {
        List<UserTest> users = Arrays.asList(new UserTest("hello"));

        users.removeIf(new java.util.function.Predicate<UserTest>() {
            @Override
            public boolean test(UserTest userTest) {
                return userTest.equals(null);
            }
        });
    }
}

