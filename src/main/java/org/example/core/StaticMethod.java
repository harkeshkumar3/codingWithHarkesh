package org.example.core;

public class StaticMethod {

//    public static void foo() {
//        System.out.println("Test.foo() called ");
//    }
//
//    public static void foo(int a) {
//        System.out.println("Test.foo(int) called ");
//    }
//
//    public static void main(String args[]) {
//        StaticMethod.foo();
//        StaticMethod.foo(10);
//    }

//    public static test() {
//        System.out.println("Hello");
//    }
}

class Check {
//    StaticMethod obj = null;
//        obj.test();

}

class AbstractTest {
   public static  void disp() {
        System.out.println("disp of static method");
    }
}

abstract class A {

    // abstract static method func
    // it has no body
  //  abstract static void func();
}

// subclass class B
class B extends A {

    // class B must override func() method
    static void func()
    {
        System.out.println(
                "Static abstract"
                        + " method implemented.");
    }
}

// Driver class

class main{
    public static void main(String[] args) {
        AbstractTest.disp();
        B.func();
    }
}
