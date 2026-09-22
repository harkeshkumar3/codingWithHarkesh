package org.example.core.forloop;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorLoop {
    public static void main(String[] args) {
        List<String> pencilCase = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
        for (String pencil : pencilCase) {
        }
        Iterator iterator = pencilCase.iterator();
        for (String pencil : pencilCase) {
            iterator.hasNext();
        } {
        }

    }
}

