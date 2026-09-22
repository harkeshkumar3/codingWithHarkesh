package org.example.core.Overriding;

import java.io.IOException;

public class ExampleWithThrows {
}


//Explanation: The exception thrown by the overriding method should not be new or more broader checked exception. In the code above, Exception is more broader class of checked exception than IOException, so this results in compilation error.
 abstract class Derived1 {
    private static void show() {

    }

    public void getDetails() throws IOException //line 23
    {
        System.out.println("Derived class");
    }
}

class Test1 extends Derived1 {
    //The exception thrown by the overriding method should not be new or more broader checked exception
    public void getDetails() throws IOException //line 24  /// Exception
    {
        System.out.println("Test class");
    }

    private static void show() {

    }

    public static void main(String[] args) throws IOException //line 25
    {
        Derived1 obj = new Test1();
        obj.getDetails();
    }

    public static void main(String[] args, Integer a) throws IOException //line 25
    {
        Derived1 obj = new Test1();
        obj.getDetails();
    }
}

