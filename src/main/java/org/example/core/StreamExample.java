package org.example.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Amit", 120));
        personList.add(new Person("Dhoni", 100));
        personList.add(new Person("Ravi", 50));
        personList.add(new Person("Shiva", 150));


        List<Person> collect = personList.stream()
                .filter(person -> person.getBillions() >= 100)
                .sorted(Comparator.comparing(Person::getBillions).reversed())
                .collect(Collectors.toList());

        collect.forEach(person -> System.out.println(person.getName()));
    }
}

class Person {
    private String name;
    private int billions;

    Person(String name, int billions) {
        this.billions = billions;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBillions() {
        return billions;
    }

    public void setBillions(int billions) {
        this.billions = billions;
    }
}


