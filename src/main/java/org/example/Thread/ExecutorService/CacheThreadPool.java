package org.example.Thread.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 200; i++) {
            executorService.execute(() -> {
                System.out.println("Thread name =" + Thread.currentThread().getName());
            });
        }
    }
}
