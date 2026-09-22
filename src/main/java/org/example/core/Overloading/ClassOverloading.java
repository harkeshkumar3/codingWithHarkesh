package org.example.core.Overloading;


class Base {

  static   int x = 10;

    public void print() {
        System.out.println("In Base Class print");
    }

    public static void show() {
        System.out.println("In Base Class Show");
    }
}

public class ClassOverloading extends Base {
      int x = 20;

    public void print() {
        System.out.println("In SUB Class print" +x);
    }

    public static void show() {
        System.out.println("In SUB Class Show" );
    }

    public static void main(String[] args) {
        Base ob = new ClassOverloading();
        ob.print();
        ob.show();
        System.out.println(ob.x);
    }
}
