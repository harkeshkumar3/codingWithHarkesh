package org.example.core.forloop;

public class CountLoop {
    static int count = 0;

    public static void main(String[] args) {
        if (count < 3) {
            count++;
            main(null);
        } else
            return;
        System.out.println("Hello World!");
        int array[] = {1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }




    }
}
