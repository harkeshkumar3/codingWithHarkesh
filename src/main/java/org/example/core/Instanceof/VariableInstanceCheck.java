package org.example.core.Instanceof;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VariableInstanceCheck {
    public static void main (String[] args) {
//        3:      List list = new ArrayList();
//        4:      list.add("hello");
//        5:      list.add(2);
//        6:      System.out.print(list.get(0) instanceof Object);
//        7:      System.out.print(list.get(1) instanceof Integer);
//        8:  }
        List list =new ArrayList<>();
        list.add("Hello");
        list.add(2);
        System.out.println(list.get(0) instanceof Object);
//        System.out.println(list instanceof Arrays);
        System.out.println(list.get(0) instanceof String);
        System.out.println(list.get(1) instanceof Integer);
    }

}
