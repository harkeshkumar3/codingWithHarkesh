package org.example.bms;

import java.util.Locale;
import java.util.Objects;

public class EnumNullCheck {

    public enum Currency {PENNY, NICKLE, DIME, QUARTER,};

    enum Color {
        WHITE, BLACK;
    }

    public static void main(String[] args) {
//        Color color = null;

//        boolean aNull = Objects.isNull(color);
        Locale locale = new Locale("");
        System.out.println(locale.getDisplayCountry().toUpperCase(Locale.ENGLISH
        ));

//        switch (color) {    // NPE here
//            case WHITE: break;
//            case BLACK: break;
//            default: break;     // null value does not fall into the default
//        }
    }
}
