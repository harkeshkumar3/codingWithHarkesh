package org.example.Thread;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerAndConsumerBlockingQueue {


    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

//    private static Queue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread-0");
        Thread producerThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread-1");

        Thread producerThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread-2");
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },"Thread-11");
        Thread consumerThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },"Thread-12");

        producerThread.start();
        producerThread1.start();
        producerThread2.start();
        consumerThread.start();
        consumerThread1.start();
    }

    private static void consumer() throws InterruptedException {
        while (true){
            Thread.sleep(2000);
            Integer take = queue.poll();
            System.out.println("Consumer: "+take+" Thread Name" + Thread.currentThread().getName());
        }
    }

    private static void producer()  throws  InterruptedException{
        Random random= new Random();
        while (true){
            Thread.sleep(1000);
            int prod = random.nextInt(100);
            queue.add(prod);
            System.out.println("Producer: "+prod +" Thread Name" + Thread.currentThread().getName());
        }

    }

}
