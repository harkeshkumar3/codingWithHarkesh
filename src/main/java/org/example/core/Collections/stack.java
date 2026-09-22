package org.example.core.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class stack {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("GeeksforGeeks");
        //An iterator made for iterating over Integer cannot be used to iterate over String data type.
        //   Iterator<Integer> iter = list.iterator();
        Iterator<String> iter = list.iterator();
        while (iter.hasNext())
            System.out.printf(iter.next() + " ");

        System.out.println();
    }
}
