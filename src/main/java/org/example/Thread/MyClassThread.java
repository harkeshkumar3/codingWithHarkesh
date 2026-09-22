package org.example.Thread;


class class1 {
    void method2(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

}

public class MyClassThread implements Runnable {

    class1 obj;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        obj.method2(Thread.currentThread().getName());
    }

    void method1() {
        obj = new class1();
        System.out.println(Thread.currentThread().getName());
        new Thread(new MyClassThread()).start();
        new Thread(new MyClassThread()).start();

    }

    public static void main(String[] args) {
        new MyClassThread().method1();
    }
}
