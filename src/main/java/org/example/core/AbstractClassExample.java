package org.example.core;

abstract class Vehicle {
    private int id;
    abstract int getSpeed();

    abstract int getSeatingCapacity();

    public boolean hasEngine() {
        return true;
    }

    private boolean hasDriver() {
        return true;
    }
}

class Car extends Vehicle {

    @Override
    int getSpeed() {
        return 60;
    }

    @Override
    int getSeatingCapacity() {
        return 4;
    }
}

class Bike extends Vehicle {

    @Override
    int getSpeed() {
        return 50;
    }

    @Override
    int getSeatingCapacity() {
        return 20;
    }
}

class Ship extends Vehicle {
    Ship(){
        super();
    }


    @Override
    int getSpeed() {
        return 30;
    }

    @Override
    int getSeatingCapacity() {
        return 100;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        System.out.println(bike.getSpeed());
        System.out.println(bike.hasEngine());
    }
}
