package org.example.Thread;

import org.example.Main;

class MainThread  extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "Thread is running " + i);
        }

    }

}
public class MyThread extends Thread {
    public static void main(String[] args) {
        MainThread mainThread = new MainThread();
        MainThread mainThread2 = new MainThread();
        mainThread.start();
        mainThread2.start();
    }

}
