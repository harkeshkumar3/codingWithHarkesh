//package org.example.core;
//
//import org.junit.jupiter.api.DynamicTest;
//import org.junit.jupiter.api.Test;
//
//public class MarkerInterface implements Cloneable {
//
//    int age;
//    String name;
//
//    MarkerInterface(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    public void display() {
//        System.out.println("Name of Student " + name);
//        System.out.println("Age of Student " + age);
//    }
//
//
//    public static void main(String[] args) throws CloneNotSupportedException {
//        MarkerInterface m = new MarkerInterface(20, "harkesh");
//        MarkerInterface m1 = (MarkerInterface) m.clone();
//        m1.display();
//    }
//
//}
//
//
