package org.example.Thread;

public class SynchronizedInMain {
    public static void main(String[] args) throws InterruptedException {
        synchronized (args) {
            System.out.println("1");
            args.wait();
            System.out.println("2");
        }
    }
}
