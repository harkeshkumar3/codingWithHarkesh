package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
            list.add(5);
        }

    }
}
