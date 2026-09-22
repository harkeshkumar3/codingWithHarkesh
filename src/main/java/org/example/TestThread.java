package org.example;

public class TestThread {
    public void start(){
        System.out.println("Start Methid");
    }
    public void run(){
        System.out.println("Run Method");
    }
    static public void main(String[] args){
        TestThread testThread = new TestThread();
        TestThread testThread2 = new TestThread();
        testThread.run();
        testThread2.run();
    }
}
