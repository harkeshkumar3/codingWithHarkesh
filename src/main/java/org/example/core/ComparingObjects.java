package org.example.core;

public class ComparingObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("sachin", 45,25000);
        Employee e4 = new Employee("sachin", 45,25000);
        Employee e2 = new Employee("Kohli", 45,30000);
        Employee e3 = new Employee("dhoni", 45,35000);


        System.out.println(e1==e4);
        System.out.println(e1.equals(e4));
    }
}

class Employee{
    private String name;
    private int age;
    private long salary;

    public Employee(String name, int age, long salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}