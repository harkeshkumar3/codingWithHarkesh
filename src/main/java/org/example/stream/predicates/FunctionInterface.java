package org.example.stream.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterface {
    public static void main(String[] args) {
        List<UserTest> users = Arrays.asList(new UserTest("hello"));

        users.stream().map(new Function<UserTest, String>() {
            @Override
            public String apply(UserTest userTest) {
                return getTaxForUser(userTest);
            }
        });

        users.stream().map(userTest -> getTaxForUser(userTest));
    }

    private static String getTaxForUser(UserTest userTest) {
            return null;
    }


}
