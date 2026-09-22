package org.example.Thread;

public class JoinThreadExample {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Frnd one 150");
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Frnd 2 one 150");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }, "Thread-main");

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();
        System.out.println("Watch movie");

    }


}
