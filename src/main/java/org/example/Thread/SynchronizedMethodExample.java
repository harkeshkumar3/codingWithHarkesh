package org.example.Thread;

class SynRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("name Method = " + Thread.currentThread().getName());
        }
       method();
    }

    synchronized void method() {
        for (int i = 0; i < 10; i++) {
            System.out.println("name = " + Thread.currentThread().getName());
        }
    }
}

public class SynchronizedMethodExample {
    public static void main(String[] args) {
        SynRunnable runnable = new SynRunnable();
        Thread thread1 = new Thread(runnable, "thread-1");
        Thread thread2 = new Thread(runnable, "thread-2");
        thread1.start();
        thread2.start();
    }
}
