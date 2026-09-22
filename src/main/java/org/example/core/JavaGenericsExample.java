package org.example.core;

public class JavaGenericsExample {

    public static void main(String[] args) {
        NumericFns<Integer> ob1 = new NumericFns<Integer>(6);
        NumericFns<Double> ob2 = new NumericFns<Double>(-6.0);
        System.out.println(ob1.absEqual(ob2));
    }


}

class Add<T extends Number> {

    T number1;
    T number2;
    Add(T o1, T o2){
        this.number1=o1;
        this.number2=o2;
    }

    public Long sum(T a, T b) {
        return a.longValue() + a.longValue();
    }
}


class NumericFns<T extends Number> {

    T num;

    NumericFns(T ob) {
        this.num = ob;
    }

    boolean absEqual(NumericFns<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
}