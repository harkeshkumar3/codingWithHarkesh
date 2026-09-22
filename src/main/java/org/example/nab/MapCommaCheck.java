package org.example.nab;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MapCommaCheck{

    public static void main(String[] args) throws Exception {
        try{
            int i =5/0;
        }
        catch (Exception e){
            throw new Exception();
        }
        finally {
            System.out.println("in");
        }
    }
}



