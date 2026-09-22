package org.example.design.principles;
/*
*
    Software Entities should be open  for Extensions but closed for modification
* */


abstract class Shape {
    public abstract double area();
}


class Rectangle extends Shape {

    double height;
    double width;

    @Override
    public double area() {
        return height * width;
    }
}

class Square extends Shape {

    double edge;

    @Override
    public double area() {
        return edge * edge;
    }
}


public class OpenClosePrinciple {
}
