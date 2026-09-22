package org.example.stream;

import java.util.function.Predicate;
import java.util.*;

/*

A Functional Interface is an Interface which allows only one Abstract method within the Interface scope. There are some predefined functional interface in Java like Predicate, consumer, supplier etc. The return type of a Lambda function (introduced in JDK 1.8) is a also functional interface.

The Functional Interface PREDICATE is defined in the java.util.Function package. It improves manageability of code, helps in unit-testing them separately, and contain some methods like

1.isEqual(Object targetRef) : Returns a predicate that tests if two arguments are equal according to Objects.equals(Object, Object).
2.and(Predicate other) : Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.
3. negate() : Returns a predicate that represents the logical negation of this predicate
4. or(Predicate other) : Returns a composed predicate that represents a short-circuiting logical OR of this predicate and another.
5. test(T t) : Evaluates this predicate on the given argument.boolean test(T t)


* */
public class PredicateExample1 {

    public static void main(String[] args) {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserthan.test(10));
    }
}

class PredicateInterfaceExample2 {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);

        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);
    }
}

class PredicateInterfaceExample3 {
    static void pred(int number, Predicate<Integer> predicate) {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }

    public static void main(String[] args) {
        pred(10, (i) -> i > 7);
    }
}

class PredicateInterfaceExample4 {
    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t) {
            return t.length() > 10;
        }
    };

    public static void predicate_or() {

        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "And";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }

    public static void main(String[] args) {
        predicate_or();
    }
}

class User {
    String name, role;

    User(String a, String b) {
        name = a;
        role = b;
    }

    String getRole() {
        return role;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return "User Name : " + name + ", Role :" + role;
    }

    public static void main(String args[]) {
        List<User> users = new ArrayList<User>();
        users.add(new User("John", "admin"));
        users.add(new User("Peter", "member"));
        List admins = process(users, (User u) -> u.getRole().equals("admin"));
        System.out.println(admins);
    }

    public static List<User> process(List<User> users,
                                     Predicate<User> predicat) {
        List<User> result = new ArrayList<User>();
        for (User user : users)
            if (predicat.test(user))
                result.add(user);
        return result;
    }
}


class PredicateInterfaceExample6 {
    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t) {
            return t.length() > 10;
        }
    };

    public static void predicate_negate() {

        String lengthGTThan10 = "Thunderstruck is a 2012 children's "
                + "film starring Kevin Durant";

        boolean outcome = hasLengthOf10.negate().test(lengthGTThan10);
        System.out.println(outcome);
    }

    public static void main(String[] args) {
        predicate_negate();
    }
}
