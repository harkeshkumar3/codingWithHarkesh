package org.example.core.Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter name, age and salary:");

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println(count);
        String name1 = s.nextLine();
        String name2 = s.nextLine();   // Reading input from STDIN

        System.out.println("Hi, " + name1 + ".");    // Writing output to STDOUT
        System.out.println("Hi, " + name2 + ".");    // Writing output to STDOUT


        LineNumberReader r = new LineNumberReader(new InputStreamReader(System.in));
        String l;

        while ((l = r.readLine()) != null) {
            Scanner s1 = new Scanner(l);

            while (s1.hasNext()) {
                System.out.println("Line " + r.getLineNumber() + ": " + s1.next());
            }
        }



    }
}
