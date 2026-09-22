package org.example.Thread.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LifeCycleMethods {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            service.execute(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread Name " + Thread.currentThread().getName());
            });
        }

        //Initiate Shutdown
        service.shutdown();

        //Will Throw java.util.concurrent.RejectedExecutionException
        //     service.execute(() -> {        });


        //will return true ,Since shutdown has begin
        service.isShutdown();
        System.out.println(service.isShutdown());


        // will return true if all Task are Completed
        service.isTerminated();
        System.out.println(service.isTerminated());

        //Block until all task are completed or if Timeout occurs
        service.awaitTermination(10, TimeUnit.SECONDS);

        //will Initiate Shutdown and return all queue Tasks
        service.shutdownNow();
        System.out.println(service.shutdownNow());


    }
}
