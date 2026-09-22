package org.example.core.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        Iterator iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            list.add("c");
//        }

        Vector<String> vector = new Vector<>();
        vector.add("1");
        vector.add("2");
        Iterator iterator1 = vector.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
            vector.add("3");
        }

    }
}
