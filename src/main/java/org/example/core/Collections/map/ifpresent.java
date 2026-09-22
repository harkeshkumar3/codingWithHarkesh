package org.example.core.Collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

interface  AllMethod{
    void show();
    void print();
}

 abstract class copySome implements AllMethod{

}

public class ifpresent {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("H",111);
        map.put("BB",222);
        map.put("AA",333);

        System.out.println(map.putIfAbsent("X",444));
        System.out.println(map);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
