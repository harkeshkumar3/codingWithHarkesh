package org.example.Thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;


/*
        Type                    User-Case
   1     Volatile                Flag
   2    AtomicInteger           Counter
        AtomicLong              counter

   3     AtomicReference         Cache
                                (Building new cache in Background and replacing Atomically)
                                Used By Some internal Class and non-blocking Alogrithms

* */
public class VolatileAndAtomic {

    public static void main(String[] args) throws IOException {
        AtomicBoolean flag = new AtomicBoolean(true);
        AtomicInteger count = new AtomicInteger(1);
        Thread thread1 = new Thread(() -> {
            count.getAndIncrement();
            while (flag.get())
                System.out.println("Flag is thread1 " + count);
        });
        Thread thread2 = new Thread(() -> {
            flag.set(false);
            count.getAndIncrement();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Flag is thread2 " + count);

        });
        thread1.start();
        thread2.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");

    }

}


