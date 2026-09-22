package org.example.core.Collections;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ConscurrentSkipListMapSet {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(1);
        set.add("2");
        set.add(3);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
