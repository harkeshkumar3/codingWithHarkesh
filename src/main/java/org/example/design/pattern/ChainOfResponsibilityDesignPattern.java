package org.example.design.pattern;

abstract class Rupees {
    int rs;

    abstract void message(int rs);

    Rupees nextRs;

}

class Rupees100 extends Rupees {

    Rupees100(int i) {
        this.rs = i;
    }

    @Override
    void message(int amount) {

        if (amount >= 100) {
            System.out.println("dispensing 100 = " + amount / 100);
            amount = amount - 100 * (amount / 100);
        }
        nextRs.message(amount);
    }
}

class Rupees50 extends Rupees {
    Rupees50(int i) {
        this.rs = i;
    }

    @Override
    void message(int amount) {
        if (amount >= 50) {
            System.out.println("dispensing 50 = " + amount / 50);
            amount = amount - 50 * (amount / 50);
        }
        nextRs.message(amount);
    }
}

class Rs10 extends Rupees {

    Rs10(int i) {
        this.rs = i;
    }

    void message(int amount) {
        if (amount >= 10) {
            System.out.println("dispensing 10 = " + amount / 10);
            amount = amount - 10 * (amount / 10);
        }
        System.out.println("done");
    }

}

public class ChainOfResponsibilityDesignPattern {
    public static void main(String[] args) {
        Rupees100 rupees100 = new Rupees100(100);
        Rupees50 rupees50 = new Rupees50(50);
        Rs10 rs10 = new Rs10(10);

        rupees100.nextRs = rupees50;
        rupees50.nextRs = rs10;

        rupees100.message(1180);
    }
}
