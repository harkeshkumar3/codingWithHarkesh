package org.example.coding;

import java.util.ArrayList;
import java.util.List;

public class FIndQuotient {

    public static void main(String[] args) {
        int number = 101;
        int div = 15;
        int print = 0;
        List<Integer> list = new ArrayList<>();
        int quotient = number / div;
        System.out.println(quotient);
        if (quotient == 0) {
            quotient = 1;
        }

        while ((print < number)) {
            System.out.print(print + " , ");
            print = (print + quotient);
            list.add(print);
        }
        System.out.println("");
        System.out.println(list);
    }
}
