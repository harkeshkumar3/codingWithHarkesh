package org.example.Thread.ExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerThreadPool {
    static ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

    public static void main(String[] args) {
//        scheduledExecutorService.schedule(() -> {
//            System.out.println("Thead Name schedule " + Thread.currentThread().getName());
//        }, 10, TimeUnit.SECONDS);
//
//        scheduledExecutorService.scheduleAtFixedRate(() -> {
//            System.out.println("Thead Name  scheduleAtFixedRate" + Thread.currentThread().getName());
//        }, 15, 10, TimeUnit.SECONDS);
//
//        scheduledExecutorService.scheduleWithFixedDelay(() -> {
//            System.out.println("Thead Name scheduleWithFixedDelay" + Thread.currentThread().getName());
//        }, 10, 10, TimeUnit.SECONDS);
        fixedTime(1);
    }

    public static void fixedTime(long time) {
        scheduledExecutorService.schedule(() -> {
            System.out.println("Thead Name schedule " + Thread.currentThread().getName());
        }, time, TimeUnit.MINUTES);
    }
}
