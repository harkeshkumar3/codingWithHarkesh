package org.example.core.abtract;


abstract class X {
    int a;
    int b;

    public X(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + b);
    }

    protected X() {
    }

    abstract void abstractMethod();
}

class Y extends X {
//    int a;
//    int b;

    public Y(int a, int b) {
        super(a,b);
        this.a = a;
        this.b = b;
        System.out.println("value of Y" + (a + b));
        System.out.println("TWO");
    }

    @Override
    void abstractMethod() {
        System.out.println("THREE");
    }
}


public class AbstractMultiClass {
    public static void main(String[] args) {
        X x = new Y(1, 5);

        x.abstractMethod();
    }
}
