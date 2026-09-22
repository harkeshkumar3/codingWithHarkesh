package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {


    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Dipak", "Delhi", 21));
        emp.add(new Employee("Sumit", "Delhi", 21));
        emp.add(new Employee("Karan", "Delhi", 23));
        emp.add(new Employee("Mona", "Udaipur", 23));
        emp.add(new Employee("Rajesh", "Banglore", 23));
        emp.add(new Employee("Niraj", "Banglore", 31));

        Map<String, List<Employee>> collect = emp.stream().collect(Collectors.groupingBy(Employee::getCity));

        System.out.println(collect);

        Map<String, Integer> collect1 = emp.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.summingInt(Employee::getAge)));
        System.out.println(collect1);
    }
}


class Employee {
    private String name;
    private String city;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}