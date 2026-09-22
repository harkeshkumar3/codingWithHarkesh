package org.example.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ImmutableClass {
    final private List<String> list;

    public List<String> getList() {
        return list;
    }

    ImmutableClass(List<String> listArg) {
        list = Collections.unmodifiableList(listArg);
    }
}

class ImmutableExample {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("harkesh");
        list.add("ram");
        ImmutableClass immutableClass = new ImmutableClass(list);
//        immutableClass.getList().add("suman");
//
        immutableClass.getList().forEach(System.out::println);
        immutableClass.getList().stream()
                .filter(s-> s.startsWith("sum"))
                .collect(Collectors.toList());

    }

}
