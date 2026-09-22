package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Tom", 90),
                new Student("Lisa", 98),
                new Student("John", 85),
                new Student("Joe", 80),
                new Student("Jason", 35));

        Map<Boolean, List<Student>> collect = students.stream().collect(Collectors.partitioningBy(f -> f.getMarks() >= 82));
        System.out.println(collect);
    }
}

class Student
{
    private String name;
    private int marks;

    Student(String name, Integer marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getMarks() { return marks; }

    @Override
    public String toString() { return getName(); }
}