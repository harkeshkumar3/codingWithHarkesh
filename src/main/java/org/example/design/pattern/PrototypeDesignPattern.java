package org.example.design.pattern;

/*

    Properties
        - Creational design pattern
        - User when you want to avoid multiple Object creation of same instance; instead  you copy the object to new object & then modified as per our need.

    Implementation
        - Object which we are coping should provide copying feature by  implementing cloneable interface;
        - We can override clone()  method  to implement as per our need.

*/

import java.util.ArrayList;
import java.util.List;

class Vehicles implements Cloneable {

    private List<String> vehicleList;

    public Vehicles() {
        vehicleList = new ArrayList<>();
    }

    public Vehicles(List<String> list) {
        this.vehicleList = list;
    }

    public void insertData() {
        this.vehicleList.add("Honda");
        vehicleList.add("Balano");
        vehicleList.add("Audi U1");
        vehicleList.add("Creta");
    }

    public List<String> getVehicleList() {
        return this.vehicleList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<>();
        for (String s : this.vehicleList) {
            tempList.add(s);
        }
        return new Vehicles(tempList);
    }
}

public class PrototypeDesignPattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicles vehicle= new Vehicles();
        vehicle.insertData();

        Vehicles b = (Vehicles) vehicle.clone();
        List<String> vehicleList = b.getVehicleList();
        vehicleList.add("Honda new Amaze");

        System.out.println(vehicle.getVehicleList());
        System.out.println(vehicleList);
    }
}
