package org.example.Thread;


class Runnable1 implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            try {
                System.out.printf("2");
                Thread.sleep(100);
                System.out.println("name = " + Thread.currentThread().getName() + "State =" + Thread.currentThread().getState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.notify();
            System.out.println("name = " + Thread.currentThread().getName() + "State =" + Thread.currentThread().getState());
            System.out.printf("3 ");
        }
    }
}

class Runnable2 extends Thread {
    Runnable1 prod;

    Runnable2(Runnable1 pro) {
        this.prod = pro;
    }

    @Override
    public void run() {
        synchronized (prod) {
            System.out.printf("1 ");
            try {
                this.prod.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("name = " + Thread.currentThread().getName() + "State =" + Thread.currentThread().getState());
            System.out.printf("4 ");
        }
    }
}

public class SynchronizedBlockInsideRunWithSleep {

    public static void main(String[] args) throws InterruptedException {
        Runnable1 runnable1 = new Runnable1();
        Runnable2 runnable2 = new Runnable2(runnable1);
        Thread thread1 = new Thread(runnable1, "thread-1");
        Thread thread2 = new Thread(runnable2, "thread-2");
        thread2.start();
        Thread.sleep(100);
        thread1.start();

    }

}
