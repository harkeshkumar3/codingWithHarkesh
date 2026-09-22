package org.example.core.Collections;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

public class concurrentSkipListMap {
    public static void main(String[] args) {
        Map<Integer, String> concurrentSkipListMap = new ConcurrentSkipListMap<Integer, String>();
        concurrentSkipListMap.put(11, "Audi");
        Iterator<Integer> iterator = concurrentSkipListMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            concurrentSkipListMap.put(12, "Suxi");
        }
    }
}


class collectionSortExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add("AAAZ");
        list.add("aaaz");
        list.add("aaaz");
        list.add("AAAZ");
        Collections.sort(list);
        System.out.println(list1);
    }
}

class Outer_Demo {
    // private variable of the outer class
    private int num = 175;

    // inner class
    public class Inner_Demo {
        public int getNum() {
            System.out.println("This is the getnum method of the inner class");
            return num;
        }
    }
}

class My_class2 {

    public static void main(String args[]) {
        // Instantiating the outer class
        //    Outer_Demo outer = new Outer_Demo();

        // Instantiating the inner class
        Outer_Demo.Inner_Demo inner = new Outer_Demo().new Inner_Demo();
        System.out.println(inner.getNum());
    }
}


interface MyInterface{
    public static int num = 100;
    public default void display() {
        System.out.println("display method of MyInterface");
    }
}
 class InterfaceExample implements MyInterface{


    public static void main(String args[]) {
        InterfaceExample obj = new InterfaceExample();
        obj.display();
    }
}

