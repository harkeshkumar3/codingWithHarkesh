package org.example.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameShuffle {
    public static void main(String[] args) {
        nameShuffle("Donald Trump");
    }
    public static String nameShuffle(String s) {
        List<String> nameList = Arrays.asList(s.split(" "));
        Collections.reverse(nameList);
        System.out.println(nameList);
        return nameList.get(0)+" "+ nameList.get(1);

    }



}
