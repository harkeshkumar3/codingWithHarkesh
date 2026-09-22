package org.example.Thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Test1 {
}

class Test implements Runnable {
    public void run() {
        System.out.printf("GFG ");
        System.out.printf("Geeks run ");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        Thread thread = new Thread(obj);

        thread.start();
        System.out.printf("Geeks Main ");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("for ");
    }
}


//Invoking start() method on a thread moves the thread to a RUNNABLE state. But invoking start() method on a thread that has already started throws a IllegalThreadStateException because the thread is already in RUNNABLE state.

class Test2 implements Runnable {
    public void run() {
        System.out.printf("GFG ");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Test());
        thread1.start();
        thread1.start();
        System.out.println(thread1.getState());
    }
}

//Test class extends Thread class that has start() method implemented. So invoking start() on an object that extends Thread class invokes run() method defined in the program.
class Test3 extends Thread implements Runnable {
    public void run() {
        System.out.printf("GFG ");
    }

    public static void main(String[] args) throws InterruptedException {
        Test3 obj = new Test3();
        obj.run();
        obj.start();
    }
}


class myThread implements Runnable {
    public void run() {
        Test4.obj.notify();
    }
}

/*
Explanation: An object must first acquire a lock before calling wait() method. Also wait() method throws Checked exception(InterruptedException), we must include it in a try-catch block or throws it.
* */
class Test4 implements Runnable {
    public static Test4 obj;
    private int data;

    public Test4() {
        data = 10;
    }

    public void run() {
        obj = new Test4();
        // obj.wait();
        obj.data += 20;

        System.out.println(obj.data);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Test4());
        Thread thread2 = new Thread(new myThread());

        thread1.start();
        thread2.start();

        System.out.printf(" GFG - ");
    }
}




/**/

class Test5 implements Runnable {
    public static CyclicBarrier barrier = new CyclicBarrier(3);

    public void run() {
        System.out.printf(" GFG ");
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Test());
        Thread thread2 = new Thread(new Test());

        thread1.start();
        thread2.start();
        System.out.printf(" GeeksforGeeks ");
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.printf(" End ");

    }
}