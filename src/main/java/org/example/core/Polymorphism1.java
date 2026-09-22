package org.example.core;

public class Polymorphism1 {

    public static void main(String[] args) {
        //  X x = new X();
        new Y().method(new Double(20));
        //  int method1 = X.method(2, 2);

        X x = new Y();


        Y y = (Y) x;


        Z z = (Z) y;

    }
}


class Overload1 {
    public void print(int a) {
        System.out.println("print non-static");
    }

    public static void print(String a) {
        System.out.println("Static printed");
    }
}

class StaticNonStatic {
    static int method(int i, double d) {
        return (int) (i + d);
    }

    int method(int i, int d) {
        return i + d;
    }

    double method(double i, int d) {
        return i + d;
    }

    static double method(double i, double d) {
        return i + d;
    }
}


class X {
    void method(int a) {
        System.out.println("ONE");
    }

    void method(double d) {
        System.out.println("TWO");
    }
}

class Y extends X {
    @Override
    void method(double d) {
        System.out.println("THREE");
    }
}

class Z extends Y {
    @Override
    void method(double d) {
        System.out.println("FOUR");
    }
}