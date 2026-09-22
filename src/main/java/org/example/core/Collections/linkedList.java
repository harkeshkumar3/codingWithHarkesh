package org.example.core.Collections;

import java.util.LinkedList;
import java.util.List;

public class linkedList {

    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("Geeks");
        list1.add("for");
        list1.add("Geeks");
        list1.add("GFG");
        list1.add("GeeksforGeeks");

        List<String> list2 = new LinkedList<>();
        list2.add("Geeks");

        list1.removeAll(list2);

        for (String temp : list1)
            System.out.printf(temp + " ");

        System.out.println();
    }
}


class DemoLinkedList1 {
    public void show() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Element1"); // line 6
        list.add("Element2");
        System.out.print(list.getFirst()); // line 8
    }
}

class MainLinkedList1 {
    public static void main(String[] args) {
        DemoLinkedList1 demo = new DemoLinkedList1();
        demo.show();
    }
}

class DemoLinkedList2 {
    public void show() {
        LinkedList<String> list = new LinkedList<String>();

        System.out.print(list.getFirst());
    }
}

class MainLinkedList2 {
    public static void main(String[] args) {
        DemoLinkedList2 demo = new DemoLinkedList2();
        demo.show();
    }
}