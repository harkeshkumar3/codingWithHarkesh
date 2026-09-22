package org.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PrCm {
    public static void main(String[] args) {

        ProducerAndConsumer pc = new ProducerAndConsumer();
        Thread p = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
       Thread c = new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   pc.consumer();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       });

       p.start();
        c.start();
    }




    public static class ProducerAndConsumer extends Thread {
        BlockingQueue queue = new ArrayBlockingQueue(10);
        int capacity = 10;
        public void producer() throws InterruptedException {
            int value = 0;
           while (true){
               while (queue.size() == capacity)
                   wait();

               System.out.println("Producer produced-"
                       + value);

               // to insert the jobs in the list
               queue.put(value++);

           }
        }

        public void consumer() throws InterruptedException {
           while (true){
               while (queue.size() == 0)
                   wait();
               System.out.println(queue.poll());
           }
        }
    }
}