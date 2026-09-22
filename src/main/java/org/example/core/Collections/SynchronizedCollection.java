//package org.example.core.Collections;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//
//public class SynchronizedCollection {
//
//    @Test
//    public void synchronizedCollectionTest() throws InterruptedException {
//        Collection<Integer> synchronizedCollection = Collections.synchronizedCollection(new ArrayList<>());
//        Runnable listOptaions = () -> {
//            synchronizedCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
//        };
//
//        Thread thread1 = new Thread(listOptaions);
//        Thread thread2 = new Thread(listOptaions);
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//
//        Assertions.assertEquals(synchronizedCollection.size(), 12);
//    }
//}
