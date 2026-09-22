package org.example.design.principles;

/*
    The  dependency of one class to another one class should be depend on smallest possible interface;
        - Client should not be forced to implement interfaces they do not use
        - Instead of one Fat Interface Many Small interface are preferred based on group of methods, each  one serving  one submodule
 * */


interface ShapeInterface {
    public double area();

}

interface SolidShapeInterface {
    public double volume();

}

class Cuboid implements ShapeInterface, SolidShapeInterface {
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}

// but we know that squares are flat shapes and that they do not have volumes,
// so this interface would force the Square class to implement a method that it has no use of.

// Better Approach to divide interface to parts
class SquareISP implements ShapeInterface {

    @Override
    public double area() {
        return 0;
    }
}

public class InterfaceSegregationPrinciple {
}
