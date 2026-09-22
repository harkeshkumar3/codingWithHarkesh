package org.example.design.pattern;

/*
1.  Constructor should be private ;
2. Public method to returning instance;
3. instance type - private static

*
* */

class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }

}

class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized() {
    }

    public static synchronized SingletonSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }
}

class SingletonSynchronizedBlock {
    private static SingletonSynchronizedBlock instance;

    private SingletonSynchronizedBlock() {
    }

    public static SingletonSynchronizedBlock getInstance() {
        if (instance == null) {
            synchronized (SingletonSynchronizedBlock.class) {
                instance = new SingletonSynchronizedBlock();
            }
        }
        return instance;
    }
}

public class SingletonDesignPattern {
    public static void main(String[] args) {

        SingletonLazy instance = SingletonLazy.getInstance();
        System.out.println(instance);
        SingletonLazy instance1 = SingletonLazy.getInstance();
        System.out.println(instance1);
    }





}


//interface Parent {
//    public int parentMethod();
//}
//@FunctionalInterface // This cannot be FunctionalInterface
//interface Child extends Parent {
//    public int childMethod();
//// It will also extend the abstract method of the Parent Interface
//// Hence it will have more than one abstract method
//// And will give a compiler error
//}