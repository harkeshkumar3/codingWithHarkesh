package org.example.core.inheritance;


class CommonOne {
    public void massage(String msg) {
        System.out.println("CommonOne Printed msg" + msg);
    }
}

interface CommonTwo {
    public void massage(String msg);
}


public class CommonClassExample1 extends CommonOne implements CommonTwo {

    public void massage(String msg) {
        System.out.println("CommonClassExample1 Printed msg" + msg);
    }

    public static void main(String[] args) {
        new CommonClassExample1().massage("hello");
    }
}
