package org.example.design.pattern;

/*

Creational design pattern
User when u have multiple sub-classes of super class & based on input we want  to return  one class instance
it provide abstraction and implementation  & client  classes.
Remove the instantiation  of client classes  from client code.


Impl
    - Super class can be interface  or abstract class or basic class.
    - Factory class has a static method which return the instance of sub class based on input.

* */


abstract class Vehicle {
    public abstract int getWheel();

    @Override
    public String toString() {
        return "Wheel = " + this.getWheel();
    }
}

class Car extends Vehicle {
    int wheel;

    Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

class Bike extends Vehicle {
    int wheel;

    Bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

class VehicleFactory {
    public static Vehicle getInstance(String type, int wheel) {
        if (type.equals("car")) {
            return new Car(wheel);
        }
        if (type.equals("bike")) {
            return new Bike(wheel);
        }
        return null;

    }
}


public class FactoryDesignPattern {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);
        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        System.out.println(bike);
    }
}
