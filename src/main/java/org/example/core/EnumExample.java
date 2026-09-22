package org.example.core;

public class EnumExample {

    enum Transport {
        CAR(89), TRAIN(120), AUTOMOBILE(100);

        int speed;

        Transport(int speed) {
            this.speed = speed;
        }
    }

    public static void main(String[] args) {
        Transport ts = Transport.AUTOMOBILE;
        System.out.println(ts.speed);
    }
}
