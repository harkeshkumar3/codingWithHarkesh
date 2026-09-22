package org.example.Thread.ExecutorService;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class FixedThreadPool {
    public static void main(String[] args) {
        SimpleThreadFactory simpleThreadFactory = new SimpleThreadFactory("Custome- ");

        ExecutorService executorService = Executors.newFixedThreadPool(10, simpleThreadFactory);

        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> {
                System.out.println("Thread Name = " + Thread.currentThread().getName());

            });
        }
        System.out.printf("Give me CustomThreadFactory stats:\n\n" + simpleThreadFactory.getStats());
    }

    static class SimpleThreadFactory implements  ThreadFactory{

        private int          counter;
        private String       name;
        private List<String> stats;

        public SimpleThreadFactory(String name)
        {
            counter = 1;
            this.name = name;
            stats = new ArrayList<>();
        }


        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r, name + "-Thread_" + counter);
            counter++;
            stats.add(String.format("Created thread %d with name %s on %s \n", t.getId(), t.getName(), new Date()));
            return t;
        }
        public String getStats()
        {
            StringBuffer buffer = new StringBuffer();
            Iterator<String> it = stats.iterator();
            while (it.hasNext())
            {
                buffer.append(it.next());
            }
            return buffer.toString();
        }

    }

}
