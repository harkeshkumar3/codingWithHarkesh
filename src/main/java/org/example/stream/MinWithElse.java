package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;

public class MinWithElse {

    public static void main(String[] args)
    {

        // Creating a list of integers
        List<Integer> list = Arrays.asList(9,10,6);
        Integer item = 10;

        // Using Stream.min() with reverse
        // comparator to get maximum element.
        Optional<Integer> var = list.stream()
                .min(comparing((i)-> item));

        // IF var is empty, then output will be Optional.empty
        // else value in var is printed.
        if(var.isPresent()){
            System.out.println(var.get());
        }
        else{
            System.out.println("NULL");
        }

    }
}
