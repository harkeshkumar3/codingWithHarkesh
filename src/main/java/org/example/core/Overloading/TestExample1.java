package org.example.core.Overloading;

public class TestExample1 {

    public int getData1() //getdata() 1
    {
        return 0;
    }

    public long getData() //getdata 2
    {
        return 1;
    }

    public static void main(String[] args) {
        TestExample1 obj = new TestExample1();
        System.out.println(obj.getData());
    }
}


class TestOl1 {
    private final String function() {
        return ("GFG");
    }

    protected final static String function(int data) {
        return ("GeeksforGeeks");
    }

    public static void main(String[] args) {
        TestOl1 obj = new TestOl1();
        System.out.println(obj.function());
    }
}

class TestOl2 {
    private String function(float i, int f) {
        return ("gfg");
    }

    private String function(double i, double f) {
        return ("GFG");
    }

    public static void main(String[] args) {
        TestOl2 obj = new TestOl2();
        System.out.println(obj.function(10., 20));
    }
}