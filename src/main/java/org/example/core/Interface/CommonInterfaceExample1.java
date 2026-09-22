package org.example.core.Interface;


interface CommonOne {
    void print();
}

interface CommonTwo {
    void print();
}


public class CommonInterfaceExample1 implements CommonOne, CommonTwo {
    @Override
    public void print() {
        System.out.println("printed");
    }


    public static void main(String[] args) {
        new CommonInterfaceExample1().print();
    }
}
