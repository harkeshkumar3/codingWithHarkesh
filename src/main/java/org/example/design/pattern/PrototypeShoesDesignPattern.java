//package org.example.design.pattern;
//
//import org.junit.Test;
//
//import java.io.*;
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//import static org.junit.Assert.assertEquals;
//
//public class PrototypeShoesDesignPattern {
//    public static void main(String[] args) {
//        Shoes shoes = Factory.makeObject("Sport");
//        shoes.wear();
//    }
//}
//
//
//abstract class Shoes implements Serializable, Cloneable {
//
//    abstract void wear();
//
//    public Object shallowCloning() throws CloneNotSupportedException {
//        return this.clone();
//    }
//
//    public Shoes deepCloning() throws IOException, ClassNotFoundException {
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        ObjectOutputStream out = new ObjectOutputStream(outputStream);
//        out.writeObject(this);
//
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
//        ObjectInputStream in = new ObjectInputStream(inputStream);
//        Shoes o = (Shoes) in.readObject();
//        return o;
//    }
//
//}
//
//class SportShoes extends Shoes {
//
//    @Override
//    public String toString() {
//        return "Sport Shoes";
//    }
//
//    @Override
//    void wear() {
//        System.out.println("i Am wearing " + toString());
//    }
//}
//
//class CasualShoes extends Shoes {
//
//    @Override
//    public String toString() {
//        return "Casual Shoes";
//    }
//
//    @Override
//    void wear() {
//        System.out.println("I Am wearing " + toString());
//    }
//}
//
//class FormalShoes extends Shoes {
//
//    @Override
//    public String toString() {
//        return "Formal Shoes";
//    }
//
//    @Override
//    void wear() {
//        System.out.println("I am wearing " + toString());
//    }
//}
//
//class Factory {
//    private static Map<String, Object> map = new HashMap<>();
//
//    static {
//        map.put("Sport", new SportShoes());
//        map.put("Formal", new FormalShoes());
//        map.put("Casual", new CasualShoes());
//    }
//
//    public static Shoes makeObject(String shoesType) {
//        Shoes shoes = (Shoes) map.get(shoesType);
//        try {
//            Shoes deepCloning = shoes.deepCloning();
//            System.out.println("Deep Cloning " + deepCloning);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        Shoes shallowCloning = null;
//        try {
//            shallowCloning = (Shoes) shoes.shallowCloning();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Shallow Cloning " + shallowCloning);
//        return shallowCloning;
//    }
//
//
//}
//
