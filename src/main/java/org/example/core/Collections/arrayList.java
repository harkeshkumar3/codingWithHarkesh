package org.example.core.Collections;

import java.util.AbstractMap;
import java.util.ArrayList;


class DemoarrayList {
    public void show() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("GeeksForGeeks_one"); // line 6
        list.add("GeeksForGeeks_two");
        //  System.out.print(list.getFirst()); // line 8 ArrayList doesn’t have method getFirst(). So
        System.out.print(list.get(0));
    }
}

class MainarrayList {
    public static void main(String[] args) {
        DemoarrayList demo = new DemoarrayList();
        demo.show();
    }
}