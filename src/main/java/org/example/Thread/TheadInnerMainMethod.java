package org.example.Thread;


class MyThread1 extends Thread {
    MyThread1() {
        System.out.println("1");
    }

    @Override
    public void run() {
        System.out.println("2");
    }
}

public class TheadInnerMainMethod {
    public static void main(String[] args) {
        Thread thread = new MyThread1() {
            public void run() {
                System.out.println("3");
            }
        };
        thread.start();
    }
}
