//package org.example.testing;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static org.junit.Assert.assertEquals;
//
//public class JUnitExample2 {
//
//
//    @Test
//    @DisplayName("Assert Equal Test Case ")
//    void AssertEqualCase() {
//        Assertions.assertEquals(4, new Calculator().add(2, 2), () -> "Assert Eqaul Failed");
//    }
//
//    @Test
//    @DisplayName("Assert Equal  ")
//    void AssertArrayEqualCase() {
//        Assertions.assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
//    }
//}
//
//
//class Calculator {
//
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    public int sub(int a, int b) {
//        return a - b;
//    }
//
//    public int mul(int a, int b) {
//        return a * b;
//    }
//
//    public int div(int a, int b) {
//        return a / b;
//    }
//}
//
//class average {
//    public static void main(String args[]) {
//        double num[] = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
//        double result;
//        result = 0;
//        for (int i = 0; i < 6; ++i)
//            result = result + num[i];
//        System.out.print(result / 6);
//
//    }
//}
//
//
//class conversion {
//    public static void main(String args[]) {
//        double a = 295.04;
//        int b = 300;
//        byte c = (byte) a;
//        byte d = (byte) b;
//        System.out.println(c + " " + d);
//    }
//}
//
//class increment {
//    public static void main(String args[]) {
//        int g = 3;
//        System.out.print(++g * 8);
//    }
//}
//
//
//class array_output {
//    public static void main(String args[]) {
//
//        int Output = 10;
//        boolean b1 = false;
//        if ((b1 == true) && ((Output += 10) == 20)) {
//            System.out.println("We are equal " + Output);
//        } else {
//            System.out.println("Not equal! " + Output);
//        }
//       /* int array_variable [] = new int[10];
//        for (int i = 0; i < 10; ++i) {
//            System.out.println( array_variable[i] +" And i"+ i);
//            array_variable[i] = i;
//            System.out.println(array_variable[i] + " ");
//            i++;
//        }*/
//    }
//}
//
//class bitwise_operator {
//    public static void main(String args[]) {
//        int var1 = 42;
//        int var2 = ~var1;
//        System.out.print(var1 + " " + var2);
//    }
//}
//
//class leftshift_operator {
//    public static void main(String args[]) {
//        byte x = 64;
//        int i;
//        byte y;
//        i = x << 2;
//        y = (byte) (x << 2);
//        System.out.print(i + " " + y);
//    }
//}
//
//class selection_statements {
//    public static void main(String args[]) {
//        int var1 = 5;
//        int var2 = 6;
//        if ((var2 = 1) == var1)
//            System.out.print(var2);
//        else
//            System.out.print(++var2);
//    }
//}
//
//class comma_operator {
//    public static void main(String args[]) {
//        int sum = 0;
//        for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1) {
//            sum += i;
//            System.out.println(sum);
//        }
//
//
//        System.out.println(sum);
//    }
//}
//
//class Output {
//    public static void main(String args[]) {
//        int x, y = 1;
//        x = 10;
//        if (x != 10 && x / 0 == 0)
//            System.out.println(y);
//        else
//            System.out.println(++y);
//    }
//}
//
//class main_class {
//    public static void main(String args[]) {
//        int x = 9;
//        if (x == 9) {
//            //  int x = 8;
//            System.out.println(x);
//        }
//    }
//}
//
//class equality {
//    int x = 3;
//    int y = 4;
//
//    boolean isequal() {
//        return (x == y);
//    }
//}
//
//class Output1 {
//    public static void main(String args[]) {
//        equality obj = new equality();
//        obj.x = 5;
//        obj.y = 5;
//        System.out.println(obj.isequal());
//    }
//}
//
//class access {
//    public int x;
//    private int y;
//
//    void cal(int a, int b) {
//        x = a + 1;
//        y = b;
//    }
//}
//
//class access_specifier extends Throwable {
//    public static void main(String args[]) {
//        if ("Welcome".trim() == "Welcome".trim())
//            System.out.println("Equal");
//        else
//            System.out.println("Not Equal");
//
////        access obj = new access();
////        obj.cal(2, 3);
////        System.out.println(obj.x + " " + obj.y);
//    }
//
//    public static String highLow(String s) {
//        String[] s1 = s.split(" ");
//        List<Integer> collect = Arrays.stream(s1).map(Integer::parseInt).sorted().collect(Collectors.toList());
//
//        return collect.get(collect.size() - 1) + " " + collect.get(0);
//    }
//
//    @Test
//    public void test6() {
//        assertEquals("1 0", highLow("1 1 0"));
//    }
//}
//
