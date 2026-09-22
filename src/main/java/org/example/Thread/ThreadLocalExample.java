package org.example.Thread;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
        Thread local
                -> Per Thread Instance for memory efficiency and thread-safety

* */
public class ThreadLocalExample {
    static ExecutorService service = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int id = i;
            service.submit(() -> {
                String birthday = new ThreadLocalUserService().birthday(id);
                System.out.println(birthday);
            });
        }

    }

}

class ThreadLocalUserService {

    public String birthday(int id) {
        Date birthday = Date.from(Instant.now().minusSeconds(new Random().nextInt(1000000)));
        final SimpleDateFormat df = ThreadSafeFormatter.dateFormatter.get();
        return df.format(birthday);
    }
}

class ThreadSafeFormatter {

    public static ThreadLocal<SimpleDateFormat> dateFormatter = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }

        @Override
        public SimpleDateFormat get() {
            return super.get();
        }
    };
}