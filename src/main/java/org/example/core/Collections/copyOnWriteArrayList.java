package org.example.core.Collections;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ind");
        list.add("Pak");
       // list.add(null);    //synchronized and does  allow null elements?
        for (String s : list) {
            System.out.println(s + "");
            list.remove("Ind");
        }


    }
}
