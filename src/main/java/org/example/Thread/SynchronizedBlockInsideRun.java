package org.example.Thread;


class MyRunnable implements Runnable {


    @Override
    public void run() {
        synchronized (this) {
            System.out.println("1 ");
            try {
                System.out.println("name = " + Thread.currentThread().getName() + "State =" + Thread.currentThread().getState());
                this.wait(100);
                System.out.println("2");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("name = " + Thread.currentThread().getName() + "State =" + Thread.currentThread().getState());
        }

    }
}

public class SynchronizedBlockInsideRun {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "Thread-1");
        thread.start();
        Thread.yield();
        System.out.println("name = " + Thread.currentThread().getName() + "State =" + Thread.currentThread().getState());
    }
}
