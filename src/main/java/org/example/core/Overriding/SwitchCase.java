package org.example.core.Overriding;

public class SwitchCase {

    public static void main(String[] args) {
        int i = 9;
        switch (i) {
            default:
                System.out.println("default" + i);
            case 0:
                System.out.println("zero" + i);
                //  break;
            case 1:
                System.out.println("one" + i);
            case 2:
                System.out.println("two" + i);
            case 6:
                doSomething();
            case 5:
                doSomething();
        }

    }

    private static void doSomething() {
        System.out.println("hello");
    }
}


class Base {
}

class Sub extends Base {
}

class Sub2 extends Base {
}

class CEx {
    public static void main(String argv[]) {
        Base b = new Base();
        Sub s = (Sub) b;
    }
}


