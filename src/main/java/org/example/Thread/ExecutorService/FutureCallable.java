package org.example.Thread.ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class FutureCallable {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future> futureList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            // Submit Task for Execution
            Future<Integer> future = service.submit(new FutureTask());
            futureList.add(future);
        }

        // 100 Futures with 100 placeholder
        // perform some unrelated work

        //After 100 Second

        for (int i = 0; i < 10; i++) {
            Future<Integer> future = futureList.get(i);
            try {
                Integer result = future.get(2, TimeUnit.SECONDS);
                System.out.println("Result from Task  is " + result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                System.out.println("Could not complate  task befor timeout ");
            }
        }

    }
}

class FutureTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return new Random().nextInt();
    }
}
