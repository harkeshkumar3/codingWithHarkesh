package org.example.core.Overriding;


class CommonMethodClass {
     String massage() {
        return "Hello world";
    }
}

public class MainClass extends CommonMethodClass {
    public static void main(String[] args) {

    }
// Compile time Error Because can  final method cannot override
//    String massage() {
//        return "Hello world";
//    }

}
