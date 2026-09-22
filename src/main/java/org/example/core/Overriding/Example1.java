package org.example.core.Overriding;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example1 {
}


//Explanation: Final and static methods cannot be overridden. For more details Check: Can we Overload or Override static methods in java ?
class Derived {
    //
    protected static void getDetails() {
        System.out.println("Derived class");
    }
}


class Test extends Derived {
    protected static void getDetails() {
        System.out.println("Test class");
    }

    public enum Days {
        monday;
    }

 //   List<String> list = new CopyOnWriteArrayList<String>();
    //Map<Integer, String> map = new daysEnumMap<Days, String>(Days.class);

    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<String>();
        Set<String> list2 = new ConcurrentSkipListSet<String>();

        list.add("Ind");
        list.add("Pak");
        list.add(null);
        for (String s : list) {
            System.out.println(s + "");
            list.add("new add");
        }

        Derived obj = new Test();
        obj.getDetails();
    }
}