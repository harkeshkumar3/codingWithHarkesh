package org.example.bms;

import java.util.function.Supplier;

public class NabDefaultTest {

    public static void main(String[] args) {
        String s = defaultIfModelNotComplete(() -> null, "UNCONFIRMED");
        System.out.println(s);
    }

    public static   <T> T defaultIfModelNotComplete(Supplier<T> statment, T defaultValue){
        try {
            return statment.get();
        }catch (Exception e){
            return defaultValue;
        }
    }
}
